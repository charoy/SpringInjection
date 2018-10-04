package eu.telecomnancy.injection;

import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class StrangeSensor {
    private int state=0;
    private double value;

    public void on() {
        state=1;
    }

    public void off() {
        state=0;
    }

    public double getValue() {
        try {
            return StrangeSensor.getProcessCpuLoad();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0.0;
    }

    public int getState() {
        return state;
    }

    public static double getProcessCpuLoad() throws Exception {

        MBeanServer mbs    = ManagementFactory.getPlatformMBeanServer();
        ObjectName name    = ObjectName.getInstance("java.lang:type=OperatingSystem");
        AttributeList list = mbs.getAttributes(name, new String[]{ "ProcessCpuLoad" });

        if (list.isEmpty())     return Double.NaN;

        Attribute att = (Attribute)list.get(0);
        Double value  = (Double)att.getValue();

        // usually takes a couple of seconds before we get real values
        if (value == -1.0)      return Double.NaN;
        return value;
    }
}

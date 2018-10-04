SensorInjection
=========

L'objectif de ce TP est de transformer l'application SensorLab en une application avec de l'injection de dépendance

Ce TP doit être réalisé en 2 heures. 

```
public interface ISensor {
    public double getValue() throws SensorNotActivated;
    public void onOff();
    public boolean getStatus();
}
```

C'est un projet maven incluant les dépendances Spring (voir le pom.xml)

Pour ces exercices, vous n'avez pas besoin de modifier le code ou les interfaces des classes existantes
sauf InjectionApplication.
Vous pouvez éventuellement ajouter des annotations si besoin

a) Vous devez modifier InjectionApplication pour permettre l'initialisation de l'application
en construisant la configuration avec Spring.
- Faites la configuration en utilisant les annotations
- faites la configuration en faisant la configuration dans un fichier xml

b) écrivez une autre implantation de ISensor qui retourne toujours la même valeur et 
testez la avec une nouvelle configuration

c) en ajoutant un object adapter utilisez l'injection pour que le programme utilise l'implantation StrangeSensor. 



Vous pouvez utiliser cette référence pour vous aider
http://www.vogella.com/tutorials/SpringDependencyInjection/article.html

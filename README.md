SensorInjection
=========

L'objectif de ce TP est de transformer l'application SensorLab en une application avec de l'injection de dépendances.

Ce TP doit être réalisé en 2 heures (et déposer sur dépôt `github`). 

```java
public interface ISensor {
    public double getValue() throws SensorNotActivated;
    public void onOff();
    public boolean getStatus();
}
```

C'est un projet Maven incluant les dépendances Spring (voir le fichier`pom.xml`) mais également un projet Gradle 
(voir le fichier `build.gradle`). Vous pouvez donc utiliser à votre guise l'un de ces deux outils.

Pour ces exercices, vous n'avez pas besoin de modifier le code ou les interfaces des classes existantes
sauf `eu.telecomnancy.injection.InjectionApplication`.
Vous pouvez éventuellement ajouter des annotations si besoin

a) Vous devez modifier `eu.telecomnancy.injection.InjectionApplication` pour permettre l'initialisation de l'application
en construisant la configuration avec Spring :
- Faites la configuration en utilisant les annotations
- faites la configuration en faisant la configuration dans un fichier XML

b) Écrivez une autre implantation de l'interface `eu.telecomnancy.injection.ISensor` qui retourne toujours la même valeur
et testez la avec une nouvelle configuration.

c) En ajoutant un objet adapter utilisez l'injection pour que le programme utilise l'implantation founie 
`eu.telecomnancy.injection.StrangeSensor`. 


Vous pouvez utiliser cette référence pour vous aider :
http://www.vogella.com/tutorials/SpringDependencyInjection/article.html

Vous pouvez également utiliser la doc de référence de Spring :
https://spring.io/guides


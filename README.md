# Java Starter Template

Ce template fournit une structure de base pour les projets Java avec Maven, configuré pour Java 21.

## Prérequis

- Java JDK 20 ou supérieur
- Maven 3.8.0 ou supérieur

## Structure du projet

```
java-starter/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── fr/guardia/
│   │   │       └── App.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── fr/guardia/
│               └── AppTest.java
├── pom.xml
└── .gitignore
```

## Installation

1. Clonez le repository :
```bash
git clone https://github.com/xoudev/java-starter.git
cd java-starter
```

2. Construisez le projet :
```bash
mvn clean install
```

## Utilisation

Pour exécuter l'application :
```bash
mvn exec:java
```

Pour exécuter les tests :
```bash
mvn test
```

## Configuration

La configuration de base est dans `src/main/resources/application.properties`. Vous pouvez :
- Modifier le nom de l'application
- Ajuster les niveaux de logging
- Ajouter vos propres configurations

## Développement

Les dépendances principales sont déjà configurées dans le `pom.xml` :
- JUnit 5 pour les tests
- Lombok pour la réduction du boilerplate code
- SLF4J pour le logging

Pour ajouter de nouvelles dépendances, modifiez le fichier `pom.xml`.

## 👨‍💻 Auteur du template

- **Jordan** - [xoudev](https://github.com/xoudev)

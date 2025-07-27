# java-starter

Ce projet est un template de base pour les projets Java utilisant Maven.

## Prérequis

- Java JDK 8 ou supérieur
- Maven 3.6.0 ou supérieur

## Structure du projet

```
java-starter/
├── src/
│   └── main/
│       └── java/
│           └── App.java
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

## Structure du code

- `src/main/java/` : Contient le code source principal
- `pom.xml` : Fichier de configuration Maven
- `.gitignore` : Fichier de configuration Git pour ignorer les fichiers inutiles

## Développement

Pour ajouter de nouvelles dépendances, modifiez le fichier `pom.xml`.

## 👨‍💻 Auteur du template

- **Jordan** - [xoudev](https://github.com/xoudev)

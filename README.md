
# n8nWorkflows

Welcome to the **n8nWorkflows** repository — a modular library of automated projects built with [n8n](https://n8n.io), orchestrated and documented for quick integration.

## 🎯 Repository Purpose

This repository serves as a central hub for collecting and documenting workflows created in the n8n environment (via Docker). Each project in the `Workflows` branch includes:

- `.json` files to import workflows into n8n  
- PDF guides detailing configuration and workflow processes  
- A `resources/` folder containing all necessary execution files

## 🌿 `Workflows` Branch

The [`Workflows`](https://github.com/ahmed200346/n8nWorkflows/tree/Workflows) branch contains various n8n projects, each in its own folder (e.g., `Graph Rag Agent`), ready to be used and tested.

---

## 📦 Repository Contents

- `README.md` *(this file)*  
- `Workflows` branch: individual n8n projects  
- PDF documentation for each project  
- Docker is required to run the workflows locally





## 📁 README pour la branche `Workflow`

# Branche `Workflow` – Projets n8n

Cette branche regroupe plusieurs projets conçus avec **n8n**, chacun organisé dans un dossier spécifique.

## 📂 Organisation

Chaque dossier est un projet n8n contenant :
- `workflow.json` : le fichier à importer dans n8n
- `documentation.pdf` : une documentation complète expliquant :
  - le processus du workflow
  - la configuration
  - les étapes d'installation
- `resources/` : tous les fichiers nécessaires (données, scripts, etc.)

## 🐳 Prérequis

Les workflows sont conçus pour fonctionner dans un environnement **n8n Dockerisé**. Assure-toi que ton instance n8n est opérationnelle via Docker avant d'importer les fichiers JSON.

## 📥 Importation dans n8n

1. Lance ton instance n8n avec Docker.
2. Accède à l’interface web n8n.
3. Importe le fichier `.json` de ton projet.
4. Suis les étapes dans la documentation PDF pour la configuration.

## 🧠 Exemples de projets

- `Graph Rag Agent`  
  → Création d’une base de données + automatisation du traitement de données textuelles.

- `Agent Qdrant Integration`  
  → Connexion intelligente entre workflow et base vectorielle.


## 📝 Contribuer

N’hésite pas à proposer de nouveaux workflows, améliorer la documentation, ou structurer davantage les ressources.
>>>>>>> 86d9a53 (Update ReadMe branch Workflows)

<<<<<<< HEAD
=======


## 📁 README pour la branche `Workflows`

# Branche `Workflows` – Projets n8n

Cette branche regroupe plusieurs projets conçus avec **n8n**, chacun organisé dans un dossier spécifique.
[![n8n](https://img.shields.io/badge/n8n-Workflow-FF6D6D?style=flat-square&logo=n8n)](https://n8n.io/)
[![Qdrant](https://img.shields.io/badge/Qdrant-Vector%20DB-DC382C?style=flat-square&logo=qdrant)](https://qdrant.tech/)
[![OpenAI](https://img.shields.io/badge/OpenAI-GPT--4o%20mini-412991?style=flat-square&logo=openai)](https://openai.com/)
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
>>>>>>> 3344c24cb044314f4a30dff701efb0da0f6cefbe

# 📚 Graph RAG Agent avec n8n, Neo4j & Java/Markdown

Ce projet présente un système complet de **Graph Retrieval-Augmented Generation (Graph RAG)** basé sur :
- Des fichiers source Java et Markdown.
- Une base de graphes Neo4j hébergée dans le cloud.
- Une orchestration via n8n en mode self-hosted.
- Un agent conversationnel connecté à une base de graphes et une mémoire Postgres.

## 📁 Structure du dépôt
Workflows/
└── 📂 Graph RAG
    ├── 📄 Graph Database Resources_JAVA+MD.json
    │   └── 🔧 Workflow 1 : Ingestion des ressources Java & Markdown avec leur relations dans Neo4j
    ├── 📄 Graph RAG AGENT new resource JAVA,MD.json
    │   └── 🤖 Workflow 2 : Agent Graph RAG conversationnel interrogeant Neo4j
    ├── 📄 documentation.pdf
    │   └── 📘 Guide complet du système avec illustrations et explications détaillées
    └── 📂 resource/
        ├── 🔤 *.java
        ├── 📝 *.md / *.markdown
        └── 📂 (Sous-dossiers facultatifs selon la structure des ressources)

## 🚀 Objectif

Créer une base de connaissances intelligente en graphes en indexant du code source Java et sa documentation, puis interagir avec un agent IA capable de raisonner sur les relations entre fichiers, tout en justifiant les réponses.

## 🧰 Technologies

- [n8n](https://n8n.io/) (self-hosted avec Docker)
- [Neo4j AuraDB](https://console.neo4j.io/)
- OpenAI / Gemini (IA)
- Postgres (mémoire conversationnelle)
- LangChain (agent Graph RAG)

## ⚙️ Installation

### Prérequis

- Docker Desktop installé
- ~7 Go d’espace disque
- Compte Neo4j AuraDB
- Clé API OpenAI ou Gemini
- Clé API Google AI Studio si Gemini utilisé

### Étapes

1. Cloner le dépôt n8n :
    ```bash
    git clone https://github.com/n8n-io/self-hosted-ai-starter-kit.git
    cd self-hosted-ai-starter-kit
    copy .env.example .env
    docker-compose --profile cpu up
    ```

2. Copier les fichiers Java/Markdown dans :
    ```
    self-hosted-ai-starter-kit/data/shared/resource/
    ```

3. Importer les workflows via l'interface n8n :
    - http://localhost:5678
    - Menu Workflows → Import from file

## 🧠 Workflows

### 1️⃣ `Graph Database Resources_JAVA+MD.json`

> 📌 Ingestion et structuration de fichiers en base de graphes Neo4j

- Lit tous les fichiers `.java`, `.md`, `.markdown`
- Extrait, nettoie, et enrichit les métadonnées
- Crée les nœuds + relations sémantiques avec un agent IA
- Insertions via requêtes Cypher

### 2️⃣ `Graph RAG AGENT new resource JAVA,MD.json`

> 🤖 Agent conversationnel Graph RAG basé sur les données Neo4j

- Reçoit des questions via chat
- Utilise une IA + base Neo4j pour répondre
- Justifie chaque réponse avec relation + métadonnées + contenu

## 🔍 Test du système

> Une fois les deux workflows importés et exécutés :

- Accéder à l'interface n8n
- Envoyer des requêtes : *"Quel fichier documente tel autre fichier ?"*, *"Quelle est la relation entre A.java et B.md ?"*

## ✨ Résultat

- Réponses contextualisées
- Analyse multi-document sans hallucination
- Justifications transparentes et traçabilité complète

## 📄 Documentation

Le guide complet est disponible dans [`documentation.pdf`](./documentation.pdf) — il contient les captures d’écran, configurations détaillées des nœuds et procédures spécifiques.

## 📌 Auteur

👤 **Ahmed Aziz Ammar**

Passionné par les architectures modulaires, l’orchestration low-code, et l’IA connectée à des bases sémantiques.

---

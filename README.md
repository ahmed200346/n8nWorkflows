# 📂 Workflow Branch – Multi-Projects with n8n, Docker & Documentation

Cette branche contient plusieurs projets **n8n** organisés par dossiers, chacun prêt à être déployé via **Docker** et à importer ses propres workflows.

Chaque projet inclut :  
- Fichiers JSON à importer dans n8n  
- Documentation PDF détaillant le processus et la configuration  
- Ressources spécifiques (code source, données, etc.)  
- **Un dossier de résultats (`Capture of Result`)** montrant les exemples de graphes, de prompts et de réponses générées  

---

## 📁 Structure du dépôt

Workflow/  
├── 📂 Project_1_Name/  
│   ├── 📄 workflow1.json   # Workflow principal à importer  
│   ├── 📄 workflow2.json   # Workflow secondaire ou complémentaire  
│   ├── 📄 documentation.pdf   # Guide complet avec étapes + captures d'écran  
│   ├── 📂 resources/   # Ressources spécifiques (Java, Markdown, CSV, etc.)  
│   └── 📂 Capture of Result/   # Résultats et tests du projet  
│  
├── 📂 Project_2_Name/  
│   ├── 📄 workflow_main.json  
│   ├── 📄 workflow_extra.json  
│   ├── 📄 documentation.pdf  
│   ├── 📂 resources/  
│   └── 📂 Capture of Result/  
│  
└── 📂 Project_3_Name/  
    ├── 📄 ...  
    └── 📂 Capture of Result/  

---

## 🚀 Objectif

Centraliser plusieurs projets **n8n** autonomes dans une seule branche, chacun avec :  
- Son environnement Docker dédié  
- Ses workflows configurés et prêts à l’emploi  
- Sa documentation complète  
- Ses résultats illustrant la pertinence et la traçabilité des workflows  

---

## 🧰 Technologies utilisées

- [n8n](https://n8n.io/) (self-hosted avec Docker)  
- [Neo4j AuraDB](https://console.neo4j.io/) (pour stockage en graphes, si applicable)  
- PostgreSQL (mémoire conversationnelle, si applicable)  
- OpenAI / Gemini API (pour l’IA)  
- LangChain (pour agents RAG, si applicable)  

---

## ⚙️ Installation d’un projet

### 1️⃣ Prérequis
- Docker Desktop installé  
- 7 Go d’espace disque minimum  
- Clés API nécessaires (OpenAI, Gemini, Neo4j, etc. selon projet)  

### 2️⃣ Étapes
1. Cloner le dépôt et naviguer dans le dossier du projet choisi :  
   ```bash
    git clone https://github.com/ahmed200346/n8nWorkflows.git
    cd n8nWorkflows
    git fetch --all
    git branch -a
    git checkout -b Workflows origin/Workflows
   ```
2. Lancer l’environnement n8n :

    copy .env.example .env
    docker-compose --profile cpu up
3. Accéder à n8n via :
    http://localhost:5678
4. Importer les fichiers .json depuis le menu Workflows → Import from file

# 📜 Documentation
# Pour chaque projet, consulte le fichier documentation.pdf :

1. Processus détaillé (étapes d’exécution)

2. Configuration des nœuds

3. Paramètres spécifiques (API, connexions)

4. Astuces d’optimisation

# 📌 Auteur
## 👤 Ahmed Aziz Ammar
Passionné par les architectures modulaires, l’automatisation low-code, et l’IA connectée à des bases de connaissances.
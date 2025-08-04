# 📚 RAG Agent avec n8n, Qdrant & multi-format

Ce projet met en place un système **Retrieval-Augmented Generation (RAG)** permettant d’indexer des fichiers PDF, Java, et Markdown dans une base vectorielle Qdrant à l’aide de **n8n** en mode self-hosted.

---

## 📁 Structure du dépôt


Workflows/ └── 📂 RAG Agent ├── 📄 Rag Base de connaisance.json │   └── 🔧 Workflow 1 : Création de la base vectorielle Qdrant ├── 📄 Rag Agent.json │   └── 🤖 Workflow 2 : Agent conversationnel exploitant les embeddings ├── 📄 documentation.pdf │   └── 📘 Guide complet avec explications et procédure d’installation └── 📂 resource/ ├── 📄 *.pdf ├── 🔤 *.java ├── 📝 *.md / *.markdown └── 📂 (Sous-dossiers facultatifs selon la structure des ressources)

---

## 🚀 Objectif

Mettre en place une base vectorielle enrichie à partir de fichiers structurés, puis exploiter cette base via un agent IA pour des recherches **contextuelles, précises et traçables**.

---

## 🧰 Technologies

- [n8n](https://n8n.io/) (self-hosted avec Docker)
- [Qdrant](https://qdrant.tech/) Vector Store
- [OpenAI](https://openai.com/) (embeddings)
- [LangChain](https://www.langchain.com/) (modèles & loaders)

---

## ⚙️ Installation

### Prérequis

- Docker Desktop installé  
- Clé API OpenAI  
- Environnement n8n opérationnel

### Étapes


# Cloner le starter kit n8n
git clone https://github.com/n8n-io/self-hosted-ai-starter-kit.git
cd self-hosted-ai-starter-kit
copy .env.example .env
docker-compose --profile cpu up


# Copier les ressources (PDF, Java, Markdown)
self-hosted-ai-starter-kit/data/shared/resource/


- Accéder à l’interface n8n : http://localhost:5678
- Menu Workflows → Import from file (les deux fichiers JSON)

🧠 Workflows
1️⃣ Rag Base de connaisance.json
📌 Construction de la base vectorielle Qdrant :
- Lecture de fichiers PDF, Java, Markdown
- Extraction conditionnelle selon format
- Transformation du contenu en embeddings via OpenAI
- Insertion dans Qdrant avec métadonnées
2️⃣ Rag Agent.json
🤖 Agent RAG pour recherche augmentée :
- Reçoit une requête utilisateur
- Recherche les documents pertinents dans Qdrant
- Génère une réponse contextualisée via modèle IA

🔍 Test du système
Une fois les workflows importés et configurés :
- Utiliser l’interface n8n pour interroger la base vectorielle
- Exemples de requêtes :
- "Montre les fichiers liés au mot-clé ‘tokenisation’"
- "Quelles ressources parlent de la segmentation dans les PDF ?"

📄 Documentation
Un guide complet est disponible dans documentation.pdf, incluant :
- Captures d’écran
- Configuration des nœuds
- Installation pas à pas

📌 Auteur
👤 Ahmed Aziz Ammar
Créateur de solutions modulaires pour l’orchestration low-code et la recherche intelligente augmentée par l’IA.

Si tu veux l’accompagner d’un badge de version, d’une section "Licence" ou d’un lien vers ton profil GitHub, je peux enrichir ça aussi ! Tu veux qu'on ajoute des tags ou un sommaire automatique ?


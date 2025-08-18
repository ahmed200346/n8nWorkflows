# 📚 RAG Agent with n8n, Qdrant & Multi-Format

This project sets up a **Retrieval-Augmented Generation (RAG)** system that indexes PDF, Java, and Markdown files into a Qdrant vector database using **n8n** in self-hosted mode.

---

## 📁 Repository Structure

Workflows/  
└── 📂 RAG Agent  
    ├── 📄 Rag Knowledge Base.json  
    │   └── 🔧 Workflow 1: Creating the Qdrant vector database  
    ├── 📄 Rag Agent.json  
    │   └── 🤖 Workflow 2: Conversational agent using embeddings  
    ├── 📄 documentation.pdf  
    │   └── 📘 Complete guide with explanations and installation steps  
    └── 📂 resource/  
        ├── 📄 *.pdf  
        ├── 🔤 *.java  
        ├── 📝 *.md / *.markdown  
└── 📂 Capture of Results
    ├── 📂 Response From Same Project
    │   └── 🧪 Contains prompt examples using resources from a single project
    └── 📂 Response From Different Projects
        └── 🧪 Contains prompt examples using resources from multiple projects

---
## 🚀 Purpose

Build an enriched vector database from structured files, then use it via an AI agent for **contextual, accurate, and traceable** search.

---

## 🧰 Technologies

- [n8n](https://n8n.io/) (self-hosted with Docker)  
- [Qdrant](https://qdrant.tech/) Vector Store  
- [OpenAI](https://openai.com/) (embeddings)  
- [LangChain](https://www.langchain.com/) (models & loaders)

---

## ⚙️ Installation

### Prerequisites

- Docker Desktop installed  
- OpenAI API key  
- Running n8n environment

### ⚙️ Installation Steps

#### 🛠️ Clone the n8n starter kit

git clone https://github.com/n8n-io/self-hosted-ai-starter-kit.git
cd self-hosted-ai-starter-kit
copy .env.example .env
docker-compose --profile cpu up

📂 Add resources
Copy your PDF, Java, and Markdown files to:
self-hosted-ai-starter-kit/data/shared/resource/
🧑‍💻 n8n Interface
- URL: http://localhost:5678
- Import workflows via: Menu → Workflows → Import from file
🧠 Workflows
1️⃣ Rag Knowledge Base.json
📌 Builds the Qdrant vector database:
- 📄 Reads PDF, Java, Markdown files
- ✂️ Conditional extraction based on format
- 🔍 Converts to embeddings via OpenAI
- 📥 Inserts into Qdrant with metadata
2️⃣ Rag Agent.json
🤖 RAG Agent for augmented search:
- 💬 Receives user query
- 🔎 Searches relevant documents via Qdrant
- 🧠 Generates contextualized response using AI
🔍 System Testing
Once workflows are imported and configured:
Example queries:
• "Show files related to the keyword ‘tokenization’"
• "Which resources mention segmentation in PDFs?"

📄 Documentation
📘 The full guide is available in documentation.pdf, including:
- 🖼️ Screenshots
- 🧩 Node configuration
- 🛠️ Step-by-step installation

## 📸 Capture of Results


To illustrate how the RAG agent performs across different resource contexts, this repository includes this folder :
Workflows/
└── 📂 Capture of Results
    ├── 📂 Response From Same Project
    │   └── 🧪 Contains prompt examples using resources from a single project
    └── 📂 Response From Different Projects
        └── 🧪 Contains prompt examples using resources from multiple projects

These subfolders showcase how the agent responds when provided with different scopes of input data. Each example demonstrates the system’s ability to generate contextualized answers based on either isolated or cross-project knowledge.

📌 Author
👤 Ahmed Aziz Ammar
Creator of modular solutions for low-code orchestration and intelligent AI-powered search.








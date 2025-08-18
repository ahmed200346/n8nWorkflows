# 📚 Graph RAG Agent with n8n, Neo4j & Java/Markdown

This project presents a complete **Graph Retrieval-Augmented Generation (Graph RAG)** system based on:
- Java and Markdown source files  
- A cloud-hosted Neo4j graph database  
- Orchestration via self-hosted n8n  
- A conversational agent connected to the graph database and a Postgres memory

## 📁 Repository Structure

Workflows/  
└── 📂 Graph RAG  
    ├── 📄 Graph Database Resources_JAVA+MD.json  
    │   └── 🔧 Workflow 1: Ingest Java & Markdown resources and their relationships into Neo4j  
    ├── 📄 Graph RAG AGENT new resource JAVA,MD.json  
    │   └── 🤖 Workflow 2: Graph RAG conversational agent querying Neo4j  
    ├── 📄 documentation.pdf  
    │   └── 📘 Complete system guide with illustrations and detailed explanations  
    ├── 📂 resource/  
    │   ├── 🔤 *.java  
    │   ├── 📝 *.md / *.markdown  
    │   └── 📂 (Optional subfolders depending on resource structure)  
    └── 📂 Capture of Results  
        ├── 📂 NEO4J  
        │   └── 🖼️ Example captures of nodes and relationships created in Neo4j based on resources in the `resource/` folder  
        ├── 📂 Response From Different Projects  
        │   ├── 📄 README.md → Example prompts using resources from *different projects* with their responses  
        │   └── 🖼️ Captures of query results and AI responses  
        └── 📂 Response From Same Project  
            ├── 📄 README.md → Example of a prompt and its response using resources from the *same project*  
            └── 🖼️ Captures of query results and explanations

## 🚀 Purpose

Build an intelligent graph-based knowledge base by indexing Java source code and its documentation, then interact with an AI agent capable of reasoning over file relationships and justifying its answers.

## 🧰 Technologies

- [n8n](https://n8n.io/) (self-hosted with Docker)  
- [Neo4j AuraDB](https://console.neo4j.io/)  
- OpenAI / Gemini (AI)  
- Postgres (conversational memory)  
- LangChain (Graph RAG agent)

## ⚙️ Installation

### Prerequisites

- Docker Desktop installed  
- ~7 GB of disk space  
- Neo4j AuraDB account  
- OpenAI or Gemini API key  
- Google AI Studio API key if using Gemini

### Steps

1. Clone the n8n starter kit:
    ```bash
    git clone https://github.com/n8n-io/self-hosted-ai-starter-kit.git
    cd self-hosted-ai-starter-kit
    copy .env.example .env
    docker-compose --profile cpu up
    ```

2. Copy your Java/Markdown files to:
    ```
    self-hosted-ai-starter-kit/data/shared/resource/
    ```

3. Import the workflows via the n8n interface:
    - http://localhost:5678  
    - Menu → Workflows → Import from file

## 🧠 Workflows

### 1️⃣ `Graph Database Resources_JAVA+MD.json`

> 📌 Ingest and structure files into the Neo4j graph database

- Reads all `.java`, `.md`, `.markdown` files  
- Extracts, cleans, and enriches metadata  
- Creates nodes + semantic relationships using an AI agent  
- Inserts data via Cypher queries

### 2️⃣ `Graph RAG AGENT new resource JAVA,MD.json`

> 🤖 Graph RAG conversational agent based on Neo4j data

- Receives questions via chat  
- Uses AI + Neo4j graph to respond  
- Justifies each answer with relationships, metadata, and content

## 🔍 System Testing

> Once both workflows are imported and executed:

- Access the n8n interface  
- Send queries like: *"Which file documents another?"*, *"What is the relationship between A.java and B.md?"*

## ✨ Result

- Contextualized responses  
- Multi-document analysis without hallucination  
- Transparent justifications and full traceability  

Additionally, check the **Capture of Results** folder for:  
- Neo4j graph screenshots of nodes and relationships  
- Example prompts and responses across different projects  
- Example prompts and responses within the same project  

## 📄 Documentation

The complete guide is available in [`documentation.pdf`](./documentation.pdf) — it includes screenshots, detailed node configurations, and specific procedures.

## 📌 Author

👤 **Ahmed Aziz Ammar**

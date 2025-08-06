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
    └── 📂 resource/  
        ├── 🔤 *.java  
        ├── 📝 *.md / *.markdown  
        └── 📂 (Optional subfolders depending on resource structure)

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

## 📄 Documentation

The complete guide is available in [`documentation.pdf`](./documentation.pdf) — it includes screenshots, detailed node configurations, and specific procedures.

## 📌 Author

👤 **Ahmed Aziz Ammar**  

[![n8n](https://img.shields.io/badge/n8n-Workflow-FF6D6D?style=flat-square&logo=n8n)](https://n8n.io/)
[![Qdrant](https://img.shields.io/badge/Qdrant-Vector%20DB-DC382C?style=flat-square&logo=qdrant)](https://qdrant.tech/)
[![OpenAI](https://img.shields.io/badge/OpenAI-GPT--4o%20mini-412991?style=flat-square&logo=openai)](https://openai.com/)

## 📁 README for the `Workflows` Branch

# `Workflows` Branch – n8n Projects

This branch contains several projects built with **n8n**, each organized in its own folder.

## 📂 Structure

Each folder is an n8n project containing:
- `workflow.json`: the file to import into n8n
- `documentation.pdf`: a complete guide explaining:
  - the workflow process
  - configuration details
  - installation steps
- `resources/`: all necessary files (data, scripts, etc.)

## 🐳 Prerequisites

These workflows are designed to run in a **Dockerized n8n environment**. Make sure your n8n instance is up and running via Docker before importing the JSON files.

## 📥 Importing into n8n

1. Start your n8n instance using Docker.  
2. Access the n8n web interface.  
3. Import the `.json` file from your project.  
4. Follow the steps in the PDF documentation for configuration.

## 🧠 Project Examples

- `Graph Rag Agent`  
  → Creates a database + automates processing of textual data.

- `Agent Qdrant Integration`  
  → Smart connection between workflow and vector database.

## 📝 Contributing

Feel free to suggest new workflows, improve documentation, or better structure the resources.

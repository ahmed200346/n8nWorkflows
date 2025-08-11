# 📚 Projet de Gestion de Bibliothèque

Ce projet permet de gérer une bibliothèque avec des livres, revues et la gestion d'utilisateurs (emprunt, retour).

## 📦 Fonctionnalités

- Ajout de documents (livres, revues)
- Enregistrement et gestion d’utilisateurs
- Emprunt et retour de documents
- Vérification de la disponibilité

## 🧱 Structure Principale

- `Document` (abstraite)
- `Livre`, `Revue`
- `Utilisateur` (nom, id, liste d’emprunts)
- `BibliothequeService`

## ▶️ Exemple

```text
➕ Livre ajouté : "1984"
➕ Revue ajoutée : "Science Mag"
✅ Emprunt par Yassine : "1984"
❌ Le document "Science Mag" est déjà emprunté.

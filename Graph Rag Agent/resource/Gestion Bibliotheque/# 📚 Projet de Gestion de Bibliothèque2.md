
# 📄 Documentation Fonctionnelle - Gestion de Bibliothèque

## 📌 Objectifs

- Gérer des ressources documentaires (livres, revues)
- Permettre aux utilisateurs d’emprunter/retourner des documents

## 📚 Types de documents

- Livre : avec auteur, ISBN
- Revue : avec volume, numéro

## 👤 Utilisateur

- `nom`, `id`
- `listeEmprunts`

## 🔁 Emprunt

- Vérifie si disponible
- Ajoute au compte utilisateur
- Met à jour la disponibilité

## 🔄 Retour

- Retire le document de l'utilisateur
- Rend le document disponible

## 🔧 Extensions possibles

- Durée d'emprunt
- Pénalités de retard
- Système de réservation

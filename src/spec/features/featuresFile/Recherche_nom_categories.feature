@categoriesname
Feature: Recherche nom catégories
ETQ utilisateur je souhaite chercher le nom de catégorie

Background:
Given Je visite l'application NopCommerce 
When Je saisis l'adresse mail "admin@yourstore.com"
And Je saisis le login "admin"
And Je clique sur le bouton Login
Then Je me redirige vers la page home


@categoriesname
Scenario:Je souhaite tester le nom de categorie
Given Je visite l'application NopCommerce 
When Je saisis l'adresse mail "admin@yourstore.com"
And Je saisis le login "admin"
And Je clique sur le bouton Login
And Je clique sur Catalog
And je clique sur Categories
And je saisis le nom du Categorie "computer"
And je clique sur le bouton search categorie

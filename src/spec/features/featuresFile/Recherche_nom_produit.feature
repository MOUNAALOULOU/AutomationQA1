@productname
Feature: Recherche nom produit
ETQ utilisateur je souhaite chercher le nom du produit


@productname
Scenario:Je souhaite tester la page LOGIN
Given Je visite l'application NopCommerce 
When Je saisis l'adresse mail "admin@yourstore.com"
And Je saisis le login "admin"
And Je clique sur le bouton Login
Then Je me redirige vers la page home
And Je clique sur Catalog
And je clique sur Products
And je saisis le nom du produit "bijoux"
And je clique sur le bouton search

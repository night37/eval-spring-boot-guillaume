# Liste des routes de l'application evalspring

## Ajouter une categorie
**methode** : *POST*

**url** : *basePath/categorie*

**body** : {
  "libele": string
}

## afficher une categorie
**methode** : *GET*

**url** : *basePath/categorie/{id}*

## afficher toute les categories
**methode** : *GET*

**url** : *basePath/categories*

## Ajouter un produit
**methode** : *POST*

**url** : *basePath/produit*

**body** : {
  "nom" : string,
  "prix": float,
  "categorie": {
    "id": int
  }
}

## afficher une produit
**methode** : *GET*

**url** : *basePath/produit/{id}*

## afficher tout les produits
**methode** : *GET*

**url** : *basePath/produits*
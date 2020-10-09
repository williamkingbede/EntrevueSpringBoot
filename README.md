# Test Analyste-Programmeur Desjardins (Java Spring Boot)

## Objectif du test

Votre objectif pour ce test est de créer un API Rest avec Java et Spring Boot
pour ajouter et obtenir les détails d'un film.

Vous devez créer 2 endpoints dans l'API:

- Un GET pour obtenir un film par ID dans la base de données en mémoire (H2).
- Un POST pour ajouter un film dans la base de données en mémoire (H2).

## Présomptions

- Ne vous souciez pas de valider l'entrer de l'utilisateur, vous pouvez présumer que la requête sera toujours valide.
- Il n'est pas nécessaire d'implémenter un mécanisme de sécurité.
- Il n'est pas nécessaire d'écrire des tests unitaires.

## Critères

- 2 endpoints REST fonctionnels
- Structure des classes
- Qualité du code
- Utilisation des meilleurs pratiques

## Outils à utiliser

Le projet contient déjà les dépendances Maven requises et la configuration nécessaire pour H2.  
Vous avez aussi, optionnellement, la possibilité d'utiliser les librairies Lombok et MapStruct si vous le désirez.

- Java 11
- Maven
- Spring Boot
- Spring Data JPA
- Base de donnée en mémoire H2
- Lombok (Optionnel)
- Mapstruct (Optionnel)

## Modèle

#### Film

```
{
    "id": long,
    "titre": string,
    "description": string
    "acteurs": [
        {
            "id": long,
            "nom": string,
            "prenom": string
        }
    ]
}
```

## Endpoints

#### GET /api/film/{id}

- Requête: ID dans l'URI
- Réponse: Objet Film (Voir modèle)
- Status: 200 OK

```
$ curl http://localhost:8080/api/film/1
{
   "id":1,
   "titre":"Star Wars: The Empire Strikes Back",
   "description":"Darth Vader is adamant about turning Luke Skywalker to the dark side.",
   "acteurs":[
      {
         "id":2,
         "nom":"Ford",
         "prenom":"Harrison"
      },
      {
         "id":3,
         "nom":"Hamill",
         "prenom":"Mark"
      }
   ]
}
```

#### POST /api/film

- Requête: Objet Film dans le body
- Réponse: Objet Film créer
- Status: 201 CREATED

```
$ curl -X POST --data
'{
   "titre":"Star Wars: The Empire Strikes Back",
   "description":"Darth Vader is adamant about turning Luke Skywalker to the dark side.",
   "acteurs":[
      {
         "nom":"Ford",
         "prenom":"Harrison"
      },
      {
         "nom":"Hamill",
         "prenom":"Mark"
      }
   ]
}'
http://localhost:8080/api/film --header "Content-Type:application/json"

{
   "id":4,
   "titre":"Star Wars: The Empire Strikes Back",
   "description":"Darth Vader is adamant about turning Luke Skywalker to the dark side.",
   "acteurs":[
      {
         "id":5,
         "nom":"Ford",
         "prenom":"Harrison"
      },
      {
         "id":6,
         "nom":"Hamill",
         "prenom":"Mark"
      }
   ]
}
```

## Validation des endpoints

Vous pouvez utiliser la collection postman inclus dans le projet si vous désirez valider votre API avec des assertions.  
Celle-ci se retrouve dans le dossier **postman** du projet.

## Soumettre le test

Une fois terminer, veuillez créer un fichier **zip** du projet ou créer un nouveau dépot sur GitHub et l'envoyer par courriel à **francois.a.crispo-sauve@desjardins.com**

Bonne chance!

<img src="Desjardins_Logo.png" width="20%" height="20%">

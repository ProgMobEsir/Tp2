# Tp2 ProgMob

Durant ce tp, nous avons appris à utiliser les adapters et les listes, ainsi que les bases d'une application android.

Nous utiliserons android studio pour ce tp.

## Première étape : 
Créer une interface avec une list View qui affichera le contenu d’une arraylist que
vous aurez rempli auparavant avec le nom des 4 départements Breton : 

## Réalisation

Premierement, nous avons créer une arraylist classique avec le nom des départements bretons


- Afin de l'afficher sur notre application, nous avons du passer par un ArrayAdapter, qui va nous permettre de créer une liste d'éléments à partir de notre arraylist. 


## Deuxième étape :

Pour pouvoir ouvrire une popup lorsqu'on clique sur un élément de la liste, nous avons du créer un OnItemClickListener sur notre liste. Cela permet de récupérer l'id de l'élément sur lequel on a cliqué.

à partir cet id, on vient récuperer l'élément dans notre liste initiale pour ensuite créer une popup qui va afficher le nom de l'élément sur lequel on a cliqué.



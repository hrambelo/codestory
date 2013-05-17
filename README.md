Codestory 2013
=========

Ceci est le projet représentant ma contribution au concours <a href="http://code-story.net/">codestory 2013</a>

Code bien-sûr protégé par copyright, avant de copier contactez votre avocat :)

Live
- - - - - - - -
Un live de l'appli est disponible à l'adresse : {{Coming soon ... :) }}


Sujet 1 :
- - - - - - - - - - - - - - -
L’échoppe de monade sur Scalaskel.

Sur la planète Scalaskel, une planète en marge de la galaxie, aux confins de l’univers, la monnaie se compte en cents, comme chez nous. 100 cents font un groDessimal. Le groDessimal est la monnaie standard utilisable partout sur toutes les planètes de l’univers connu. C’est un peu compliqué à manipuler, mais si on ne s’en sert pas y’a toujours des erreurs d’arrondis incroyables quand on les soustrais ou on les divise, c’est idiot, mais c’est comme ça. Sur Scalaskel, on utilise rarement des groDessimaux, on utilise des pièces plus petites : Le Foo vaut 1 cent, le Bar vaut 7 cents, le Qix vaut 11 cents et le Baz vaut 21 cents.

Vous tenez une échoppe de monade et autres variables méta-syntaxique sur Scalaskel. Pour faire face à l’afflux de touristes étrangers avec les poches remplies de groDessimaux vous avez besoin d’écrire un programme qui pour toute somme de 1 à 100 cents, vous donnera toutes les décompositions possibles en pièces de Foo, Bar, Qix ou Baz.

Par exemple, 1 cent ne peut se décomposer qu’en une seule pièce Foo. Par contre 7 cents peuvent se décomposer soit en 7 pièces Foo, soit en 1 pièce Bar.

Serveur Web :

Votre serveur doit répondre aux requetes http GET de la forme http://serveur/scalaskel/change/X, X étant une valeur en cents de 1 à 100 cents.

La réponse attendue est un json de la forme :

[{“foo”: w, “bar”: x, “qix”: y, “baz”: z}, …]>
Exemples Pour http://serveur/scalaskel/change/1 il faut répondre :

[ {“foo”: 1} ]
Pour http://serveur/scalaskel/change/7 il faut répondre :

[ {“foo”: 7}, {“bar”: 1} ]
L’ordre des valeurs dans le tableau json, ainsi que le formatage n’a pas d’importance à partir du moment ou c’est du json valide, il s’entends.

Bon courage !


Sujet 2 :
- - - - - - - - - - - - - - -
## Location d'astronef sur Jajascript

Votre cousin par alliance, Martin O. sur la planÃ¨te Jajascript vient de monter sa petite entreprise de vol spatial
privÃ©e: Jajascript Flight Rental. Il loue aux grosses corporations son astronef lorsqu'elles ont de fortes charges ou un
pÃ©pin avec leurs propres appareils. Il s'occupe de la maintenance et de l'entretien de son petit astronef. Il ne pouvait
s'en payer qu'un pour dÃ©marrer.

Ces grosses corporations envoient des commandes de location qui consistent en un intervalle de temps, et le prix qu'ils
sont prÃªts Ã  payer pour louer l'astronef durant cet intervalle.

Les commandes de tous les clients sont connues plusieurs jours Ã  l'avance. Ce qui permet de faire un planning pour une
journÃ©e.
Les commandes viennent de plusieurs sociÃ©tÃ©s diffÃ©rentes et parfois elles se chevauchent. On ne peut donc pas toutes les
honorer.

IdÃ©alement, il faut donc Ãªtre capable de prendre les plus rentables, histoire de maximiser les gains de sa petite
entreprise, et de s'acheter d'autres astronefs.
Votre cousin passe des heures Ã  trouver le planning idÃ©al et vous demande **pour un planning donnÃ© de calculer une
solution qui maximise son gain**.

### Exemple

ConsidÃ©rez par exemple le cas oÃ¹ la JajaScript Flight Rental a 4 commandes :

	MONAD42 : heure de dÃ©part 0, durÃ©e 5, prix 10
	META18 : heure de dÃ©part 3, durÃ©e 7, prix 14
	LEGACY01 : heure de dÃ©part 5, durÃ©e 9, prix 8
	YAGNI17 : heure de dÃ©part 5, durÃ©e 9, prix 7

La solution optimale consiste Ã  accepter MONAD42 et LEGACY01, et le revenu est de `10 + 8 = 18`. Remarquez qu'une
solution Ã  partir de MONAD42 et YAGNI17 est faisable (l'avion serait louÃ© sans interruption de 0 Ã  14) mais non
optimale car le bÃ©nÃ©fice serait que de 17.

### PrÃ©cisions

L'identifiant d'un vol ne dÃ©passe jamais 50 caractÃ¨res,
les heures de dÃ©parts, durÃ©e et prix sont des entiers positifs raisonnablement grands.

### Serveur

Votre serveur doit rÃ©pondre aux requÃªtes http POST de la forme `http://serveur/jajascript/optimize` avec un payload de
la forme :

	[
		{ "VOL": "NOM_VOL", "DEPART": HEURE, "DUREE": DUREE, "PRIX": PRIX },
		...
	]

En reprenant l'exemple ci dessus :

	[
		{ "VOL": "MONAD42", "DEPART": 0, "DUREE": 5, "PRIX": 10 },
		{ "VOL": "META18", "DEPART": 3, "DUREE": 7, "PRIX": 14 },
		{ "VOL": "LEGACY01", "DEPART": 5, "DUREE": 9, "PRIX": 8 },
		{ "VOL": "YAGNI17", "DEPART": 5, "DUREE": 9, "PRIX": 7 }
	]

Vous devrez rÃ©pondre le rÃ©sultat suivant :

	{
		"gain" : 18,
		"path" : ["MONAD42","LEGACY01"]
	}

Le gain reprÃ©sentant la somme optimale, path reprÃ©sentant l'ordre des vols.

Bons calculs !
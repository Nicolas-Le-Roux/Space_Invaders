# Space_Invaders
This is a JAVA scholar project about designing a Space Invaders based game. If you don't like java programming, or if you don't know what I mean by "Space Invaders based game", you can close this window and get back to a normal activity.

CASTELLAN Vincent
DIAS Nicolas
LE ROUX Nicolas

Pour pouvoir exécuter ce projet, il suffit de télécharger par zip le contenu de la branche "nouveau_main", de le dézipper, et d'ouvrir, à travers Intellij,
le projet au niveau Space_Invaders.
Il vous faudra par la suite télécharger les libraires suivantes en utilisant Maven (un copier-coller est fortement recommandé):

org.openjfx:javafx-media:18.0.1     
com.google.guava:guava:14.0.1     
org.hamcrest:hamcrest-junit:2.0.0.0     
junit:junit:4.12      
org.loadui:testFx:3.1.2     
org.testfx:testfx-core:4.0.6-alpha      
org.testfx:testfx-junit:4.0.6-alpha     

Enfin, il peut être nécéssaire de cliquer sur le répertoire tests, "Mark repository as", "Tests root".
Les adresses relatives des fichiers suivent la convention Windows : si vous êtes détenteur d'un système non-compatible, le jeu fonctionnera toujours, mais en
mode dégradé (pas d'images, de fond et de musique).

Afin de lancer l'application, il faut lancer la classe HelloApplication situé : src/main/java/com/example/space_invaders/HelloApplication.java

Une fois cela fait, on arrive à l'écran d'accueil du jeu.     
De là, il est possible:     
-De personnaliser en cliquant sur les flèches, puis de jouer une partie à un joueur en utilisant les touches directionnelles du clavier. En appuyant sur la flèche du bas on alterne entre deux modes de tir: automatique et manuel, et en mode manuel on peut tirer en appuyant sur la flèche du haut.      
-De personnaliser en cliquant sur les flèches, puis de jouer une partie à deux joueurs en utilisant les touches directionnelles du clavier pour le premier joueur, et les touches "q" et "d" pour le deuxième joueur. Pour tirer, même principe qu'en 1 joueur, et pour le joueur 2 ce sont les touches S pour changer de mode, et Z pour tirer.

Il est possible de mettre PAUSE en appuyant sur la barre d'espace, ainsi que de continuer à joueur en ré-appuyant sur la barre d'espace.
Il est à noter que le jeu propose un fond sonore.
Les parties s'enchaînent par niveau de difficulté croissantes tant que le/les joueur(s) gagnent, et il est possible de revenir à l'écran d'accueil à la fin de chaque niveau.

Il est possible de tester les fonctions de manipulation des objets en lançant tests/Objet/objetTest.java

Pour la partie "Network play" en multijoueur, il est nécessaire de modifier les adresses IP et ports dans la classe Menu en fonction de l'ordinateur avec lequel on souhaite se connecter.

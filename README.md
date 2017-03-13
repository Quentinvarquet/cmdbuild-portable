# Installation 

Le répertoire doit se trouver dans un path sans espace. (Par exemple à la racine de votre disque C:\)

		c:\cmdbuild_portable

# Configuration 

* Telecharger la dernière version de cmdbuild : https://sourceforge.net/projects/cmdbuild/files/latest/download

* Dans l'archive téléchargée, copier le fichier cmdbuild-$version.war dans c:\cmdbuild_portable\tomcat\webapps et renommez le en cmdbuild.war

* Dans le dossier c:\cmdbuild_portable\tomcat\bin, ouvrez le fichier catalina.bat et modifier la deuxième ligne pour indiquer où se trouve JDK sur votre PC 

		set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_101

		

* Une fois fait, vous pouvez sauvegarder et lancer tomcat. Toujours dans le dossier c:\cmdbuild_portable\tomcat\bin : startup.bat

* Lancez votre base postgresql : PostgreSQLPortable.exe

* Une fois tomcat + postgresql démarré. Rendez vous sur http://localhost:8080/cmdbuild

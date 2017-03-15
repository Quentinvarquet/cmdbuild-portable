Version CMDBUILD : 2.4.3 (fevrier 2017)

# Installation 

Le répertoire doit se trouver dans un path sans espace. (Par exemple à la racine de votre disque C:\)

		c:\cmdbuild_portable

# Configuration 

* Téléchargez la dernière version de cmdbuild : https://sourceforge.net/projects/cmdbuild/files/latest/download

* Dans l'archive téléchargée, copiez le fichier cmdbuild-$version.war dans c:\cmdbuild_portable\tomcat\webapps et renommez le en cmdbuild.war
		

* Une fois fait, vous pouvez sauvegarder et lancer tomcat. Toujours dans le dossier c:\cmdbuild_portable\tomcat\bin : startup.bat

* Lancez votre base postgresql : PostgreSQLPortable.exe

* Une fois tomcat + postgresql démarrés. Rendez vous sur http://127.0.0.1:8080/cmdbuild

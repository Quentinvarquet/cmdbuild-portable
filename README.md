# Installation 

Le r�pertoire doit se trouver dans un path sans espace. (Par exemple � la racine de votre disque C:\)

		c:\cmdbuild_portable

# Configuration 

* T�l�chargez la derni�re version de cmdbuild : https://sourceforge.net/projects/cmdbuild/files/latest/download

* Dans l'archive t�l�charg�e, copiez le fichier cmdbuild-$version.war dans c:\cmdbuild_portable\tomcat\webapps et renommez le en cmdbuild.war

* Dans le dossier c:\cmdbuild_portable\tomcat\bin, ouvrez le fichier catalina.bat et modifier la deuxi�me ligne pour indiquer o� se trouve JDK sur votre PC 

		set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_101

		

* Une fois fait, vous pouvez sauvegarder et lancer tomcat. Toujours dans le dossier c:\cmdbuild_portable\tomcat\bin : startup.bat

* Lancez votre base postgresql : PostgreSQLPortable.exe

* Une fois tomcat + postgresql d�marr�s. Rendez vous sur http://127.0.0.1:8080/cmdbuild

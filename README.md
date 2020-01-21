# EJBContainer

EJBContainer es un proyecto para mostrar como probar EJB , con el contenedor embebido de IBM com.ibm.ws.ejb.embeddableContainer_8.5.0.jar 

### Installation

Instalar dependencia en el repositorio de maven  com.ibm.ws.ejb.embeddableContainer_8.5.0.jar, este jar está en la ruta de instalación del WAS /opt/IBM/WebSphere/AppServer/runtimes/com.ibm.ws.ejb.embeddableContainer_8.5.0.jar

```sh
$ mvn install:install-file -Dfile=/opt/IBM/WebSphere/AppServer/runtimes/com.ibm.ws.ejb.embeddableContainer_8.5.0.jar -DgroupId=com.ibm.websphere 	-DartifactId=was-embeddableContainer -Dversion=8.5.0 -Dpackaging=jar

```

# Patterns Lab 2 CVDS 
    
# Integrantes

 - Camilo Andres Fernandez Diaz
 - Roger Alexander Rodriguez Abril

# La herramienta de Maven
   * ¿Qué es Maven?
      - Maven es una herramienta de software para la gestión y construcción de proyectos Java. Esta herramienta utiliza un archivo XML para describir el software del proyecto, sus dependencias en otros módulos y componentes externos, y el orden de construcción de los elementos. Esta viene con objetivos predefinidos para realizar ciertas tareas, como la compilación del código y su empaquetado. 
      - Maven fomenta las mejores prácticas de desarrollo de software, como la gestión de dependencias, la gestión de la configuración, la documentación del proyecto y la publicación de información de un proyecto.
 
# Ejercicio de las figuras
# Creacion del proyecto con Maven
   - Para crear un proyecto maven desde 0 lo primero que haremos es abrir command prompt o el simbolo de sistema y ir al directorio donde se quiere crear el proyecto y se introducira el siguiente comando como se vera en la imagen:
   ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/CrearProyecto.png)
     Este comando sera utilizado para la creacion del proyecto maven llamado Patterns donde en este caso se utilizaran las siguientes especificaciones:
        - groupId: edu.eci.cvds
        - artifactId: Patterns
        - package: edu.eci.cvds.patterns.archetype
        - archetypeArtifactId: maven-archetype-quickstart

   - Una vez creado el proyecto cambiaremos de directorio a Patterns con el siguiente comando:
   ```bash
      cd Patterns
   ```

   - Luego de esto se creara la estructura del proyecto y para ver el conjunto de archivos y directorios creados por el comando mvn se digitara el comando tree como se vera en la imagen:
   ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/Estructura.png)
# Ajustar el proyecto
   - Para ajustar el proyecto se debe abrir el archivo pom.xml que se encuentra en la raiz del proyecto y se debe cambiar la version de java a 8 y para ello en la seccion de properties se debe agregar las siguientes lineas:
   ```xml
      <maven.compiler.source>1.8</maven.compiler.source>
      <maven.compiler.target>1.8</maven.compiler.target>
   ```
# Compilar y ejecutar el proyecto
   - Para compilar el proyecto se debe ejecutar el siguiente comando:
   ```bash
      mvn package
   ```
![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/Paquete.png)

   - Y si se quieren actualizar las dependencias en caso de que se hayan modificado se debe ejecutar el siguiente comando:
   ```bash
      mvn compile
   ```
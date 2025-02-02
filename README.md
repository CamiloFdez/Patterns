# Patterns Lab 2 CVDS 
    
# Integrantes

 - Camilo Andres Fernandez Diaz
 - Roger Alexander Rodriguez Abril

# La herramienta de Maven
   * ¿Qué es Maven?
        - Maven es una herramienta de software para la gestión y construcción de proyectos Java. Esta herramienta utiliza un archivo XML para describir el software del proyecto, sus dependencias en otros módulos y componentes externos, y el orden de construcción de los elementos. Esta viene con objetivos predefinidos para realizar ciertas tareas, como la compilación del código y su empaquetado. 
        - Maven fomenta las mejores prácticas de desarrollo de software, como la gestión de dependencias, la gestión de la configuración, la documentación del proyecto y la publicación de información de un proyecto.
   * Fases de maven:
        - Las fases que tiene maven son:
            - Fase de limpieza: En esta fase se eliminan todos los archivos generados por la compilación anterior.
            - Fase de compilación(compile): En esta fase se compila el código fuente del proyecto.
            - Fase de empaquetado(package): En esta fase se empaqueta el código compilado en un formato distribuible, como un JAR.
            - Fase de prueba(test): En esta fase se ejecutan las pruebas unitarias del proyecto.
            - Fase de instalación(install): En esta fase se instala el paquete en el repositorio local, para su uso como dependencia en otros proyectos localmente.
            - Fase de despliegue(deploy): En esta fase se copia el paquete final a un repositorio remoto para compartirlo con otros usuarios o programas.
   * ¿Para qué sirven los plugins?
        - Un plugin es un conjunto de objetivos que se pueden ejecutar en un proyecto Maven donde estos objetivos son tareas específicas que se pueden ejecutar en un proyecto Maven. Maven tiene muchos plugins que se pueden utilizar para realizar tareas específicas en un proyecto Maven y estos se utilizan para extender la funcionalidad de Maven y el proyecto que se quiere crear.
   * ¿Qué es y para qué sirve el repositorio central de maven?
        - El repositorio central de Maven es un repositorio de artefactos de software que se utilizan en proyectos Maven. Este repositorio contiene una gran cantidad de artefactos de software que se pueden utilizar en proyectos Maven y se utiliza para almacenar y distribuir artefactos de software en un proyecto Maven.


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

   * ¿Cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn?
        -

   - Ahora se busca ejecutar desde línea de comandos, un proyecto maven y en el proceso verificaremos la salida al ejecutar la clase App.java
   - Para ello usaremos un comando para ejecutar el proyecto y ponerle un comando para que se ejecute la clase App.java
   ```bash
      mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.archetype.App" -Dexec.args="Camilo"
   ```
   - Al ejecutar este comando se vera la siguiente salida:
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/Helloworld.png)
     - Una vez visto esto al tratar de ejecutar el comando con nuevos argumentos nos lanzara un error como se vera a continuacion:
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/Helloerror.png)
   - Para solucionar este problema debemos configurar el codigo con argumentos para que no nos genere este error, se buscara una manera para leer argumentos y que cambie el saludo por el nombre que se le pase como argumento reestructurando el codigo como se vera en la siguiente foto:
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/Appcodigo.png)
   - Una vez cambiado el codigo al ejecutar con argumentos tanto con 1 o 2 se vera de la siguiente manera:
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/Hellocamilo.png)
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/Hellocamilof.jpg)

# Hacer el esqueleto de la aplicacion
* Cree el paquete edu.eci.cvds.patterns.shapes y el paquete edu.eci.cvds.patterns.shapes.concrete. 
   - Para crear los paquetes se debe crear las carpetas y por consiguiente se crearan los directorios y ademas se crearan los archivos java necesarios:
    ```bash
        mkdir -p src/main/java/edu/eci/cvds/patterns/shapes
        mkdir -p src/main/java/edu/eci/cvds/patterns/shapes/concrete
    ```
  Y se deberia ver de la siguiente manera:
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/Treeshapes.png)
  - Una vez creados los directorios se creara una interfaz llamada shapes que se vera de la siguiente manera:
    ```bash
        touch src/main/java/edu/eci/cvds/patterns/shapes/Shape.java
     ```
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/Shapes.png)
  - Despues de crear la clase Shapes con java y cumplir con esos parametros se buscara crear una enumeracion llamada RegularShapeType que se vera de la siguiente manera:
    ```bash
        touch src/main/java/edu/eci/cvds/patterns/shapes/RegularShapeType.java
    ```
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/Regularshapes.png)
  Esto nos dara los parametros para crear las clases que nos indican en el codigo lo cual son las figuras geometricas que se quieren crear.
  - A continuación se crearan las clases concretas de las figuras geometricas que se veran de la siguiente manera:
    ```bash
        touch src/main/java/edu/eci/cvds/patterns/shapes/concrete/Hexagon.java
    ```
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/Hexagon.png)
    ```bash
        touch src/main/java/edu/eci/cvds/patterns/shapes/concrete/Quadrilateral.java
    ```
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/Quadrilateral.png)
    ```bash
        touch src/main/java/edu/eci/cvds/patterns/shapes/concrete/Triangle.java
    ```
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/Triangle.png)
    ```bash
        touch src/main/java/edu/eci/cvds/patterns/shapes/concrete/Pentagon.java
    ```
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/Pentagon.png)

  - Ahora crearemos el Main con el cual interactuaremos en la consola para ejecutar el nombre de las figuras y que nuestro proyecto maven nos de el resultado deseado:
    ```bash
        touch src/main/java/edu/eci/cvds/patterns/archetype/ShapeMain.java
    ```
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/ShapeMain.png)
  - Ya por ultimo se creara ShapesFactory con el cual con el se crearan las figuras geometricas y con el caso case-switch servira como un menu para seleccionar la figura que se quiere crear:
    ```bash
        touch src/main/java/edu/eci/cvds/patterns/shapes/ShapeFactory.java
    ```
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/ShapeFactory.png)
  * ¿Cuál fábrica se hizo?
    - Se realizo SimpleFactory para la creacion de ShapeFactory debido a que esta utiliza un metodo estatico, el cual no necesita instanciar la clase para poder utilizarlo y ademas es mas sencillo de utilizar y entender. Este metodo estatico tambien decidira que instancia de la clase se creara y se retornara y se centra en la creacion de objetos de una jerarquia de clases.
  * ¿Cuál es mejor?
    - La mejor fabrica es la AbstractFactory debido a que esta se encarga de crear familias de objetos relacionados o dependientes y ademas se puede cambiar la familia de objetos que se crea en tiempo de ejecucion. Esta fabrica es mas compleja que las demas fabricas y se utiliza cuando se necesita crear objetos de una familia de clases y se necesita que estos objetos sean independientes de la creacion de los objetos.
    - La FactoryMethod es una fabrica que se utiliza cuando se necesita crear un objeto de una jerarquia de clases y se necesita que el objeto sea independiente de la creacion de los objetos y ademas se necesita que la creacion de los objetos sea delegada a las subclases.
  - Una vez hecho el proyecto se ejecutara varias veces para ver la funcionalidad del codigo hecho:
    1. Sin parámetros:
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/NoParametros.png)
    2. Parámetro: qwerty
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/Qwerty.png)
    3. Parámetro: pentagon
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/PentagonMain.png)
    4. Parámetro: Hexagon
    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/HexagonMain.png)
  * ¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?
    1. Esta instruccion como se puede ver se ejecuta pero no funciona debido a que se debe recibir un parametro para que pueda funcionar correctamente.
    2. Esta instruccion a pesar tambien se ejecuta no funciona debido a que el parametro que se le pasa no es una figura geometrica.
    3. Esta instruccion como se puede ver tiene 2 alternativas, una en donde no se ingresa el caracter inicial en mayuscula y suelta un error diciendo que no es una figura geometrica o que no la reconoce debido a que en la sintaxis esta en mayuscula, y la otra alternativa es que si se ingresa el caracter inicial en mayuscula y se ejecuta correctamente.
    4. Esta instruccion como se puede ver se ejecuta y funciona correctamente debido a que el parametro que se le pasa es una figura geometrica y ademas esta en mayuscula.
# Investigue para qué sirve "gitignore" 
  * Git Ignore

    Git ve cada archivo de tu copia de trabajo de una de las siguientes maneras:

      1. Con seguimiento: Un archivo que se ha preparado o confirmado previamente.

      2. Sin seguimiento: Un archivo que no se ha preparado o confirmado.

      3. Ignorado: Un archivo que se le ha indicado explícitamente a Git que ignore.

    Los archivos ignorados suelen ser artefactos de compilación y archivos generados por el equipo que pueden derivarse de
    tu fuente de repositorios o que no deberían confirmarse por algún otro motivo. Estos son algunos ejemplos habituales:

      - Cachés de dependencias, como es el caso del contenido de /node_modules o /packages.
      - Código compilado como, por ejemplo, los archivos .o, .pyc y .class.
      - Directorios de salida de compilación, como es el caso de /bin, /out o /target.
      - Archivos generados en tiempo de ejecución como, por ejemplo, .log, .lock o .tmp.
      - Archivos ocultos del sistema, como es el caso de .DS_Store o Thumbs.db.
      - Archivos personales de configuración de IDE como, por ejemplo, .idea/workspace.xml.

    A los archivos ignorados se les hace un seguimiento en un archivo especial llamado .gitignore que se incorpora en la raíz de tu repositorio.
    En Git no hay ningún comando explícito para ignorar archivos: en su lugar, cuando tengas nuevos archivos que quieras ignorar, deberás editar
    y confirmar manualmente el archivo .gitignore. Los archivos .gitignore contienen patrones que establecen coincidencias con los nombres de
    archivo de tu repositorio para determinar si deberían ignorarse o no.

    Puedes utilizar # para incluir comentarios en tu archivo .gitignore:

       ```bash
        # ignore all logs
        *.log 
      ```
        Puedes usar la barra oblicua invertida (\) para escapar los caracteres de un patrón de .gitignore si tienes archivos o directorios que los contengan:

       ```bash
        # ignore the file literally named foo[01].txt
        foo\[01\].txt
      ```
    # Archivos .gitignore compartidos en tu repositorio

    Las reglas de ignoración de Git suelen definirse en un archivo .gitignore ubicado en la raíz de tu repositorio. Sin embargo, puedes optar por definir varios archivos .gitignore en distintos directorios del repositorio. Cada patrón de un archivo .gitignore concreto se comprueba en relación con el directorio que contiene ese archivo. No obstante, lo habitual, y el enfoque más simple, es definir un solo archivo .gitignore en la raíz. Cuando el archivo .gitignore se incorpora, se le realiza un control de versiones como con cualquier otro archivo del repositorio y se comparte con tus compañeros de equipo al enviarlo. Por lo general, solo debes incluir patrones en los archivos .gitignore que beneficiarán a otros usuarios del repositorio.

    # Reglas personales de git ignore

    ambién puedes definir patrones personales de ignoración de Git para un repositorio concreto en un archivo especial en .git/info/exclude. Además de no aplicárseles el control de versiones, tampoco se distribuyen con tu repositorio, por lo que es un lugar adecuado para incluir patrones que probablemente solo te beneficien a ti. Por ejemplo, si tienes una configuración de inicio de sesión personalizada o herramientas especiales de desarrollo que generan archivos en el directorio de trabajo de tu repositorio, podrías plantearte la posibilidad de añadirlos a .git/info/exclude para evitar que se confirmen por accidente en el repositorio.

    # Reglas globales de git ignore

    Asimismo, puedes definir patrones globales de ignoración de Git para todos los repositorios de tu sistema local. Para ello, basta con establecer la propiedad core.excludesFile de Git. Tendrás que crear este archivo por ti mismo. Si no tienes claro dónde colocar el archivo .gitignore global, una buena opción es tu directorio principal (además, luego te resultará más sencillo encontrarlo). En cuanto hayas creado el archivo, deberás configurar su ubicación con git config:

       ```bash
      $ touch ~/.gitignore
      $ git config --global core.excludesFile ~/.gitignore
      ```

    Debes tener cuidado con los patrones que eliges ignorar de manera global, ya que los distintos tipos de archivos son pertinentes para proyectos diferentes. Los archivos especiales del sistema operativo (como .DS_Store y thumbs.db) o los archivos temporales creados por algunas herramientas para desarrolladores son candidatos típicos para ignorarse globalmente.

    # Omisión de un archivo previamente confirmado

    Si quieres ignorar un archivo que has confirmado en el pasado, deberás eliminarlo de tu repositorio y, a continuación, añadirle una regla de .gitignore. Al usar la opción --cached con git rm, el archivo se eliminará del repositorio, pero permanecerá en tu directorio de trabajo como archivo ignorado.

      ```bash
        $ echo debug.log >> .gitignore
    
        $ git rm --cached debug.log
        rm 'debug.log'
        
        $ git commit -m "Start ignoring debug.log"
      ```

      Puedes omitir la opción --cached si quieres eliminar el archivo tanto del repositorio como de tu sistema de archivos local.

      # Confirmación de un archivo ignorado

      Se puede forzar la confirmación de un archivo ignorado en el repositorio mediante la opción -f (o --force) con git add:

      ```bash
        $ cat .gitignore
        *.log
  
        $ git add -f debug.log
  
        $ git commit -m "Force adding debug.log"
    ```

      Puedes plantearte hacer esto si tienes definido un patrón general (como *.log), pero quieres confirmar un archivo específico. Sin embargo, es mejor definir una excepción a la regla general:

      ```bash
        $ echo !debug.log >> .gitignore
  
        $ cat .gitignore
        *.log
        !debug.log
        
        $ git add debug.log
        
        $ git commit -m "Adding debug.log"
    ```
      Este enfoque es más obvio y menos confuso para tus compañeros de equipo.

      # Almacenamiento de un archivo ignorado

      El comando git stash es una potente función de Git para guardar temporalmente cambios locales y revertirlos, lo que te permite volver a aplicarlos más tarde. Como cabría esperar, de forma predeterminada, git stash ignora los archivos ignorados y solo almacena en stash los cambios de los archivos de los que Git hace un seguimiento. Sin embargo, puedes invocar git stash con la opción --all para guardar en el stash también los cambios de los archivos ignorados y sin seguimiento.

      # Depuración de archivos .gitignore

      Si tienes patrones de .gitignore complicados o patrones repartidos por varios archivos .gitignore, puede resultar difícil averiguar el motivo por el que se ignora un archivo concreto. Puedes usar el comando git check-ignore con la opción -v (o --verbose) para determinar qué patrón está provocando que se ignore un archivo en particular:

      ```bash
        $ git check-ignore -v debug.log
        .gitignore:3:*.log  debug.log
    ```

      La salida muestra lo siguiente:

      ```bash
        <file containing the pattern> : <line number of the pattern> : <pattern>    <file name>
    ```

      Puedes incluir varios nombres de archivos en git check-ignore si quieres; no es necesario que los nombres se correspondan con los archivos que haya en tu repositorio.

    ![imagen](https://github.com/CamiloFdez/Patterns/blob/master/assets/gitignore.jpg)

# Bibliografia:

    - https://git-scm.com/docs/gitignore
    - https://docs.github.com/es/get-started/getting-started-with-git/ignoring-files
    - https://www.atlassian.com/git/tutorials/saving-changes/gitignore

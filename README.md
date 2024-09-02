# Instrucciones para el Proyecto Validar Edad

## Descripción

Este proyecto se divide en dos partes: la creación de un backend usando Spring Boot y un frontend con React. A continuación, se detallan los pasos realizados para completar el proyecto.

## Backend

### 1. Crear un proyecto Spring Boot
- Dirígete a [Spring Initializr](https://start.spring.io/).
- Selecciona las opciones necesarias para crear un proyecto Spring Boot y agrega las dependencias requeridas.
- Haz clic en "Generate" para descargar el archivo `.zip`.
- Mueve el archivo descargado al escritorio (Desktop) y descomprímelo.

### 2. Abrir el proyecto en Visual Studio Code
- Abre Visual Studio Code.
- Carga el proyecto que acabamos de generar.

### 3. Crear la estructura del proyecto
- Navega a la carpeta `src -> main` y haz clic derecho en la carpeta `demo`.
- Crea una nueva carpeta llamada `service`.
- Dentro de la carpeta `service`, crea un archivo llamado `AgeCheckerService.java`.
- Crea una nueva carpeta llamada `controller`.

### 4. Ejecutar el backend
- Abre el terminal en Visual Studio Code presionando `Ctrl + J`.
- Ejecuta el comando `mvn spring-boot:run` para iniciar el backend.
- Accede a la API en tu navegador con la URL `http://localhost:8080/api/age/check?age=20`.
- Si ingresas un número menor a 18, el backend indicará que no eres un adulto.

### 5. Solución de problemas
- Asegúrate de que Maven esté instalado ejecutando `mvn -v` en la terminal.
- Si aparece un error, ve a "Propiedades del sistema" o "Variables de entorno".
- Edita la variable PATH para agregar la dirección donde se instaló Maven.

## Frontend

### 1. Crear el proyecto React
- Abre una nueva ventana de Visual Studio Code y asegúrate de que el backend siga ejecutándose.
- Crea una carpeta para el frontend.
- En el terminal, navega a la carpeta creada y ejecuta el comando `npx create-react-app agechecker-frontend`.
- Una vez que se haya creado el proyecto, entra a la carpeta con `cd agechecker-frontend`.

### 2. Ejecutar el frontend
- Ejecuta el comando `npm start` para iniciar el frontend.
- Verás que el proyecto React se carga con el logo de React.

### 3. Crear componentes
- Dentro del frontend, crea un archivo llamado `AgeChecker.js` donde se escribirá el código necesario.
- Edita el archivo `App.js` para modificar la pantalla principal y eliminar el logo de React.

## Finalización

Primero, voy a crear un repositorio en GitHub llamado **MiniProyecto**, donde incluiré un archivo README con una descripción de este mini proyecto. Aquí podrán revisar el proyecto y entender cómo funciona.

El repositorio está disponible en la siguiente URL:  
[https://github.com/jgarcia-2019121/MiniProyecto.git](https://github.com/jgarcia-2019121/MiniProyecto.git)

### Creación de ramas

A continuación, crearé dos ramas en el repositorio: una para el BackEnd y otra para el FrontEnd.

#### Pasos para versionar el BackEnd:
1. Copia la URL del repositorio.
2. Dirígete a la carpeta donde guardaste el backend.
3. Abre Git Bash dentro de esa carpeta.
4. Ejecuta los comandos para añadir los archivos en rojo y subirlos a la rama correspondiente.

#### Pasos para versionar el FrontEnd:
1. Repite el proceso anterior pero dentro de la carpeta del frontend.
2. Crea la rama correspondiente y sube los archivos.

Y con esto, ¡hemos completado el mini proyecto! El código completo está versionado en GitHub para su revisión.

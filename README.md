# MiniProyecto

# Instrucciones para el Proyecto Age Checker

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

Con estos pasos, hemos completado el mini proyecto de verificación de edad. El código completo está versionado en GitHub para su revisión.

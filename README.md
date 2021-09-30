# Shared-Expenses-API
Es una API REST desarrollada poder visualizar y gestionar los gastos compartidos de un grupo de amigos.
• IDE Visual Studio Code
•	Dependencias gestionadas con **Maven**  
•	JDK 11
•	Lenguaje de programación **Java**  
•	Framework **Spring boot**  
•	Capa de persistencia gestionada con **Spring Data**
## Contenido	
Este proyecto tiene una rama principal (master) sobre la que se han ido añadiendo las funcionalidades y requisitos de la aplicación.  
La estructura del proyecto se subdivide en las siguientes carpetas:   
• **Configuration**: contiene la configuración de CORS.   
• **Controllers**: contiene los controladores para las peticiones de la API.    
• **Models**: contiene la definición mediante clases de `Friend`, `Expense` y `Balance`  
• **Repositories**: contiene la definición de los repositorios de la aplicación, es decir, la lógica de recuperación y almacenamiento de las colecciones de objetos.  
• **Services**: contiene el único servicio de la aplicación que es `BalanceService`. Se encarga de la lógica de elaboración del balance de saldos.

## Endpoints  
Los endpoints implementados fueron:   
•	`\friends` :   
  - método `GET`: devuelve un listado de todos los amigos existentes 
  - método `POST`: añade un nuevo amigo al grupo.  
  
•	`\expenses` : 
  - método `GET`: devuelve un listado de todos los gastos del grupo de amigos   
  - método `POST`: nos permite añadir un nuevo gasto al grupo.  
  
•	`\balances` : 
  - método `GET`:   devuelve un listado con los balances individuales de cada miembro del grupo.  
  Un balance es el dinero que una persona debe pagar o recibir para que no hayan dedudas dentro del grupo de amigos.

## Instalación y ejecución
Se deberá tener instalada en VSC las siguientes extensiones: Java Extension Pack, Maven for Java y Spring Boot Extension Pack. 

Después de clonar el repositorio, y desde VSC puedes iniciar el proyecto desde el Spring Boot dashboard.

## Notas
Fue desarrollada como reto en una semana y sin conocer el framework de Spring boot.  
Esta primera versión no contempla la creación de diferentes grupos de amigos.

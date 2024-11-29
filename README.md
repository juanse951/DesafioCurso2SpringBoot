README: Sistema de Gestión de Datos de Cantantes y Canciones
Descripción
Este proyecto es una aplicación Java que permite gestionar información sobre cantantes y sus canciones. Implementa funcionalidades para registrar cantantes y canciones, buscar canciones por cantante, listar canciones de todos los artistas y obtener información adicional sobre un cantante mediante un servicio externo de consulta (ChatGPT).

Funcionalidades
Registrar datos de cantantes: Permite ingresar nuevos cantantes con su tipo (solista, dúo o banda).
Registrar datos de canciones: Asocia canciones a un cantante existente en la base de datos.
Buscar canciones por cantantes: Busca y muestra todas las canciones asociadas a un cantante específico.
Obtener información sobre un cantante: Utiliza un servicio externo (ConsultaChatGPT) para obtener datos adicionales sobre un cantante.
Listar todas las canciones: Muestra todas las canciones registradas junto con sus respectivos cantantes.

Repositorio
DatosCantanteRepository: Define las operaciones para interactuar con la base de datos, como guardar cantantes, buscar por nombre y obtener canciones de un artista.

Servicio Externo
ConsultaChatGPT: Simula una consulta a un servicio externo para obtener datos adicionales de un cantante.

Uso
Requisitos Previos
Java 17 o superior.
PostgreSQL configurado como base de datos.
Librerías para persistencia, como Hibernate o Spring Data JPA.
Ejecución
Configura la conexión a la base de datos en tu proyecto (por ejemplo, en application.properties si usas Spring Boot).
Ejecuta la aplicación desde la clase Principal.
Interactúa con el menú para realizar las operaciones deseadas.

Flujo del Menú
Elige una opción del menú principal:

1: Registrar un cantante.
2: Registrar una canción asociada a un cantante.
3: Buscar canciones por un cantante.
4: Consultar información adicional sobre un cantante.
5: Listar todas las canciones registradas.
0: Salir del programa.
Sigue las instrucciones del programa para completar cada operación.

Notas Técnicas
Consulta flexible: El método findByNombreContainingIgnoreCase permite buscar cantantes de manera insensible a mayúsculas y coincidencias parciales.
Persistencia: Los datos de los cantantes y canciones se guardan utilizando DatosCantanteRepository.
Servicio externo: La consulta a ChatGPT simula la integración con una API externa para enriquecer la información del sistema.

Ejemplo de Salida
Menú Principal:

Copiar código
1 - Registrar datos de cantantes
2 - Registrar datos de canciones
3 - Buscar canciones por cantantes
4 - Obtener información sobre un cantante
5 - Lista de canciones

0 - Salir
Registro de un cantante:

Nombre del cantante: Adele
Qué tipo de artista es (solo, due, banda): solo
Registrar un nuevo cantante? (S/N): N
Registro de una canción:

De cuál cantante deseas registrar la canción: Adele
Título de la canción: Rolling in the Deep



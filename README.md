# Screen-Match
**Screenmatch** es una aplicación desarrollada en Java utilizando el framework **Spring Boot**, cuyo objetivo es consumir datos de una API de series para mostrar información detallada sobre series, temporadas y episodios. El proyecto forma parte de una etapa introductoria donde se practican conceptos modernos del lenguaje Java como las **expresiones lambda**, **Streams API**, y el diseño orientado a servicios con **Spring Framework**.


## Conceptos aplicados

- **Programación funcional**: Se utilizan expresiones lambda y operaciones con `Stream` para procesar listas de datos como episodios o temporadas. Esto permite realizar filtrados, ordenamientos y transformaciones de forma más concisa y expresiva.
  
- **Consumo de APIs REST**: La aplicación incluye un servicio que realiza llamadas HTTP para obtener datos de una API externa en formato JSON. Luego, esos datos se transforman en objetos Java mediante técnicas de deserialización.
  
- **Inversión de dependencias y componentes Spring**: Se aplican principios de desarrollo modular mediante interfaces y clases de servicio, permitiendo una arquitectura limpia y escalable.

- **Separación por responsabilidades**: El proyecto está dividido en paquetes como `model`, `service` y `principal`, lo que facilita el mantenimiento del código y refuerza la comprensión del diseño orientado a objetos.

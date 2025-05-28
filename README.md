# S1.01-Herencia-y-Polimorfismo


📄 Descripcion 📄 

Nivel 1:

* Ejercicio 1: En un grupo de música hay diferentes tipos de instrumentos musicales. Hay instrumentos de viento, de cuerda y de percusión.
Todos los instrumentos tienen como atributos su nombre, y su precio. Además, tienen un método llamado tocar(). Este, es abstracto a la clase instrumento y, por lo tanto, debe implementarse en las clases hijas. Si se está tocando un instrumento de viento, el método debe mostrar por consola: "Está sonando un instrumento de viento", si se está tocando un instrumento de cuerda: "Está sonando un instrumento de cuerda" y si se está tocando un instrumento de percusión: "Está sonando un instrumento de percusión".
El proceso de carga de una clase sólo tiene lugar una vez. Demuestra que la carga puede ser provocada por la creación de la primera instancia de esta clase o por el acceso a un miembro estático de la misma.
Busca información sobre los bloques de inicialización y bloques estáticos en Java.

* Ejercicio 2: Crea una clase "Coche" con los atributos: marca, modelo y potencia. La marca debe ser estático final, el modelo estático y la potencia final. Demuestra la diferencia entre los tres. ¿Hay alguno que se pueda inicializar al constructor de la clase?
Añade dos métodos a la clase "Coche". Un método estático llamado frenar() y otro no estático llamado acelerar(). El método acelerar debe mostrar por consola: "El vehículo está acelerando" y el método frenar() debe mostrar: "El vehículo está frenando".
Demuestra cómo invocar el método estático y el no estático desde el main() de la clase principal.

Nivel 2:

* Ejercicio 1: Crea una clase llamada "Teléfono" con los atributos marca y modelo, y el método llamar(). Este método debe recibir un String con un número de teléfono. El método debe mostrar por consola un mensaje diciendo que se está llamando al número recibido por parámetro.
Crea una interfaz llamada "Camera" con el método fotografiar(), y otra interfaz llamada Reloj con el método alarma().
Crea una clase llamada "Smartphone" que sea subclase de "Teléfono" y que a la vez implemente las interfaces "Camera" y "Reloj".
El método fotografiar() debe mostrar por consola: "Se está haciendo una foto" y el método alarma() debe mostrar: "Está sonando la alarma".
Desde el main() de la aplicación, crea un objeto Smartphone y llama a los métodos anteriores.

Nivel 3:

*Ejercicio 1: En una redacción de noticias deportivas tienen las noticias clasificadas para deportes: fútbol, baloncesto, tenis, F1 y motociclismo.
La redacción puede tener más de un redactor, y de cada uno de ellos queremos saber su nombre, el DNI y el sueldo. Una vez asignado un DNI, éste no podrá cambiar nunca. Todos los redactores tienen el mismo sueldo, y si en un futuro la empresa puede incrementarlo, lo hará a todo el mundo por igual. De momento el sueldo actual es de 1500 €.
Cada redactor puede trabajar en más de una noticia. Las noticias deben tener un titular, un texto, una puntuación y un precio. En el momento de crearse, el texto debe estar vacío.
Además, de las noticias de fútbol hay que saber a qué competición hace referencia(String), a qué club(String) y a qué jugador(String).
De las noticias de baloncesto se debe indicar a qué competición hace referencia(String) y a qué club(String).
De las noticias de tenis hay que saber de qué competición(String) hablan y de qué tenistas(String).
De las noticias de F1 debemos saber a qué escudería(String) hacen referencia.
De las noticias de motociclismo se debe indicar de qué equipo(String) son.
Las noticias se venden en diferentes medios. Para saber el precio de cada noticia debemos implementar un método que se llama calcularPreuNoticia().

A continuación se explica cómo calcular el precio de cada noticia:

Noticias de fútbol:
Precio inicial: 300 €
Liga de Campeones: 100 €
Barça o Madrid: 100 €
Ferran Torres o Benzema: 50 €
Ejemplo: Una noticia que habla de un gol de Ferran Torres del Barça en la Liga de Campeones, tiene un precio de 550 €.

Noticias de baloncesto:
Precio inicial: 250 €
Euroliga: 75 €
Barça o Madrid: 75 €

Noticias de tenis:
Precio inicial: 150 €
Federer, Nadal o Djokovic: 100 €

Noticias de F1:
Precio inicial: 100 €
Ferrari o Mercedes: 50 €

Noticias de motociclismo:
Precio inicial: 100 €
Honda o Yamaha: 50 €

Para calcular las puntuaciones de las noticias se siguen los siguientes criterios:

Noticias de fútbol:
5 Puntos.
Liga de Campeones: 3 puntos
Liga: 2 puntos
Barça o Madrid: 1 punto
Ferran Torres o Benzema: 1 punto
Ejemplo: Una noticia que habla de un gol de Ferran Torres del Barça en la Liga de Campeones, tiene una puntuación de 10 puntos.

Noticias de baloncesto:
4 puntos
Euroliga: 3 puntos
ACB: 2 puntos
Barça o Madrid: 1 punto

Noticias de Tenis:
4 puntos
Federer, Nadal o Djokovic: 3 puntos

Noticias F1:
4 puntos
Ferrari o Mercedes: 2 puntos

Noticias de Motociclismo:
3 puntos
Honda o Yamaha: 3 puntos

En la clase principal se debe hacer un menú con las siguientes opciones:
1.- Introducir redactor.
2.- Eliminar redactor.
3.- Introducir noticia a un redactor.
4.- Eliminar noticia (debe pedir redactor y titular de la noticia).
5.- Mostrar todas las noticias por redactor.
6.- Calcular puntuación de la noticia.
7.- Calcular precio-noticia.


💻 Tecnologías Utilitzadas 💻

Java version 24 IntelliJ IDE.

📋 Requisitos 📋

IDE Eclipse o IntelliJ

🛠️ Instalación 🛠️

Clona este repositorio --> https://github.com/Lucy-SD/S1.01-Herencia-y-Polimorfismo.git.

▶️ Execucion ▶️ 

Configura la base de datos a config/database.js.
Executa el servidor: npm start.

🌐 Despliegue 🌐

Sube los archivos del proyecto al IDE.

🤝 Contribuciones 🤝

Las contribuciones son bienvenidas ¡! Por favor, sigue los siguientes pasos para contribuir:

Has un fork del repositorio.
Crea una nueva rama git checkout -b feature/NuevaFuncionalidad.
Realiza tus cambios y comenta 'ls:   git commit -m 'Adición de nueva funcionalidad'
Sube los cambios a tu rama:   git push origin feature/NuevaFuncionalidad.
Has un pull request About: https://github.com/Lucy-SD/S1.01-Herencia-y-Polimorfismo.git.

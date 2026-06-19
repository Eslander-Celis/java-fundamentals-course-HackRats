# Leccion 6: Proyecto final integrador

Hola a todos. Bienvenidos a la ultima leccion del curso.

En esta parte vamos a integrar los conceptos aprendidos para crear un proyecto final en Java. El proyecto sera un registro basico de estudiantes.

El objetivo es crear un programa que permita ingresar el nombre y la edad de varios estudiantes, guardar esa informacion en objetos y luego mostrar los datos registrados en consola.

Para este proyecto usaremos variables, condicionales, bucles, metodos, entrada por consola, clases, objetos, constructores, encapsulacion y arreglos.

Primero necesitamos una clase llamada `Estudiante`. Esta clase representa a cada estudiante del registro. Sus atributos principales son nombre y edad.

Los atributos se declaran como privados para aplicar encapsulacion. Esto permite proteger los datos internos de la clase y acceder a ellos mediante metodos.

Luego agregamos un constructor. El constructor recibe el nombre y la edad, y asigna esos valores al nuevo objeto estudiante.

Tambien agregamos metodos para obtener y modificar los datos. Estos metodos se conocen como getters y setters.

Despues creamos un metodo para mostrar los datos del estudiante en consola. Este metodo imprime el nombre, la edad y un mensaje que indica si el estudiante esta dentro del rango principal de edad escolar secundaria.

Para decidir eso usamos una condicion. Si la edad esta entre 12 y 17 anos, el programa muestra que el estudiante esta en edad escolar de secundaria. En caso contrario, muestra que no esta dentro de ese rango principal.

En la clase principal usamos `Scanner` para leer los datos ingresados por el usuario. El programa solicita el nombre y la edad de cada estudiante.

Luego usamos un arreglo para guardar varios objetos de tipo `Estudiante`. Un arreglo permite almacenar varios elementos relacionados en una sola estructura.

Con un bucle `for`, el programa repite el registro de estudiantes. En cada repeticion pide los datos, crea un objeto y lo guarda en el arreglo.

Finalmente, usamos otro bucle para recorrer el arreglo y mostrar los datos de cada estudiante registrado.

Este proyecto es pequeno, pero integra varios conceptos importantes. Permite ver como las partes del curso trabajan juntas dentro de un mismo programa.

La actividad final consiste en ejecutar el registro, ingresar datos de tres estudiantes y revisar la informacion mostrada en consola.

En resumen, en este curso aprendimos los fundamentos de Java: variables, tipos de datos, operadores, condicionales, bucles, metodos y programacion orientada a objetos.

Con esta base, el estudiante puede seguir practicando, modificar los ejemplos y avanzar hacia programas mas completos.

Gracias por completar el curso Fundamentos de Java para Principiantes.

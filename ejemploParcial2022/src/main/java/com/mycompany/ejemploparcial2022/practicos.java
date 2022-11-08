/*/*Ejercicios: tp 1
1) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por
consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.
2) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (aplica
Scanner y JOptionPane).
3) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta,
multiplicación, división y módulo (resto de la división).
4) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si
son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
5) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también
debemos indicarlo.
6) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule
el precio final con IVA. El IVA sera una constante que sera del 21%.
7) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
8) Haz el mismo ejercicio anterior con un bucle for.
9) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que
desees.
10) Lee un número por teclado y comprueba que este número es mayor o igual que cero, si no lo es
lo volverá a pedir (do while), después muestra ese número por consola.
11) Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te
pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá más la
Tecnicatura Superior en Programación
UTN-FRM
Laboratorio de Computación I – Practica Estructura de Datos
contraseña y mostrara un mensaje diciendo “Acceso Correcto”. Piensa bien en la condición de
salida (3 intentos y si acierta sale, aunque le queden intentos).
12) Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no
(siendo sábado y domingo no laborales). Usa un switch para ello. Valida que el número
ingresado sea un valor entre 1 y 7, caso contrario solicite el valor nuevamente.
13) Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel
solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible
entre 5, sin embargo, 17 si es primo. Un buen truco para calcular la raíz cuadrada del numero e
ir comprobando que si es divisible desde ese número hasta 1.
NOTA: Si se introduce un número menor o igual que 1, directamente es no primo.
14) Codifique un programa de consola en Java que permita realizar las siguientes acciones:
Generar un número aleatorio entre 0 y 100, para ello use la siguiente función:
int x = new Double(Math.random() * 100).intValue();
Una vez generado el número codifique la lógica necesaria para encontrar el número aleatorio
ayudando al usuario informando al mismo si el número ingresado es mayor o menor al número
aleatorio buscado. Una vez encontrado el número muestre la cantidad de intentos necesarios
para lograrlo.
Ejemplo:
Número aleatorio generado: 63
Ingrese un número entre 0 y 100.
Numero Ingresado: 50
Respuesta: Es muy bajo
Ingrese un número entre 0 y 100.
Numero Ingresado: 75
Respuesta: Es muy alto
Ingrese un número entre 0 y 100.
Numero Ingresado: 60
Respuesta: Es muy bajo
Ingrese un número entre 0 y 100.
Numero Ingresado: 65
Respuesta: Es muy alto
Ingrese un número entre 0 y 100.
Numero Ingresado: 63
Respuesta: Correcto, numero encontrado, cantidad de intentos 5
     */
 
package com.mycompany.ejemploparcial2022;

/*Trabajo Práctico – Tipo de Datos y Funciones de Cadena
1- CASTEO: Codifique un programa que solicite el ingreso de un numero decimal y
asigne el mismo a una variable valorDecimal de tipo double, aplique las
operaciones de CASTING para convertir la variable a los siguientes tipos de
datos, short, int, long, String, float investigue las diferentes formas de lograr la
conversión. Muestre por pantalla el resultado de las conversiones.
2- Si se asigna un valor a una variable fuera de rango (mayor de lo establecido)
¿Qué ocurre? ¿Existe alguna forma de resolverlo? Ejemplifique.
3- Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 -
999) y por medio del uso de las operaciones matemáticas módulo 10 y división
por 10 efectué la suma de los 3 dígitos del número. Ejemplo ingreso 563, salida
del algoritmo 14.
4- Desarrolle un programa que ayude a una cajera a determinar el número de
billetes y monedas que se necesitan de cada una de las siguientes
denominaciones 200, 100, 50, 20, 10, 5, 2 y 1, y monedas de 0.50, 0.25, 0.10 y
0.05 centavos para una cantidad de dinero dada. Ejemplo si la cantidad es
1390,55 se necesitan 6 billetes de 200, 1 billete de 100, 1 billete de 50, 2
billetes de 20, 1 moneda de 0.50 y una moneda de 0.05 centavos.
Ejercicios con cadenas:
5- Solicite el ingreso de un número y conviértalo a un String mediante
String.valueOf
6- Del siguiente String “La lluvia en Mendoza es escasa” indique cual es el tamaño
de la cadena es decir su número de caracteres.
7- Solicite el ingreso de una cadena y determine el tamaño de la misma y cuantas
vocales tiene en total (recorre el String con charAt)
8- Reemplaza todas las a del String anterior por una e. (aplique replace)
9- Recorre el String del ejercicio 6 y transforma cada carácter a su código ASCII.
Muéstralos en línea recta, separados por un espacio entre cada carácter.
10- Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el
usuario lo pida y mostraremos el resultado por pantalla.
UTN-FRM
Practica Tipos de Datos – Valor y Referencia
Funciones de Cadena (String)
11- Pedir dos palabras por teclado, indicar si son iguales. (equals, compareTo,
compareToIgnoreCase)
12- Dada una cadena, extraer la cuarta y quinta letra usando el método substring.
13- Pedir el ingreso de dos cadenas por por teclado, indicar si la segunda cadena se
encuentra dentro de la primera (usar indexOf o contains).
Ejercicios con Tipos Referencia (Objetos)
14- Indique cual es la diferencia entre los datos primitivos (por valor) ejemplo el int
y su contraparte por referencia ejemplo Integer.
15- Indique que sucede si realizo la siguiente declaración de variable:
int numero = null;
¿Qué debo modificar para poder asignar null a la variable?
16- Como transformo una variable tipo Double a una variable tipo double.
17- Cree una clase FuncionesPrograma y codifique una función estática que reciba
como parámetro una fecha de tipo Date y retorne la fecha como una cadena.
public static String getFechaString(Date fecha){
……….
}
Cree una clase Principal que contenga un método main y haga uso de la función
getFechaString.
18- En la clase FuncionesPrograma codifique una función estática que reciba como
parámetro 3 valores enteros, día, mes, anio y retorne la fecha de tipo Date
correspondiente.
public static Date getFechaDate(int día, int mes, int anio){
……….
}
En la clase Principal creada en el punto anterior haga uso de la función
getFechaDate.
19- Cree una clase OperacionMatematica con dos atributos numéricos decimales,
valor1 y valor2 y un atributo String de nombre operación. Cree los
correspondientes métodos get/set.
UTN-FRM
Practica Tipos de Datos – Valor y Referencia
Funciones de Cadena (String)
Agregue a la clase los siguientes 5 métodos:
private double sumarNumeros(){
return valor1 + valor2;
}
private double restarNumeros(){
return valor1 - valor2;
}
private double multiplicarNumeros(){
return valor1 * valor2;
}
private double dividirNumeros(){
return valor1 / valor2;
}
El quinto método será el siguiente:
public double aplicarOperacion(String operacion){
…………………..
}
Cree una clase Calculo que contenga un método main, donde cree una
instancia de la clase OperacionMatematica, asigne 2 valores para las variables
de la instancia y ejecute la función aplicarOperacion, pasando como parámetro
primero “+”, después “-”, a continuación “*” y finalmente “/”. Muestre por
pantalla el resultado de las operaciones.
20- Cree una clase Fracción con dos atributos numéricos enteros, numerador y
denominador. Agregue un constructor sobrecargado (debe contener como
parámetros el numerador y el denominador) que cree el objeto Fracción
correspondiente.
Agregue a la clase los siguientes 4 métodos e implemente los mismos:
public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
……….
}
public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
……….
}
public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
……….
}
public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
……….
}
Cree una clase OperacionesFraccion que contenga un método main donde se
solicite al usuario el ingreso de 4 valores numéricos enteros con los cuales se
crearan 2 objetos Fracción y finalizada la creación de los mismos se ejecutaran
los 4 métodos implementados anteriormente asignando el resultado a una
nueva variable de tipo Fracción y mostrando por pantalla el resultado de las
operaciones realizadas.
Ejercicios con Recursión
21- Codifique un programa que solicite un número entero mayor a cero y que
mediante recursión sume todos los números números naturales desde el
número ingresado hasta 1.
Ejemplo: Ingreso 10
El programa debe sumar 10 + 9 + 8 +7 +6 + 5 + 4 + 3 + 2 + 1
22- Suma los dígitos de un número ingresado por el usuario de forma recursiva.
Ejemplo: el usuario ingresa 1596
El programa debe sumar 1 + 5 + 9 + 6
23- Crea un programa donde se pida el ingreso de una cadena y por medio de
recursión mostrar la cadena de forma inversa.
Ejemplo: Ingreso “computadora de escritorio”
Invertir cadena “oirotircse ed arodatupmoc” 
 */
public class practicos {

    /*Trabajo Practico - Ejercicios: (Arreglos unidimensionales)
1. ¿Qué sucede si tratamos de acceder un elemento fuera del tamaño del array?
2. Crea un array o arreglo unidimensional con un tamaño de 5, asignale los valores
numéricos manualmente (los que tú quieras) y muestralos por pantalla. Solicite los
números mediante un bucle.
3. Crea un array o arreglo unidimensional donde tú le indiques el tamaño por teclado y crear
una función que rellene el array o arreglo con los múltiplos de un numero pedido por
teclado. Por ejemplo, si defino un array de tamaño 5 y elijo un 3 en la función, el array
contendrá 3, 6, 9, 12, 15. Muéstralos por pantalla usando otra función distinta.
4. Escriba una aplicación que:
a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un
arreglo unidimensional.
b) determine y muestre el mayor de los números en el arreglo
c) determine y muestre el menor de los números del arreglo calcule y muestre el rango
(diferencia entre el mayor y el menor) de los elementos en el arreglo
5. Escriba una aplicación para almacenar aleatoriamente 20 números enteros positivos pares
del 1 al 100, de los cuales se desea saber:
a) su promedio aritmético
b) cuántos de los números son iguales al promedio aritmético
c) cuántos de los números son mayores que el promedio aritmético
d) cuántos de los números son menores que el promedio aritmético
6. Realice una búsqueda secuencial en un arreglo unidimensional de tamaño 50 generado
aleatoriamente mediante la función java random.
Realice una búsqueda secuencial de la siguiente forma:
- se lee el valor que se desea buscar,
- se compara la primera posición;
- si son iguales,
- fin de la búsqueda.
- De lo contrario, compararlo con la segunda posición, y así sucesivamente.
- Si se llega al final del arreglo y no se encontró el valor, debe indicarlo con un mensaje
apropiado.
- Si se encuentra, se debe especificar la posición que ese valor ocupa en el arreglo por
primera vez.
7. Escriba una aplicación que solicite y cargue en un arreglo 10 dígitos enteros, luego cree
dos nuevos arreglos y asigne al primero los números ingresados por el usuario de forma
ascendente y en el segundo de forma descendente. Muestre los 2 arreglos por pantalla.
8. Solicite al usuario el ingreso de una cadena de números separadas por guiones medio, por
ejemplo:
45-9-8-6-45-23-21-74-96-32-45-25
UTN-FRM
Arreglos de Una Dimensión.
Posteriormente aplique el método SPLIT de los String de Java para convertir la cadena en
un arreglo, y calcular la suma total de los elementos y el valor promedio calculado.
9. En Argentina cada persona está identificada con un Documento Nacional de Identidad
(DNI) en el que figura un número y una letra, por ejemplo 56999545W
La letra que sigue al número se calcula siguiendo la metodología que vamos a indicar.
Crea un programa que calcule la letra de un DNI a partir del número de DNI que
introduzca el usuario. Es decir, se debe pedir el DNI sin la letra por teclado y el programa
nos devolverá el DNI completo (con la letra).
Para calcular la letra, se debe tomar el resto de dividir nuestro número de DNI entre 23.
El resultado debe estar por tanto entre 0 y 22.
Crea un método obtenerLetra(int numeroDNI) donde según el resultado de la anterior
fórmula busque en un array de caracteres la posición que corresponda a la letra. Esta es
la tabla de caracteres:
Posición 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
Letra T R W A G M Y F P D X B N J Z S Q V H L C K E
Por ejemplo, si introducimos el DNI 20267079, el resto de dividirlo por 23 sería 8, luego
la letra sería la P, que es la que ocupa esa posicion en la matriz de caracteres.
10. Dado 2 array de enteros, el primero de tamaño 5 y el segundo de tamaño 10, pedir los
valores numéricos enteros para cargar cada uno de los arreglos, cree un tercer arreglo de
tamaño 10 que contenga en casa posición la suma de la multiplicación de cada elemento
del array uno por cada elemento del array 2
ARRAY3 = (posición 0 del arreglo 1 * posición 0 del arreglo 2) + (posición 0 del arreglo 1
* posición 1 del arreglo 2) + (posición 0 del arreglo 1 * posición 2 del arreglo 2) +
………….+ (posición 4 del arreglo 1 * posición 9 del arreglo 2)
Use 2 estructuras iterativas anidadas para realizar el cálculo y asignación de los valores
en el 3 array.
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

## EJERCICIO 1

### Diseñar la función eco() a la que se la pasa como parámetro un número n, y muestra por pantalla n veces el menaje.

## EJERCICIO 2

### Escribir una función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos

## EJERCICIO 3

### Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique. Para distinguir un caso de otro se le pasará un número, 1 (para área) o 2(para el volumen). Además, hemos de pasarle a la función el radio de la base y la altura.

área = 2 * pi * radio * (altura + radio);
volumen = pi * radio^2 * altura

## EJERCICIO 4

### Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor.

## EJERCICIO 5

### Repetir el ejercicio anterior con una versión que calcule el mayor de 3 números.

## EJERCICIO 6

### Crear una función que, mediante un booleano, indique si el carácter que se pasa como parámetro de entrada corresponde a una vocal

La función tendrá en cuenta las vocales minúsculas y mayúsculas. No consideramos las vocales acentuadas o con diéresis.

## EJERCICIO 7 

### Diseñar una función que nos diga si un número es primo.

La función esPrimo() indica, mediante un booleano, si el número pasado como parámetro es primo. Un número n es primo si no es divisible por ningún número entre 2 y n-1.
Recordamos que un número primo es solo divisible por el mismo y por 1.

## EJERCICIO 8

### Escribir una función a la que se le pase un número entero y devuelva el número de divisores primos que tiene.

Para calcular los divisiores de un número, solo tendremos en cuenta los números primos comprendidos entre 1 y el número que nos interese.


## EJERCICIO 9

### Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores primos del número que se le pasa como parámetro.

## EJERCICIO 10

### Escribir una función que decida si dos números enteros positivos son amigos. Dos números son amigos si la suma de sus divisores propios (distintos de ellos mismos) son iguales.

Los divisores propios de un número son todos los divisores, primos y no primos, de dicho número excepto él mismo.

Dos números a y b son amigos cuando la suma de los divisores propios de a es b y viceversa. Ejemplos conocidos de pares de números amigos son : (200, 284), (1184, 1210), (6231, 6368).

## EJERCICIO 11

### Diseñar una función que calcule a^n, donde a es real y n entero no negativo. Realizar una versión iterativa y otra recursiva.

## EJERCICIO 12

### Diseñar la función calculadora(), a la que se le pasan dos números enteros(operandos) y qué operación se desea realizar con ellos. Las operaciones disponibles son sumar, restar, multiplicar o dividir. Estas se especifican mediante un número: 1 para la suma, 2 para la resta y así sucesivamente. La función devolverá el resultado de la operación mediante un número real.

## EJERCICIO 13

### Calcular el factorial de n recursivamente. Recordar que por definición el factorial de 0 (0!) es 1.

Para calcular n! (factorial de n), una forma es n! = n * (n-1) * (n-2)...1, y otra consiste en n! = n * (n-1)!.

## EJERCICIO 14

### Diseñar una función que calcule el n-ésimo término de la serie de Fibonacci. En esta serie el n-ésimo valor se calcula sumando los dos valores anteriores.

Es decir : fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2).
fibonacci(0) = 1.
fibonacci(1) = 1.
## EJERCICIO 1 

### Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.

Para distinguir si es par o impar comprobamos el resto de dividir por 2.

## EJERCICIO 2

### Pedir dos números enteros y decir si son iguales o no.

## EJERCICIO 3

### Solicitar dos números distintos y mostrar cuál es mayor.

## EJERCICIO 4

### Realizar de nuevo el ejercicio anterior considerando el caso de que los números introducidos puedan ser iguales.

## EJERCICIO 5

### Implementar un programa que pida por teclado un número decimal e indiquie si es un número casi-cero, que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 no se considera número casi-cero.

Un número casi-cero es el que se encuentra en el rango (-1, 1), donde se excluye el -1, el 0 y el 1.

## EJERCICIO 6

### Pedir dos números y mostrarlos ordenados de forma decreciente.

## EJERCICIO 7

### Pedir tres números y mostrarlos ordenados de mayor a menor

Supongamos que todos los números son distintos.

## EJERCICIO 8

### Pedir los coeficientes de una ecuación de 2ºgrado, y mostrar sus soluciones reales. Si no existen, debe indicarlo. Recordemos que las soluciones de ecuación de segundo grado, ax^2 + bx + c = 0 son, https://www.nobbot.com/resolver-ecuaciones-de-segundo-grado/.

Hay que comprobar que no existan divisiones por 0 o que no calculemos la raiz cuadrada de un número negativo. Estos errores producen una parada de la ejecución del programa.

## EJERCICIO 9 

### Escribir una aplicación que indique cuántas cifras tiene un número entero introducido por teclado, que estará comprendido entre 0 y 99.999

Sabemos que los números comprendidos entre 0 y 9, inclusives, tienen una cifra.

Los numeros comprendidos entre 10 y 99, inclusives, tienen 2 cifras.

Los números entre 100 y 999, inclusives, tienen 3 cifras. Etc...

## EJERCICIO 10

### Pedir un número entre 0 y 9.999, y decir si es capicúa

Un número capicúa se lee igual de derecha a izquierda, que de izquierda a derecha.

Para comparar los guarismos de un número lo descompondremos en: decenas de millar(dm), unidades de millar (um), centenas (c), decenas (d) y unidades (u).

Un número capicúa tiene las decenas de millar iguales que las unidades, y las unidades de millar igual que las decenas. Las centenas no son necesarias compararlas con nada. Esto en el caso de que tenga 5 cifras.

## EJERCICIO 11

### Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente(de 0 a 4), suficiente(5), Bien(6), Notable(7 y 8) y Sobresaliente(9 y 10).

## EJERCICIO 12

### Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Recordemos que existen meses con 28, 30 y 31 días. No consideramos los años bisiestos.

## EJERCICIO 13

### Escribir un programa que pida una hora de la forma: hora, minutos y segundos. El programa debe mostrar la hora un segundo más tarde.

Hora actuasl[10:41:59] --> hora actual + 1 segundo [10:42:00]

Supondremos que la hora introducida por el usuario es correcta. La idea del algoritmo es incrementar los segundos en 1. Esto puede provocar que salgan del rango 0..59, en este caso pondremos los segundos a 0 e incrementamos los minutos. Lo mismo con los minutos y horas.

## EJERCICIO 14

### Crear una aplicación que solicite al usuario una fecha (día, mes y año) y muestre la fecha correspondiente al día siguiente.

Este ejercicio es similar al anterior, en el que incrementábamos la hora.

No tendremos en cuenta los años bisiestos.

## EJERCICIO 15

### Idear un programa que solicite al usuario un número comprendido entre 1 y 7, correspondiente a un día de la semana. Se debe mostrar el nombre del día de la semana al que corresponde.

## EJERCICIO 16

### Solicitar un número comprendido entre 1 y 99. El programa debe mostrarlo escrito.

Descompondremos el número en unidades y decenas.

El problema es que el 11 se muestra como "dieci y uno". Habrá que considerar los números que no siguen la regla general.
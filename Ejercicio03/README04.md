# Ejercicio 4 - Tabla de multiplicar validada

## Integrantes

- Julio Terán
- Steven Betancourt
- Isaac Ogonaga

## 1. Problema

Desarrollar un programa que solicite un número entre 1 y 12. Si el número ingresado no se encuentra dentro de este rango, se deberá solicitar nuevamente. Una vez validado el número, el programa debe mostrar su tabla de multiplicar desde 1 hasta 12.

## Objetivo

Desarrollar un programa en Java que permita generar la tabla de multiplicar de un número entre 1 y 12, utilizando una validación mediante `while` y un ciclo `for` para generar la tabla.

## Descripción del ejercicio

El programa debe solicitar al usuario un número entre 1 y 12. Si el número ingresado es menor que 1 o mayor que 12, se deberá mostrar un mensaje indicando que el dato no es válido y solicitarlo nuevamente. Cuando el número sea válido, se generará su tabla de multiplicar desde 1 hasta 12.

## 2. Análisis

El programa primero solicita un número al usuario. Mediante un ciclo `while` se verifica que el número se encuentre entre 1 y 12. Si el valor no cumple con este rango, se vuelve a solicitar.

Una vez validado el número, se utiliza un ciclo `for` que comienza en 1 y termina en 12. En cada repetición se multiplica el número ingresado por el contador y se muestra el resultado correspondiente.

## 3. Entradas

- Número entre 1 y 12.

## 4. Procesos

- Solicitar un número.
- Validar que el número esté entre 1 y 12.
- Volver a solicitar el número si no es válido.
- Utilizar un ciclo `for` desde 1 hasta 12.
- Multiplicar el número ingresado por cada valor del ciclo.
- Mostrar cada resultado de la tabla.

## 5. Salidas

- Mensaje de número no válido cuando corresponda.
- Tabla de multiplicar del número ingresado desde 1 hasta 12.

## 6. Algoritmo

1. Inicio.
2. Solicitar un número al usuario.
3. Verificar si el número está entre 1 y 12.
4. Si el número no es válido, solicitarlo nuevamente.
5. Repetir la validación hasta ingresar un número válido.
6. Iniciar un ciclo `for` desde 1 hasta 12.
7. Multiplicar el número ingresado por el contador del ciclo.
8. Mostrar el resultado de cada multiplicación.
9. Repetir hasta llegar a 12.
10. Fin.

## 7. Pseudocódigo

```text
Algoritmo TablaMultiplicarValidada

    Definir numero, i, resultado Como Entero

    Escribir "Ingrese un numero entre 1 y 12:"
    Leer numero

    Mientras numero < 1 O numero > 12 Hacer
        Escribir "Numero no valido. Ingrese un numero entre 1 y 12:"
        Leer numero
    FinMientras

    Escribir "Tabla de multiplicar del ", numero

    Para i <- 1 Hasta 12 Hacer

        resultado <- numero * i

        Escribir numero, " x ", i, " = ", resultado

    FinPara

FinAlgoritmo
```

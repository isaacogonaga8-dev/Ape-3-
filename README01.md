# Ejercicio 1 - Promedio de calificaciones

## Integrantes

- Julio Terán
- Steven Betancourt
- Isaac Ogonaga

## 1. Problema

Desarrollar un programa que solicite la cantidad de estudiantes y registre las calificaciones de cada uno. Las calificaciones deben estar entre 0 y 10. Al finalizar, el programa debe mostrar el promedio general, la calificación mayor, la calificación menor, el número de aprobados y el número de reprobados.

## Objetivo

Desarrollar un programa que solicite la cantidad de estudiantes y registre sus calificaciones, aplicando validaciones y utilizando estructuras de repetición para obtener el promedio general, la calificación mayor, la menor, el número de aprobados y el número de reprobados.

## Descripción del ejercicio

El programa debe solicitar la cantidad de estudiantes y registrar una calificación para cada uno. Las calificaciones deben estar entre 0 y 10. Al finalizar, se debe mostrar el promedio general, la calificación mayor, la calificación menor, la cantidad de estudiantes aprobados y la cantidad de estudiantes reprobados.

## 2. Análisis

El programa primero solicita la cantidad de estudiantes. Después, mediante un ciclo `for`, se ingresa la calificación de cada estudiante. Cada calificación debe ser validada para que esté entre 0 y 10.

Mientras se ingresan las calificaciones, se acumulan los valores para calcular el promedio y se determina la calificación mayor y menor. También se cuentan los estudiantes aprobados y reprobados.

## 3. Entradas

- Cantidad de estudiantes.
- Calificación de cada estudiante.

## 4. Procesos

- Solicitar la cantidad de estudiantes.
- Ingresar las calificaciones mediante un ciclo `for`.
- Validar que las calificaciones estén entre 0 y 10.
- Acumular las calificaciones.
- Determinar la calificación mayor.
- Determinar la calificación menor.
- Contar los estudiantes aprobados.
- Contar los estudiantes reprobados.
- Calcular el promedio general.

## 5. Salidas

- Promedio general.
- Calificación mayor.
- Calificación menor.
- Número de aprobados.
- Número de reprobados.

## 6. Algoritmo

1. Inicio.
2. Solicitar la cantidad de estudiantes.
3. Inicializar el acumulador de calificaciones en cero.
4. Inicializar el contador de aprobados en cero.
5. Inicializar el contador de reprobados en cero.
6. Para cada estudiante, solicitar su calificación.
7. Validar que la calificación esté entre 0 y 10.
8. Si la calificación no es válida, volver a solicitarla.
9. Acumular la calificación.
10. Comparar la calificación para determinar la mayor y la menor.
11. Si la calificación es mayor o igual a 7, aumentar el contador de aprobados.
12. Si la calificación es menor a 7, aumentar el contador de reprobados.
13. Repetir el proceso hasta completar todos los estudiantes.
14. Calcular el promedio general.
15. Mostrar los resultados.
16. Fin.

## 7. Pseudocódigo

```text
Algoritmo PromedioCalificaciones

    Definir N, i, aprobados, reprobados Como Entero
    Definir calificacion, suma, promedio, mayor, menor Como Real

    Escribir "Ingrese la cantidad de estudiantes:"
    Leer N

    suma <- 0
    aprobados <- 0
    reprobados <- 0

    Para i <- 1 Hasta N Hacer

        Escribir "Ingrese la calificacion del estudiante ", i, ":"
        Leer calificacion

        Mientras calificacion < 0 O calificacion > 10 Hacer
            Escribir "Calificacion no valida. Ingrese una nota entre 0 y 10:"
            Leer calificacion
        FinMientras

        suma <- suma + calificacion

        Si i = 1 Entonces
            mayor <- calificacion
            menor <- calificacion
        SiNo
            Si calificacion > mayor Entonces
                mayor <- calificacion
            FinSi

            Si calificacion < menor Entonces
                menor <- calificacion
            FinSi
        FinSi

        Si calificacion >= 7 Entonces
            aprobados <- aprobados + 1
        SiNo
            reprobados <- reprobados + 1
        FinSi

    FinPara

    promedio <- suma / N

    Escribir "Promedio general: ", promedio
    Escribir "Calificacion mayor: ", mayor
    Escribir "Calificacion menor: ", menor
    Escribir "Aprobados: ", aprobados
    Escribir "Reprobados: ", reprobados

FinAlgoritmo

## Diagrama de flujo
<img width="1024" height="1536" alt="Ejercicio01_Diagrama png" src="https://github.com/user-attachments/assets/935ae130-1d7f-407a-9b33-57873e3cd40f" />


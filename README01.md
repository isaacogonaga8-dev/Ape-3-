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
```

## 8. Diagrama de flujo

<img width="1024" height="1536" alt="Ejercicio01_Diagrama png" src="https://github.com/user-attachments/assets/935ae130-1d7f-407a-9b33-57873e3cd40f" />

## 9. Estructuras utilizadas

- **Ciclo for:** permite repetir el ingreso de las calificaciones de todos los estudiantes.
- **Ciclo do-while:** permite validar que cada calificación esté entre 0 y 10.
- **Condicional if:** permite determinar la calificación mayor y menor.
- **Condicional if-else:** permite determinar si un estudiante está aprobado o reprobado.
- **Acumulador:** se utiliza para sumar todas las calificaciones.
- **Contadores:** se utilizan para contar los estudiantes aprobados y reprobados.
- **Validación:** comprueba que las calificaciones ingresadas estén dentro del rango permitido.

## 10. Datos de prueba

Cantidad de estudiantes: 4

| Estudiante | Calificación |
|------------|--------------|
| 1 | 8 |
| 2 | 6 |
| 3 | 10 |
| 4 | 5 |

## Seguimiento

| Estudiante | Calificación | Suma acumulada | Mayor | Menor | Aprobados | Reprobados |
|------------|--------------|----------------|-------|-------|-----------|------------|
| 1 | 8 | 8 | 8 | 8 | 1 | 0 |
| 2 | 6 | 14 | 8 | 6 | 1 | 1 |
| 3 | 10 | 24 | 10 | 6 | 2 | 1 |
| 4 | 5 | 29 | 10 | 5 | 2 | 2 |

## Resultados esperados

- Suma de calificaciones: 29
- Promedio general: 7.25
- Calificación mayor: 10
- Calificación menor: 5
- Aprobados: 2
- Reprobados: 2

## 11. Capturas o evidencias

<img width="1442" height="961" alt="Ejercicio01_Evidencia_01" src="https://github.com/user-attachments/assets/4af0d5cd-0730-4629-8c3c-b1153b849391" />
<img width="1438" height="946" alt="Ejercicio01_Evidencia_02" src="https://github.com/user-attachments/assets/67579e47-23a7-4e6e-aaf0-ddc7c742e61e" />

## 12. Conclusiones

- Se desarrolló un programa en Java para calcular el promedio de las calificaciones de un grupo de estudiantes.

- Se aplicaron estructuras de repetición para ingresar y procesar las calificaciones de cada estudiante.

- Se utilizaron validaciones para asegurar que las calificaciones ingresadas estén dentro del rango establecido de 0 a 10.

- Se utilizaron acumuladores y contadores para obtener el promedio y determinar la cantidad de estudiantes aprobados y reprobados.

- Se comprobó el funcionamiento del programa mediante diferentes casos de prueba, verificando que los resultados obtenidos sean correctos.

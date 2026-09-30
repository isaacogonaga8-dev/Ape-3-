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
### 8. Diagrama de flujo

<img width="1129" height="1393" alt="draigrama 4" src="https://github.com/user-attachments/assets/1c5fed41-7e87-43e8-993e-9cb5ffa03456" />

## 9. Estructuras utilizadas

- **Ciclo while:** permite validar que el número ingresado se encuentre entre 1 y 12. Si el número no es válido, se vuelve a solicitar.

- **Ciclo for:** permite generar la tabla de multiplicar desde 1 hasta 12.

- **Condicional:** permite comprobar si el número ingresado está dentro del rango permitido.

- **Validación:** evita que el programa continúe con números menores que 1 o mayores que 12.

- **Contador:** la variable `i` controla las multiplicaciones desde 1 hasta 12.

## 10. Datos de prueba

| Caso | Número ingresado | Validación | Resultado |
|------|------------------:|------------|-----------|
| 1 | 7 | Válido | Se genera la tabla del 7 |
| 2 | 15 | No válido | Se solicita nuevamente |
| 3 | 10 | Válido | Se genera la tabla del 10 |
| 4 | 0 | No válido | Se solicita nuevamente |
| 5 | 1 | Válido | Se genera la tabla del 1 |

## Seguimiento

### Caso de prueba: número 7

| Iteración | Número | Multiplicador | Operación | Resultado |
|----------:|-------:|--------------:|-----------|----------:|
| 1 | 7 | 1 | 7 × 1 | 7 |
| 2 | 7 | 2 | 7 × 2 | 14 |
| 3 | 7 | 3 | 7 × 3 | 21 |
| 4 | 7 | 4 | 7 × 4 | 28 |
| 5 | 7 | 5 | 7 × 5 | 35 |
| 6 | 7 | 6 | 7 × 6 | 42 |
| 7 | 7 | 7 | 7 × 7 | 49 |
| 8 | 7 | 8 | 7 × 8 | 56 |
| 9 | 7 | 9 | 7 × 9 | 63 |
| 10 | 7 | 10 | 7 × 10 | 70 |
| 11 | 7 | 11 | 7 × 11 | 77 |
| 12 | 7 | 12 | 7 × 12 | 84 |

## Resultados esperados

- 7 × 1 = 7
- 7 × 2 = 14
- 7 × 3 = 21
- 7 × 4 = 28
- 7 × 5 = 35
- 7 × 6 = 42
- 7 × 7 = 49
- 7 × 8 = 56
- 7 × 9 = 63
- 7 × 10 = 70
- 7 × 11 = 77
- 7 × 12 = 84

Si se ingresa un número menor que 1 o mayor que 12, el programa debe mostrar un mensaje de número no válido y solicitar nuevamente el dato.

## 11. Capturas o evidencias

<img width="1391" height="931" alt="image" src="https://github.com/user-attachments/assets/066c9934-d3dc-4e5d-9149-823887703e4a" />
<img width="1413" height="917" alt="image" src="https://github.com/user-attachments/assets/38a84c32-4f62-4a98-b9c5-421d17f4832b" />

## 12. Conclusiones

- Se desarrolló un programa en Java para generar la tabla de multiplicar de un número entre 1 y 12.

- Se utilizó un ciclo `while` para validar que el número ingresado se encuentre dentro del rango permitido.

- Se utilizó un ciclo `for` para generar las multiplicaciones desde 1 hasta 12.

- Se comprobó el funcionamiento del programa mediante diferentes datos de prueba, incluyendo valores válidos y no válidos.

- Se aplicaron estructuras de repetición de acuerdo con el problema planteado.

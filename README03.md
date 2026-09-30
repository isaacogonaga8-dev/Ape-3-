# Ejercicio 3 - Calculadora con menú repetitivo

## Integrantes

- Julio Terán
- Steven Betancourt
- Isaac Ogonaga

## 1. Problema

Construir una calculadora que permita realizar operaciones matemáticas mediante un menú repetitivo. El programa debe presentar las opciones de sumar, restar, multiplicar, dividir y salir. El menú debe repetirse hasta que el usuario seleccione la opción de salir. Además, se debe controlar la división para evitar dividir entre cero.

## Objetivo

Desarrollar un programa en Java que permita realizar operaciones matemáticas utilizando un menú repetitivo, aplicando la estructura `do-while`, la selección `switch` y una validación para evitar la división entre cero.

## Descripción del ejercicio

El programa debe mostrar un menú con cinco opciones: sumar, restar, multiplicar, dividir y salir. Cuando el usuario seleccione una operación, se solicitarán dos números y se mostrará el resultado correspondiente. En el caso de la división, se deberá comprobar que el segundo número sea diferente de cero. El menú continuará apareciendo hasta que el usuario seleccione la opción de salir.

## 2. Análisis

El programa utiliza un menú que se repite mediante un ciclo `do-while`. En cada repetición, el usuario selecciona una opción y el programa utiliza `switch` para ejecutar la operación correspondiente.

Para las operaciones de suma, resta, multiplicación y división se solicitan dos números. Antes de realizar una división, se verifica que el segundo número no sea igual a cero para evitar un error. El programa continúa funcionando hasta que el usuario selecciona la opción de salir.

## 3. Entradas

- Opción seleccionada del menú.
- Primer número.
- Segundo número.

## 4. Procesos

- Mostrar el menú de opciones.
- Leer la opción seleccionada.
- Solicitar dos números para las operaciones.
- Realizar la suma.
- Realizar la resta.
- Realizar la multiplicación.
- Validar que el divisor sea diferente de cero.
- Realizar la división.
- Mostrar el resultado de la operación.
- Repetir el menú hasta seleccionar la opción de salir.

## 5. Salidas

- Resultado de la suma.
- Resultado de la resta.
- Resultado de la multiplicación.
- Resultado de la división.
- Mensaje de error cuando se intenta dividir entre cero.
- Mensaje de finalización del programa.

## 6. Algoritmo

1. Inicio.
2. Mostrar el menú de opciones.
3. Solicitar al usuario una opción.
4. Verificar la opción seleccionada.
5. Si selecciona sumar, solicitar dos números y realizar la suma.
6. Si selecciona restar, solicitar dos números y realizar la resta.
7. Si selecciona multiplicar, solicitar dos números y realizar la multiplicación.
8. Si selecciona dividir, solicitar dos números.
9. Verificar que el segundo número sea diferente de cero.
10. Si el segundo número es cero, mostrar un mensaje de error.
11. Si el segundo número es diferente de cero, realizar la división.
12. Mostrar el resultado de la operación.
13. Si selecciona salir, finalizar el programa.
14. Si selecciona una opción diferente, mostrar un mensaje de opción no válida.
15. Repetir el menú mientras la opción sea diferente de 5.
16. Fin.

## 7. Pseudocódigo

```text
Algoritmo CalculadoraMenu

    Definir opcion Como Entero
    Definir num1, num2, resultado Como Real

    Repetir

        Escribir "=========================="
        Escribir "       CALCULADORA"
        Escribir "=========================="
        Escribir "1. Sumar"
        Escribir "2. Restar"
        Escribir "3. Multiplicar"
        Escribir "4. Dividir"
        Escribir "5. Salir"
        Escribir "Seleccione una opcion:"
        Leer opcion

        Segun opcion Hacer

            1:
                Escribir "Ingrese el primer numero:"
                Leer num1

                Escribir "Ingrese el segundo numero:"
                Leer num2

                resultado <- num1 + num2

                Escribir "Resultado: ", resultado

            2:
                Escribir "Ingrese el primer numero:"
                Leer num1

                Escribir "Ingrese el segundo numero:"
                Leer num2

                resultado <- num1 - num2

                Escribir "Resultado: ", resultado

            3:
                Escribir "Ingrese el primer numero:"
                Leer num1

                Escribir "Ingrese el segundo numero:"
                Leer num2

                resultado <- num1 * num2

                Escribir "Resultado: ", resultado

            4:
                Escribir "Ingrese el primer numero:"
                Leer num1

                Escribir "Ingrese el segundo numero:"
                Leer num2

                Si num2 = 0 Entonces
                    Escribir "Error: no se puede dividir entre cero."
                SiNo
                    resultado <- num1 / num2
                    Escribir "Resultado: ", resultado
                FinSi

            5:
                Escribir "Programa finalizado."

            De Otro Modo:
                Escribir "Opcion no valida."

        FinSegun

    Hasta Que opcion = 5

FinAlgoritmo
```

## 8. Diagrama de flujo

<img width="1158" height="1359" alt="diagrama03" src="https://github.com/user-attachments/assets/e352dd0c-e259-4f02-ba18-0b4b0771cb6f" />

## 9. Estructuras utilizadas

- **Ciclo do-while:** permite repetir el menú hasta que el usuario seleccione la opción 5.
- **Switch:** permite seleccionar y ejecutar la operación correspondiente.
- **Condicional if-else:** permite controlar que no se realice una división entre cero.
- **Validación:** permite controlar la división y las opciones ingresadas.
- **Selección:** permite determinar qué operación matemática debe realizar el programa.

## 10. Datos de prueba

| Caso | Opción | Primer número | Segundo número | Resultado esperado |
|------|-------:|--------------:|---------------:|--------------------|
| 1 | 1 | 10 | 5 | 15 |
| 2 | 2 | 10 | 5 | 5 |
| 3 | 3 | 10 | 5 | 50 |
| 4 | 4 | 10 | 5 | 2 |
| 5 | 4 | 10 | 0 | Error: no se puede dividir entre cero |
| 6 | 5 | - | - | Programa finalizado |

## Seguimiento

| Caso | Opción | Operación | Resultado |
|------|-------:|-----------|----------:|
| 1 | 1 | 10 + 5 | 15 |
| 2 | 2 | 10 - 5 | 5 |
| 3 | 3 | 10 × 5 | 50 |
| 4 | 4 | 10 ÷ 5 | 2 |
| 5 | 4 | 10 ÷ 0 | División no permitida |
| 6 | 5 | Salir | Programa finalizado |

## Resultados esperados

- Suma de 10 + 5: 15
- Resta de 10 - 5: 5
- Multiplicación de 10 × 5: 50
- División de 10 ÷ 5: 2
- División de 10 ÷ 0: operación no permitida
- Opción 5: programa finalizado

## 11. Capturas o evidencias

<img width="1451" height="950" alt="image" src="https://github.com/user-attachments/assets/c2a15ea6-e5ac-44f0-a88e-8da39314c2c8" />
<img width="1424" height="914" alt="image" src="https://github.com/user-attachments/assets/815ffa4b-2627-49f1-872a-0ce5689c773e" />

## 12. Conclusiones

- Se desarrolló una calculadora en Java utilizando un menú repetitivo para realizar diferentes operaciones matemáticas.

- Se utilizó el ciclo `do-while` para mantener el menú activo hasta seleccionar la opción de salida.

- Se utilizó `switch` para seleccionar la operación que debe realizar el programa.

- Se aplicó una validación para evitar realizar divisiones entre cero.

- Se comprobó el funcionamiento del programa mediante diferentes casos de prueba.

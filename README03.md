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

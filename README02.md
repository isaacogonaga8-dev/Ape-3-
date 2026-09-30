# Ejercicio 2 - Control de edades con centinela

## Integrantes

- Steven Betancourt
- Isaac Ogonaga
- Julio Terán

## 1. Problema

Ingrese edades válidas de personas. El ingreso terminará cuando se escriba -1. El programa deberá determinar cuántos son menores de edad, adultos y mayores de 65 años, además del promedio de edades ingresadas.

## Objetivo

Desarrollar un programa que permita ingresar edades de diferentes personas utilizando un valor centinela para finalizar el ingreso, clasificando las edades y calculando el promedio de las edades ingresadas.

## Descripción del ejercicio

El programa debe solicitar las edades de diferentes personas. El ingreso continuará mientras no se introduzca el valor -1. Las edades ingresadas serán procesadas para determinar cuántas personas son menores de edad, cuántas son adultas y cuántas tienen más de 65 años. Al finalizar, se deberá calcular el promedio de las edades ingresadas.

## 2. Análisis

El programa solicita las edades de las personas utilizando un ciclo `while`. El ingreso de datos termina cuando el usuario introduce `-1`, que funciona como valor centinela.

Cada edad ingresada debe ser validada. Mientras se procesan las edades, se utilizan contadores para clasificar a las personas y un acumulador para sumar las edades. Al finalizar el ingreso, se calcula el promedio de las edades registradas.

## 3. Entradas

- Edad de cada persona.
- Valor `-1` para finalizar el ingreso.

## 4. Procesos

- Solicitar una edad.
- Validar que la edad sea válida.
- Verificar si la edad es `-1`.
- Clasificar las edades en menores de edad, adultos y mayores de 65 años.
- Acumular las edades ingresadas.
- Contar las personas de cada categoría.
- Contar la cantidad total de edades ingresadas.
- Calcular el promedio de las edades.

## 5. Salidas

- Cantidad de menores de edad.
- Cantidad de adultos.
- Cantidad de personas mayores de 65 años.
- Promedio de las edades ingresadas.

## 6. Algoritmo

1. Inicio.
2. Inicializar el acumulador de edades en cero.
3. Inicializar el contador de edades en cero.
4. Inicializar el contador de menores de edad en cero.
5. Inicializar el contador de adultos en cero.
6. Inicializar el contador de mayores de 65 años en cero.
7. Solicitar una edad.
8. Verificar si la edad es igual a `-1`.
9. Si la edad es `-1`, finalizar el ingreso.
10. Si la edad es menor que 0 y diferente de `-1`, solicitar nuevamente una edad.
11. Acumular la edad ingresada.
12. Aumentar el contador de edades.
13. Si la edad es menor que 18, aumentar el contador de menores.
14. Si la edad está entre 18 y 65, aumentar el contador de adultos.
15. Si la edad es mayor que 65, aumentar el contador de mayores de 65.
16. Solicitar una nueva edad.
17. Repetir el proceso hasta ingresar `-1`.
18. Calcular el promedio de las edades ingresadas.
19. Mostrar los resultados.
20. Fin.

## 7. Pseudocódigo

```text
Algoritmo ControlEdades

    Definir edad, suma, cantidad Como Entero
    Definir menores, adultos, mayores65 Como Entero
    Definir promedio Como Real

    suma <- 0
    cantidad <- 0
    menores <- 0
    adultos <- 0
    mayores65 <- 0

    Escribir "Ingrese una edad (-1 para finalizar):"
    Leer edad

    Mientras edad <> -1 Hacer

        Mientras edad < 0 Y edad <> -1 Hacer
            Escribir "Edad no valida. Ingrese una edad valida:"
            Leer edad
        FinMientras

        Si edad <> -1 Entonces

            suma <- suma + edad
            cantidad <- cantidad + 1

            Si edad < 18 Entonces
                menores <- menores + 1
            SiNo
                Si edad <= 65 Entonces
                    adultos <- adultos + 1
                SiNo
                    mayores65 <- mayores65 + 1
                FinSi
            FinSi

        FinSi

        Si edad <> -1 Entonces
            Escribir "Ingrese una edad (-1 para finalizar):"
            Leer edad
        FinSi

    FinMientras

    Si cantidad > 0 Entonces
        promedio <- suma / cantidad
    SiNo
        promedio <- 0
    FinSi

    Escribir "Menores de edad: ", menores
    Escribir "Adultos: ", adultos
    Escribir "Mayores de 65 años: ", mayores65
    Escribir "Promedio de edades: ", promedio

FinAlgoritmo
```


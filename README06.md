Ejercicio 6 – Estadísticas de un curso

1. Análisis del problem
   
Se registran las notas de N estudiantes. Con ellas se calcula el promedio general, la nota mayor, la nota menor y la cantidad y porcentaje de aprobados y reprobados. Cada nota debe estar entre 0 y 10. Se asume que se aprueba con nota ≥ 7.

3. Entradas, procesos y salidas
   
Entradas	Procesos	Salidas
N (cantidad de estudiantes), N notas	Validar N > 0; repetir N veces (for); validar nota entre 0 y 10; acumular suma; comparar para mayor y menor; contar aprobados y reprobados; calcular promedio y porcentajes	Promedio, nota mayor, nota menor, aprobados y reprobados (cantidad y %)


3. Algoritmo

Inicio.

Leer N; repetir mientras N ≤ 0.

Iniciar suma = 0, mayor = 0, menor = 10, aprobados = 0, reprobados = 0.

Para i desde 1 hasta N: leer nota y repetir mientras esté fuera de 0–10.

Sumar la nota a suma.

Si nota > mayor, mayor = nota. Si nota < menor, menor = nota.

Si nota ≥ 7, aumentar aprobados; si no, aumentar reprobados.

Al terminar el ciclo: promedio = suma / N; % aprobados = aprobados × 100 / N; % reprobados = reprobados × 100 / N.

Mostrar resultados.

Fin.


5. Pseudocódigo

Algoritmo EstadisticasCurso

    Definir n, i, aprobados, reprobados Como Entero
    Definir nota, suma, mayor, menor, promedio Como Real
    Definir porcAprobados, porcReprobados Como Real

    Repetir
        Escribir "Número de estudiantes:"
        Leer n
        Si n <= 0 Entonces
            Escribir "El número debe ser mayor a 0"
        FinSi
    Hasta Que n > 0

    suma <- 0
    mayor <- 0
    menor <- 10
    aprobados <- 0
    reprobados <- 0

    Para i <- 1 Hasta n Con Paso 1 Hacer
        Repetir
            Escribir "Nota del estudiante ", i, " (0-10):"
            Leer nota
            Si nota < 0 O nota > 10 Entonces
                Escribir "Nota inválida, debe estar entre 0 y 10"
            FinSi
        Hasta Que nota >= 0 Y nota <= 10

        suma <- suma + nota

        Si nota > mayor Entonces
            mayor <- nota
        FinSi

        Si nota < menor Entonces
            menor <- nota
        FinSi

        Si nota >= 7 Entonces
            aprobados <- aprobados + 1
        SiNo
            reprobados <- reprobados + 1
        FinSi
    FinPara

    promedio <- suma / n
    porcAprobados <- aprobados * 100 / n
    porcReprobados <- reprobados * 100 / n

    Escribir "--- RESULTADOS ---"
    Escribir "Promedio general: ", promedio
    Escribir "Nota mayor: ", mayor
    Escribir "Nota menor: ", menor
    Escribir "Aprobados: ", aprobados, " (", porcAprobados, "%)"
    Escribir "Reprobados: ", reprobados, " (", porcReprobados, "%)"
FinAlgoritmo



6.DIAGRAMA DE FLUJO


<img width="1962" height="2586" alt="ej6" src="https://github.com/user-attachments/assets/2a38e697-3b81-4799-9e56-265ce9bce3e0" />






7.ESTRUCTURAS UTILIZADAS


Tipo	Estructura	Dónde se usa

Repetitiva	for	Recorre los N estudiantes

Repetitiva	do-while (dentro del for)	Valida cada nota entre 0 y 10

Repetitiva	do-while (inicial)	Valida que N sea mayor que 0

Selectiva	if (dos independientes)	Actualiza la nota mayor y la nota menor

Selectiva	if / else	Clasifica en aprobado (≥ 7) o reprobado

Acumulador	suma	Suma todas las notas para el promedio

Contadores	aprobados, reprobados	Cuentan cada grupo

Cálculo	Promedio y porcentajes	suma / n y cantidad * 100.0 / n





8.CASOS DE PRUEBA

N.º	Descripción	Entrada	Resultado esperado

1	N inválido	N = 0 o N = -3, luego 3	Vuelve a pedir N

2	Un solo estudiante	N = 1; nota 10	Promedio 10.00; mayor 10.0; menor 10.0; aprobados 1 (100 %); reprobados 0 (0 %)

3	Todos justo en el límite	N = 3; notas 7, 7, 7	Promedio 7.00; aprobados 3 (100 %)

4	Todos reprobados	N = 3; notas 0, 3, 6	Promedio 3.00; mayor 6.0; menor 0.0; reprobados 3 (100 %)

5	Nota negativa	Nota -1	"Nota inválida" y vuelve a pedir la misma nota

6	Nota mayor a 10	Nota 10.5	"Nota inválida" y vuelve a pedir la misma nota

7	Caso mixto	N = 4; notas 8, 5.5, 10, 6	Promedio 7.38; mayor 10.0; menor 5.5; aprobados 2 (50 %); reprobados 2 (50 %)

8	Frontera de aprobación	Notas 6.99 y 7	6.99 reprobado; 7 aprobado




9.CAPTURAS O EVIDENCIAS

<img width="580" height="397" alt="image" src="https://github.com/user-attachments/assets/ebd6f24b-8e8a-4176-a2fa-98da5f284f82" />



10.CONCLUSIONES
Aquí el for fue la mejor opción, porque se conoce de antemano cuántos estudiantes hay (N) y por lo tanto cuántas veces debe repetirse el proceso. En un solo recorrido se calcularon varios resultados a la vez: la suma para el promedio, la nota mayor y menor mediante comparaciones, y los contadores de aprobados y reprobados. Validar cada nota dentro del ciclo garantiza que los datos incorrectos no afecten las estadísticas. La prueba de escritorio confirmó que el promedio (7.38) y los porcentajes (50 % y 50 %) se calculan bien. También se vio que los valores iniciales importan: la nota mayor empieza en 0 y la menor en 10 para que la primera nota ingresada siempre actualice ambos valores.









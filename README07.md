Ejercicio 7 – Venta de entradas CineCampus

1. Análisis del problema

Se registran ventas de entradas de forma repetitiva. Para cada venta se pide tipo de entrada, cantidad y precio; se calcula el subtotal (cantidad × precio) y se acumula en un total general. Al final de cada venta se pregunta si se desea registrar otra; el ciclo termina cuando la respuesta no es "s".


2. Entradas, procesos y salidas
   
Entradas	Procesos	Salidas

Tipo de entrada (1-3), cantidad, precio, respuesta s/n	Validar tipo, cantidad > 0 y precio > 0; seleccionar nombre del tipo (switch); subtotal = cantidad × precio; acumular total; contar ventas; repetir con do-while	Tipo de entrada, subtotal por venta, total acumulado, número de ventas y total recaudado



3. Algoritmo

Inicio.

Iniciar totalAcumulado = 0 y cantidadVentas = 0.

Leer tipo de entrada (1 General, 2 Estudiante, 3 Tercera edad); repetir si no está entre 1 y 3.

Leer cantidad; repetir mientras sea ≤ 0.

Leer precio; repetir mientras sea ≤ 0.

subtotal = cantidad × precio.

totalAcumulado = totalAcumulado + subtotal; cantidadVentas = cantidadVentas + 1.

Mostrar tipo, subtotal y total acumulado.

Preguntar "¿Otra venta? (s/n)".

Si la respuesta es "s", volver al paso 3.

Mostrar ventas realizadas y total recaudado.

Fin.



4. Pseudocódigo

Algoritmo CineCampus

    Definir tipo, cantidad, cantidadVentas Como Entero
    Definir precio, subtotal, totalAcumulado Como Real
    Definir otra, nombreTipo Como Cadena
    totalAcumulado <- 0
    cantidadVentas <- 0
    Repetir
        Repetir
            Escribir "Tipo: 1.General 2.Estudiante 3.Tercera edad"
            Leer tipo
        Hasta Que tipo >= 1 Y tipo <= 3
        Segun tipo Hacer
            1: nombreTipo <- "General"
            2: nombreTipo <- "Estudiante"
            3: nombreTipo <- "Tercera edad"
        FinSegun
        Repetir
            Escribir "Cantidad:"
            Leer cantidad
        Hasta Que cantidad > 0
        Repetir
            Escribir "Precio:"
            Leer precio
        Hasta Que precio > 0
        subtotal <- cantidad * precio
        totalAcumulado <- totalAcumulado + subtotal
        cantidadVentas <- cantidadVentas + 1
        Escribir nombreTipo, " Subtotal: ", subtotal
        Escribir "Total acumulado: ", totalAcumulado
        Escribir "¿Otra venta? (s/n)"
        Leer otra
    Hasta Que otra <> "s" Y otra <> "S"
    Escribir "Ventas: ", cantidadVentas, " Total: ", totalAcumulado
FinAlgoritmo


5.DIAGRAMA DE FLUJO





<img width="1399" height="2821" alt="ej7" src="https://github.com/user-attachments/assets/eb5c2427-3a84-4a0f-af35-c545e6fe363c" />






6.ESTRUCTURAS UTILIZADAS

Tipo	Estructura	Dónde se usa

Repetitiva	do-while (externo)	Repite ventas mientras la respuesta sea "s"

Repetitiva	do-while (internos)	Validan tipo (1 a 3), cantidad > 0 y precio > 0

Selectiva múltiple	switch	Asigna el nombre del tipo de entrada

Acumulador	totalAcumulado	Suma el subtotal de cada venta

Contador	cantidadVentas	Cuenta las ventas registradas

Cálculo	subtotal = cantidad * precio	Subtotal por venta

Comparación de texto	equalsIgnoreCase("s")	Acepta "s" o "S" para continuar




7. CASOS DE PRUEBA
   
N.º	Descripción	Entrada	Resultado esperado

1	Tipo inválido	Tipo 0 o 4	Vuelve a pedir el tipo

2	Cantidad inválida	Cantidad 0 o -2	Vuelve a pedir la cantidad

3	Precio inválido	Precio 0 o -1	Vuelve a pedir el precio

4	Una sola venta	Tipo 1, cantidad 2, precio 5; respuesta "n"	Subtotal $10.0; total $10.0; ventas realizadas 1

5	Dos ventas	Venta anterior con "s"; luego tipo 2, cantidad 3, precio 3.5; "n"	Subtotal $10.5; total acumulado $20.5; ventas 2

6	Tercera edad	Tipo 3, cantidad 1, precio 2.5	"Tipo: Tercera edad", subtotal $2.5

7	Respuesta en mayúscula	Respuesta "S"	Continúa con otra venta

8	Respuesta distinta de "s"	Respuesta "x" o "n"	Termina y muestra el resumen final


8.CAPTURAS O EVIDENCIAS

<img width="617" height="355" alt="image" src="https://github.com/user-attachments/assets/63eca0b0-bbb1-420c-bd32-9dfe461e2c2a" />






9.CONCLUSIONES
Este ejercicio trabajó la repetición controlada por el usuario, ya que no se sabe cuántas ventas habrá. El do-while con la pregunta "¿Desea realizar otra venta?" permite registrar al menos una venta y continuar solo si la respuesta es afirmativa. El subtotal se calcula en cada venta y el total acumulado se mantiene a lo largo de todo el ciclo, lo que ilustra bien la diferencia entre una variable local de cada iteración y un acumulador. Usar switch para el tipo de entrada y validar cantidad y precio hace el sistema más robusto y cercano a una aplicación real.

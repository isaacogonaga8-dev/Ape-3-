Ejercicio 5 – Cajero universitario

1. Análisis del problema
Se necesita un cajero que parta de un saldo inicial y permita consultar saldo, depositar, retirar, ver el número de transacciones y salir. El menú se repite hasta que el usuario elija "Salir". No se aceptan valores negativos ni retiros mayores al saldo disponible. Solo los depósitos y retiros exitosos cuentan como transacciones.

2. Entradas, procesos y salidas

Entradas	Procesos	Salidas ,Saldo inicial, opción del menú, monto a depositar, monto a retirar	Validar saldo inicial ≥ 0; repetir el menú (do-while); seleccionar acción (switch); acumular saldo (suma/resta); contar transacciones; validar monto > 0 y retiro ≤ saldo	Saldo actual, mensajes de éxito o error, número de transacciones, despedida

3. Algoritmo
Inicio.
Leer saldo inicial; repetir mientras sea negativo.
Poner transacciones en 0.
Mostrar menú y leer opción.
Si opción = 1, mostrar saldo.
Si opción = 2, leer monto; si monto > 0, sumar al saldo y aumentar transacciones; si no, mostrar error.
Si opción = 3, leer monto; si monto > 0 y monto ≤ saldo, restar del saldo y aumentar transacciones; si no, mostrar error.
Si opción = 4, mostrar transacciones.
Si opción = 5, despedirse; si es otro valor, mostrar "opción inválida".
Mientras opción ≠ 5, volver al paso 4.
Fin.

4. Pseudocódigo
Algoritmo CajeroUniversitario
    Definir saldo, deposito, retiro Como Real
    Definir opcion, transacciones Como Entero
    transacciones <- 0
    Repetir
        Escribir "Ingrese el saldo inicial:"
        Leer saldo
        Si saldo < 0 Entonces
            Escribir "El saldo no puede ser negativo"
        FinSi
    Hasta Que saldo >= 0
    Repetir
        Escribir "1.Consultar 2.Depositar 3.Retirar 4.Transacciones 5.Salir"
        Leer opcion
        Segun opcion Hacer
            1: Escribir "Saldo actual: ", saldo
            2: Leer deposito
               Si deposito > 0 Entonces
                   saldo <- saldo + deposito
                   transacciones <- transacciones + 1
               SiNo
                   Escribir "Monto inválido"
               FinSi
            3: Leer retiro
               Si retiro > 0 Y retiro <= saldo Entonces
                   saldo <- saldo - retiro
                   transacciones <- transacciones + 1
               SiNo
                   Escribir "Monto inválido o fondos insuficientes"
               FinSi
            4: Escribir "Transacciones: ", transacciones
            5: Escribir "Gracias por usar el cajero"
            De Otro Modo: Escribir "Opción inválida"
        FinSegun
    Hasta Que opcion = 5
FinAlgoritmo


5.DIAGRAMA DE FLUJO



<img width="3195" height="1746" alt="5 DIA" src="https://github.com/user-attachments/assets/efa2aed0-e696-481d-afe8-1ea6342779f3" />





6. ESTRUCTURAS UTILIZADAS

Tipo	Estructura	Dónde se usa
Repetitiva	do-while (externo)	: Repite el menú hasta que la opción sea 5

Repetitiva	do-while (interno)	:Valida que el saldo inicial no sea negativo

Selectiva múltiple	switch:	Ejecuta la acción según la opción (1 a 5 y default)

Selectiva	if / else if / else	Valida depósitos :(> 0) y retiros (> 0 y ≤ saldo)

Acumulador	saldo:	Suma en depósitos, resta en retiros

Contador	transacciones	:Aumenta en 1 con cada depósito o retiro exitoso

Otros	Variables double e int,: Scanner	Datos y lectura por teclado



7.CASOS DE PRUEBA

N.º	Descripción	Entrada	Resultado esperado

1	Consultar saldo	Saldo inicial 100; opción 1	Saldo actual: $100.0
2	Saldo inicial negativo	Saldo inicial -50, luego 100	Mensaje de error y vuelve a pedir el saldo
3	Depósito válido	Saldo 100; opción 2, monto 50	Nuevo saldo $150.0; transacciones = 1
4	Depósito en cero	Opción 2, monto 0	"El monto debe ser mayor a 0."; saldo sin cambio
5	Depósito negativo	Opción 2, monto -20	Mismo error; saldo sin cambio
6	Retiro válido	Saldo 150; opción 3, monto 30	Nuevo saldo $120.0; transacciones +1
7	Retiro mayor al saldo	Saldo 150; opción 3, monto 200	"Fondos insuficientes"; saldo sin cambio
8	Retiro igual al saldo	Saldo 120; opción 3, monto 120	Retiro exitoso; saldo $0.0
9	Retiro en cero o negativo	Opción 3, monto 0 o -10	"El monto debe ser mayor a 0."
10	Opción inexistente	Opción 9	"Opción inválida." y muestra el menú de nuevo
11	Ver transacciones	2 operaciones exitosas y 2 fallidas; opción 4	Transacciones realizadas: 2
12	Salir	Opción 5	"Gracias por usar el cajero." y termina




8.EVIDENCIAS 


<img width="672" height="355" alt="image" src="https://github.com/user-attachments/assets/5748cf3c-b3e9-401a-9b35-19509a48d9b7" />



9.CONCLUSIONES

Este ejercicio mostró que el do-while es la estructura adecuada para un menú, porque el menú debe mostrarse al menos una vez y repetirse hasta que el usuario elija salir. El saldo funciona como acumulador (suma en los depósitos, resta en los retiros) y el número de transacciones como contador. Además, las validaciones evitan que el programa llegue a estados incorrectos, como un saldo negativo o un retiro mayor al disponible. Al combinar switch con condiciones anidadas, el código queda ordenado y fácil de ampliar con nuevas opciones. Los depósitos y retiros fallidos no se contaron como transacciones, lo que mantiene coherente el resultado final

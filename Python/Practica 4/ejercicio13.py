# Pedimos el número
numbers = int(input("Introduce un número para saber si es primo o no: "))
# Calculamos el entero de la raiz cuadrada y creamos la variable acumulativa de los divisores
raiz = int(numbers**0.5)
divisible = ""
primo = True
# Si la raiz es menor que 2, es primo
if raiz < 2:
    primo
# Si es >= 2, dividimos desde 2 hasta raiz(número) y si el resto es 0 -> No es primo
else:
    for i in range(2, raiz+1):
        if numbers % i == 0:
            primo = False
            divisible = f"{divisible} [{int(i)}]"

# Mostramos resultado
if primo:
    print("Es un Nº primo")
else:
    print(f"No es un Nº primo, es divisible por{divisible}")

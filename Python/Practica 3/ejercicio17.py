# Pedimos los 2 números
number1, number2 = input("Introduce dos números separados con un espacio: ").split(" ")
# Comprobamos si es mayor y mostramos el resultado
if float(number1) > float(number2):
    print("El número 1 es mayor que el número 2")
else:
    print("El número 1 no es mayor que el número 2")

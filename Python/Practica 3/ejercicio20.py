# Pedimos los 2 números
number1, number2 = input("Introduce 2 números separados por un espacio: ").split(" ")
# Comprobamos que el n2 sea > 0 y en tal caso mostramos la división
if number2 != 0:
    print(f"El resultado de dividir el 1º número entre el 2º número es: {round(float(number1)/float(number2),2)}")
else:
    print("No se puede realizar la división, al ser el 2º número igual a 0")

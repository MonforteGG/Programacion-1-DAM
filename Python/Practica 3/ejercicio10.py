# Pedimos los datos y calculamos la distancia en valor absoluto
number1, number2 = input("Introuce los 2 números separados por un espacio: ").split(" ")
distance = abs(float(number1) - float(number2))
# Mostramos el resultado
print(f"La distancia que hay entre {number1}KM y {number2}KM, es de {round(distance, 2)}KM")

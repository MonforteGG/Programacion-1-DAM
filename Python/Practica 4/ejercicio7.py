# Pedimos un número del dado
number = int(input("Introduce el número del dado (1-6): "))
# Creamos una lista con los números en palabras
list = ["One","Two","Three","Four","Five","Six"]
# Mientras el numero no este entre 1 y 6, error y vuelve a introducir el nº
while number > 6 or number < 1:
    print("El número es incorrecto")
    number = int(input("Introduce el número del dado (1-6): "))

opuesto = 6-number
# Muestra el número opuesto
print(f"El número de la cara opuesta al número introducido es: {list[opuesto]}")

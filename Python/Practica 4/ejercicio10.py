# Importamos libreria random
import random

# Generamos un número aleatorio entre 1 y 100
number_random = random.randint(1, 100)
# Bucle que se repite 10 veces  donde se pide el número y
for i in range(1, 11):
    number = int(input("Intenta adivinar el número: "))
    if number == number_random:
        print("El número introducido es correcto")
        print(f"Has tardado {i} intentos")
        break
    else:
        if number_random > number:
            print("El número es mayor")
        else:
            print("El número es menor")

if i == 10:
    print(f"El número era {number_random}")


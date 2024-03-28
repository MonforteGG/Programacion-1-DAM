import random


count = 0
flag = False

# Bucle que genere numeros aleatorios entre el 0 y 100 y si son pares cuente cuantos genera hasta que se genere el 24
while flag != True:
    number = random.randint(0, 100)
    if number % 2 == 0:
        count +=1
        if number == 24:
            flag = True

# Mostramos el resultado
print(f"Ha tardado: {count} intentos.")


# Pedimos cuantos números vamos a usar
cuantity = int(input("¿Cuantos números vas a introducir? : "))
# Declaramos las variables
positive = 0
negative = 0
zero = 0
# Pedimos los números y contamos según tipo
for i in range (cuantity):
    number = float(input(f"Introduce el {i+1}º número: "))
    if number > 0:
        positive = positive + 1
    elif number < 0:
        negative = negative + 1
    else:
        zero = zero + 1
# Mostramos el resultado
print(f"Hay {positive} números positivos, {negative} números negativos y {zero} números igual a 0")

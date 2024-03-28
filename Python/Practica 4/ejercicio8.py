# Pedimos el día por teclado
day = int(input("Introduce el número del día de la semana (1-7): "))

# Bucle hasta que metamos el dato correcto
while day > 7 or day < 1:
    print("Número incorrecto")
    day = int(input("Introduce el número del día de la semana (1-7): "))

# Lista de los días de la semana
list = ["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]

# Mostramos la posición de la lista que corresponda
print(f"El día de la semana es: {list[day-1]}")
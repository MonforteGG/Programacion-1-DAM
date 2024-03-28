# Pedimos el mes por teclado hasta que se introduzca el dato correcto
month = int(input("Introduce el número del mes para conocer cuantos días tiene (1-12): "))
while month > 12 or month < 1:
    print("Dato incorrecto")
    month = int(input("Introduce el número del mes para conocer cuantos días tiene (1-12): "))
# Creamos las listas de los meses y días
list_month = ["January","February","March","April","May","June","July","August","September","October","November","December"]
list_days = ["31","28","31","30","31","30","31","31","30","31","30","31"]

# Mostramos el resultado
print(f"El mes {list_month[month-1]} tiene {list_days[month-1]} días")
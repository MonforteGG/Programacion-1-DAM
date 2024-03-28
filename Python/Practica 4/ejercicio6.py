# Pedimos el año
year = int(input("Introduce el año a comprobar: "))
# Dividimos el año por 4,100 y 400
div4 = year/4
div100 = year/100
div400 = year/400

# Comprobamos si se cumplen las condiciones viendo si el resultado es un entero
if not div100.is_integer() and div4.is_integer():
    print("El año es bisiesto")
elif div4.is_integer() and div100.is_integer() and div400.is_integer():
    print("El año es bisiesto")
else:
    print("El año no es bisiesto")

# Pedimos los datos y creamos la variable de conversión
fahrenheit = float(input("Introduce la temperatura en grados Fahrenheit: "))
celsius = (fahrenheit-32)*5/9
# Mostramos el resultado
print(f"{fahrenheit}º grados fahrenheit son equivalentes a {round(celsius,2)}º grados celcius")

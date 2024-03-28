# Pedimos los datos
nota, edad, sexo = input("Introduce la nota, edad y sexo (M/F) separados por espacios: ").split(" ")

# Comprobamos si se cumplen las condiciones
if float(nota) >= 5 and int(edad) >= 18 and sexo == "F":
    print("ACEPTADA")
elif float(nota) >= 5 and int(edad) >= 18 and sexo == "M":
    print("POSIBLE")
else:
    print("NO ACEPTADA")

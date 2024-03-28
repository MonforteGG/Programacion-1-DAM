# Pedimos los 3 números y declaramos la variable media
numb1, numb2, numb3 = input("Introduce 3 números separados por un espacio: ").split(" ")
media = (float(numb1)+float(numb2)+float(numb3))/3
# Mostramos el resultado
print("La media de los 3 números es: ", round(media,2))

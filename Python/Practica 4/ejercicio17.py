# Pedimos los datos
phrase = input("Introduce una cadena de caracteres: ").split()
phrase_nospace = ""
# Quitamos los espacios
for i in phrase:
    phrase_nospace = phrase_nospace+i
# Escribimos la cadena al revés
reverse = phrase_nospace[::-1]
# Comprobamos si son iguales y mostramos el resultado
if reverse == phrase_nospace:
    print("Es un palíndromo")
else:
    print("No es un palíndromo")

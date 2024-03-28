# Pedimos los datos
cadena = input("Introduce una frase: ")
caracter = input("Introduce un carácter: ")
suma = 0
# Verificación
while len(caracter) != 1:
    caracter = input("Carácter inválido. Introduce solo una letra: ")
# Cuenta
for i in cadena:
    if i == caracter:
        suma = suma + 1
# Mostramos el resultado
print(f"La cantidad de caracteres {caracter} introducidas son: {suma}")


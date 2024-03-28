# Pedimos la letra
char = input("Introduce una letra: ")
# Comprueba si la letra es mayúscula o minúscula
if len(char) == 1 and "A" <= char <= "Z":
    print("Es mayúscula")
elif len(char) == 1 and "a" <= char <= "z":
    print("Es minúscula")
else:
    print("No es una letra")


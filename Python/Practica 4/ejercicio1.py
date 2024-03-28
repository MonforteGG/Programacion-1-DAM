# Pedimos los datos
user, password = input("Introduce el usuario y contraseña separados por un espacio: ").split(" ")

# Comprobamos si son correctos
if user == "jose" and password == "asdasd":
    print("Has entrado al sistema")
else:
    print("Los datos introducidos son incorrectos")

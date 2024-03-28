# Pedimos el nombre y apellidos
name, first_name, second_name = input("Introduce tu nombre y apellidos, separados por un espacio: ").split(" ")
# Mostramos el resultado
print(f"Las iniciales son: {name[0]}{first_name[0]}{second_name[0]}")

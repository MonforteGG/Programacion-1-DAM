# Pedimos los datos
A, B = input("Introduce las dos variables numéricas separadas por un espacio: ").split(" ")
# Cambiamos los valores y mostramos el resultado
A, B = B, A
print(f"La variable A vale: {A} y la variable B vale: {B}")

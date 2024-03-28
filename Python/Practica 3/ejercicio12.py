# Pedimos los valores y calculamos las distancias
x1, y1 = input("Introduce los 2 valores de la primera coordenada separados por un espacio: ").split(" ")
x2, y2 = input("Introduce los 2 valores de la segunda coordenada separados por un espacio: ").split(" ")
distance_x = int(x1)-int(x2)
distance_y = int(y1)-int(y2)
# Mostramos el resultado
print(f"La distancia entre los puntos ({x1},{y1}) y ({x2},{y2}), es de ({abs(distance_x)},{abs(distance_y)})")

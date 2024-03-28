# Pedimos los datos y calculamos el resultado
practicas, examen, actitud = input("Introduce las notas de las prácticas, examen y de la actitud, separadas por un espacio: ").split(" ")
result = float(practicas)*0.6 + float(examen)* 0.3 + float(actitud)*0.1
# Mostramos el resultado
print(f"La nota final es de {round(result,2)}")

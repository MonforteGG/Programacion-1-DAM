# Pedimos los datos
phrase = input("Introduce una oración con las palabradas separadas por espacios: ").split(" ")
suma = 0

# Contamos las palabras y mostramos el resultado
for i in phrase:
    suma = suma + 1
print(f"La oración esta compuesta por {suma} palabras")

import random
# Declaramos el nº de filas y columnas
rows = 4
cols = 5

# Declaramos los arrays
array = []
sum_cols = []

# Rellenamos el array con arrays de filas que incluyen la suma de la fila al final
for i in range(rows):
    row = []
    for j in range(cols):
        number = random.randint(0,1000)
        row.append(number)
    row.append(sum(row))
    array.append(row)


# Recorremos el array de forma vertical y sumamos las columnas
for i in range(cols):
    sumprueba = 0
    for j in range(rows):
        sumprueba = sumprueba + array[j][i]
    sum_cols.append(sumprueba)



# Mostramos el resultado
for row in array:
    print(row)

sum_cols.append(sum(sum_cols))
print(sum_cols)







# Pedimos los minutos
data = int(input("Introduce la cantidad de minutos: "))
# Calculamos las horas y los minutos
hours_int = data//60
minutes = data-hours_int*60
# Mostramos el resultado
print(f"{data} minutos son {hours_int} horas y {minutes} minutos")

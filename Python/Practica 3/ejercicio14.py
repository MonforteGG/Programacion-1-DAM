# Pedimos la hora de salida
HH, MM, SS = input("Introduce la hora de salida del ciclista en formato: HH MM SS: ").split(" ")
# Lo pasamos a segundos
HH_seconds = float(HH) * 3600
MM_seconds = float(MM) * 60
# Declaramos lo que tarda el viaje en segundos
distance = 3750

# Calculamos la hora de salida en segundos y la suma de salida y la distancia para saber la llegada
departure_seconds = HH_seconds + MM_seconds + int(SS)
departure_total_seconds = departure_seconds + distance

# Calculamos las horas, minutos y segundos de la hora de llegada
HH_sum = departure_total_seconds // 3600
seconds_remain = departure_total_seconds % 3600
MM_sum = seconds_remain // 60
SS_sum = seconds_remain % 60

# Que pase de día si pasa de las 24h
if HH_sum >= 24:
    HH_sum = HH_sum - 24
# Mostramos el resultado
print(f"Saliendo desde la ciudad A a las {HH} horas, {MM} minutos y {SS} segundos, si el tiempo de llegada es de {distance} segundos, la hora de llegada a la ciudad B  es: {int(HH_sum)} horas, {int(MM_sum)} minutos y {int(SS_sum)} segundos")

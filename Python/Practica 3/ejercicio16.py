# Pedimos los datos
dos_euros = int(input("¿Cuantas monedas de 2 euros tienes? "))
un_euro = int(input("¿Cuantas monedas de 1 euro tienes? "))
cincuenta_centimos = int(input("¿Cuantas monedas de 50 céntimos tienes? "))
veinte_centimos = int(input("¿Cuantas monedas de 20 céntimos tienes? "))
diez_centimos = int(input("¿Cuantas monedas de 10 céntimos tienes? "))
# Calcuamos el valor
valor = (2*dos_euros)+(un_euro)+(0.5*cincuenta_centimos)+(0.2*veinte_centimos)+(0.1*diez_centimos)
# Mostramos el resultado
print(f"El valor es de: {valor}€")

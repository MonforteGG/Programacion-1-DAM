# Pedimos el importe y creamos la variable del descuento
price = float(input("Introduce el importe de la compra: "))
discount = 0.15

# Mostramos el resultado
print(f"El importe total de la compra es: {price}€, y el importe con el descuento del {round(discount*100)}% aplicado es de: {round(price*(1-discount), 2)}€")

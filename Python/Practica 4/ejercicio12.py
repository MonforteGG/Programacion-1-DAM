# Pedimos la base y el exponente
base = float(input("Introduce el número base: "))
exponent = int(input("Introduce el exponente: "))
# Variable acumulativa
resultado = base
# Si el exponente es 1, igual a la base, si no, base * base (exponent veces)
if exponent == 1:
    resultado = base
else:
    for i in range(exponent - 1):
        resultado = resultado * base

# Mostramos resultado
print(f"El resultado elevar {base} a {exponent} es: {resultado} ")

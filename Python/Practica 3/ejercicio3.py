# Pedimos los lados
lado1 = float(input("Introduce el lado 1: "))
lado2 = float(input("Introduce el lado 2: "))
# Calculamos la hipotenusa y la mostramos
hipotenusa_cuadrado = lado1**2 + lado2**2
hipotenusa = pow(hipotenusa_cuadrado, 0.5)
print("La hipotenusa es ", hipotenusa)

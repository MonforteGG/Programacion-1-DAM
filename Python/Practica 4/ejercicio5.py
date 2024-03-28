# Pedimos los 3 lados y vemos cual es el mayor,mid, y menor
A, B, C = input("Introduce las dimensiones de los 3 lados del triangulo, separados por espacios: ").split(" ")
list = [float(A), float(B), float(C)]
mayor = float(max(list))
minor = float(min(list))
mid = None

if mayor > float(A) > minor:
    mid = float(A)
elif mayor > float(B) > minor:
    mid = float(B)
else:
    mid = float(C)

# Comprobamos que tipo de triangulo es
if mayor**2+0.1 > mid**2 + minor**2 > mayor**2-0.1:
    print("Es un triangulo rectangulo")
elif A == B == C:
    print("Es un triangulo equilatero")
elif A == B or B == C or A == C:
    print("Es un triangulo isosceles")
else:
    print("Es un triangulo escaleno")

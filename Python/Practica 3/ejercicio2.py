#  Pedimos el lado y altura
lado = float(input("Escribe el lado del rectangulo: "))
altura = float(input("Escribe la altura del rectangulo: "))
# Calculamos el area y perímetro
area = lado * altura
perimetro = 2*(lado+altura)
# Mostramos el resultado
print(f"Para un rectangulo de lado {lado} y altura {altura}, el area es {area} y el perimetro es {perimetro} ")

import random
from statistics import *

# Declaramos el array y lo rellenamos de números aleatorios entre el 100 y el 199
numbers = []
for i in range(50):
    numbers.append(random.randint(100,199))
# Mostramos los números
for i in numbers:
    print(i , end=" ")
print()
# Mostramos el max, min, media, moda, mediana y desv típica
print(f"El número máximo es: {max(numbers)}")
print(f"El número mínimo es: {min(numbers)}")
print(f"La media es: {mean(numbers)}")
print(f"La moda es: {mode(numbers)}")
print(f"La mediana es: {median(numbers)}")
print(f"La desviación típica: {pstdev(numbers)}")

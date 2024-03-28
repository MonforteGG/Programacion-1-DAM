# Pedimos los números
number1, number2, number3 = input("Introduce 3 números separados por un espacio: ").split(" ")

# Los mostramos de forma ordenada
print("Los números ordenados de mayor a menor son: ")
if int(number1) > int(number2) > int(number3):
    print(number1,number2,number3)
elif int(number1) > int(number3) > int(number2):
    print(number1, number3, number2)
elif int(number2) > int(number1) > int(number3):
    print(number2, number1, number3)
elif int(number2) > int(number3) > int(number1):
    print(number2, number3, number1)
elif int(number3) > int(number1) > int(number2):
    print(number3, number1, number2)
elif int(number3) > int(number2) > int(number1):
    print(number3, number2, number1)
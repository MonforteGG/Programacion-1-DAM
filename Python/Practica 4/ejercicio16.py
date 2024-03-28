# Pedimos los datos y verificamos
phrase = input("Introduce una oración: ")

char_1 = input("Introduce el carácter a sustituir: ")
while len(char_1) != 1:
    char_1 = input("Carácter inválido. Introduce solo un carácter: ")

char_2 = input("Introduce el carácter que sustituye: ")
while len(char_2) != 1:
    char_2 = input("Carácter inválido. Introduce solo un carácter: ")

# Sustituimos los caracteres y mostramos el resultado
new_phrase = phrase.replace(char_1, char_2)

print(f"La nueva oración es: {new_phrase}")
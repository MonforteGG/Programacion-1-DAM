class OperadorTuplas:
    def __init__(self):
        self.__tupla = (1,2,3,4,5,6)

# Getter
    def get_Tupla(self)-> tuple:
        return self.__tupla
# Setter
    def set_Tupla(self,tupla: tuple):
        self.__tupla = tupla

# Recorrer tupla

    def iterate(self):
        for element in self.__tupla:
            print(element)

# Generar subtuplas de 2 en 2

    def subtupla(self)-> list:
        i = 0
        tuple_list = []
        for n in range(int(len(self.__tupla)/2)):
            subtupla = (self.__tupla[i],self.__tupla[i+1])
            i = i +2
            tuple_list.append(subtupla)
        return tuple_list




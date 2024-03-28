class GestorListas:
    def __init__(self):
        self.__list = []

# Getter
    def get_Lista(self)-> list:
        return self.__list
# Setter
    def set_Lista(self,list: list):
        self.__list = list

# Agregar un elemento
    def agregar(self, elemento):
        self.__list.append(elemento)

# Actualizar elemento

    def update(self, indice: int, elemento):
        self.__list[indice] = elemento

# Eliminar elemento

    def remove(self,indice: int):
        self.__list.remove(indice)

# Recorrer lista y duplicarla al cuadrado

    def elevar(self)-> list:
        squares = []
        for i in self.__list:
            squares.append(i**2)
        self.__list = squares
        return squares

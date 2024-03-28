class OperadorConjuntos:
    def __init__(self):
        self.__conjunto = set()


    # Getter
    def get_Conjunto(self):
        return self.__conjunto
    # Setter
    def set_Conjunto(self,conjunto):
        self.__conjunto = conjunto

    # Agregar elemento
    def agregar(self,elemento):
        self.__conjunto.add(elemento)
    # Actualizar elemento
    def update(self,old_elemento,new_elemento):
            if old_elemento in self.__conjunto:
                self.__conjunto.remove(old_elemento)
                self.__conjunto.add(new_elemento)

    # Eliminar un elemento
    def eliminar(self,elemento):
        if elemento in self.__conjunto:
            self.__conjunto.remove(elemento)

    # Mostrar elementos del conjunto
    def mostrar(self):
        for elemento in self.__conjunto:
            print(elemento)

    # Unir 2 subconjuntos
    def union(self,subconjunto):
        self.__conjunto = self.__conjunto | subconjunto
        return self.__conjunto

class GestorDiccionarios:
    def __init__(self):
        self.__dicionario = {}

    # Getter
    def get_Dic(self):
        return self.__dicionario
    # Setter
    def set_Dic(self,dic):
        self.__dicionario = dic

    # Agregar o actualizar un elemento
    def add_or_update(self,key,value):
        self.__dicionario[key] = value

    # Eliminar un elemento
    def remove(self,key):
        del self.__dicionario[key]

    # Iterar e imprimir por clave
    def iterate_key(self):
        for key in self.__dicionario.keys():
            print(key)

    # Iterar e imprimir por valor
    def iterate_value(self):
        for value in self.__dicionario.values():
            print(value)
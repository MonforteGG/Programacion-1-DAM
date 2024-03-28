class GestorMixto:
    def __init__(self):
        self.__list = []
        self.__dic = {}

    # Getter Lista
    def get_List(self):
        return self.__list
    # Getter Dic
    def get_Dic(self):
        return self.__dic
    # Setter List
    def set_List(self,list):
        self.__list = list
    # Setter Dic
    def set_Dic(self,dic):
        self.__dic = dic

    # Añadir un elemento a la lista
    def add_to_list(self,element):
        self.__list.append(element)

    # Añadir o actualizar un elemento del diccionario
    def add_to_dic(self,key,value):
        self.__dic[key] = value

    # Crear una lista con los valores del diccionario
    def dic_to_list(self):
        for value in self.__dic.values():
            self.__list.append(value)
        return self.__list

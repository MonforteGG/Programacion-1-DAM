class Subjects:
    def __init__(self, name: str, id: int, description: str, credits: float):
        self.__name = name
        self.__id = id
        self.__description = description
        self.__credits = credits

    def get_name(self)-> str:
        return self.__name

    def set_name(self, name):
        self.__name = name

    def get_id(self)-> int:
        return self.__id

    def set_id(self, id):
        self.__id = id

    def get_description(self)-> str:
        return self.__description

    def set_description(self, description):
        self.__description = description

    def get_credits(self)-> float:
        return self.__credits

    def set_credits(self, credits):
        self.__credits = credits




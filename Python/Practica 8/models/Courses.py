class Courses:
    def __init__(self, types: str, level: int, description: str, code: int, subjects: list):
        self.__types = types
        self.__level = level
        self.__description = description
        self.__code = code
        self.__subjects = subjects

    def get_types(self)-> str:
        return self.__types

    def set_types(self, types):
        self.__types = types

    def get_level(self)-> int:
        return self.__level

    def set_level(self, level):
        self.__level = level

    def get_description(self)-> str:
        return self.__description

    def set_description(self, description):
        self.__description = description

    def get_code(self)-> int:
        return self.__code

    def set_code(self, code):
        self.__code = code

    def get_subjects(self)-> list:
        return self.__subjects

    def set_subjects(self, subjects):
        self.__subjects = subjects

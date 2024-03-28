from models.Location import Location


class Institutes:
    def __init__(self, name: str, cif: str, address: Location, courses: list):
        self.__name = name
        self.__cif = cif
        self.__address = address
        self.__courses = courses

    def get_name(self)-> str:
        return self.__name

    def set_name(self, name):
        self.__name = name

    def get_cif(self)-> str:
        return self.__cif

    def set_cif(self, cif):
        self.__cif = cif

    def get_address(self)-> Location:
        return self.__address

    def set_address(self, address):
        self.__address = address

    def get_courses(self)-> list:
        return self.__courses

    def set_courses(self, courses):
        self.__courses = courses


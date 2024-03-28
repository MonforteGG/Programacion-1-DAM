from models.Courses import Courses
from models.Location import Location
from models.Persons import Persons


class Alumns(Persons):
    def __init__(self, dni: str, name: str, age: int, sex: str, email: str, address: Location, course: Courses):
        super().__init__(dni, name, age, sex)
        self.__email = email
        self.__address = address
        self.__course = course

    def get_email(self)-> str:
        return self.__email

    def set_email(self, email):
        self.__email = email

    def get_address(self)-> Location:
        return self.__address

    def set_address(self, address):
        self.__address = address

    def get_course(self)-> Courses:
        return self.__course

    def set_course(self, course):
        self.__course = course

from models.Alumns import Alumns
from models.Subjects import Subjects


class Calification:
    def __init__(self, subject: Subjects, alumn: Alumns, calification: float):
        self.__subject = subject
        self.__alumn = alumn
        self.__calification = calification

    def get_subject(self)-> Subjects:
        return self.__subject

    def set_subject(self, subject):
        self.__subject = subject

    def get_alumn(self)-> Alumns:
        return self.__alumn

    def set_alumn(self, alumn):
        self.__alumn = alumn

    def get_calification(self)-> float:
        return self.__calification

    def set_calification(self, calification):
        self.__calification = calification

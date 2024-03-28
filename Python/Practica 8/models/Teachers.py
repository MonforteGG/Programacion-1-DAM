from datetime import datetime
from models.Departments import Departments
from models.Location import Location
from models.Persons import Persons
from models.Subjects import Subjects


class Teachers(Persons):
    def __init__(self,dni: str, name: str, age: int, sex: str, salary: float, startingDate: datetime, subjects: Subjects, departments: Departments, address: Location):
        super().__init__(dni, name, age, sex)
        self.__salary = salary
        self.__startingDate = startingDate
        self.__subjects = subjects
        self.__departments = departments
        self.__address = address

    def get_salary(self)-> float:
        return self.__salary

    def set_salary(self, salary):
        self.__salary = salary

    def get_starting_date(self)-> datetime:
        return self.__startingDate

    def set_starting_date(self, startingDate):
        self.__startingDate = startingDate

    def get_subjects(self)-> Subjects:
        return self.__subjects

    def set_subjects(self, subjects):
        self.__subjects = subjects

    def get_departments(self)-> Departments:
        return self.__departments

    def set_departments(self, departments):
        self.__departments = departments

    def get_address(self)-> Location:
        return self.__address

    def set_address(self, address):
        self.__address = address




    def getNetSalary(self, tax: float):
        return self.__salary * (1-tax)


    def getWorkAge(self)-> int:
        current_year = datetime.now().year
        return current_year - self.__startingDate.year


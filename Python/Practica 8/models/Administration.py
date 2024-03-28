from datetime import datetime
from models import Location
from models.Persons import Persons


class Administration(Persons):
    def __init__(self, dni: str, name: str, age: int, sex: str, role: str, salary: float, startingDate: datetime,
                 address: Location):
        super().__init__(dni, name, age, sex)
        self.__role = role
        self.__salary = salary
        self.__startingDate = startingDate
        self.__address = address

    def get_role(self) -> str:
        return self.__role

    def set_role(self, role):
        self.__role = role

    def get_salary(self) -> float:
        return self.__salary

    def set_salary(self, salary):
        self.__salary = salary

    def get_starting_date(self) -> datetime:
        return self.__startingDate

    def set_starting_date(self, startingDate):
        self.__startingDate = startingDate

    def get_address(self) -> Location:
        return self.__address

    def set_address(self, address):
        self.__address = address

    def getNetSalary(self, tax: float):
        return self.__salary * (1 - tax)

    def getWorkAge(self) -> int:
        current_year = datetime.now().year
        return current_year - self.__startingDate.year

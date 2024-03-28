class Location:
    def __init__(self,street: str,number: int, postalcode: int, city: str, province: str):
        self.__street = street
        self.__number = number
        self.__postalcode = postalcode
        self.__city = city
        self.__province = province

    def get_street(self) -> str:
        return self.__street
    def set_street(self, street):
        self.__street = street
    def get_number(self)-> int:
        return self.__number
    def set_number(self, number):
        self.__number = number
    def get_postal_code(self)-> int:
        return self.__postalcode
    def set_postal_code(self, postal_code):
        self.__postalcode = postal_code
    def get_city(self)-> str:
        return self.__city
    def set_city(self, city):
        self.__city = city
    def get_province(self)-> str:
        return self.__province
    def set_province(self, province):
            self.__province = province


class Usuario:
    def __init__(self,nombre,apellidos,cp,direccion,email,contraseña):
        self.nombre = nombre
        self.apellidos = apellidos
        self.cp = cp
        self.direccion = direccion
        self.email = email
        self.contraseña = contraseña

    def mostrarUsuario(self):
        print(f'{self.nombre} con email {self.email} vive en la calle {self.direccion} con CP: {self.cp}')
    def checkAccount(self):

        email = input(f"Introduce el email de {self.nombre}: ")
        contraseña = input("Introduce su contraseña: ")

        if email == self.email and contraseña == self.contraseña:
            print("Login correcto")
            Usuario.mostrarUsuario(self)
        else:
            print("La cuenta no es correcta")

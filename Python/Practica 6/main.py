# Importamos la clase Usuario
from Usuario import Usuario

if __name__ == "__main__":
    # Creamos los objetos
    usuario1 = Usuario('Alberto', 'Díaz Muñoz', 41008, 'Calle Ejemplo 1', 'adm0043@alu.medac.es', 'password1')
    usuario2 = Usuario('Pepe', 'Perez Sánchez', 41029, 'Calle Larios', 'pps0023@alu.medac.es', 'password2')

    # Call a la funcion checkAccount de Usuario que comprueba si el email y pass son correctos y si es así muestra los datos
    Usuario.checkAccount(usuario1)
    Usuario.checkAccount(usuario2)

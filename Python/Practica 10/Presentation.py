from GestorDiccionarios import GestorDiccionarios
from GestorListas import GestorListas
from GestorMixto import GestorMixto
from OperadorConjuntos import OperadorConjuntos
from OperadorTuplas import OperadorTuplas

class Presentation:
    @staticmethod
    def presentation():

        print("## PRESENTACIÓN DE LOS EJERCICIOS:")

        print('Creamos los objetos...')
        print('Objetos creados!')
        gestorListas = GestorListas()
        gestorDiccionarios = GestorDiccionarios()
        gestorMixto = GestorMixto()
        operadorConjuntos = OperadorConjuntos()
        operadorTuplas = OperadorTuplas()

        print('EJERCICIO 1: Manejo de Listas (CRUD y Recorrido)')

        # Agregamos los números
        gestorListas.agregar(1)
        gestorListas.agregar(2)
        gestorListas.agregar(3)
        print("Agregados los nº 1, 2 y 3 a la lista")

        # Actualizamos un elemento
        gestorListas.update(0,10)
        print('Sustituido el primer elemento por el nº 10')

        # Eliminamos un elemento
        gestorListas.remove(2)
        print('Eliminado el tercer elemento (pos 2) de la lista')

        # Mostramos la lista
        print("Mostrando la lista:")
        print(gestorListas.get_Lista())

        # Elevar al cuadrado los elementos
        print('Elevamos los elementos de la lista al cuadrado')
        print(gestorListas.elevar())

        print('EJERCICIO 2: Manejo de Tuplas (Recorrido y Subtuplas)')
        # Al crear el objeto viene predefinida ya con unos números, ya que no se puede mutar

        # Recorremos la tupla e imprimimos
        print('Los elementos de la tupla son:')
        operadorTuplas.iterate()

        # Generamos una lista de subtuplas
        print('Generando una lista de subtuplas de 2 en 2: ')
        print(operadorTuplas.subtupla())

        print('EJERCICIO 3: Manejo de Diccionarios (CRUD y Recorrido)')

        # Agregamos los elementos con sus claves

        print("Agregando colores al diccionario...")
        gestorDiccionarios.add_or_update(1,'rojo')
        gestorDiccionarios.add_or_update(2, 'blanco')
        gestorDiccionarios.add_or_update(3, 'negro')
        print('Colores agregados!')

        # Sustituimos el valor con clave 1 por el color verde

        gestorDiccionarios.add_or_update(1, 'verde')

        # Eliminar elemento
        print('Eliminamos el color blanco con clave 2')
        gestorDiccionarios.remove(2)

        # Mostrando los elementos del dict

        print('Mostrando los elementos del diccionario: ')
        print(gestorDiccionarios.get_Dic())

        # Recorremos las claves
        print('Las claves del diccionario son:')
        gestorDiccionarios.iterate_key()
        # Recorremos los valores
        print('Los valores del diccionario son:')
        gestorDiccionarios.iterate_value()

        print('EJERCICIO 4: Manejo de Conjuntos (CRUD y Operaciones)')

        # Agregamos los elementos al conjunto
        operadorConjuntos.agregar(1)
        operadorConjuntos.agregar(2)
        operadorConjuntos.agregar(3)

        print('Agregados los nº al conjunto')

        # Sustituimos el primero elemento que es el nº1 por el nº 10
        operadorConjuntos.update(1,10)

        # Eliminamos el nº 3

        operadorConjuntos.eliminar(3)

        # Mostramos los elementos del conjunto:
        print('Mostrando los elementos del conjunto:')
        operadorConjuntos.mostrar()

        # Unir 2 conjuntos

        print('Creamos otro conjunto: ')
        conjunto2 = {2,20}
        print('El nuevo conunto es {2,20}')
        print('Lo unimos a nuestro conjunto:')
        print(operadorConjuntos.union(conjunto2))

        print('EJERCICIO 5: Manejo de Listas y Diccionarios (Operaciones Mixtas)')

        # Agregamos los pares clave, valor  al diccionario
        print('Agregando los elementos al diccionario')

        gestorMixto.add_to_dic(1, 'rojo')
        gestorMixto.add_to_dic(2, 'negro')
        gestorMixto.add_to_dic(3, 'morado')


        print('Elementos agregados!')

        # Pasamos los valores del diccionario como elementos de la lista
        print('Pasamos los valores del diccionario como elementos de nuestra lista')
        print(gestorMixto.dic_to_list())









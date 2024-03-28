from datetime import datetime

from models.Administration import Administration
from models.Alumns import Alumns
from models.Courses import Courses
from models.Departments import Departments
from models.Institutes import Institutes
from models.Location import Location
from models.Subjects import Subjects
from models.Teachers import Teachers
from populate import locations, subjects, departments, courses, institutes, alumns, teachers, administrations


class Create:

    def createLocation(self):
        print('Introduce los datos para crear una localización: ')
        new_id = int(input('Introduce el id:'))

        # Verificar si la localización ya existe
        if new_id in locations:
            print('Esa localización ya existe')
            return None

        street = input('Nombre de la calle: ')
        number = int(input('Número: '))
        postalcode = int(input('Código Postal: '))
        city = input('Ciudad: ')
        province = input('Provincia: ')

        # Crear la nueva instancia de Location
        location_created = Location(street, number, postalcode, city, province)
        locations[new_id] = location_created
        print('Localización creada')
        return location_created

    def createSubject(self):
        print('Introduce los datos para crear una asignatura:')
        new_id = int(input('Introduce el id:'))

        # Verificar si la asignatura ya existe
        if new_id in subjects:
            print('Esa asignatura ya existe')
            return None

        name = input('Nombre de la asignatura: ')
        credits = int(input('Número de créditos: '))
        description = input('Descripción de la asignatura: ')

        # Crear la nueva instancia de Subjects
        subject_created = Subjects(name, credits, description)
        subjects[new_id] = subject_created
        print('Asignatura creada')
        return subject_created

    def createDepartment(self):
        print('Introduce los datos para crear un departamento:')
        new_id = int(input('Introduce el id:'))

        # Verificar si el departamento ya existe
        if new_id in departments:
            print('Ese departamento ya existe')
            return None

        name = input('Nombre del departamento: ')


        # Crear la nueva instancia de Departments
        department_created = Departments(new_id, name)
        departments[new_id] = department_created
        print('Departamento creado')
        return department_created

    def createCourse(self):
        print('Introduce los datos para crear un curso:')
        code = int(input('Introduce el código:'))

        # Verificar si el curso ya existe
        if code in courses:
            print('Ese curso ya existe')
            return None

        types = input('Tipo de curso: ')
        level = int(input('Nivel del curso: '))
        description = input('Descripción del curso: ')

        # Crear la nueva instancia de Courses
        subjects_list = []
        course_created = Courses(types, level, description, code, subjects_list)
        courses[code] = course_created
        print('Curso creado')
        return course_created

    def createInstitute(self):
        print('Introduce los datos para crear un instituto:')
        cif = input('Introduce el CIF:')

        # Verificar si el instituto ya existe
        if cif in institutes:
            print('Ese instituto ya existe')
            return None

        name = input('Nombre del instituto: ')

        location_id = int(input('Introduce el id de la localización: '))
        # Verificar si la dirección ya existe
        location = None
        if location_id in locations:
            print('La localización ya existe')
            location = locations[location_id]
        else:
            location = self.createLocation()

        # Crear la nueva instancia de Institute
        courses_list = []
        institute_created = Institutes(name, cif, location, courses_list)
        institutes[cif] = institute_created
        print('Instituto creado')
        return institute_created

    def createAlumn(self):
        print('Introduce los datos para crear un alumno:')
        dni = input('Introduce el DNI:')

        # Verificar si el alumno ya existe
        if dni in alumns:
            print('Ese alumno ya existe')
            return None

        name = input('Nombre del alumno: ')
        age = int(input('Edad del alumno: '))
        sex = input('Sexo del alumno: ')
        email = input('Email del alumno: ')

        location_id = int(input('Introduce el id de la localización: '))
        # Verificar si la dirección ya existe
        location = None
        if location_id in locations:
            print('La localización ya existe')
            location = locations[location_id]
        else:
            location = self.createLocation()

        course_code = int(input('Introduce el código del curso: '))
        # Verificar si el curso existe
        course = None
        if course_code in courses:
            print('El curso ya existe')
            course = courses[course_code]
        else:
            course = self.createCourse()

        # Crear la nueva instancia de Alumn
        alumn_created = Alumns(dni, name, age, sex, email, location, course)
        alumns[dni] = alumn_created
        print('Alumno creado')
        return alumn_created

    def createTeacher(self):
        print('Introduce los datos para crear un profesor:')
        dni = input('Introduce el DNI:')

        # Verificar si el profesor ya existe
        if dni in teachers:
            print('Ese profesor ya existe')
            return None

        name = input('Nombre del profesor: ')
        age = int(input('Edad del profesor: '))
        sex = input('Sexo del profesor: ')
        salary = float(input('Salario del profesor: '))
        starting_date = input('Fecha de inicio (YYYY-MM-DD): ')
        starting_date = datetime.strptime(starting_date, '%Y-%m-%d')

        subject_id = input('Introduce la id de la asignatura: ')
        # Verificar si la asignatura ya existe
        subject = None
        if subject_id in subjects:
            print('Esa asignatura ya existe')
            subject = subjects[subject_id]
        else:
            subject = self.createSubject()



        location_id = int(input('Introduce el id de la localización'))
        # Verificar si la dirección ya existe
        location = None
        if location_id in locations:
            print('Esa localización ya existe')
            location = locations[location_id]
        else:
            location = self.createLocation()

        departments_id = int(input('Introduce el id del departamento'))
        # Verificar si el departamento ya existe
        department = None
        if departments_id in departments:
            print('Ese departamento ya existe')
            department = departments[departments_id]
        else:
            department = self.createDepartment()

        teacher_created = Teachers(dni, name, age, sex, salary, starting_date, subject, department, location)
        teachers[dni] = teacher_created
        print('Profesor creado')
        return teacher_created

    def createAdministration(self):
        print('Introduce los datos para crear un miembro de la administración:')
        dni = input('Introduce el DNI:')

        # Verificar si el miembro de la administración ya existe
        if dni in administrations:
            print('Ese miembro de la administración ya existe')
            return None

        name = input('Nombre del miembro de la administración: ')
        age = int(input('Edad del miembro de la administración: '))
        sex = input('Sexo del miembro de la administración: ')
        role = input('Cargo del miembro de la administración: ')
        salary = float(input('Salario del miembro de la administración: '))
        starting_date = input('Fecha de inicio (YYYY-MM-DD): ')
        starting_date = datetime.strptime(starting_date, '%Y-%m-%d')

        location_id = int(input('Introduce el id de la localización'))
        # Verificar si la dirección ya existe
        location = None
        if location_id in locations:
            print('Esa localización ya existe')
            location = locations[location_id]
        else:
            location = self.createLocation()

        # Crear la nueva instancia de Administration
        administration_created = Administration(dni, name, age, sex, role, salary, starting_date, location)
        administrations[dni] = administration_created
        print('Personal de administración creado')
        return administration_created

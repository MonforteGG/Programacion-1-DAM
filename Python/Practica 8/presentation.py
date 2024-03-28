from Create import Create
from populate import locations, subjects, departments, courses, institutes, alumns, teachers, administrations, \
    califications

create = Create()

def menu():
    print('MENU DE LA APLICACIÓN:')
    print('1. CREAR')
    print('2. LEER')
    print('3. FUNCIONES')
    print('4. SALIR')
    choice = int(input())

    match choice:
        case 1:
            print('¿QUE DESEAS CREAR?:')
            print('1. LOCALIZACIÓN')
            print('2. ASIGNATURA')
            print('3. DEPARTAMENTO')
            print('4. CURSO')
            print('5. INSTITUTO')
            print('6. ALUMNO')
            print('7. PROFESOR')
            print('8. ADMINISTRACIÓN')

            create_choice = int(input(''))
            match create_choice:
                case 1:
                    create.createLocation()
                    menu()
                case 2:
                    create.createSubject()
                    menu()
                case 3:
                    create.createDepartment()
                    menu()
                case 4:
                    create.createCourse()
                    menu()
                case 5:
                    create.createInstitute()
                    menu()
                case 6:
                    create.createAlumn()
                    menu()
                case 7:
                    create.createTeacher()
                    menu()
                case 8:
                    create.createAdministration()
                    menu()


        case 2:
            print('¿QUE DESEAS CONSULTAR?')
            print('1. LISTA DE LOCALIZACIONES')
            print('2. LISTA DE ASIGNATURA')
            print('3. LISTA DE DEPARTAMENTOS')
            print('4. LISTA DE CURSOS')
            print('5. LISTA DE INSTITUTOS')
            print('6. LISTA DE ALUMNOS')
            print('7. LISTA DE PROFESORES')
            print('8. LISTA DE TRABAJADORES DE LA ADMINISTRACIÓN')

            read_choice = int(input())
            match read_choice:

                case 1:
                    # Mostrar la lista de localizaciones
                    for location_id, location in locations.items():
                        print(f"ID: {location_id}, Calle: {location.get_street()}, Número: {location.get_number()}, "
                          f"Ciudad: {location.get_city()}, Provincia: {location.get_province()}")

                    print('Presiona la tecla M para volver al menu')
                    back = input()
                    if back == 'M' or 'm':
                        menu()
                case 2:
                    # Mostrar la lista de asignaturas
                    for subject_id, subject in subjects.items():
                        print(f"ID: {subject_id}, Nombre: {subject.get_name()}, Descripción: {subject.get_description()}, "
                              f"Créditos: {subject.get_credits()}")

                    print('Presiona la tecla M para volver al menu')
                    back = input()
                    if back == 'M' or 'm':
                        menu()
                case 3:
                    # Mostrar la lista de departamentos
                    for department_id, department in departments.items():
                        print(f"ID: {department_id}, Nombre: {department.get_name()}")

                    print('Presiona la tecla M para volver al menu')
                    back = input()
                    if back == 'M' or 'm':
                        menu()
                case 4:
                    # Mostrar la lista de cursos
                    for course_code, course in courses.items():
                        print(f"Código: {course_code}, Tipo: {course.get_types()}, Nivel: {course.get_level()}, "
                              f"Descripción: {course.get_description()}")
                        print("Asignaturas:")
                        for subject in course.get_subjects():
                            print(f"    - {subject.get_name()}")

                    print('Presiona la tecla M para volver al menu')
                    back = input()
                    if back == 'M' or 'm':
                        menu()
                case 5:
                    # Mostrar la lista de institutos
                    for institute_name, institute in institutes.items():
                        print(f"Nombre: {institute_name}, CIF: {institute.get_cif()}")
                        print(f"Dirección: {institute.get_address().get_street()} {institute.get_address().get_number()}, "
                              f"{institute.get_address().get_postalcode()} {institute.get_address().get_city()}, "
                              f"{institute.get_address().get_province()}")
                        print("Cursos:")
                        for course in institute.get_courses():
                            print(f"    - {course.get_code()}: {course.get_description()}")

                    print('Presiona la tecla M para volver al menu')
                    back = input()
                    if back == 'M' or 'm':
                        menu()

                case 6:
                    # Mostrar la lista de alumnos
                    for alumn_dni, alumn in alumns.items():
                       print(f"DNI: {alumn_dni}, Nombre: {alumn.get_name()}, Edad: {alumn.get_age()}, "
                             f"Sexo: {alumn.get_sex()}, Email: {alumn.get_email()}")
                       print(f"Dirección: {alumn.get_address().get_street()} {alumn.get_address().get_number()}, "
                             f"{alumn.get_address().get_postalcode()} {alumn.get_address().get_city()}, "
                             f"{alumn.get_address().get_province()}")
                       print(f"Curso: {alumn.get_course().get_code()}: {alumn.get_course().get_description()}")

                    print('Presiona la tecla M para volver al menu')
                    back = input()
                    if back == 'M' or 'm':
                        menu()

                case 7:
                    # Mostrar la lista de profesores
                    for teacher_dni, teacher in teachers.items():
                        print(f"DNI: {teacher_dni}, Nombre: {teacher.get_name()}, Edad: {teacher.get_age()}, "
                              f"Sexo: {teacher.get_sex()}, Salario: {teacher.get_salary()}, "
                              f"Fecha de inicio: {teacher.get_starting_date().strftime('%Y-%m-%d')}")
                        print(f"Dirección: {teacher.get_address().get_street()} {teacher.get_address().get_number()}, "
                              f"{teacher.get_address().get_postalcode()} {teacher.get_address().get_city()}, "
                              f"{teacher.get_address().get_province()}")
                        print(f"Asignaturas: {teacher.get_subjects().get_name()}")
                        print(f"Departamento: {teacher.get_departments().get_name()}")

                    print('Presiona la tecla M para volver al menu')
                    back = input()
                    if back == 'M' or 'm':
                        menu()

                case 8:
                    # Mostrar la lista de personal de administración
                    for administration_dni, administration in administrations.items():
                        print(
                            f"DNI: {administration_dni}, Nombre: {administration.get_name()}, Edad: {administration.get_age()}, "
                            f"Sexo: {administration.get_sex()}, Rol: {administration.get_role()}, "
                            f"Salario: {administration.get_salary()}, "
                            f"Fecha de inicio: {administration.get_starting_date().strftime('%Y-%m-%d')}")
                        print(
                            f"Dirección: {administration.get_address().get_street()} {administration.get_address().get_number()}, "
                            f"{administration.get_address().get_postal_code()} {administration.get_address().get_city()}, "
                            f"{administration.get_address().get_province()}")

                    print('Presiona la tecla M para volver al menu')
                    back = input()
                    if back == 'M' or 'm':
                        menu()

        case 3:
            print('¿QUE FUNCIÓN DESEA REALIZAR?')
            print('1. BOLETIN DE NOTAS DE UN ALUMNO')
            print('2. CONOCER SUELDO NETO')
            print('3. CONOCER AÑOS DE ANTIGUEDAD')
            print('4. VOLVER AL MENU')

            functions_choice = int(input())

            match functions_choice:
                case 1:
                    dni = input('Introduce el dni del alumno: ')
                    if dni in alumns:
                        student = alumns[dni]
                        for key, calification in califications.items():
                            if calification.get_alumn() == student:
                                print(
                                    f'Las notas del alumno con DNI {dni} en {calification.get_subject().get_name()} son: {calification.get_calification()}')
                        menu()
                    else:
                        print(f'El alumno con DNI {dni} no se encuentra en la lista.')
                        menu()


                case 2:
                    dni = input('Introduce el DNI del trabajador: ')
                    tax = int(input('Introduce el % de impuestos: '))
                    if dni in teachers:
                        print(teachers[dni].getNetSalary(tax/100))
                    elif dni in administrations:
                        print(administrations[dni].getNetSalary(tax / 100))
                    else:
                        print('DNI Inválido')
                    menu()

                case 3:
                    dni = input('Introduce el DNI del trabajador: ')
                    if dni in teachers:
                        print(teachers[dni].getWorkAge())
                    elif dni in administrations:
                        print(administrations[dni].getWorkAge())
                    else:
                        print('DNI Inválido')
                    menu()
                case 4:
                    menu()

        case 4:
            return

        case _:
            print("Introduce un número válido")
            menu()
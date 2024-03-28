# Objects
from datetime import datetime

from models.Administration import Administration
from models.Alumns import Alumns
from models.Calification import Calification
from models.Courses import Courses
from models.Departments import Departments
from models.Institutes import Institutes
from models.Location import Location
from models.Subjects import Subjects
from models.Teachers import Teachers

# Crear 5 objetos de la clase Location
location1 = Location("Main Street", 123, 10001, "City A", "Province X")
location2 = Location("Oak Avenue", 456, 20002, "City B", "Province Y")
location3 = Location("Pine Street", 789, 30003, "City C", "Province Z")
location4 = Location("Maple Avenue", 101, 40004, "City D", "Province W")
location5 = Location("Cedar Street", 202, 50005, "City E", "Province V")

# Crear 5 objetos de la clase Subjects
subject1 = Subjects("Mathematics I", 1, "Introduction to Mathematics", 5.0)
subject2 = Subjects("Physics I", 2, "Introduction to Physics", 4.0)
subject3 = Subjects("Chemistry I", 3, "Introduction to Chemistry", 3.5)
subject4 = Subjects("Biology I", 4, "Introduction to Biology", 4.5)
subject5 = Subjects("Computer Science I", 5, "Introduction to Computer Science", 4.0)

# Crear 5 objetos de la clase Departments
department1 = Departments(1, "Department A")
department2 = Departments(2, "Department B")
department3 = Departments(3, "Department C")
department4 = Departments(4, "Department D")
department5 = Departments(5, "Department E")

# Listas de asignaturas por curso
course1_subjects = [subject1,subject2,subject3]
course2_subjects = [subject5,subject4,subject3]
course3_subjects = [subject1,subject3,subject5]
course4_subjects = [subject2,subject4,subject5]
course5_subjects = [subject1,subject4,subject3]

# Crear 5 objetos de la clase Courses referenciando la clase Location y la clase Subjects
course1 = Courses("Science", 1, "Science Foundation", 101, course1_subjects)
course2 = Courses("Engineering", 2, "Engineering Basics", 202, course2_subjects)
course3 = Courses("Arts", 1, "Artistic Expressions", 303, course3_subjects)
course4 = Courses("Social Sciences", 2, "Understanding Society", 404, course4_subjects)
course5 = Courses("Business", 1, "Business Fundamentals", 505, course5_subjects)

# Crear 5 objetos de la clase Teachers referenciando la clase Location
teacher1 = Teachers("11111111A", "John Doe", 35, "Male", 50000.0,datetime(2015,3,22), subject1, department1, location1)
teacher2 = Teachers("22222222B", "Jane Doe", 40, "Female", 55000.0, datetime(2010,5,20), subject2, department2, location2)
teacher3 = Teachers("33333333C", "Bob Smith", 45, "Male", 60000.0, datetime(2012,1,12), subject3, department1, location3)
teacher4 = Teachers("44444444D", "Alice Smith", 30, "Female", 48000.0, datetime(2020,4,2), subject4, department2, location4)
teacher5 = Teachers("55555555E", "Charlie Brown", 38, "Male", 52000.0, datetime(2012,7,22), subject5, department5, location5)

# Crear 5 objetos de la clase Administration
administration1 = Administration("11111111X", "Admin 1", 40, "Male", "Manager", 80000.0, datetime(2020, 1, 1), location1)
administration2 = Administration("22222222Y", "Admin 2", 35, "Female", "Supervisor", 70000.0, datetime(2019, 1, 1), location2)
administration3 = Administration("33333333Z", "Admin 3", 45, "Male", "Coordinator", 75000.0, datetime(2021, 1, 1), location3)
administration4 = Administration("44444444W", "Admin 4", 38, "Female", "Director", 90000.0, datetime(2018, 1, 1), location4)
administration5 = Administration("55555555V", "Admin 5", 42, "Male", "Supervisor", 72000.0, datetime(2022, 1, 1), location5)

# Crear 5 objetos de la clase Alumns referenciando la clase Location
alumn1 = Alumns("66666666F", "Eva Green", 20, "Female", "eva@example.com", location1,course1)
alumn2 = Alumns("77777777G", "Michael Johnson", 22, "Male", "michael@example.com", location2,course2)
alumn3 = Alumns("88888888H", "Sophie Turner", 21, "Female", "sophie@example.com", location3,course1)
alumn4 = Alumns("99999999I", "Alex Brown", 23, "Male", "alex@example.com", location4,course5)
alumn5 = Alumns("10101010J", "Emma White", 19, "Female", "emma@example.com", location5,course4)


# Crear 5 objetos de la clase Calification referenciando la clase Subjects y la clase Alumns
calification1 = Calification(subject1, alumn1, 85.0)
calification2 = Calification(subject2, alumn1, 92.5)
calification3 = Calification(subject3, alumn3, 78.0)
calification4 = Calification(subject4, alumn4, 88.5)
calification5 = Calification(subject5, alumn5, 95.0)

# Listas de cursos que tienen cada instituto
institute1_courses = [course1,course2,course3]
institute2_courses = [course1,course2,course3,course4,course5]
institute3_courses = [course1,course3,course5]
institute4_courses = [course2,course4]
institute5_courses = [course5]

# Crear 5 objetos de la clase Institutes referenciando la clase Location
institute1 = Institutes("Institute A", "A12345678", location1, [course1])
institute2 = Institutes("Institute B", "B87654321", location2, [course2])
institute3 = Institutes("Institute C", "C98765432", location3, [course3])
institute4 = Institutes("Institute D", "D54321098", location4, [course4])
institute5 = Institutes("Institute E", "E10987654", location5, [course5])


# Diccionarios

locations = {}
subjects = {}
departments = {}
califications = {}
registrations = {}
teachers = {}
administrations = {}
alumns = {}
institutes = {}
courses = {}


# Rellenar los diccionarios

# Locations
locations[1] = location1
locations[2] = location2
locations[3] = location3
locations[4] = location4
locations[5] = location5

# Subjects
subjects[1] = subject1
subjects[2] = subject2
subjects[3] = subject3
subjects[4] = subject4
subjects[5] = subject5

# Departments
departments[1] = department1
departments[2] = department2
departments[3] = department3
departments[4] = department4
departments[5] = department5

# Califications
califications[1] = calification1
califications[2] = calification2
califications[3] = calification3
califications[4] = calification4
califications[5] = calification5


# Teachers
teachers["11111111A"] = teacher1
teachers["22222222B"] = teacher2
teachers["33333333C"] = teacher3
teachers["44444444D"] = teacher4
teachers["55555555E"] = teacher5

# Administration
administrations["11111111X"] = administration1
administrations["22222222Y"] = administration2
administrations["33333333Z"] = administration3
administrations["44444444W"] = administration4
administrations["55555555V"] = administration5

# Alumns
alumns['66666666F'] = alumn1
alumns['77777777G'] = alumn2
alumns['88888888H'] = alumn3
alumns['99999999I'] = alumn4
alumns['10101010J'] = alumn5

# Institutes
institutes["A12345678"] = institute1
institutes["B87654321"] = institute2
institutes["C98765432"] = institute3
institutes["D54321098"] = institute4
institutes["E10987654"] = institute5

# Courses
courses[101] = course1
courses[202] = course2
courses[303] = course3
courses[404] = course4
courses[505] = course5

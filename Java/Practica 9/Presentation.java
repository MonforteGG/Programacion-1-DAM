public class Presentation {
    public static void presentation() {
        System.out.println("## PRESENTACIÓN DE LOS EJERCICIOS: ");

        System.out.println("EJERCICIO 1: GESTOR DE NÚMEROS");
        GestorNumeros gestorNumeros = new GestorNumeros();

        // Agregamos los números
        gestorNumeros.agregarNumero(1);
        gestorNumeros.agregarNumero(2);
        gestorNumeros.agregarNumero(3);
        // Mostrar lista de números
        System.out.println("Mostrando lista de números: ");
        System.out.println(gestorNumeros.getListaNumeros());
        // Sumar números
        System.out.println("La suma de los números es:");
        System.out.println(gestorNumeros.sumarNumeros());

        System.out.println("EJERCICIO 2: GESTOR DE PERSONAS");
        GestorPersonas gestorPersonas = new GestorPersonas();

        // Agregamos las personas
        gestorPersonas.agregarPersonas("Pepe",30);
        gestorPersonas.agregarPersonas("Maria",28);
        gestorPersonas.agregarPersonas("Jose",22);

        // Mostrar info de una persona
        System.out.println("Mostrando la información de las personas");
        gestorPersonas.mostrarPersona("Pepe");
        gestorPersonas.mostrarPersona("Maria");
        gestorPersonas.mostrarPersona("Jose");

        // Comprobar si existe la persona
        System.out.println("Comprobando si existen las personas: ");
        gestorPersonas.personaExiste("Pepe");
        gestorPersonas.personaExiste("Joselito");

        System.out.println("EJERCICIO 3: GESTOR DE COLORES");
        GestorColores gestorColores = new GestorColores();

        // Agregamos los colores
        gestorColores.agregarColor("rojo");
        gestorColores.agregarColor("blanco");
        gestorColores.agregarColor("negro");

        // Lista Colores
        System.out.println("Mostrando lista de colores");
        System.out.println(gestorColores.getSetColores());

        // Verificar Color
        System.out.println("Verificando si existen los colores: ");
        gestorColores.verificarColor("rojo");
        gestorColores.verificarColor("verde");

        System.out.println("EJERCICIO 4: GESTOR DE ESTUDIANTES");
        GestorEstudiantes gestorEstudiantes = new GestorEstudiantes();

        // Creamos los objetos de estudiantes
        Estudiantes estudiante1 = new Estudiantes("Jose",1);
        Estudiantes estudiante2 = new Estudiantes("Maria",2);
        Estudiantes estudiante3 = new Estudiantes("Pepe",3);

        // Agregramos los estudiantes
        gestorEstudiantes.agregarEstudiante(estudiante1);
        gestorEstudiantes.agregarEstudiante(estudiante2);
        gestorEstudiantes.agregarEstudiante(estudiante3);

        // Mostrar lista
        System.out.println("Mostrando la lista de estudiantes: ");
        gestorEstudiantes.mostrarLista();

        // Comprobrar estudiante
        System.out.println("Comprobando si existe el estudiante: ");
        gestorEstudiantes.comprobarEstudiante("Maria");
        gestorEstudiantes.comprobarEstudiante("Pablo");

        System.out.println("EJERCICIO 5: GESTOR DE EMPLEADOS");
        GestorEmpleados gestorEmpleados = new GestorEmpleados();

        // Creamos los objetos de empleados
        Empleados empleado1 = new Empleados("Alberto",30000.00);
        Empleados empleado2 = new Empleados("Adriana",400000.00);
        Empleados empleado3 = new Empleados("Emma",28000.00);

        // Agregamos los empleados
        gestorEmpleados.agregarEmpleado("111111A",empleado1);
        gestorEmpleados.agregarEmpleado("222222A",empleado2);
        gestorEmpleados.agregarEmpleado("333333A",empleado3);

        // Mostrar información de un empleado
        System.out.println("Mostrando información de los empleados: ");
        gestorEmpleados.mostrarEmpleado("111111A");
        gestorEmpleados.mostrarEmpleado("222222A");
        gestorEmpleados.mostrarEmpleado("333333A");

        // Comprobar si existe el empleado
        System.out.println("Comprobrando si existe el Empleado: ");
        gestorEmpleados.comprobarEmpleado("111111A");
        gestorEmpleados.comprobarEmpleado("555555B");

    }
}

import java.io.*;
import java.util.Scanner;

public class GestionPacientes {
    FileReader fr = this.fr;
    BufferedReader br = this.br;

    String[] datos;

    public GestionPacientes() throws FileNotFoundException {
        this.fr = new FileReader("paciente.txt");
        this.br = new BufferedReader(this.fr);
        try {
            String line;
            while ((line = this.br.readLine()) != null) {
                datos = line.split(";");
            }
        } catch (NumberFormatException | IOException e) {
            System.err.println("Error al leer el archivo de texto: " + e.getMessage());
        }
    }

    public Paciente crearPaciente() {
        Paciente paciente = new Paciente(
                datos[0],
                datos[1],
                Integer.parseInt(datos[2]),
                datos[3]
        );
        return paciente;
    }

    public void leerPaciente(Paciente p)  {
        System.out.println("El nombre del paciente es: " + p.getNombre()
                + "\n El dni del paciente es: " + p.getDni()
                + "\n La edad del paciente es: " + p.getEdad()
                + "\n El sexo del paciente es: " + p.getSexo()
        );
    }
    public void actualizarPaciente(Paciente paciente) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce los nuevos datos del paciente para actualizarlos:");
        System.out.println("Nombre: ");
        paciente.setNombre(s.nextLine());
        System.out.println("DNI: ");
        paciente.setDni(s.nextLine());
        System.out.println("Edad: ");
        paciente.setEdad(s.nextInt());
        System.out.println("Sexo: ");
        s.nextLine();
        paciente.setSexo(s.nextLine());

    }
}

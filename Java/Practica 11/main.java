import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main (String [] args) throws IOException {

        GestionPacientes gestionPacientes = new GestionPacientes();
        Paciente paciente = gestionPacientes.crearPaciente();
        gestionPacientes.leerPaciente(paciente);
        gestionPacientes.actualizarPaciente(paciente);
        gestionPacientes.leerPaciente(paciente);


        GestionMedicos gestionMedicos = new GestionMedicos();
        Medico m = gestionMedicos.crearMedico();
        gestionMedicos.leerMedico(m);
        gestionMedicos.actualizarMedico(m);
        gestionMedicos.leerMedico(m); 




    }

}



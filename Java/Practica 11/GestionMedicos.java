import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;


public class GestionMedicos {

    public GestionMedicos()  {
    }

    public Medico crearMedico() throws IOException {
        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get("medico.json"));
        Map<String, String> map = gson.fromJson(reader, Map.class);
        Medico medico = new Medico(

                Double.parseDouble(map.get("salario")),
                map.get("nombre"),
                map.get("dni"),
                Integer.parseInt(map.get("edad")),
                map.get("sexo")
        );
        return medico;
    }

    public void leerMedico(Medico m)  {
        System.out.println("El nombre del medico es: " + m.getNombre()
                + "\n El dni del médico es: " + m.getDni()
                + "\n El salario del médico es: " + m.getSalario()
                + "\n La edad del médico es: " + m.getEdad()
                + "\n El sexo del médico es: " + m.getSexo()
        );
    }

    public void actualizarMedico(Medico medico) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce los nuevos datos del médico para actualizarlos:");
        System.out.println("Nombre: ");
        medico.setNombre(s.nextLine());
        System.out.println("DNI: ");
        medico.setDni(s.nextLine());
        System.out.println("Salario: ");
        medico.setSalario(s.nextDouble());
        System.out.println("Edad: ");
        medico.setEdad(s.nextInt());
        System.out.println("Sexo: ");
        s.nextLine();
        medico.setSexo(s.nextLine());

    }
}


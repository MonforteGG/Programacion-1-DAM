import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        ArrayList<Location> Locations = new ArrayList<>();
        ArrayList<Hospital> Hospitals = new ArrayList<>();
        ArrayList<Area> Areas = new ArrayList<>();
        ArrayList<Doctor> Doctors = new ArrayList<>();
        ArrayList<Contract> Contracts = new ArrayList<>();

        int action;
        do {
            System.out.println("MENU");
            System.out.println("1. Crear una localización");
            System.out.println("2. Crear un hospital");
            System.out.println("3. Crear un área");
            System.out.println("4. Crear un médico");
            System.out.println("5. Crear un contrato");
            System.out.println("6. Ver los contratos con fecha 2023");
            System.out.println("7. Salir del programa");
            System.out.println("Introduce el número de la acción que quieres realizar:");
            action = s.nextInt();

            switch (action) {
            case 1:
                Location.createLocation(Locations);
                action = 7;
                break;

            case 2:
                Hospital.createHospital(Hospitals, Locations);
                break;

            case 3:
                Area.createArea(Hospitals,Locations,Areas);
                break;

            case 4:
                Doctor.createDoctor(Areas,Doctors,Hospitals,Locations);
                break;

            case 5:
                Contract.createContract(Areas,Doctors,Hospitals,Locations,Contracts);
                break;

            case 6:
                System.out.println("Aquí tienes una lista de todos los contratos con año 2023:");
                System.out.println(Contract.checkContracts2023(Contracts));
                break;

            case 7:
                break;
        }

        }while (action != 7);

    }
}
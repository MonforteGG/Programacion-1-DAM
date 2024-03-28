import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    private String name;
    private String cif;
    private Location location;

    public Hospital() {
    }

    public Hospital(String name, String cif, Location location) {
        this.name = name;
        this.cif = cif;
        this.location = location;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                ", location=" + location +
                '}';
    }

    public static int checkHospital (String hospital, ArrayList<Hospital> Hospitals) {
        int index = -1;
        for (int i = 0; i<Hospitals.size(); i++) {
            if (hospital.equals(Hospitals.get(i).getName())) {
                index = i;
            }
        }
        return index;
    }


    public static Hospital createHospital(ArrayList<Hospital> Hospitals, ArrayList<Location> Locations) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce los datos del hospital:");
        System.out.println("Nombre:");
        String name = s.nextLine();
        System.out.println("CIF:");
        String cif = s.nextLine();
        System.out.println("Calle:");
        String location = s.nextLine();
        System.out.println("Comprobando si existe la localización...");
        int location_index = Location.checkLocation(location,Locations);
        Location location1 = new Location();

        if (location_index < 0) {
            System.out.println("No existe");
            location1 = Location.createLocation(Locations);


        }
        else {
            System.out.println("Existe");
            location1 = Locations.get(location_index);
        }
        Hospital hospital1 = new Hospital(name,cif,location1);
        Hospitals.add(hospital1);
        System.out.println("Hospital creado correctamente");

        return hospital1;
    }
}

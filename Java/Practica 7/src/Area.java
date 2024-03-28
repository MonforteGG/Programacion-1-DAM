import java.util.ArrayList;
import java.util.Scanner;

public class Area implements Comparable<Area>{
    private String name;
    private Integer id;
    private Integer floor;
    private Hospital hospital;
    private Integer docNumber;

    public Area() {
    }

    public Area(String name, Integer id, Integer floor, Hospital hospital, Integer docNumber) {
        this.name = name;
        this.id = id;
        this.floor = floor;
        this.hospital = hospital;
        this.docNumber = docNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Area{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", floor=" + floor +
                ", hospital=" + hospital +
                ", doc numbers=" + docNumber +
                '}';
    }

    @Override
    public int compareTo(Area o) {
        return this.docNumber.compareTo(o.docNumber);
    }

    public static int checkArea (String area, ArrayList<Area> Areas) {
        int index = -1;
        for (int i = 0; i<Areas.size(); i++) {
            if (area.equals(Areas.get(i).getName())) {
                index = i;
            }
        }
        return index;
    }

    public static Area createArea (ArrayList<Hospital>Hospitals,ArrayList<Location>Locations,ArrayList<Area>Areas) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce los datos del area:");
        System.out.println("Nombre:");
        String areaname = s.nextLine();
        System.out.println("ID:");
        int id = s.nextInt();
        System.out.println("Planta:");
        int floor = s.nextInt();
        System.out.println("Número de doctores:");
        int docnum = s.nextInt();
        System.out.println("Hospital al que pertenece el area:");
        s.nextLine();
        String hospital = s.nextLine();

        int hospital_index = Hospital.checkHospital(hospital,Hospitals);
        Hospital hospital1 = new Hospital();

        System.out.println("Comprobando si existe el hospital...");
        if (hospital_index < 0) {
            System.out.println("No existe");
            hospital1= Hospital.createHospital(Hospitals,Locations);


        }
        else {
            System.out.println("Existe");
            hospital1 = Hospitals.get(hospital_index);
        }

        Area area1 = new Area(areaname,id,floor,hospital1,docnum);
        Areas.add(area1);
        System.out.println("Área creada correctamente");

        return area1;
    }
}

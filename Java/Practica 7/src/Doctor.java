import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Person{
    private Double salary;
    private LocalDate startingDate;
    private Area area;

    public Doctor() {
    }

    public Doctor(String dni, String name, Integer age, String sex, Double salary, LocalDate startingDate, Area area) {
        super(dni, name, age, sex);
        this.salary = salary;
        this.startingDate = startingDate;
        this.area = area;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "salary=" + salary +
                ", startingDate=" + startingDate +
                ", area=" + area +
                '}';
    }

    public Double netSalary(double percentage) {
        double net = this.salary * (1-percentage);
        return  net;

    }
    public Integer getYear() {
        Integer year = LocalDate.now().getYear()-startingDate.getYear();
        return year;
    }

    public static int checkDoctor (String doctor, ArrayList<Doctor> Doctors) {
        int index = -1;
        for (int i = 0; i<Doctors.size(); i++) {
            System.out.println(doctor + Doctors.get(i).getName());
            if (doctor.equals(Doctors.get(i).getName())) {
                index = i;
            }
        }
        return index;
    }

    public static Doctor createDoctor (ArrayList<Area>Areas,ArrayList<Doctor>Doctors,ArrayList<Hospital>Hospitals,ArrayList<Location>Locations) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce los datos del médico:");
        System.out.println("DNI:");
        String dni = s.nextLine();
        System.out.println("Nombre:");
        String docname = s.nextLine();
        System.out.println("Edad:");
        int age = s.nextInt();
        System.out.println("Sexo:");
        s.nextLine();
        String sex = s.nextLine();
        System.out.println("Salario:");
        double salary = s.nextDouble();
        System.out.println("Primer día de trabajo:");
        System.out.println("Día:");
        int day = s.nextInt();
        System.out.println("Mes:");
        int month = s.nextInt();
        System.out.println("Año:");
        int year = s.nextInt();
        LocalDate date = LocalDate.of(year,month,day);
        System.out.println("Area:");
        s.nextLine();
        String area = s.nextLine();

        int area_index = Area.checkArea(area,Areas);
        Area area1 = new Area();

        System.out.println("Comprobando si existe el area...");

        if (area_index < 0) {
            System.out.println("No existe");
            area1 = Area.createArea(Hospitals,Locations,Areas);

        }
        else {
            System.out.println("Existe");
            area1 = Areas.get(area_index);
        }

        Doctor doctor1 = new Doctor(dni,docname,age,sex,salary,date,area1);
        Doctors.add(doctor1);
        System.out.println("Médico creado correctamente");

        return doctor1;
    }

}

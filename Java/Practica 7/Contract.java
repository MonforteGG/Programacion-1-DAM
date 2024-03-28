import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Contract {
    private LocalDate creationDate;
    private Doctor doctorData;
    private Hospital hospital;

    public Contract(LocalDate creationDate, Doctor doctorData, Hospital hospital) {
        this.creationDate = creationDate;
        this.doctorData = doctorData;
        this.hospital = hospital;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Doctor getDoctorData() {
        return doctorData;
    }

    public Hospital getHospital() {
        return hospital;
    }


    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setDoctorData(Doctor doctorData) {
        this.doctorData = doctorData;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Contracts{" +
                "creationDate=" + creationDate +
                ", doctorData=" + doctorData +
                ", hospital=" + hospital +
                '}';
    }

    public static ArrayList<Contract> checkContracts2023(ArrayList<Contract>Contracts) {
        ArrayList<Contract> contract2023 = new ArrayList<>();
        for (int i = 0; i < Contracts.size(); i++) {
            if (Contracts.get(i).getCreationDate().getYear() == 2023) {
                contract2023.add(Contracts.get(i));
            }
        }
        return contract2023;
    }

    public static Contract createContract(ArrayList<Area>Areas,ArrayList<Doctor>Doctors,ArrayList<Hospital>Hospitals,ArrayList<Location>Locations,ArrayList<Contract>Contracts) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce los datos del contrato:");
        System.out.println("Día:");
        int contract_day = s.nextInt();
        System.out.println("Mes:");
        int contract_month = s.nextInt();
        System.out.println("Año:");
        int contract_year = s.nextInt();
        LocalDate contract_date = LocalDate.of(contract_year,contract_month,contract_day);
        System.out.println("Nombre del doctor:");
        s.nextLine();
        String doctor_name = s.nextLine();

        int doctor_index = Doctor.checkDoctor(doctor_name,Doctors);
        Doctor doctor1 = new Doctor();
        System.out.println("Comprobando si existe el doctor...");

        if (doctor_index < 0) {
            System.out.println("No existe");
            doctor1 = Doctor.createDoctor(Areas,Doctors,Hospitals,Locations);
        }
        else {
            System.out.println("Existe");
            doctor1 = Doctors.get(doctor_index);
        }

        System.out.println("Nombre del hospital:");
        String hospital_name = s.nextLine();

        int hospital_index = Hospital.checkHospital(hospital_name,Hospitals);
        Hospital hospital1 = new Hospital();
        System.out.println("Comprobando si existe el hospital...");

        if (hospital_index < 0) {
            System.out.println("No existe");
            hospital1 = Hospital.createHospital(Hospitals,Locations);
        }
        else {
            System.out.println("Existe");
            hospital1 = Hospitals.get(hospital_index);
        }

        Contract contract1 = new Contract(contract_date,doctor1,hospital1);
        Contracts.add(contract1);
        System.out.println("Contrato creado correctamente");

        return contract1;
    }
}

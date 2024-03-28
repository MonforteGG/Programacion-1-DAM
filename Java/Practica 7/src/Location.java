import java.util.ArrayList;
import java.util.Scanner;

public class Location {
    ArrayList<Location> Locations = new ArrayList<>();
    private String street;
    private Integer number;
    private Integer postalCode;
    private String city;
    private String province;

    public Location() {
    }

    public Location(String street, Integer number, Integer postalCode, String city, String province) {
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
        this.province = province;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Location{" +
                "Street='" + street + '\'' +
                ", number=" + number +
                ", postalCode=" + postalCode +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
    public static Location createLocation(ArrayList<Location> Locations) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce los datos de la localización:");
        System.out.println("Calle:");
        String calle = s.nextLine();
        System.out.println("Número:");
        int num = s.nextInt();
        System.out.println("Código Postal");
        int postalcode = s.nextInt();
        System.out.println("Ciudad:");
        s.nextLine();
        String city = s.nextLine();
        System.out.println("Provincia:");
        String province = s.nextLine();
        Location location1 = new Location(calle,num,postalcode,city,province);
        Locations.add(location1);
        System.out.println("Localización creada correctamente");

        return location1;

    }

    public static int checkLocation (String location, ArrayList<Location> Locations) {
        int index = -1;
        for (int i = 0; i<Locations.size(); i++) {
            if (location.equals(Locations.get(i).getStreet())) {
                index = i;
            }
        }
        return index;
    }
}

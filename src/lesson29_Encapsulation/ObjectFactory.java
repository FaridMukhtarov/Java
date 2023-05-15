package lesson29_Encapsulation;

public class ObjectFactory extends Child {
    public static void main(String[] args) {

        // From Hospital Class
        Hospital personal1 = new Hospital();
        System.out.println(personal1.getHospitalName()); // Ulduz Hospital
        personal1.setPatientPrice(100);
        personal1.setDoctorName("Ali");
        personal1.setDoctorAddress("Baki");

        System.out.println(personal1.getDoctorName()); // Ali
        System.out.println(personal1.getDoctorAddress()); // Baki

        // Getter və setter üsulları bəzən girişi məhdudlaşdırmaq üçün deyil,
        // istifadəçilərə funksiyanı daha yaxşı başa düşmək üçün istifadə olunur.

        System.out.println("\n----------------------------\n");

        System.out.println("\n----------------------------\n");

        // From Car Class
        Car firstCar = new Car();
        firstCar.setBrand("Toyota");
        firstCar.setModel("Prius");
        firstCar.setFuel("electricity");
        firstCar.setDoor(2);

        System.out.println(firstCar.getBrand()+
                "\n" + firstCar.getModel()+
                "\n" + firstCar.getFuel()+
                "\n" +  firstCar.getDoor()+
                "\n" + firstCar.getSpeed());

    }
}

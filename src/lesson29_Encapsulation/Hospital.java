package lesson29_Encapsulation;

public class Hospital {

    private String hospitalName = "Ulduz Hospital";
    private int patientPrice;
    private String doctorName;
    private String doctorAddress;

    // Xestexana adi gorulsun amma deyisdirilmesin (getter method)
    public String getHospitalName() {
        return hospitalName;
    }

    // xeste qiymeti de giris edile bilsin ama
    // qiymeti sigortadan alinacagi ucun
    // personel xeste qiymetleri  goremesin (setter method)
    public void setPatientPrice(int patientPrice) {
        if (patientPrice > 0)
            this.patientPrice = patientPrice;
        else
            throw new IllegalArgumentException();
    }

    // bu instance variable'lara herkes cata bilsin
    // bu vezyetde public etmek agila gelen ilk hell olacakdir
    // bu variable'lari public etmek yerine
    // private edib, getter ve setter yaratmaq da
    // ayni isi gorur
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }
}

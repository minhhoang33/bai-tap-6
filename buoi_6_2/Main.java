package buoi_6_2;

public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Bs.Hoang", 38, "Noi Khoa", 55);
        Doctor doctor2 = new Doctor("Bs.Hai", 46, "Ngoai Khoa", 40);

        Patient patient1 = new Patient("Nguyen Van A", 60, "AA001", "15-10-2024");
        Patient patient2 = new Patient("Nguyen Van B", 52, "BB002", "15-10-2024");

        Doctor[] doctors = {doctor1, doctor2};
        Patient[] patients = {patient1, patient2};

        ManageHospital hospital = new ManageHospital(doctors, patients);
        hospital.displayAllInfo();
    }
}

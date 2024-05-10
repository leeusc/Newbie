import java.util.Scanner;

public class Formulir {
    public static void main(String[] args) {

        String nama, alamat, telepon, gender;
        int usia;
        boolean statusMenikah;
        double penghasilan;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama: ");
        nama = scanner.nextLine();

        System.out.print("Alamat: ");
        alamat = scanner.nextLine();

        System.out.print("Telepon: ");
        telepon = scanner.nextLine();

        System.out.print("Gender: ");
        gender = scanner.nextLine();

        System.out.print("Usia: ");
        usia = scanner.nextInt();

        System.out.print("Status Menikah (true/false): ");
        statusMenikah = scanner.nextBoolean();

        System.out.print("Penghasilan: ");
        penghasilan = scanner.nextDouble();


        String hasilFormulir = "Nama saya " + nama + ", seorang " + gender +
                " tinggal di " + alamat + ", dan Telepon " + telepon + ". " +
                "Tahun ini usia saya " + usia + " tahun, " +
                (statusMenikah ? "sudah menikah" : "belum menikah") +
                ", dan Penghasilan saya " + penghasilan + ".";


        System.out.println(hasilFormulir);
    }
}

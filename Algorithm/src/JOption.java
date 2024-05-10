import javax.swing.JOptionPane;

public class JOption{
    public static void main(String[] args) {

        double persentasePajak = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Persentase Pajak (contoh: 18.5):"));
        int gaji = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Gaji:"));
        int bonus = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Bonus:"));
        int denda = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Denda:"));


        double penghasilan = gaji + bonus - denda;
        double pajak = penghasilan * (persentasePajak / 100);
        double total = penghasilan - pajak;


        String hasil = "Penghasilan: " + penghasilan + "\n" +
                "Pajak: " + pajak + "\n" +
                "Total: " + total;
        JOptionPane.showMessageDialog(null, hasil, "Hasil Perhitungan Penghasilan", JOptionPane.INFORMATION_MESSAGE);
    }
}

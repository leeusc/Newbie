import javax.swing.*;

public class temp {
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null, "Welcome to My Java Program!");
        String temp;
        temp = JOptionPane.showInputDialog(null, "Masukkan Nama Anda: ");



        int g = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog(null, "Gaji:" );

        int a = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog(null, "Bonus:");

        int b = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog(null, "Denda:");

        int c = Integer.parseInt(temp);
        JOptionPane.showMessageDialog(null, "Penghasilan: " +(g+a-b) );

        double d = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog(null, "Pajak");
        int e = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog(null, "Total");

    }
}

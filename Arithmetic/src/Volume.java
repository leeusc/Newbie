import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of side of cube!");
        double s = scanner.nextDouble();


        System.out.println(s * s * s);
    }
}

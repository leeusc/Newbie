import java.util.Scanner;

    public class Volume2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the radius:");
            double r = scanner.nextDouble();
            System.out.println("Enter the height:");
            double h = scanner.nextDouble();

             double volume =Math.round(Math.PI * r * r * h * 100.00)/100.00;
            System.out.println("The Volume is: " + volume);
        }
    }


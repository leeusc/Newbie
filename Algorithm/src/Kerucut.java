public class Kerucut {
    public static void main(String[] args){

        double r = 5;
        double h = 2;

        double volume = (1.00/3.00)*Math.PI*r*r*h;
        double RoundVolume = Math.round(volume * 100.00)/100.00;

        System.out.println("Print the answer of cone:  "+ RoundVolume);
    }}

public class TrueorFalse {
    public static void main(String[] args) {


        float a = 1, b = 2, c = 3, d = 4, e = 5 , f = 7, g = 10;

        System.out.println("Contoh 1 : " + (f > e + c));
        System.out.println("Contoh 2 : " + ((d - b * c < g) && (e != b)));
        System.out.println("Contoh 3 : " + (e == c && f < g || a != b ));
        System.out.println("Contoh 4 : " + ((e == c && f < g) || a != c));
        System.out.println("Contoh 5 : " + (e == c && (f < g || a != c)));
        System.out.println("Contoh 6 : " + (f % e * c < (e-b) / c));


    }

}

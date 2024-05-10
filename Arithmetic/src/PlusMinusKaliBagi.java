public class PlusMinusKaliBagi {
    public static void main(String[] args) {

        int a = 7, b = 5, c = 2, d = 4 ;

        System.out.println("Contoh 1 : " + (a - b * c + d));
        System.out.println("Contoh 2 : " + ((a - b) * (c + d)));
        System.out.println("Contoh 3 : " + (int)(a + b * c / d));
        System.out.println("Contoh 4 : " + ((float) a + b * c / d)); //supposedly the result expected to be 9.5 if we change the int to double, IDK hehe

    }
}
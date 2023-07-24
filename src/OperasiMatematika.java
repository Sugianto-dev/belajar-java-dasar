public class OperasiMatematika {
    public static void main(String[] args) {

        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assigments
        int c = 100;

        c += 10; // sama dengan c = c + 10
        System.out.println(c);

        c -= 10; // sama dengan c = c + 10
        System.out.println(c);

        c *= 10; // sama dengan c = c + 10
        System.out.println(c);

        // Unary Operator (Operator yang ditempatkan di depan variabel & cukup 1 variabel)
        int d = 100;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        System.out.println(!true);

    }
}

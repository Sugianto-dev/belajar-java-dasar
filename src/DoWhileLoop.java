public class DoWhileLoop {
    public static void main(String[] args) {

        /*
        * Notes!
        * > Do While Loop
        * > Minimal 1x perulangan walaupun kondisi salah dari awal
        * */

        var counter = 100;

        do{
            System.out.println("Perulangan " + counter);
            counter++;
        } while (counter <= 101);

    }
}

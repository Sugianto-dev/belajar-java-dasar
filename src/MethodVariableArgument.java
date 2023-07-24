public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values = {80, 50, 50, 50, 80};
        sayCongrats("Eko", values);

        // Cara lebih simple
        sayCongrats("Budi", 80, 90, 76, 80);

    }

    /*
    * Notes!
    * > Values dibawah tetap dibaca array
    * */

    static void sayCongrats(String name, int... values){ // int[] diubah int...
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}

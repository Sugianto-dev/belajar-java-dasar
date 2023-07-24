public class TernaryOperator {
    public static void main(String[] args) {

        var nilai = 75;
//        String ucapan;

        // Versi If Standard
//        if(nilai >= 75){
//            ucapan = "Selamat Anda Lulus";
//        } else {
//            ucapan = "Silahkan Coba Lagi";
//        }

        // Ternary Operator
        /*
        * Fungsi :
        * > Mempermudah dalam menggunakan If Statement
        * */
        String ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";

        System.out.println(ucapan);

    }
}

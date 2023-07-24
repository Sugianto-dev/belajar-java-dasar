public class KonversiNumber {
    public static void main(String[] args) {

        // 1. Widening Casting (Otomatis)
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        // 2. Narrowing Casting (Manual)
        /*
        * Notes!
        * Hati hati ketika angka yang dikonversi (besar ke kecil) secara manual tidak muat, dapat menyebabkan Number Overflow
        * Contoh :
        * */
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2; // Number Overflow

        /*
        * Penjelasan Number OverFlow diatas :
        * byte hanya sampai 127, ketika digunakan untuk mengkonversi int 1000 maka yang terjadi byte akan
        * menghitung sampai 127 lalu kembali ke -128 sampai 127 kembali, terus berulang sampai 1000
        * */

    }
}

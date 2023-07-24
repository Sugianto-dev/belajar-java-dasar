public class TipeDataNumber {

    public static void main(String[] args) {

        /*
        * Notes!
        * Ada 2 Jenis Tipe Data Number :
        * 1. Integer Number
        * 2. Floating Point Number
        *
        * Default value Integer Number = 0
        * Default value Floating Point Number = 0.0
        * */

        // 1. Integer Number
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

        // 2. Floating Point Number
        float iniFloat = 10.10f; // Pakai titik (Format luar negri)
        double iniDouble = 10.10;

        // Literals
        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        // Underscore (Optional)
        // Untuk pemisah agar memudahkan kita untuk membaca
        int amount = 1_000_000_000;

        /*
        * Konversi Tipe Data Number
        * 1. Widening Casting (Otomatis) : byte -> short -> int -> long -> float -> double
        * 2. Narrowing Casting (Manual) : double -> float -> long -> int -> char -> short -> byte
        * */

        // Untuk contoh lihat di KonversiNumber.java
    }

}

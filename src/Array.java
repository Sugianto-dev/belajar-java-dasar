public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3]; // Inisialisasi array

        stringArray[0] = "Eko";
        stringArray[1] = "Kurniawan";
        stringArray[2] = "Khannedy";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Budi";

        System.out.println(stringArray[0]);

        // atau
        String[] stringArray2 = new String[3];

        // CARA 2
        String[] namaNama = {
                "Eko", "Kurniawan", "Khannedy"
        };

        // Di java tidak bisa hapus array, hanya bisa mengubah datanya jadi 0 atau null
        // mengubah mengosongkan isi data array
        namaNama[0] = null; // bisa null karena String adalah objek atau bukan primitif

        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        // mengubah mengosongkan isi data array
        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        // Array dalam Array
        String[][] members = {
                {"Eko", "Kurniawan"},
                {"Budi", "Nugraha"},
                {"Joko"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);

    }
}

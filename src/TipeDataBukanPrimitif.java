public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        /*
        * Notes!
        * 1. Tipe data primitif = tipe data yang tidak bisa diubah lagi
        * Contoh : number, char, boolean
        * Tipe data primitif selalu memiliki default value
        *
        * String bukan tipe data primitif
        * 2. Bukan tipe data primitif :
        * bisa memiliki method/function
        *
        * ---------------------------------------------------------------------
        * | Tipe Data Primitif            | Tipe Data Bukan Primitif          |
        * ---------------------------------------------------------------------
        * | byte                          | Byte                              |
        * | short                         | Short                             |
        * | int                           | Integer                           |
        * | long                          | Long                              |
        * | float                         | Float                             |
        * | double                        | Double                            |
        * |                               |                                   |
        * | char                          | Character                         |
        * | boolean                       | Boolean                           |
        * ---------------------------------------------------------------------
        *
        * Default value Bukan Primitif = null
        * */

        // Tipe Data Bukan Primitif
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100; // Mengubah value iniByte

        System.out.println(iniByte);

        // Konversi primitif ke bukan primitif
        int iniInt = 100;
        Integer iniObject = iniInt;

        // Ketika tipe data tidak kompatible
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

    }
}

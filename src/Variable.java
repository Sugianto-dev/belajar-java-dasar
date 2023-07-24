public class Variable {
    public static void main(String[] args) {

        /*
        * Notes!
        * Variable = Tempat untuk menyimpan data
        * Cuma bisa 1 tipe data dalam variable java, tidak seperti PHP / JS
        * */

        String name; // Variable (String)
        name = "Eko Kurniawan Khannedy"; // Mengisi Variable

        System.out.println(name);

        int age = 30; // Bisa langsung di isi
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Budi Nugraha"; // Mengganti value variable name diatas
        System.out.println(name);

        /*
        * Notes!
        * Sejak java 10 bisa menggunakan kata kunci var
        * bisa diisi banyak tipe data seperti di PHP / JS
        * wajib langsung isi value jika tidak maka akan error
        * */

        // var company; // Akan error
        var firstName = "Eko";
        var middleName = "Kurniawan";
        var lastName = "Khannedy";

        // nilainya tidak dapat diubah atau konstan
        final String application = "Belajar Java";
        // application = "Belajar PHP"; // Akan error

    }
}

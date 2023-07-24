public class Method {
    public static void main(String[] args) { // Main Method atau Main Function

        sayHelloWorld(); // cara memanggil method

    }

    /*
    * Notes!
    * > Style orang java ketika membuat penamaan method
    * > diawali huruf kecil selanjutnya huruf besar (contoh: sayHelloWorld)
    * > ikutin style nya orang java
    *
    * > Kalo method main static maka method lain harus static juga
    * > Static cuma bisa memanggil method static juga
    * */

    static void sayHelloWorld(){
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
    }
}

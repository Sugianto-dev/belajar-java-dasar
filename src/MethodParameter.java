public class MethodParameter {
    public static void main(String[] args) {

        sayHello("Eko", "Kurniawan");
        sayHello("Budi", "Nugraha");
        sayHello("Joko", "Nugroho");

    }

    /*
    * Notes!
    * > Parameter atau Argument
    * */

    static  void sayHello(String firstname, String lastname){
        System.out.println("Hello " + firstname + " " + lastname);
    }
}

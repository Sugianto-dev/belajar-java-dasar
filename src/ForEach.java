public class ForEach {
    public static void main(String[] args) {

        String[] names = {
                "Eko", "Kurniawan", "Khannedy",
                "Programmer", "Zaman", "Now"
        };

        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        // For Each (Semenjak java versi 5 atau 6)
        System.out.println("FOR EACH");

        for(var name: names){
            System.out.println(name);
        }

    }
}

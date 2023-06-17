import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Register {

    public HashMap<String, String> create(){
        Helpers helpers = new Helpers();
        HashMap<String, String> men = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("first name : ");
        men.put("firstName",scanner.nextLine());
        System.out.print("last name : ");
        men.put("lastName",scanner.nextLine());
        System.out.print("foot size : ");
        men.put("footSize", scanner.nextLine());
        helpers.out();

        return men;
    }
//    public static void displayMen(HashMap<String, String> men/*<-- ось він*/) {
//        // тут ми в змінну "е" присвоюємо один елемент при кожній ітерації через ":" всі дані з "men" якого ми прийняли, витягнувши дані "men.entrySet()"
//        for (Map.Entry<String, String> e/*<-- ось вона */ : men.entrySet()) {
//            System.out.println(e.getKey() + " = " + e.getValue());
//        }
//
//    }
}

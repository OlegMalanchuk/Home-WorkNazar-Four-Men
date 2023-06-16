import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Register {
    public HashMap<String, String> create1(){
        Helpers helpers = new Helpers();
        HashMap<String, String> men1 = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("first name : ");
        String data1 = scanner.nextLine();
        System.out.print("last name : ");
        String data2 = scanner.nextLine();
        System.out.print("foot size : ");
        Integer data3 = Integer.valueOf(scanner.nextLine());
        helpers.out();

        men1.put("firstName",data1);
        men1.put("lastName",data2);
        men1.put("footSize", String.valueOf(data3));
        for (Map.Entry<String,String>e: men1.entrySet()){
            System.out.println(e.getKey() +" = "+ e.getValue());
        }
        return men1;
    }
    private  HashMap<String, String> men1;

    public void display( HashMap<String, String> men1){
        // використовуємо цикл for-each для перебору всіх пар ключ-значення в HashMap
        for (Map.Entry<String,String> e: men1.entrySet()){
            // виводимо ключ і значення, розділяючи їх знаком рівності
            System.out.println(e.getKey() +" = "+ e.getValue());
        }
    }


}

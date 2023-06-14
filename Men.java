import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Men {

    private String firstName,lastName ;
    private int footSize;

    public  void person1(){

        HashMap<String, String> men1 = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("first name : ");
        String data1 = scanner.nextLine();
        System.out.print("last name : ");
        String data2 = scanner.nextLine();
        System.out.print("foot size : ");
        Integer data3 = Integer.valueOf(scanner.nextLine());
        System.out.println("end");

        men1.put("firstName",data1);
        men1.put("lastName",data2);
        men1.put("footSize", String.valueOf(data3));
        for (Map.Entry<String,String>e: men1.entrySet()){
            System.out.println(e.getKey() +" = "+ e.getValue());
        }
    }
    public  void person2(){HashMap<String, String> men2 = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("first name : ");
        String data1 = scanner.nextLine();
        System.out.print("last name : ");
        String data2 = scanner.nextLine();
        System.out.print("foot size : ");
        Integer data3 = Integer.valueOf(scanner.nextLine());
        System.out.println("end");

        men2.put("firstName",data1);
        men2.put("lastName",data2);
        men2.put("footSize", String.valueOf(data3));
        for (Map.Entry<String,String>e: men2.entrySet()){
            System.out.println(e.getKey() +" = "+ e.getValue());
        }}
    public  void person3(){HashMap<String, String> men3 = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("first name : ");
        String data1 = scanner.nextLine();
        System.out.print("last name : ");
        String data2 = scanner.nextLine();
        System.out.print("foot size : ");
        Integer data3 = Integer.valueOf(scanner.nextLine());
        System.out.println("end");

        men3.put("firstName",data1);
        men3.put("lastName",data2);
        men3.put("footSize", String.valueOf(data3));
        for (Map.Entry<String,String>e: men3.entrySet()){
            System.out.println(e.getKey() +" = "+ e.getValue());
        }}
    public  void person4(){HashMap<String, String> men4 = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("first name : ");
        String data1 = scanner.nextLine();
        System.out.print("last name : ");
        String data2 = scanner.nextLine();
        System.out.print("foot size : ");
        Integer data3 = Integer.valueOf(scanner.nextLine());
        System.out.println("end");

        men4.put("firstName",data1);
        men4.put("lastName",data2);
        men4.put("footSize", String.valueOf(data3));
        for (Map.Entry<String,String>e: men4.entrySet()){
            System.out.println(e.getKey() +" = "+ e.getValue());
        }
    }



}

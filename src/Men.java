import java.util.HashMap;
import java.util.Scanner;

public class Men
{



    private static HashMap <String , String> men1;// це метод ключ-значення ніби
    private static HashMap <String , String> men2;// це метод ключ-значення ніби
    private static HashMap <String , String> men3;// це метод ключ-значення ніби
    private static HashMap <String , String> men4;// це метод ключ-значення ніби



    public HashMap<String,String> create(){
        HashMap<String, String> men = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("first name : ");
        men.put("firstName",scanner.next());// ввід даних і одночасно запис їх в хес мер
        System.out.print("last name : ");
        men.put("lastName",scanner.next());
        System.out.print("foot size : ");
        men.put("footSize", scanner.next());
        Helpers.out();

        return men;// повертає змінну мен із записаними значеннями
    }

    public Men(){
        this.men1=this.create();// констрктори  які приймають вище записані параметри кожен окремо та різні
        this.men2=this.create();// констрктори  які приймають вище записані параметри кожен окремо та різні
        this.men3=this.create();// констрктори  які приймають вище записані параметри кожен окремо та різні
        this.men4=this.create();// констрктори  які приймають вище записані параметри кожен окремо та різні
    }
    public static HashMap<String, String> getMen1() {return men1;} // банальні гетери

    public static HashMap<String, String> getMen2() {return men2;} // банальні гетери

    public static HashMap<String, String> getMen3() {return men3;} // банальні гетери
    public static HashMap<String, String> getMen4() {return men4;} // банальні гетери



    public void setFootMen1(String foot) {this.men1.put("footSize", foot);} // сетери які використовуються для зміни розміру пенсіла )
    public void setFootMen2(String foot) {this.men2.put("footSize", foot);} // сетери які використовуються для зміни розміру пенсіла )
    public void setFootMen3(String foot) {this.men3.put("footSize", foot);} // сетери які використовуються для зміни розміру пенсіла )
    public void setFootMen4(String foot) {this.men4.put("footSize", foot);} // сетери які використовуються для зміни розміру пенсіла )

    public void setNameMen1(String name) {this.men1.put("firstName", name);}
    public void setNameMen2(String name) {this.men2.put("firstName", name);}
    public void setNameMen3(String name) {this.men3.put("firstName", name);}
    public void setNameMen4(String name) {this.men4.put("firstName", name);}

    public void setLastNameMen1(String LastName) {this.men1.put("lastName", LastName);}
    public void setLastNameMen2(String LastName) {this.men1.put("lastName", LastName);}
    public void setLastNameMen3(String LastName) {this.men1.put("lastName", LastName);}
    public void setLastNameMen4(String LastName) {this.men1.put("lastName", LastName);}





}

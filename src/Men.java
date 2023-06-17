import java.util.HashMap;
import java.util.Map;

public class Men {

    private String firstName,lastName ;//змінні
    private String footSize;//змінні
    Register register = new Register();//ініціалізація класу
    private HashMap<String,String> men1;
    private HashMap<String,String> men2;
    private HashMap<String,String> men3;
    private HashMap<String,String> men4;

    public void human(){
        this.men1 = this.register.create();
        this.men2 = this.register.create();
        this.men3 = this.register.create();
        this.men4 = this.register.create();
    }

    public  HashMap<String, String> getMen1() {return men1;}

    public HashMap<String, String> getMen2() {
        return men2;
    }

    public HashMap<String, String> getMen3() {
        return men3;
    }

    public HashMap<String, String> getMen4() {
        return men4;
    }



    public void setFootMen1(String foot) {
        this.men1.put("footSize", foot);
    }public void setFootMen2(String foot) {
        this.men2.put("footSize", foot);
    }public void setFootMen3(String foot) {
        this.men3.put("footSize", foot);
    }public void setFootMen4(String foot) {
        this.men4.put("footSize", foot);
    }
}


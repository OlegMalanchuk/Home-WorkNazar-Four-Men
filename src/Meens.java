import java.util.HashMap;

public class Meens{
    private  HashMap<String , HashMap<String,String>> mens; // тут я створив новий змінну ключ - значення


    public HashMap<String , HashMap<String,String>> createMeens() //створив метод який створює ключі мен і бере дані створених  в класі мен дані хес меру
    {
        HashMap<String , HashMap<String,String>> allMens = new HashMap<>();
        allMens.put("men1",Men.getMen1());// присвоюємо першому чоловіку парамити
        allMens.put("men2",Men.getMen2());//тутт то саме
        allMens.put("men3",Men.getMen3());
        allMens.put("men4",Men.getMen4());
        return allMens;
    }
    public Meens(){
        this.mens = this.createMeens(); // конструктор
    }

    public  HashMap<String, HashMap<String, String>> getMens() {// гетер для виводу інфи
        return mens ;
    }
}

import java.util.HashMap;

public class Meens{
    private  HashMap<String , HashMap<String,String>> mens;


    public HashMap<String , HashMap<String,String>> createMeens()
    {
        HashMap<String , HashMap<String,String>> allMens = new HashMap<>();
        allMens.put("men1",Men.getMen1());
        allMens.put("men2",Men.getMen2());
        allMens.put("men3",Men.getMen3());
        allMens.put("men4",Men.getMen4());
        return allMens;
    }
    public Meens(){
        this.mens = this.createMeens();
    }

    public  HashMap<String, HashMap<String, String>> getMens() {

        return mens ;
    }
}

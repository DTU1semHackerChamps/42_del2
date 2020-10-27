import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> stringList;

        stringList = Language.languageInit();

        System.out.println(stringList.get("winMessasge"));
        System.out.println(stringList.get("rollMessasge"));
        Dice a = new Dice(0);


        System.out.println(a.rollDice());

    }
}
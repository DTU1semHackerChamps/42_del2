import gui_main.GUI;
import gui_fields.GUI_Street;
import gui_fields.GUI_Field;

import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        Displaymanager display = new Displaymanager();
        Dice a = new Dice(3);



        display.startScreen();
        display.startButton();
        display.displayDice();

        //display.initBoard();



        HashMap<String, String> stringList;
        stringList = Language.languageInit();

        System.out.println(stringList.get("winMessasge"));
        System.out.println(stringList.get("rollMessasge"));


    }
}
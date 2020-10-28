

import gui_main.GUI;

import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        GUI gui = new GUI();
        Dice a = new Dice(3);

        Displaymanager.startScreen(gui);
        Displaymanager.startButton(gui);
        Displaymanager.displayDice(gui,a.getFaceValue(),a.getFaceValue());

//        HashMap<String, String> stringList;
//        stringList = Language.languageInit();
//        System.out.println(stringList.get("winMessasge"));
//        System.out.println(stringList.get("rollMessasge"));


    }
}
import java.awt.*;
import java.io.IOException;
import java.util.HashMap;

import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;
public class Main {
    public static void main(String[] args) throws IOException {
        Dice dice = new Dice(0);
        Displaymanager displaymanager = new Displaymanager();


        GUI gui = Displaymanager.initBoard();
        GUI_Player player1 = Displaymanager.displayAddPlayer(gui, "Brian", 1000, true);
        GUI_Player player2 = Displaymanager.displayAddPlayer(gui, "Niller", 1000, false);
        int balance = 1200;


        while(balance>0) {
            dice.rollDice();
            displaymanager.displayPosition(gui, dice.getFaceValue(), player1, player2);
        }




        HashMap<String, String> stringList;
        stringList = Language.languageInit("english");

        System.out.println(stringList.get("winMessasge"));
        System.out.println(stringList.get("rollMessasge"));
        Dice a = new Dice(0);
        System.out.println(a.rollDice());
//        Displaymanager.startScreen(gui);
//        Displaymanager.startButton(gui);
//        Displaymanager.displayDice(gui,a.getFaceValue(),a.getFaceValue());
    }
}
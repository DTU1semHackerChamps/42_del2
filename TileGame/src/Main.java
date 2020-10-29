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
        dice.rollDice();

        Displaymanager.initBoard();

        GUI_Car car1 = new GUI_Car();
        car1.setPrimaryColor(Color.blue);
        GUI_Player gui_Player1 = new GUI_Player("Brian",0, car1);
        Displaymanager.gui.addPlayer(gui_Player1);
        gui_Player1.setBalance(1000);

        GUI_Car car2 = new GUI_Car();
        car2.setPrimaryColor(Color.red);
        GUI_Player gui_Player2 = new GUI_Player("Niller",0, car2);
        Displaymanager.gui.addPlayer(gui_Player2);
        gui_Player2.setBalance(1000);


        displaymanager.displayPosition(dice.getFaceValue(), gui_Player1, gui_Player2);




        HashMap<String, String> stringList;
        stringList = Language.languageInit();

        System.out.println(stringList.get("winMessasge"));
        System.out.println(stringList.get("rollMessasge"));
        Dice a = new Dice(0);
        System.out.println(a.rollDice());
//        Displaymanager.startScreen(gui);
//        Displaymanager.startButton(gui);
//        Displaymanager.displayDice(gui,a.getFaceValue(),a.getFaceValue());
    }
}
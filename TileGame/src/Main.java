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

        GUI_Field[] fields = new GUI_Field[16];
        GUI gui = Displaymanager.initBoard(fields);
        Displaymanager.startScreen(gui);
        Player player1 = new Player(1000, 1, true, gui.getUserString("Indtast et navn for spiller 1"));
        Player player2 = new Player(1000, 1, true, gui.getUserString("Indtast et navn for spiller 2"));
        GUI_Player gui_Player1 = Displaymanager.displayAddPlayer(gui, fields, player1.getPlayerName(), player1.getBalance(), true);
        GUI_Player gui_Player2 = Displaymanager.displayAddPlayer(gui, fields, player2.getPlayerName(), player2.getBalance(), false);





      //  displaymanager.displayPosition(fields, player1.getPosition(), player2.getPosition(), gui_Player1, gui_Player2);





    }
}
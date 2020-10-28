import gui_main.GUI;
import gui_fields.GUI_Street;
import gui_fields.GUI_Field;
import java.io.IOException;
import java.util.HashMap;
public class Displaymanager {
//    throws IOException;
    GUI gui = new GUI();
    Dice a = new Dice(3);

//    HashMap<String, String> stringList;
//    stringList = Language.languageInit();


    public void startScreen(){
        //gui.getUserButtonPressed("Press OK to roll the dice ");
        gui.showMessage("Press OK to roll the dice ");
        //return startScreen();
    }
    public void startButton(){
        while (gui.getUserLeftButtonPressed(" ","Roll","Exit")){
            gui.setDice(a.rollDice(),a.rollDice());
        }


    }

    public void displayDice(){
        gui.setDice(1,2);

    }

    public void initBoard(){
        GUI_Field[] tiles = new GUI_Field[12];
        //tiles[0] = new GUI_Street();
        GUI_Street tileInfo= new GUI_Street();
        tileInfo.setTitle("Tower");
        tiles[0] = tileInfo;

    }

    public void winScreen(){

    }

    public void displayBalance(){

    }

    public void displayPosition(){

    }

    public void displayTileText(){

    }


}

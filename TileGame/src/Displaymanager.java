import gui_main.GUI;
import gui_fields.GUI_Street;
import gui_fields.GUI_Field;
import java.io.IOException;
import java.util.HashMap;
public class Displaymanager {
    GUI gui = new GUI();

    public void startScreen(){

        gui.showMessage("Press OK to roll the dice ");

    }
    public static void startButton(GUI gui){
        gui.getUserLeftButtonPressed(" ","Roll","Exit");
    }

    public static void displayDice(GUI gui,int dice1, int dice2){
        gui.setDice(dice1,dice2);

    }

    public static void initBoard(){
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

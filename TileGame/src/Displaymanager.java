import gui_main.GUI;
import gui_fields.GUI_Street;
import gui_fields.GUI_Field;

public class Displaymanager {
    GUI gui = new GUI();


    public static void startScreen(){



    }

    public static void displayDice(){

    }

    public static void initBoard(){
        GUI_Field[] tiles = new GUI_Field[12];
        //tiles[0] = new GUI_Street();
        GUI_Street tileInfo= new GUI_Street();
        tileInfo.setTitle("Tower");
        tiles[0] = tileInfo;



    }

    public static void winScreen(){

    }

    public static void displayBalance(){

    }

    public static void displayPosition(){

    }

    public static void displayTileText(){

    }



}

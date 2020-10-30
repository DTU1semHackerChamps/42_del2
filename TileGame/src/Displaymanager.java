import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;
import gui_fields.GUI_Street;
import gui_fields.GUI_Field;

import java.awt.*;

public class Displaymanager {

    private static GUI_Field[] fields = new GUI_Field[16];


    public static void startScreen(GUI gui){

        gui.showMessage("Press OK to roll the dice ");

    }
    public static void startButton(GUI gui){

        gui.getUserLeftButtonPressed(" ","Roll","Exit");

    }

    public static void displayDice(GUI gui,int dice1, int dice2){
        gui.setDice(dice1,dice2);

    }

    /**
     *
     * @return Returns gui with Tile names, Tile balance and random colors
     * for the tiles and the
     * background
     */
    public static GUI initBoard(){

        GUI.setNull_fields_allowed(true);
        Tile[] tiles = Tile.tileListInit();
        String tileBalance, tileName;
        int j = 0;

        for (int i = 0; i < 16; i++) {

            j++;
            if ((i == 0) || (i == 4) || (i == 8) || (i == 12)) {
             j--;
            }
            else {
                tileBalance = Integer.toString(tiles[j].getBalanceChange());
                tileName = tiles[j].getTileName();
                GUI_Street street = new GUI_Street();
                street.setTitle(tileName);
                street.setSubText(tileBalance);
                fields[i] = street;
                fields[i].setBackGroundColor(Color.getHSBColor((float)Math.random(),(float)0.50,(float)0.85));
            }
        }
        GUI gui = new GUI(fields,Color.getHSBColor((float)Math.random(),(float)0.60,(float)0.75));


        return gui;

    }

    public static GUI_Player displayAddPlayer(GUI gui, String name, int balance, boolean color){
        GUI_Car car1 = new GUI_Car();
        if(color) {
            car1.setPrimaryColor(Color.blue);
        }
        else{
            car1.setPrimaryColor(Color.red);
        }
        GUI_Player gui_Player = new GUI_Player(name,balance, car1);
        gui.addPlayer(gui_Player);

        return gui_Player;

    }

    public void winScreen(){

    }

    public void displayBalance(){

    }

    public static void displayPosition(GUI gui, int diceRoll, GUI_Player gui_Player1, GUI_Player gui_Player2){

        int facevalue = diceRoll;
        int tile = 1;

        fields[tile].setCar(gui_Player1, true);
        fields[tile].setCar(gui_Player2, true);


            if(gui.getUserLeftButtonPressed("Press left or right","left", "right")){
                fields[tile].removeAllCars();
                tile += facevalue;

                if(tile >= 16)
                    tile = 1;

                if((tile==0)||(tile==4)||(tile==8)||(tile==12))
                    tile++;


                fields[tile].setCar(gui_Player1, true);
            }

    }

    public void displayTileText(){

    }


}

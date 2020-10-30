import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;
import gui_fields.GUI_Street;
import gui_fields.GUI_Field;

import java.awt.*;

public class Displaymanager {



    public static boolean rollScreen(GUI gui, String rollScreenMessage, String rollButton){
        boolean buttonPress;
        buttonPress = gui.getUserButtonPressed( rollScreenMessage, rollButton).equals(rollButton);
        return buttonPress;
    }
    public static void startButton(GUI gui, String startButtonMessage, String startTrueButton, String startFalseButton){

        gui.getUserLeftButtonPressed(startButtonMessage, startTrueButton, startFalseButton);

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
    public static GUI initBoard(GUI_Field[] fields){

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

    public static GUI_Player displayAddPlayer(GUI gui, GUI_Field[] fields, String name, int balance, boolean color){
        GUI_Car car1 = new GUI_Car();
        if(color) {
            car1.setPrimaryColor(Color.blue);
        }
        else{
            car1.setPrimaryColor(Color.red);
        }
        GUI_Player gui_Player = new GUI_Player(name,balance, car1);
        gui.addPlayer(gui_Player);
        fields[1].setCar(gui_Player, true);

        return gui_Player;

    }

    public static boolean winScreen(GUI gui, boolean hasWon, String winScreenMessage, String winTrueButton, String winFalseButton){
        boolean buttonPress = false;
        if (hasWon) {
           buttonPress = gui.getUserLeftButtonPressed(winScreenMessage, winTrueButton, winFalseButton);
           if(buttonPress){
               System.exit(0);
           }
       }

        return buttonPress;

    }


    public void displayBalance(){

    }

    public static void displayPosition(GUI_Field[] fields, int positionPlayer1, int positionPlayer2, GUI_Player gui_Player1, GUI_Player gui_Player2){


        for (int i = 1; i < 16; i++) {
            if ((i == 4)||(i == 8)||(i == 12)) {

            } else {
                fields[i].removeAllCars();
            }
        }
        switch (positionPlayer1) {
            case 4,5,6: positionPlayer1 += 1;
                break;
            case 7,8,9: positionPlayer1 += 2;
                break;
            case 10,11,12: positionPlayer1 += 3;
                break;
        }

        switch (positionPlayer2) {
            case 4,5,6: positionPlayer2 += 1;
                break;
            case 7,8,9: positionPlayer2 += 2;
                break;
            case 10,11,12: positionPlayer2 += 3;
                break;

        }

        fields[positionPlayer1].setCar(gui_Player1, true);
        fields[positionPlayer2].setCar(gui_Player2, true);

    }

    public void displayTileText(){


    }


}

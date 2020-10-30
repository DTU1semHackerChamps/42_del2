import gui_codebehind.Observable;
import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;
import gui_fields.GUI_Street;
import gui_fields.GUI_Field;

import java.awt.*;

public class Displaymanager {
    GUI a = new GUI();


    /**
     * A reference to gui showMessage method to show a message and a button.
     * @param gui
     */
    public static void startScreen(GUI gui){
        gui.showMessage("Press OK to roll the dice ");

    }

    /**
     * A reference method for Roll and Exit button.
     * @param gui
     */
    public static void startButton(GUI gui){
        gui.getUserLeftButtonPressed(" ","Roll","Exit");

    }

    /**
     * Method to show dice and the face values.
     * @param gui
     * @param dice1  Face value of the first dice.
     * @param dice2  Face value of the second dice.
     *
     */
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

    /**
     * A method to show win-message to the winner when the player reached 3000 points.
     * @param gui
     * @param playerPosition
     */
    public void winScreen(GUI gui, int playerPosition){
       if (playerPosition >= 3000) {
           gui.getUserLeftButtonPressed("You have won the game! Press 'Restart' or 'Exit' ","Exit","Restart");
           System.exit(0);
       }

    }


    public void displayBalance(){

    }

    public static void displayPosition(GUI_Field[] fields, int positionPlayer1, int positionPlayer2, GUI_Player gui_Player1, GUI_Player gui_Player2){




        fields[positionPlayer1].removeAllCars();
        switch (positionPlayer1) {
            case 4,5,6: positionPlayer1 += 1;
            case 7,8,9: positionPlayer1 += 2;
            case 10,11,12: positionPlayer1 += 3;

        }

        switch (positionPlayer2) {
            case 4,5,6: positionPlayer2 += 1;
            case 7,8,9: positionPlayer2 += 2;
            case 10,11,12: positionPlayer2 += 3;

        }

        fields[positionPlayer1].setCar(gui_Player1, true);
        fields[positionPlayer2].setCar(gui_Player2, true);

    }

    public void displayTileText(){

    }


}

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;
import gui_fields.GUI_Street;
import gui_fields.GUI_Field;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
public class Displaymanager {

    private static GUI_Field[] fields = new GUI_Field[16];

    static GUI gui = new GUI();
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
        // *********Init board*********

        GUI.setNull_fields_allowed(true);



        //Der tilføjes et par værdier.
        for (int i = 0; i < 16; i++) {

            if((i==0)||(i==4)||(i==8)||(i==12)) {

            }
            else{
                GUI_Street testStreet = new GUI_Street();
                testStreet.setTitle("Tower");
                testStreet.setSubText("+250");
                fields[i] = testStreet;
            }
        }
        GUI gui = new GUI(fields);

    }

    public void winScreen(){

    }

    public void displayBalance(){

    }

    public void displayPosition(int diceRoll, GUI_Player gui_Player1, GUI_Player gui_Player2){
        //********* Move player *******
//        GUI_Car car1 = new GUI_Car();
//        car1.setPrimaryColor(Color.blue);
//        GUI_Player gui_Player1 = new GUI_Player("Brian",0, car1);
//        gui.addPlayer(gui_Player1);
//        gui_Player1.setBalance(1000);
//
//        GUI_Car car2 = new GUI_Car();
//        car1.setPrimaryColor(Color.red);
//        GUI_Player gui_Player2 = new GUI_Player("Niller",0, car2);
//        gui.addPlayer(gui_Player2);
//        gui_Player2.setBalance(1000);



        int facevalue = diceRoll;
        int tile = 1;

        fields[tile].setCar(gui_Player1, true);
        fields[tile].setCar(gui_Player2, true);


        while (true){

            if(gui.getUserLeftButtonPressed("Press left or right","left", "right")){
                fields[tile].removeAllCars();
                tile += facevalue;

                if(tile == 16)
                    tile = 1;

                if((tile==0)||(tile==4)||(tile==8)||(tile==12))
                    tile++;


                fields[tile].setCar(gui_Player1, true);
            }

            else{
                fields[tile].removeAllCars();
                tile -= facevalue;

                if(tile == 0)
                    tile = 15;

                if((tile==0)||(tile==4)||(tile==8)||(tile==12))
                    tile--;


                fields[tile].setCar(gui_Player1, true);

            }
            if(tile==12)
                break;

        }

    }

    public void displayTileText(){

    }


}

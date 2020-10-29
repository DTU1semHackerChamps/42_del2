import java.io.IOException;
import java.util.HashMap;

import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;
public class Main {
    public static void main(String[] args) throws IOException {


        // *********Init board*********
        GUI_Field[] fields = new GUI_Field[16];
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

        //********* Move player *******
        GUI_Player gui_Player1 = new GUI_Player("Brian");
        GUI_Player gui_Player2 = new GUI_Player("Niller");
        int tile = 1;

        fields[tile].setCar(gui_Player1, true);
        fields[tile].setCar(gui_Player2, true);


        while (true){

            if(gui.getUserLeftButtonPressed("Press left or right","left", "right")){
                fields[tile].removeAllCars();
                tile++;

                if(tile == 16)
                    tile = 1;

                if((tile==0)||(tile==4)||(tile==8)||(tile==12))
                    tile++;


                fields[tile].setCar(gui_Player1, true);
            }

            else{
                fields[tile].removeAllCars();
                tile--;

                if(tile == 0)
                    tile = 15;

                if((tile==0)||(tile==4)||(tile==8)||(tile==12))
                    tile--;


                fields[tile].setCar(gui_Player1, true);

            }
            if(tile==12)
                break;

        }








        HashMap<String, String> stringList;
        stringList = Language.languageInit();

        System.out.println(stringList.get("winMessasge"));
        System.out.println(stringList.get("rollMessasge"));
        Dice a = new Dice(0);
        System.out.println(a.rollDice());
        Displaymanager.startScreen(gui);
        Displaymanager.startButton(gui);
        Displaymanager.displayDice(gui,a.getFaceValue(),a.getFavceValue());
    }
}
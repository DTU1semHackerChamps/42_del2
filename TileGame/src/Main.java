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
        Tile[] tileList = Tile.tileListInit();
        HashMap<String,String> stringList = Language.languageInit("english");


        String[] tileTexts = Language.tileTexts(stringList);

        Dice dice1 = new Dice(0);
        Dice dice2 = new Dice(0);
        int sumOfDice;

        GUI_Field[] fields = new GUI_Field[16];
        GUI gui = Displaymanager.initBoard(fields);
        Player player1 = new Player(1000, 1, true, gui.getUserString(stringList.get("typeName1")));
        Player player2 = new Player(1000, 1, false, gui.getUserString(stringList.get("typeName2")));
        Player currentPlayer = new Player(0,0,false,"");
        GUI_Player gui_Player1 = Displaymanager.displayAddPlayer(gui, fields, player1.getPlayerName(), player1.getBalance(), true);
        GUI_Player gui_Player2 = Displaymanager.displayAddPlayer(gui, fields, player2.getPlayerName(), player2.getBalance(), false);

        do{
            player1.setPosition(1);
            player2.setPosition(1);
            player1.setBalance(1000);
            player2.setBalance(1000);
            player1.setPlayerTurn(true);
            player2.setPlayerTurn(false);
            gui_Player1.setBalance(player1.getBalance());
            gui_Player2.setBalance(player2.getBalance());
            Displaymanager.displayPosition(fields, player1.getPosition(), player2.getPosition(), gui_Player1, gui_Player2);
            while(Displaymanager.rollScreen(gui, Displaymanager.displayPlayerTurn(player1.getPlayerTurn(),stringList,player1.getPlayerName(),player2.getPlayerName()), stringList.get("rollButton"))){
                currentPlayer = Player.shiftPlayer(player1, player2);
                sumOfDice = dice1.rollDice() + dice2.rollDice();
                currentPlayer.addPosition(sumOfDice);
                currentPlayer.addBalance(tileList[currentPlayer.getPosition()].getBalanceChange());
                Player.extraTurn(player1, tileList[currentPlayer.getPosition()].isExtraTurn());

                player1.setPosition(player1.getPosition());
                player2.setPosition(player2.getPosition());
                gui_Player1.setBalance(player1.getBalance());
                gui_Player2.setBalance(player2.getBalance());

                Displaymanager.displayPosition(fields, player1.getPosition(), player2.getPosition(), gui_Player1, gui_Player2);
                Displaymanager.displayDice(gui, dice1.getFaceValue(), dice2.getFaceValue());
                Displaymanager.displayTileText(tileTexts,currentPlayer.getPosition(), gui);
                if(currentPlayer.hasWon()){
                    break;
                }
            }

        }while (Displaymanager.winScreen(gui,stringList.get("winScreenMessage"),stringList.get("winTrueButton"), stringList.get("winFalseButton")));
        System.out.println("man");

       // while (!(Displaymanager.winScreen(gui, currentPlayer.hasWon())));*/
    }
}
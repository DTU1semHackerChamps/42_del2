import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    // tests that the program gives the player a balance of 0 if the player goes under 0.
    @Test
    void addBalance() {
        Player testplayer = new Player(1000,1,true,"brian");
        testplayer.addBalance(-1010);
        int balance = testplayer.getBalance();
        assertEquals(0,balance);
    }

    // tests position of a player with a certain facevalue
    @Test
    void addPosition(){
        Player testplayer = new Player(1000,6,true,"brian");
        testplayer.addPosition(12);
        int position = testplayer.getPosition();
        assertEquals(6,position);
    }

    // tests that our won method works
    @Test
    void hasWon(){
        Player testplayer1 = new Player(1000,6,true,"brian");
        Player testplayer2 = new Player(3050,6,true,"frank");
        assertTrue(testplayer2.hasWon());
        assertFalse(testplayer1.hasWon());

    }

    //tests that the program is able to shift player turn correctly
    @Test
    void shiftPlayer(){
        Player testplayer1 = new Player(1000,6,false,"brian");
        Player testplayer2 = new Player(1000,6,true,"frank");
        Player currentPlayer = new Player(0,1,false,"adolf");
        currentPlayer = Player.shiftPlayer(testplayer1,testplayer2);
        assertTrue(currentPlayer.getPlayerTurn());

    }
}
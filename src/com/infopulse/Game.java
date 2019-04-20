package com.infopulse;

import java.io.IOException;

public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() throws IOException {
        while(true){
            if(player1.isFreeCell()){
                player1.step();
            }else{
                System.out.println("draw");
                break;
            }

            if(player1.isWin()){
                System.out.println("player1 is winner");
                break;
            }

            if(player2.isFreeCell()){
                player2.step();
            }else{
                System.out.println("draw");
                break;
            }

            if(player2.isWin()){
                System.out.println("player2 is winner");
                break;
            }

        }
    }
}

package com.infopulse;

public class Field {
    private Cell[][] cells = new Cell[3][3];

    public Field(){
        for(int i = 0; i < 3; i++){
          for(int j = 0; j < 3; j++){
              cells[i][j] = new Cell();
          }
        }
    }

    public boolean isFreeCell(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(cells[i][j].getSymbol() == 'E'){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isThreeSymbolsInLine(char symbol){
        for(int i = 0; i < 3; i++){
            if(cells[i][0].getSymbol() == symbol
               && cells[i][1].getSymbol() == symbol
               && cells[i][2].getSymbol() == symbol){
                return true;
            }
        }

        for(int j = 0; j < 3; j++){
            if(cells[0][j].getSymbol() == symbol
               && cells[1][j].getSymbol() == symbol
               && cells[2][j].getSymbol() == symbol){
                return true;
            }
        }

        if(cells[0][0].getSymbol() == symbol
           && cells[1][1].getSymbol() == symbol
           && cells[2][2].getSymbol() == symbol){
            return true;
        }

        if(cells[0][2].getSymbol() == symbol
           && cells[1][1].getSymbol() == symbol
           && cells[2][0].getSymbol() == symbol){
            return true;
        }
        return false;
    }

    public void step(int i, int j, char symbol){
        cells[i][j].setSymbol(symbol);
    }

    public boolean freeCell(int i, int j){
        if(cells[i][j].getSymbol() == 'E'){
            return true;
        }
        return false;
    }

    public void show(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(cells[i][j].getSymbol());
            }
            System.out.println();
        }
    }

}

package com.infopulse;

import java.io.IOException;

public abstract class Player {
    protected Field field;
    protected char symbol;

    public Player(Field field, char symbol){
        this.field = field;
        this.symbol = symbol;
    }

    public boolean isFreeCell(){
        return field.isFreeCell();
    }

    public abstract void step() throws IOException;

    public boolean isWin(){
        return field.isThreeSymbolsInLine(symbol);
    }
}

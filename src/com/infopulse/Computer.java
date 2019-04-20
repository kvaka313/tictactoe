package com.infopulse;

import java.io.IOException;

public class Computer extends Player{

    public Computer(Field field, char symbol){
        super(field, symbol);
    };

    @Override
    public void step() throws IOException {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(field.freeCell(i, j)){
                    field.step(i, j, symbol);
                    field.show();
                    return;
                }
            }
        }
    }
}

package com.infopulse;

import java.io.IOException;

public class Human extends Player{

    public Human(Field field, char symbol){
        super(field, symbol);
    };

    @Override
    public void step() throws IOException {
        int x = System.in.read()-48;
        System.out.println(x);
        int y = System.in.read()-48;
        System.out.println(y);
        field.step(x,y, symbol);
        field.show();
    }
}

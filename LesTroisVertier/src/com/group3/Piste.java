package com.group3;

import java.awt.*;

public class Piste {
    private Gondel gondel;
    private String name;
    private Color color;
    private int start;
    private boolean isallowed;
    private boolean accessible;

    public Piste(Gondel gondel, String name, Color color, int start) {
        this.gondel = gondel;
        this.name = name;
        this.color = color;
        this.start = start;
        this.isallowed = true;
        this.accessible = true;
    }

    public void disable(int age){
        if(age < 12 && (this.color == Color.RED || this.color == Color.BLACK)){
            this.isallowed = false;
        }
        if(!this.gondel.isActive()){
            this.isallowed = false;
        }
    }

    public String getName() {
        return this.name;
    }

    public boolean getIsAllowed() {
        return this.isallowed;
    }

    public Gondel getGondel() {
        return this.gondel;
    }

    public Color getColor() {
        return this.color;
    }
}

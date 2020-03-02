package com.group3;

public class Gondel {
    private String name;
    private int start;
    private int stop;
    private boolean active;
    private int maxWind;

    public Gondel(String name, int start, int stop, boolean active, int maxWind) {
        this.name = name;
        this.start = start;
        this.stop = stop;
        this.active = active;
        this.maxWind = maxWind;
    }

    public void disable(int windforce) {
        this.active = windforce < this.maxWind;
    }

    public String getName() {
        return this.name;
    }

    public boolean isActive() {
        return this.active;
    }
}

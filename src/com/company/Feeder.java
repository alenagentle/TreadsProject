package com.company;

public class Feeder {

    private int grains = 100;

    public  boolean getOneGrain() throws InterruptedException {
        if (this.grains > 0) {
            Thread.sleep(1000);
            this.grains -= 1;
            return true;
        }
        return false;
    }

    public  int getGrain() {
        return this.grains;
    }

}

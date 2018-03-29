package com.company;

import static java.lang.Thread.sleep;

public class Bird implements Runnable {

    private int grainQuantity;
    private Feeder feeder;

    public Bird(Feeder feeder) {
        this.feeder = feeder;
    }

    public void eatGrain () throws InterruptedException {
        if (feeder.getOneGrain()) {
            this.grainQuantity +=1;
        }
    }

    public void thank() {
        System.out.println("Голубь Геннадий не чирикает! Но милостливо принимает угощение.");
    }

    @Override
    public void run() {
        for (int i=0;i<5;++i) {
            try {
                eatGrain();
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        thank();
    }
}

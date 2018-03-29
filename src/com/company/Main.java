package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            Feeder feeder = new Feeder();
            Thread tr0 = new Thread(new Bird(feeder));
            Thread tr1 = new Thread(new Bird(feeder));
            Thread tr2 = new Thread(new Bird(feeder));
            Thread tr3 = new Thread(new Bird(feeder));
            Thread tr4 = new Thread(new Bird(feeder));
            Thread tr5 = new Thread(new Bird(feeder));
            Thread tr6 = new Thread(new Bird(feeder));
            Thread tr7 = new Thread(new Bird(feeder));
            Thread tr8 = new Thread(new Bird(feeder));
            Thread tr9 = new Thread(new Bird(feeder));
            tr0.start();
            tr1.start();
            tr2.start();
            tr3.start();
            tr4.start();
            tr5.start();
            tr6.start();
            tr7.start();
            tr8.start();
            tr9.start();

            tr0.join();
            tr1.join();
            tr2.join();
            tr3.join();
            tr4.join();
            tr5.join();
            tr6.join();
            tr7.join();
            tr8.join();
            tr9.join();
            System.out.println("Осталось: " + feeder.getGrain());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

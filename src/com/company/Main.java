package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
//
        DrinkDispenser cliffsDispenser = new DrinkDispenser(5, 8, 12);

        cliffsDispenser.small.refill(20);
        cliffsDispenser.medium.refill(15);
        cliffsDispenser.large.refill(12);

        cliffsDispenser.addSyrup(new Syrup("Purple Drink", 1000));
        cliffsDispenser.addSyrup("Blue Drink", 600);
        cliffsDispenser.addSyrup(new Syrup("Orange", 750));
        cliffsDispenser.addSyrup("Dr. Cliff", 112);

        System.out.printf("m cups: %d\tdrink 3 vol: %d\n", cliffsDispenser.medium.qty, cliffsDispenser.syrups.get(3).getVol());
        cliffsDispenser.serveDrink("M", 3);
        System.out.printf("m cups: %d\tdrink 3 vol: %d\n", cliffsDispenser.medium.qty, cliffsDispenser.syrups.get(3).getVol());
        System.out.println(cliffsDispenser.lowSyrups(100));
        cliffsDispenser.serveDrink("L", 3);
        System.out.println(cliffsDispenser.lowSyrups(100));
    }
}

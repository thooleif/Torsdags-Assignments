package Opgave2;

public class Contest {
    Animal animal1;
    Animal animal2;
    int round = 1;

    Contest(Animal animal1, Animal animal2){
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    void playRound(){
        System.out.println("\n --- Round " + round + " ---");
        int dmg1 = animal1.attack();
        animal2.setEnergy(animal2.getEnergy() - dmg1);
        System.out.println(animal1.getName() + " attacks " + animal2.getName() + " for " + dmg1 + "! (" +
                animal2.getName() + " has " + animal2.getEnergy() + " energy left)");

        if(!animal2.isActive()) return;

        int dmg2 = animal2.attack();
        animal1.setEnergy(animal1.getEnergy() - dmg2);
        System.out.println(animal2.getName() + " attacks " + animal1.getName() + " for " + dmg2 + "! (" +
                animal1.getName() + " has " + animal1.getEnergy() + " energy left)");

        round++;
    }

    Animal getWinnner(){
        if(!animal1.isActive()) return animal2;
        if(!animal2.isActive()) return animal1;

        return null;
    }
}

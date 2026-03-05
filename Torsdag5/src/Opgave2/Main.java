package Opgave2;

import java.util.ArrayList;

public class Main {
    void main(){

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Lion("Scar", 90));
        animals.add(new Wolf("Luna", 60));
        animals.add(new Rabbit("Snow"));
        animals.add(new Wolf("Solar", 70));

        for(int i = 0; i < animals.size(); i += 2){
            Animal animal1 = animals.get(i);
            Animal animal2 = animals.get(i + 1);
            System.out.println("\n--- Fight: " + animal1 + " vs " + animal2 + " ---");
            Contest contest = new Contest(animal1, animal2);
            while(contest.getWinnner() == null){
                contest.playRound();
            }
            System.out.println("Winner: " + contest.getWinnner());
        }
    }
}

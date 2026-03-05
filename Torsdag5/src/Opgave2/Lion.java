package Opgave2;

public class Lion extends Animal{

    Lion(String name, int energy){
        super(name, energy);
    }

    @Override
    public int attack(){
        return 15;
    }
}

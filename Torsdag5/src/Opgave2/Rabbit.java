package Opgave2;

public class Rabbit extends Animal{

    Rabbit(String name){
        super(name, 60);
    }

    @Override
    public int attack(){
        return 4;
    }
}

package Opgave2;

public abstract class Animal {
    String name;
    int energy;

    Animal(String name, int energy){
        this.name = name;
        this.energy = energy;
    }

    String getName(){
        return name;
    }

    int getEnergy(){
        return energy;
    }

    void setEnergy(int energy) {
        this.energy = energy;
    }

    boolean isActive(){
        return energy > 0;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + " \"" + name + "\" (energy: " + energy + ")";
    }

    public abstract int attack();
}

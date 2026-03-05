package Opgave1;

public class Lamp {
    int watt;
    boolean isOn;

    Lamp(int watt){
        this.watt = watt;
        this.isOn = false;
    }

    void turnOn(){
        isOn = true;
    }

    void turnOff(){
        isOn = false;
    }

    int getWatt(){
        return watt;
    }

    @Override
    public String toString(){
        return watt + "W";
    }

}

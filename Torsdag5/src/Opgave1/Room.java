package Opgave1;

import java.util.ArrayList;

public class Room {
    String name;
    ArrayList<Lamp> lamps;
    ArrayList<Window> windows;

    Room(String name){
        this.name = name;
        lamps = new ArrayList<>();
        windows = new ArrayList<>();
    }

    void addLamp(Lamp lamp){
        lamps.add(lamp);
    }

    void addWindow(Window window){
        windows.add(window);
    }

    int getLampCount(){
        return lamps.size();
    }

    int getTotalWatt(){
        int totalWatt = 0;
        for(Lamp lamp : lamps){
            totalWatt += lamp.getWatt();
        }
        return totalWatt;
    }

    int getTotalWindowArea(){
        int totalWindowArea = 0;
        for(Window window : windows){
            totalWindowArea += window.getAreaCm2();
        }
        return totalWindowArea;
    }

    void printRoom(){
        System.out.println("Room: " + name);
        System.out.println("Lamps: ");
        for(Lamp lamp : lamps){
            System.out.println(" " + lamp);
        }
        System.out.println("Window: ");
        for(Window window : windows){
            System.out.println(" " + window);
        }
        System.out.println("Total watt: " + getTotalWatt() + "W");
        System.out.println("Total window area: " + getTotalWindowArea() + "cm2");
        System.out.println();
    }
}

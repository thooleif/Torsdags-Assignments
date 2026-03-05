package Opgave1;

import java.util.ArrayList;

public class Building {
    String name;
    ArrayList<Room> rooms;

    Building(String name){
        this.name = name;
        rooms = new ArrayList<>();
    }

    void addRoom(Room room){
        rooms.add(room);
    }

    int getTotalLampCount(){
        int totalLamps = 0;
        for(Room room : rooms){
            totalLamps += room.getLampCount();
        }
        return totalLamps;
    }

    int getTotalWatt(){
        int totalWatt = 0;
        for(Room room : rooms){
            totalWatt += room.getTotalWatt();
        }
        return totalWatt;
    }

    void printBuilding(){
        System.out.println("Building: " + name);
        System.out.println();
        for(Room room : rooms){
            room.printRoom();
        }
        System.out.println("Total: " + getTotalLampCount() + " lamps, " + getTotalWatt() + "W");

    }
}

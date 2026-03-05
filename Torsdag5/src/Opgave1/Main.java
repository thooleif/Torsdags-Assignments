package Opgave1;

public class Main {
    void main(){

        Building building = new Building("Office Building");

        Room office = new Room("Office Room");
        office.addLamp(new Lamp(40));
        office.addLamp(new Lamp(40));
        office.addLamp(new Lamp(60));
        office.addWindow(new Window(70, 80));
        office.addWindow(new Window(70, 80));
        office.addWindow(new Window(70, 80));
        office.addWindow(new Window(70, 80));

        Room meeting = new Room("Meeting Room");
        meeting.addLamp(new Lamp(80));
        meeting.addLamp(new Lamp(80));
        meeting.addLamp(new Lamp(40));
        meeting.addWindow(new Window(100, 110));
        meeting.addWindow(new Window(100, 110));

        Room cafeteria = new Room("Cafeteria");
        cafeteria.addLamp(new Lamp(80));
        cafeteria.addLamp(new Lamp(80));
        cafeteria.addWindow(new Window(70, 80));

        building.addRoom(office);
        building.addRoom(meeting);
        building.addRoom(cafeteria);

        building.printBuilding();
    }
}

package developer.arifkhan;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling=new Ceiling(12,55);
        Bed bed=new Bed("Mordern",2,3,2,1);
        Lamp lamp=new Lamp("Classic",false,75);

        BedRoom bedRoom=new BedRoom("ArifKhan",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
       bedRoom.makeBed();
       bedRoom.getLamp().turnOn();


    }
}

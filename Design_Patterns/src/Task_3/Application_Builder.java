package Task_3;

public class Application_Builder {
    public static void main(String[] args) {
        House house = new HouseBuilderImpl().setWalls(4).setDoors(2).setWindows(4).setType("WithGarage").build();
        house.print();
    }
}

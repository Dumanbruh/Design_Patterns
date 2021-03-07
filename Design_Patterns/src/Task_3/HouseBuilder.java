package Task_3;

public interface HouseBuilder {
    HouseBuilder setWalls(int walls);
    HouseBuilder setDoors(int doors);
    HouseBuilder setWindows(int windows);
    HouseBuilder setType(String type);
    House build();
}

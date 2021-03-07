package Task_3;

public class HouseBuilderImpl implements HouseBuilder {
    House house = new House();

    @Override
    public HouseBuilder setWalls(int walls) {
        house.walls = walls;
        return this;
    }

    @Override
    public HouseBuilder setDoors(int doors) {
        house.doors = doors;
        return this;
    }

    @Override
    public HouseBuilder setWindows(int windows) {
        house.windows = windows;
        return this;
    }

    @Override
    public HouseBuilder setType(String type) {
        house.type = type;
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}

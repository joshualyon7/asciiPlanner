import java.util.UUID;

public class Plant{
    UUID id;
    int x;
    int y;
    PlantRecord plantType;

    public Plant(PlantRecord r, int x, int y){
        plantType = r;
        this.x = x;
        this.y = y;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

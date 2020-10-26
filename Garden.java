import java.util.HashMap;
import java.util.UUID;

public class Garden {
    HashMap<UUID, Plant> plantList = new HashMap<UUID, Plant>();
    Season curSeason = Season.fall;
    String title;
    String description = "";
    int rating = 0;
    int length;
    int width;

    public HashMap<UUID, Plant> getPlantList() {
        return plantList;
    }

    public void setPlantList(HashMap<UUID, Plant> plantList) {
        this.plantList = plantList;
    }

    public Season getCurSeason() {
        return curSeason;
    }

    public void setCurSeason(Season curSeason) {
        this.curSeason = curSeason;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

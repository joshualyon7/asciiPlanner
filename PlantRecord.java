public class PlantRecord {
    String name;
    String sciName;
    String type;
    String color;
    Season growthSeason;
    String light; 
    String water;
    String bloomTime;

    public String toString(){
        return name + "(" + sciName + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSciName() {
        return sciName;
    }

    public void setSciName(String sciName) {
        this.sciName = sciName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Season getGrowthSeason() {
        return growthSeason;
    }

    public void setGrowthSeason(Season growthSeason) {
        this.growthSeason = growthSeason;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getBloomTime() {
        return bloomTime;
    }

    public void setBloomTime(String bloomTime) {
        this.bloomTime = bloomTime;
    }
}

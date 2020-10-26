import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

public class Model {
    HashMap<String, PlantRecord> plantDatabase = new HashMap<String, PlantRecord>();
    HashMap<String, Garden> gardenList = new HashMap<String, Garden>();
    Garden curGarden;

    public Model() {
        curGarden = new Garden();
        gardenList.put(curGarden.description, curGarden);
    }

    //reads in plant data from a csv
    public void loadPlants(String filename) throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader(filename));
        String row;
        while ((row = csvReader.readLine()) != null) {
            PlantRecord newRecord = new PlantRecord();
            String[] plantData = row.split(",");
            newRecord.setName(plantData[0]);
            newRecord.setSciName(plantData[1]);
            newRecord.setType(plantData[2]);
            newRecord.setColor(plantData[3]);
            plantDatabase.put(newRecord.getName(), newRecord);
        }
        csvReader.close();
        
    }

    public void addPlant(Plant p){
        curGarden.getPlantList().put(p.getId(), p);
    }

    public void deletePlant(UUID id){
        curGarden.getPlantList().remove(id);
    }


    /*<getters and setters>*/
    public HashMap<String, PlantRecord> getPlantDatabase() {
        return plantDatabase;
    }

    public void setPlantDatabase(HashMap<String, PlantRecord> plantDatabase) {
        this.plantDatabase = plantDatabase;
    }

    public HashMap<String, Garden> getGardenList() {
        return gardenList;
    }

    public void setGardenList(HashMap<String, Garden> gardenList) {
        this.gardenList = gardenList;
    }

    public Garden getCurGarden() {
        return curGarden;
    }

    public void setCurGarden(Garden curGarden) {
        this.curGarden = curGarden;
    }
    /*</getters and setters>*/
}
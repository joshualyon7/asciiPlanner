import java.util.HashMap;

public class View {

    public void printWelcome(){
        System.out.println("Welcome to the ASCII Garden Designer!");
        System.out.println("Please enter a title for your new garden: ");
    }

    public void printEnterDimensions(){
        System.out.println("Please enter your garden's dimensions: ");
    }

    public void printOptions(){
        System.out.println("\n**** MAIN MENU ****");
        System.out.println("Please select an option: ");
        System.out.println("1: load plant data");
        System.out.println("2. get garden's dimensions");
        System.out.println("3. add plant to garden");
        System.out.println("4. select existing plant");
        System.out.println("5. delete plant from garden");
        System.out.println("6. move existing plant in garden");
        System.out.println("7. print all plants/locations");
        System.out.println("8. exit");
    }

    public void printLoadPlants(){
        System.out.println("enter the name of a csv file");
    }

    public void printGetDimensions(){

    }

    public void printAddPlant(HashMap<String, PlantRecord> plantList){
        int i = 1;
        System.out.println("select a plant to add to the garden :\n");
        for(PlantRecord p : plantList.values()){
            System.out.println(i + ": " + p);
            i++;
        }
        System.out.println("\n");
    }

    public void printDeletePlant(){
        
    }

    public void printMovePlant(){
        
    }

    public void printPrintAll(){
        
    }

    public void printGoodbye(){
        System.out.println("Thanks for using the ASCII Garden Designer!\nGoodbye!");
    }

    public void printDimensions(int len, int wid){
        System.out.println("your garden's dimensions are: " + len + " x " + wid);
    }

}

import java.io.IOException;
import java.util.Scanner;

public class Controller {
    Model model;
    View view;
    Scanner prompt = new Scanner(System.in);

    public static void main(String[] args) {
        Controller c = new Controller();
        c.model = new Model();
        c.view = new View();
        
        c.setupGarden();
        c.optionLoop();
        c.prompt.close();
        c.view.printGoodbye();
    }

    public void setupGarden() {
        view.printWelcome();
        model.getCurGarden().setTitle(prompt.next());
        view.printEnterDimensions();
        boolean running = true;
        while(running){

            prompt.nextLine();
            System.out.println("length: ");
            if(!prompt.hasNextInt()){
                System.out.println("please enter a valid integer");
                continue;
            }
            else{
                model.getCurGarden().setLength(prompt.nextInt());
            }

            System.out.println("width: ");
            prompt.nextLine();
            if(!prompt.hasNextInt()){
                System.out.println("please enter a valid integer");
                continue;
            }
            else{
                model.getCurGarden().setWidth(prompt.nextInt());
                running = false;
            }

        }

        System.out.println("\nyour garden's dimensions are: " + model.getCurGarden().getLength() + " x " + model.getCurGarden().getWidth() + "\n");
    }

    private void optionLoop(){
        boolean running = true;
        int option;
        while(running){
            view.printOptions();
            
            if(!(prompt.hasNextInt() && (option = prompt.nextInt()) > 0 && option < 8)){
                System.out.println("please enter a valid option");
                continue;
            }

            switch (option) {
                case 1:
                    loadPlants();
                    System.out.println("plants loaded.");
                    break;
                case 2:
                    getDimensions();
                    break;
                case 3:
                    addPlant();
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    return; 
                default:
                    break;
            }
        }
    }

    public void loadPlants(){
        view.printLoadPlants();
        String filename = prompt.next();
        try {
            model.loadPlants(filename);
        } catch (IOException e) {
            System.out.println("\nINVALID FILE");
            System.out.println("contents must be in the format: \n<name>,<scientific-name>,<type>,<color>\n");
        }
        
    }

    public void getDimensions(){
        view.printDimensions(model.getCurGarden().getLength(), model.getCurGarden().getWidth());
    }

    public void addPlant(){
        view.printAddPlant(model.getPlantDatabase());
        boolean validPlant = false;
        String chosen;
        int x = 0;
        int y = 0;
        while(!validPlant){
            chosen = prompt.nextLine();
            if(!(model.getPlantDatabase().containsKey(chosen))){
                System.out.println("please enter a valid plant name");
                continue;
            }
            else{
                validPlant = true;
                boolean validCoor = false;
                while(!validCoor){
                    System.out.println("enter the x and y coordinates for your new plant: ");
                    System.out.println("x: ");
                    x = prompt.nextInt();
                    if(!prompt.hasNextInt()){
                        System.out.println("enter a valid x coordinate");
                        continue;
                    }
                    if(!(x > 0) || !(x <= model.getCurGarden().getWidth())){
                        System.out.println("please enter an x coordinate within your garden's dimensions.");
                        getDimensions();
                        continue;
                    }
                    else{
                        System.out.println("y: ");
                        y = prompt.nextInt();
                        if(!prompt.hasNextInt()){
                            System.out.println("enter a valid x coordinate");
                            continue;
                        }
                        if(!(y > 0) || !(y <= model.getCurGarden().getLength())){
                            System.out.println("please enter an y coordinate within your garden's dimensions.");
                            getDimensions();
                            continue;
                        }
                        validCoor = true;
                    }
                }
                
                model.addPlant(new Plant(model.getPlantDatabase().get(chosen), x, y));
                
            }
        }
    }

}

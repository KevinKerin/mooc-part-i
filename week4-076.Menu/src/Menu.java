
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal){
        if(meals.contains(meal)){
            System.out.println("Meal is already in list");
        } else {
            meals.add(meal);
        }
    }
    
    public void printMeals(){
        for (String str : meals){
            System.out.println(str);
        }
    }
    
    public void clearMenu(){
        meals.clear();
    }
            
}

import java.util.ArrayList;
public class CafeUtil {



    public static int getStreakGoal(){
        int suma = 0;
        
        for(int i = suma; i < 11; i++){
            suma += i;
        }
        return suma;
    } 

    public static double getOrderTotal(double[] prices){
        
        double suma = 0;

        for(double price: prices){
            suma += price;
        }
        return suma;
    } 
    public static void displayMenu(ArrayList<String> menuItems){
        
        for(int i = 0; i < menuItems.size(); i++ ){ 
            System.out.println(menuItems.get(i));
        }
    }    
    
    public static void addCustomers(ArrayList<String> customers){
        
        System.out.println("Por favor ingresa tu nombre: ");
        String userName = System.console().readLine();
        System.out.println("Hola,"+ userName);
        System.out.println("hay "+ customers.size()+" personas frente a ti");

        customers.add(userName);
        System.out.println(customers);



    }


}      
        
    




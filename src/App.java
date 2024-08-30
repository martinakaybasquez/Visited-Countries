import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String filler;

        // LIST OF THE HOMIES
        ArrayList<String> homies = new ArrayList<>
        (List.of("Martittie El Jefe", "Bri Bri", "Benji", "Chicago Fling", "Pollyana", "Hillybob"));
        // // DISPLAYING LIST JUST TO SEE 
        // for (String h : homies) {
        //     System.out.println(h);
        // }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
       
        // LIST OF THE PLACES THE HOMIES HAVE BEEN
        ArrayList<HashSet<String>> places = new ArrayList<>();
        places.add(new HashSet<>(List.of("Philippines", "Singapore", "Mexico", "Japan", "United Kingdom", "Canada", "United States"))); // Martina
        places.add(new HashSet<>(List.of("Mexico", "Peru", "United States"))); // Breanna
        places.add(new HashSet<>(List.of("Mexico", "United Kingdom", "Belgium", "France", "Netherlands", "China", "United States"))); // Benjamin
        places.add(new HashSet<>(List.of("Vietman", "Taiwan", "France", "China", "Mexico" ,  "United States" ))); // Hehe 
        places.add(new HashSet<>(List.of("Canada", "Mexico", "France", "United States"))); // Pollyana
        places.add(new HashSet<>(List.of("Lebanon", "Mexico", "United Kingdom", "United States" ))); // Hillybob 
        // // DISPLAYING LIST JUST TO SEE
        //  for (HashSet<String> p : places) {
        //     System.out.println(p);
        // }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Please make a selection:");
        System.out.println("(A) Search for people whomst visited a specific country");
        System.out.println("(B) Add a country a homie has been to");
        System.out.println("(C) List the countries a homie has been to");
        String userInput = sc.nextLine().toLowerCase().trim();

        if (userInput.equals("a")){
            System.out.println("Which country would you like to choose?");
            userInput = sc.nextLine();
            for (int a = 0; a <places.size(); a++){
                if (userInput.equals("mexico")){
                    System.out.println(homies.get(a));
                }
                else if (userInput.equals("canada")){
                    System.out.println(homies.get(a));
                }
                else if (userInput.equals("united states")){
                    System.out.println(homies.get(a));
                }
                else if (userInput.equals("united kingdom")){
                    System.out.println(homies.get(a));
                }
                else if (userInput.equals("china")){
                    System.out.println(homies.get(a));
                }
                else if (userInput.equals("france")){
                    System.out.println(homies.get(a));
                }
                }
            }
        
        if (userInput.equals("b")){
            System.out.println("You wanna know where a homie has been. Which homie do you choose?");
            userInput = sc.nextLine();
            for (String h : homies){
                if (userInput.contains("martina")){
                   
                }
            }
            }
           

































        }
}

// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//                                                          CODE GRAVEYARD       
/*
userInput = sc.nextLine().toLowerCase().trim();
for (int i = 0; i < places.size(); i++){
    String mexico = (userInput.equals("mexico") ? (homies.get(i)) : null);
    System.out.println(mexico);
}
for (int i = 0; i < places.size(); i++){
    String ohCanada = (userInput.equals("canada") ? (homies.get(i)) : null);
    System.out.println(ohCanada);
}
for (int i = 0; i < places.size(); i++){
    String china = (userInput.equals("china") ? (homies.get(i)) : null);
    System.out.println(china); 
}
for (int i = 0; i < places.size(); i++){
    String france = (userInput.equals("france") ? (homies.get(i)) : null);
    System.out.println(france);
}
for (int i = 0; i < places.size(); i++){
    String unitedStates = (userInput.equals("united states") ? (homies.get(i)) : null);
    System.out.println(unitedStates);

}
for (int i = 0; i < places.size(); i++){
    String unitedKingdom = (userInput.equals("united kingdom") ? (homies.get(i)) : null);
    System.out.println(unitedKingdom); 
}
*/

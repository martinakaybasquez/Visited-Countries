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
        // [0] = martina
        // [1] = breanna
        // [2] = benjamon
        // [3] = HAHAHAHAH
        // [4] = pj
        // [5] = hadil
        
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
            System.out.println("A homie is missing a passport stamp! Let's fix that! Which homie is missing a stamp?");
            userInput = sc.nextLine();
            if (userInput.contains("martina")){
                 System.out.println("Where did Martina go?:");
                 userInput = sc.nextLine();
                 places.get(0).add(userInput); 
            }
            if (userInput.contains("breanna")){
                System.out.println("Where did Breanna go?:");
                userInput = sc.nextLine();
                places.get(1).add(userInput); 
           }
           if (userInput.contains("benjamin")){
            System.out.println("Where did Benjamin go?:");
            userInput = sc.nextLine();
            places.get(2).add(userInput); 
            }
            if (userInput.contains("chicago")){
                System.out.println("Where did [unknown]] go?:");
                userInput = sc.nextLine();
                places.get(3).add(userInput); 
            }
            if (userInput.contains("pollyana")){
                System.out.println("Where did Pj go?:");
                userInput = sc.nextLine();
                places.get(4).add(userInput); 
            }
            if (userInput.contains("hadil")){
                System.out.println("Where did Hadil go?:");
                userInput = sc.nextLine();
                places.get(5).add(userInput); 
            }
        }

        String individualHomies = homies.get(0);
        HashSet<String> homiesPlaces = places.get(0);

        if (userInput.equals("c")){
            System.out.println("You wanna know where a homie has been. Which homie do you choose?");
            userInput = sc.nextLine();
            if (userInput.contains("martina")){
                System.out.println("Martina has been to:");
                for (String c : homiesPlaces){
                    System.out.println(c);
                }
            }
        if (userInput.contains("breanna")){
            individualHomies = homies.get(1);
            homiesPlaces = places.get(1);
            System.out.println("Breanna has been to:");
            for (String c : homiesPlaces){
                System.out.println(c);
            }
        }
        if (userInput.contains("benjamin")){
            individualHomies = homies.get(2);
            homiesPlaces = places.get(2);
            System.out.println("Benjamin has been to:");
            for (String c : homiesPlaces){
                System.out.println(c);
            }
        }
        if (userInput.contains("chicago")){
            individualHomies = homies.get(3);
            homiesPlaces = places.get(3);
            System.out.println("[unknown] has been to:");
            for (String c : homiesPlaces){
                System.out.println(c);
            }
        }
        if (userInput.contains("pollyana")){
            individualHomies = homies.get(4);
            homiesPlaces = places.get(4);
            System.out.println("Pj has been to:");
            for (String c : homiesPlaces){
                System.out.println(c);
            }
        }
        if (userInput.contains("hadil")){
            individualHomies = homies.get(5);
            homiesPlaces = places.get(5);
            System.out.println("Hadil has been to:");
            for (String c : homiesPlaces){
                System.out.println(c);
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

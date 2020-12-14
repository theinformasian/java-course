// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
      System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
    Scanner keyboard = new Scanner(System.in);
    
    String firstName; // User's first name
    String itemOrder; // Item ordered
    String frostingType; // Frosting ordered
    String fillingType; // Filling ordered
    String toppings; // Toppings ordered
    String input;  // User input
   
    double cost = 15.00; // cost of cake + cupcakes
    final double TAX_RATE = .08; // sales tax rate, must be california
    double tax; // amount of tax for order
    
    // Introduce shop and prompt user to input first name
      
    System.out.println("Welcome to Java's Cake & Cupcake Shop!");
    System.out.println("We make custom cakes with our secret cake batter!");
	  
    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
   
	  System.out.println("What is your first name? ");
    firstName = "Mina"; // keyboard.nextLine();

    System.out.println(firstName + ", please see our menu below:\n");
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU

    System.out.println("_______________________________________________");      
    System.out.println("        MENU         QUANTITY    BASE COST  ");
    System.out.println("_______________________________________________"); 
    System.out.println("        Cake             1            $15     ");
    System.out.println("   Set of Cupcakes       6            $15     ");
    System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
    System.out.println("Frostings (vanilla, chocolate, strawberry, coco)");
    System.out.println("Fillings (mocha, mint, lemon, caramel, vanilla)");
    System.out.println("Toppings (sprinkles, cinnamon, cocoa, nuts)");
    System.out.println("_______________________________________________");
    
    String[][] menu;
    String[] frostingsMenu = {"frostings:", "vanilla", "chocolate", "strawberry", "coconut"};
    String[] fillingsMenu = {"fillings:", "mocha", "mint", "lemon", "caramel", "vanilla"};
    String[] toppingsMenu = {"toppings:", "sprinkles", "cinnamon", "cocoa", "nuts"};


    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

    System.out.println("Do you want CUPCAKES or a CAKE?");
    itemOrder = "cake"; // keyboard.nextLine();
    System.out.println("One " + itemOrder + ", coming right up.");
	  
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

    System.out.println("What type of FROSTING do you want? ");
    System.out.println("Vanilla, Chocolate, Strawberry or Coco");
    frostingType = "coco"; // keyboard.nextLine();
    System.out.println(frostingType + " it is.");

    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING

    System.out.println("What type of FILLING do you want? ");
    String fillingText = "";
    for (String s : fillingsMenu){ fillingText+=s + "  "; }
    System.out.println(fillingText);
    fillingType = "vanilla"; //keyboard.nextLine();
    System.out.println("We'll make sure it's full of " + fillingType + " for you.");
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS
    System.out.println("What type of TOPPINGS do you want? ");
    System.out.println("Sprinkles, Cinnamon, Cocoa, Nuts");
    toppings = "Nuts"; //keyboard.nextLine();      
    System.out.println("Covered in " + toppings + ", got it!");

    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION
    
    System.out.println();
    System.out.println(firstName + ", your order is as follows:");
    System.out.println("_________________________________________");
    System.out.println("Item Ordered: " + itemOrder);
    System.out.println(frostingsMenu[0] + " " + frostingType);
    System.out.println(fillingsMenu[0] + " " + fillingType);
    System.out.println(toppingsMenu[0] + " " + toppings);
    System.out.println("_________________________________________");
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX

    System.out.printf("The cost of your order is: $%.2f\n", cost);
  
    }   

    /* Compares user input with the menu options */
    private static boolean inputValidation(String input, String[] source){
      // TODO match input against correct list of options
      // TODO fuzzy match to an option, ask for confirmation if more than one equal match
      return true;
    }
}
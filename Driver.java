// SNHU IT 145 Project Two
// Driver.java
// Modifications 2022 June 19 Mary Visser

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	// Implemented arrayLists for Monkeys and Dogs
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
	

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);		// Scanner object created 
       String menuChoice = "go";							// Local variable set to accept user input						

        initializeDogList();
        initializeMonkeyList();
        
        // Start loop 
        // TODO: Consider to refactor to a switch statement
        	// If we have booleans, switch block not possible
        	// reserved is boolean
        
        // Gets menu choice from user
        //while (!menuChoice.equalsIgnoreCase("q")) 
        do { 
        	displayMenu();
            menuChoice = scanner.nextLine();
	        // Conditional statements to accept user input and call appropriate method
            
            // FIXME switch case
            /*
            switch (menuChoice) {
            case 1:
                intakeNewDog(scanner);
             case 2:
                intakeNewMonkey(scanner);
             case 3:
                reserveAnimal(scanner);
             case 4:
                printAnimals();
             case 5:
                printAnimals();
             case 6:
                printAnimals();
             case 'q':
                break;
             default:
                System.out.println("Enter valid input");
	       	*/
            
            
            if(menuChoice.equals("1")) {
	        	intakeNewDog(scanner);
	        }
	        else if(menuChoice.equals("2")) {
	        	intakeNewMonkey(scanner);
	        }
	        else if(menuChoice.equals("3")) {
	        	reserveAnimal(scanner);
	        }
	        else if(menuChoice.equals("4")) {
	        	printAnimals(scanner);
	        }
	        else if(menuChoice.equals("5")) {
	        	printAnimals(scanner);
	        }
	        else if(menuChoice.equals("6")) {
	        	printAnimals(scanner);

	        }
	        else if(menuChoice.equalsIgnoreCase("q")) {
	        	return;
	        }
	        else {
	        	System.out.println("Please make a valid selection from the menu, thank you");
	        }
	        
        }
        while (!menuChoice.equalsIgnoreCase("q"));
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // TODO: project two
    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {

    }

    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        
        System.out.println("What breed is the dog?");
        String animalType = scanner.nextLine();
			
    	System.out.println("Enter the dog's gender:\n");								
        String gender = scanner.nextLine();
        
        System.out.println("Enter the dog's age:\n");
        String age = scanner.nextLine();
        
        System.out.println("Enter the dog's weight:\n");
        String weight = scanner.nextLine();
        
        System.out.println("Enter date dog was aquired:\n");
        String acquisitionDate = scanner.nextLine();
        
        System.out.println("Enter the country in which the dog was aquired:\n");
        String acquisitionCountry = scanner.nextLine();
        
        System.out.println("What is the dog's training status?  "
        		+ "Enter INTAKE, IN-SERIVCE, or FARM");
        String trainingStatus = scanner.nextLine();
        	// Conditional statement for animals that are actively in service, 
        	// or if user input incorrect choice
        	/*
        	boolean reserved = false;
        	if(trainingStatus.equalsIgnoreCase("IN-SERVICE") {
        		System.out.println("Is the monkey reserved? YES or NO:\n");
                String inputReserved = scanner.nextLine();
                	// Conditional statement to check if animal 
                	// is reserved and set boolean to T or F
                	if(inputReserved.equalsIgnoreCase("YES")) {
                		reserved = true;
                	}
                
                System.out.println("Enter the name of the country the animal is in service:\n");
                String inServiceCountrys = scanner.nextLine();
        	}
        	else if(trainingStatus != "INTAKE" || trainingStatus != "FARM") {
        		System.out.println("Please enter a valid training status:\n");
        	}
        	*/
        
        System.out.println("Is the dog reserved? Enter 'true' or 'false':\n");
        boolean reserved = scanner.nextBoolean();
        
        System.out.println("Enter name of country where dog is in service:\n");
        String inServiceCountry = scanner.nextLine();

        // Instantiate a new dog and add it to the appropriate list
        Dog dog1 = new Dog(name, animalType, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        dogList.add(dog1);
    }

	    // Validate input to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String monkeyName = scanner.nextLine();
            // Check if monkey is already in system
            for(Monkey monkey: monkeyList ) {
            	if(monkey.getName().equalsIgnoreCase(monkeyName)) {
            		System.out.println("\n\nThis monkey is already in our system\n\n");
            		return; // returns to menu
            	}
            }
            
            
            System.out.println("What is the monkey's tail length?\n");
            String tailLength = scanner.nextLine();
            
            System.out.println("What is the moneky's height?\n");
            String height = scanner.nextLine();
            
            System.out.println("What is the monkey's body length?");
            String bodyLength = scanner.nextLine();
            
            System.out.println("What type of species is the monkey?");
            String species = scanner.nextLine();
            	// FIXME: loop continue
            	// Conditional statement to check if the 
            	// monkey species is acceptable for training
            	if(!species.equalsIgnoreCase("Tamarin") && !species.equalsIgnoreCase("Squirrel monkey") && !species.equalsIgnoreCase("Marmoset")
                        && !species.equalsIgnoreCase("Macaque") && !species.equalsIgnoreCase("Capuchin")) {
                        System.out.println("Sorry, this monkey is not eligable for training."); 
                        return;
                      }
				
        	System.out.println("Enter the monkey's gender:\n");								
            String gender = scanner.nextLine();
            
            System.out.println("Enter the monkey's age:\n");
            String age = scanner.nextLine();
            
            System.out.println("Enter the monkey's weight:\n");
            String weight = scanner.nextLine();
            
            System.out.println("Enter date monkey was aquired:\n");
            String acquisitionDate = scanner.nextLine();
            
            System.out.println("Enter the country in which the monkey was aquired:\n");
            String acquisitionCountry = scanner.nextLine();
            
            System.out.println("What is the monkey's training status?  "
            		+ "Enter INTAKE, IN-SERIVCE, or FARM");
            String trainingStatus = scanner.nextLine();
            	// Conditional statement for animals that are actively in service, 
            	// or if user input incorrect choice
            	/*
            	boolean reserved = false;
            	if(trainingStatus.equalsIgnoreCase("IN-SERVICE") {
            		System.out.println("Is the monkey reserved? YES or NO:\n");
                    String inputReserved = scanner.nextLine();
                    	// Conditional statement to check if animal 
                    	// is reserved and set boolean to T or F
                    	if(inputReserved.equalsIgnoreCase("YES")) {
                    		reserved = true;
                    	}
                    
                    System.out.println("Enter the name of the country the animal is in service:\n");
                    String inServiceCountrys = scanner.nextLine();
            	}
            	else if(trainingStatus != "INTAKE" || trainingStatus != "FARM") {
            		System.out.println("Please enter a valid training status:\n");
            	}
            	*/
            
            System.out.println("Is the monkey reserved? Enter 'true' or 'false':\n");
            boolean reserved = scanner.nextBoolean();
            
            System.out.println("Enter name of country where monkey is in service:\n");
            String inServiceCountry = scanner.nextLine();
			
            // Create monkey object
            Monkey monkey1 = new Monkey(monkeyName, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry, tailLength, height, bodyLength, species);
            
            monkeyList.add(monkey1);
            
            for(Monkey m:monkeyList) {
                System.out.println(m);
              }
        }
        
        // Find and reserve available animals by type and country
        public static void reserveAnimal(Scanner scanner) {
            // boolean animalFound = false;
            System.out.println("Enter animal type you would like to reserve:");
          	String reserveType = scanner.nextLine();
          	System.out.println("Enter animal service country: ");
          	String reserveCountry = scanner.nextLine();
                               
            if (reserveType.equalsIgnoreCase("monkey")) {
            	for(Monkey m:monkeyList ) {
            		if (!m.getReserved() && m.getInServiceLocation().equalsIgnoreCase(reserveCountry)) {
            			System.out.println("Animal reserved");
                        m.setReserved(true);
                      	return;
            		}
            	}
            } else {
              	for(Dog d:dogList) {
                  if (!d.getReserved() && d.getInServiceLocation().equalsIgnoreCase(reserveCountry)) {
                    System.out.println("Animal reserved");
                    d.setReserved(true);
                    return;
                  }
                }
              // Do the same thing in here for dogs that we do for monkeys.
            }
                               
            System.out.println("Animal not found");

        }

        // printAnimals provides four different outputs
        public static void printAnimals(Scanner scanner) {
            System.out.println("Enter which list you would like printed out:\nDOGS, MONKEYS, or IN-SERVICE: ");
            String userListSelection = scanner.nextLine();
            
            // Prints list of dogs
            if(userListSelection.equalsIgnoreCase("DOGS")) {
            	for(Monkey m: monkeyList) {
            		System.out.println(m);
            	}
            }
            
            // Prints list of monkeys
            else if(userListSelection.equalsIgnoreCase("MONKEYS")) {
            	for(Dog d:dogList) {
            		System.out.println(d);
            	}
            }
            
            // Prints list of in-service and available dogs and monkeys
            else if(userListSelection.equalsIgnoreCase("IN-SERVICE")) {
            	for(Monkey m:monkeyList) {
                	if(m.getReserved() && m.getTrainingStatus().equalsIgnoreCase("in service")) {
                		System.out.println(m);
                	}
                	else {
                		System.out.println("There are no monkeys which are in service and availble at this time.");
                	}
            	}
                for (Dog d:dogList) {
                	if(d.getReserved() && d.getTrainingStatus().equalsIgnoreCase("in service")) {
                		System.out.println(d);
                	}
                	else {
                		System.out.println("There are no monkeys which are in service and availble at this time.");
                	}
                }
            }   
            
            // Prints statement if no valid choice was entered
            else {
            	System.out.println("Please enter valid input:\n");
            }   
        }
        
} // End of Class Driver

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<App> myApps = new ArrayList<App>();
        
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║     WORK HUB - SETUP WIZARD    ║");
        System.out.println("╚════════════════════════════════╝");
        
        // Ask user how many apps they want to add
        System.out.print("\nHow many apps do you want to add? ");
        int numberOfApps = keyboard.nextInt();
        keyboard.nextLine();  // Clear the Enter key
        
        // Let user add each app
        for (int i = 1; i <= numberOfApps; i++) {
            System.out.println("\n--- App #" + i + " ---");
            
            System.out.print("App name (e.g., Slack, Teams): ");
            String name = keyboard.nextLine();
            
            System.out.print("Icon (emoji, e.g., 💬 👥 📊): ");
            String icon = keyboard.nextLine();
            
            System.out.print("Category (Communication, Productivity, etc.): ");
            String category = keyboard.nextLine();
            
            // Create the app and add to list
            App newApp = new App(name, icon, category);
            myApps.add(newApp);
            
            System.out.println("✅ Added " + name + " to your work hub!");
        }
        
        // Show all apps the user added
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║     YOUR WORK HUB APPS         ║");
        System.out.println("╚════════════════════════════════╝");
        
        for (int i = 0; i < myApps.size(); i++) {
            App app = myApps.get(i);
            System.out.println((i+1) + ". " + app.icon + " " + app.name + " (" + app.category + ")");
        }
        
        // Interactive menu for using the apps
        boolean running = true;
        while (running) {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║           MAIN MENU            ║");
            System.out.println("╚════════════════════════════════╝");
            System.out.println("1. Open an app");
            System.out.println("2. Send message to an app");
            System.out.println("3. Read all messages in an app");
            System.out.println("4. Show all apps status");
            System.out.println("5. Add a new app");
            System.out.println("6. Exit");
            System.out.print("\nYour choice: ");
            
            int choice = keyboard.nextInt();
            keyboard.nextLine();  // Clear Enter
            
            if (choice == 1) {
                // Open an app
                System.out.print("Enter app number to open: ");
                int appNum = keyboard.nextInt() - 1;  
                keyboard.nextLine();
                
                if (appNum >= 0 && appNum < myApps.size()) {
                    myApps.get(appNum).open();
                } else {
                    System.out.println("❌ Invalid app number!");
                }
                
            } else if (choice == 2) {
                // Send message to app
                System.out.print("Enter app number to send message: ");
                int appNum = keyboard.nextInt() - 1;
                keyboard.nextLine();
                
                if (appNum >= 0 && appNum < myApps.size()) {
                    myApps.get(appNum).receiveMessage();
                } else {
                    System.out.println("❌ Invalid app number!");
                }
                
            } else if (choice == 3) {
                // Read all messages
                System.out.print("Enter app number to read messages: ");
                int appNum = keyboard.nextInt() - 1;
                keyboard.nextLine();
                
                if (appNum >= 0 && appNum < myApps.size()) {
                    myApps.get(appNum).readAllMessages();
                } else {
                    System.out.println("❌ Invalid app number!");
                }
                
            } else if (choice == 4) {
                // Show all apps
                System.out.println("\n=== ALL APPS STATUS ===");
                for (int i = 0; i < myApps.size(); i++) {
                    System.out.println("\n--- App #" + (i+1) + " ---");
                    myApps.get(i).showInfo();
                }
                
            } else if (choice == 5) {
                // Add new app
                System.out.println("\n--- ADD NEW APP ---");
                System.out.print("App name: ");
                String name = keyboard.nextLine();
                System.out.print("Icon: ");
                String icon = keyboard.nextLine();
                System.out.print("Category: ");
                String category = keyboard.nextLine();
                
                App newApp = new App(name, icon, category);
                myApps.add(newApp);
                System.out.println("✅ Added " + name + "!");
                
            } else if (choice == 6) {
                System.out.println("Goodbye! Have a productive day!");
                running = false;
                
            } else {
                System.out.println("❌ Invalid choice! Try again.");
            }
            
            // Pause before showing menu again
            if (running) {
                System.out.print("\nPress Enter to continue...");
                keyboard.nextLine();
            }
        }
        System.out.println("Press delete to delete");
        keyboard.close();   
    }
}
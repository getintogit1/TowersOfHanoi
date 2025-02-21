import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      loadingScreen();
      int userInput =  askingForInput();
      TowersOfHanoi towers = new TowersOfHanoi(userInput);
      towers.initializeTower();
      towers.printTowerStates();
      towers.solveHanoi(userInput, 0, 2, 1);
    }

    public static void loadingScreen() {
        String[] frames = {
            " ________                                                                     ______          __   __                                __\n",
            "/        |                                                                   /      \\       /  |  /  |                              /  |\n",
            "$$$$$$$$/______   __   __   __   ______    ______   _______         ______  /$$$$$$  |      $$ |  $$ |  ______   _______    ______  $$/ \n",
            "   $$ | /      \\ /  | /  | /  | /      \\  /      \\ /       |       /      \\ $$ |_ $$/       $$ |__$$ | /      \\ /       \\  /      \\ /  |\n",
            "   $$ |/$$$$$$  |$$ | $$ | $$ |/$$$$$$  |/$$$$$$  /$$$$$$$/       /$$$$$$  |$$   |          $$    $$ | $$$$$$  |$$$$$$$  |/$$$$$$  |$$ |\n",
            "   $$ |$$ |  $$ |$$ | $$ | $$ |$$    $$ |$$ |  $$/$$      \\       $$ |  $$ |$$$$/           $$$$$$$$ | /    $$ |$$ |  $$ |$$ |  $$ |$$ |\n",
            "   $$ |$$ \\__$$ |$$ \\_$$ \\_$$ |$$$$$$$$/ $$ |      $$$$$$  |      $$ \\__$$ |$$ |            $$ |  $$ |/$$$$$$$ |$$ |  $$ |$$ \\__$$ |$$ |\n",
            "   $$ |$$    $$/ $$   $$   $$/ $$       |$$ |     /     $$/       $$    $$/ $$ |            $$ |  $$ |$$    $$ |$$ |  $$ |$$    $$/ $$ |\n",
            "   $$/  $$$$$$/   $$$$$/$$$$/   $$$$$$$/ $$/      $$$$$$$/         $$$$$$/  $$/             $$/   $$/  $$$$$$$/ $$/   $$/  $$$$$$/  $$/ \n"
        };

        System.out.println("\nTowers of Hanoi Visualizer is Loading...\n");
        for (int i = 0; i < 10; i++) { 
            System.out.print("\r" + frames[i % frames.length]); 
            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("\nLoading interrupted.");
                return;
            }
        }
        System.out.println("\n\nLoading Complete!");
    }

    
    public static int askingForInput() {
      System.out.println("Type in a Number between 1 and 7 to initialize the game!");
      System.out.println("---------------------------------------------------------------");
      Scanner scanner = new Scanner(System.in);
      int input = scanner.nextInt();
    
      if (input >= 1 && input <= 7) {
        return input;  // Valid input
      }else {
        System.out.println("Invalid input! Please type a number between 1 and 7.");
        return 0;  // Invalid input
      }
    }
}
                                                                   

       

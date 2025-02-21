
import java.util.Arrays;
public class TowersOfHanoi {
    static int HEIGHT; 
    static final int WIDTH = 7;
    String[][] array;

    public  TowersOfHanoi(int amountOfDisks){
      this.HEIGHT = amountOfDisks;
      array = new String[HEIGHT][3];
      }
  
    
    public void initializeTower() {
      for (String[] row : array) {
        Arrays.fill(row, " ".repeat(WIDTH));
      }
      for (int i = 0; i < HEIGHT; i++) {
        int diskSize = Math.min(2 * (i + 1) - 1, WIDTH);                        // Avoid exceeding WIDTH
        int padding = Math.max((WIDTH - diskSize) / 2, 0);                      // Ensure padding is non-negative
        array[i][0] = " ".repeat(padding) + "#".repeat(diskSize) + " ".repeat(padding);
      }
    }

    public void printTowerStates() {
        System.out.println("\nCurrent Towers of Hanoi State:");
        for (int i = 0; i < HEIGHT; i++) { 
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + "   ");                          // Add spacing between columns
            }
            System.out.println();
        }
        System.out.println("   (A)       (B)       (C)\n");
    }

    public void solveHanoi(int n, int from, int to, int aux) { 
      if (n == 1) {
        moveDisk(from, to);
        printTowerStates();
        return;
      }
      solveHanoi(n - 1, from, aux, to);
      moveDisk(from, to);
      printTowerStates();
      solveHanoi(n - 1, aux, to, from);
    }

    public void moveDisk(int from, int to) {
      int fromRow = getTopDiskRow(from);
      int toRow = getEmptyRow(to);
      if (fromRow == -1 || toRow == -1) return;                                 // Invalid move
      array[toRow][to] = array[fromRow][from];                                  // Move disk
      array[fromRow][from] = " ".repeat(WIDTH);                                 // Clear old position
      System.out.println("Moved disk from " + (char) ('A' + from) + " to " + (char) ('A' + to));
    }

    // Finds the row of the topmost disk in a given column
    public int getTopDiskRow(int peg) {
      for (int i = 0; i < HEIGHT; i++) {
        if (!array[i][peg].trim().isEmpty()) return i;
      }
      return -1;                                                                // No disk found
    }

    public int getEmptyRow(int peg) {
      for (int i = HEIGHT - 1; i >= 0; i--) {
        if (array[i][peg].trim().isEmpty()) return i;
      }
      return -1;                                                                // No empty space
    }
}

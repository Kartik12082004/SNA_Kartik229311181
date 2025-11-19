import java.util.Scanner;

public class TowerOfHanoi {

    public static void solveHanoi(int n, char from, char to, char aux) {
    	
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        solveHanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        solveHanoi(n - 1, aux, to, from);
        
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();

        System.out.println("\nSolution for " + n + " disks:\n");
        solveHanoi(n, 'A', 'C', 'B');  // A = source, C = destination, B = auxiliary

        scanner.close();
        
    }
}

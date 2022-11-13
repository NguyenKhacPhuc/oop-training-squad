import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BatchManagement b1 = new BatchManagement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value: ");
        int n = sc.nextInt();
        Batch[] batchArray = new Batch[n];
        for(int i = 0; i < n; i++){
            batchArray[i] = b1.createBatch();
        }

        b1.display(batchArray);
    }
}
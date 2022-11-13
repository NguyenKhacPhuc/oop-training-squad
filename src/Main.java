import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BatchManagement b1 = new BatchManagement();

        int n = 3;
        Batch[] batch = new Batch[n];
        for(int i = 0; i < n; i++){
            batch[i] = b1.createBatch();
        }

        b1.display(batch);
    }
}
package ex_0811;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BatchManagement batchManagement = new BatchManagement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of batch to create: ");
        int numberOfBatch = sc.nextInt();
        Batch[] batches = new Batch[numberOfBatch];
        for (int i = 0; i < numberOfBatch; i++) {
            batches[i] = batchManagement.createBatch();
        }
        batchManagement.display(batches);
    }
}

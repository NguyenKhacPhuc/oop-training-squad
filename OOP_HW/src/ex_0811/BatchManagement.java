package ex_0811;

import java.util.ArrayList;
import java.util.Scanner;

public class BatchManagement {

    public Batch createBatch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter batch's name: ");
        String batchName = sc.nextLine();
        System.out.println("Please enter batch's date: ");
        String batchDate = sc.nextLine();
        return new Batch(batchName, batchDate);
    }

    public void display(Batch[] batch) {
        for (Batch batches: batch) {
            System.out.println("Batch name: " + batches.getBatchName() + "\nBatch date: " + batches.getBatchDate());
        }
    }
}

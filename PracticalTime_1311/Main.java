package PracticalTime_1311;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BatchManagement bM = new BatchManagement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of batch: ");
		int number = sc.nextInt();
		Batch[] batch = new Batch[number];
		for (int i = 0; i < number; i++) {
			batch[i] = bM.createBatch();
		}
		bM.display(batch);
	}
}

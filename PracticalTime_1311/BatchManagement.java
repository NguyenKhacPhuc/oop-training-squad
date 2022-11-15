package PracticalTime_1311;

import java.util.Scanner;

public class BatchManagement {
	Batch ba = new Batch();
	Scanner sc = new Scanner(System.in);

	public Batch createBatch() {
		System.out.println("Enter name of batch: ");
		ba.setBatchName(sc.next());
		System.out.println("Enter date of batch: ");
		ba.setBatchDate(sc.next());
		return new Batch(ba.getBatchName(), ba.getBatchDate());
	}

	public void display(Batch[] batch) {
		for (int i = 0; i < batch.length; i++) {
			System.out.println("Name of batch : " + ba.getBatchName() + " || " + "Date of batch " + ba.getBatchDate());
		}
	}
}

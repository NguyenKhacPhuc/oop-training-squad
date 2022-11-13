import java.util.Scanner;

public class BatchManagement {

    public Batch createBatch(){
        Scanner sc = new Scanner(System.in);
        String batchName = sc.next();
        String batchDate = sc.next();
        return new Batch(batchName,batchDate);
    }

    public void display(Batch[] batch){
        for(int i = 0; i < batch.length; i++)
        System.out.println("Output" + batch[i].getBatchDate() + batch[i].getBatchName());
    }
}

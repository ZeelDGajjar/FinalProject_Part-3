import java.util.*;

public class Average {

    //Data fields
    private int[] data;
    private double mean;

    Scanner info = new Scanner(System.in);

    public Average(){
        for(int i = 0; i < 5; i++){
            System.out.printf("Please enter score %d", i + 1);
            data[i] = info.nextInt();

            calculateMean();
            selectionSort();
        }
    }

    public void calculateMean(){
        int total = 0;
        for(int i = 0; i < 5; i++){
            total += data[i];
        }
        mean = total/5; ///?
    }

    public String toString(){
        int[] data;
        for(int i = 0; i < 5; i++){
            if(data[i] < data[i+1]){
                int num1 = data[i];
                data[i] = data[i + 1];
                data[i + 1] = num1;
            }
        }

        int total = 0;
        for(int i = 0; i < 5; i++){
            total += data[i];
        }
        mean = total/5;

        return data.toString() + mean.toString(); ///not sure. does this include all? //how do I add mean in it??
    }

    public void selectionSort(){

        for (int i = 0 , j  = 0; ; i++ , j++){

        }

    }

}

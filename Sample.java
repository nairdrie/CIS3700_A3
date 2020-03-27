import java.util.*;

public class Sample {

    List<Example> exampleSet;

    public Sample() {}

    public double getInfo(List<Example> g, int k) {
        //-log2(probability of answer)

        //log2(x) =ln(x) /ln(2) = log10(x)/log10(2)
        int size = g.size();
        int[] count = new int[k];
        for(int j = 0; j < k ; j++) {
            count[j] = g.get(j).getAttributeValues().length;
            //MAYBE NOT RIGHT. MIGHT BE NUMBER OF ATTRIBUTES WITH VALUE EQUAL TO FUNCTION VALUE.
        }
        double info = 0;
        for(int j = 0; j < k; j++) {
            double pr = count[j] / size;
            info = info - pr * (Math.log(pr) /  Math.log(2));
        }

        return info;

    }


    public void getRmd() {
        System.out.println("CHRISIS AN FAJOT");
    }

    public void getAttribute() {
    }

}
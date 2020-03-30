import java.util.*;

public class Sample {

    Scheme scheme;
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


    public double getRmd(Attribute b, List<Example> g, int k) {
        int size = g.size();
        int m = b.getPossibleValues().length;

        List<Example>[] subg = new ArrayList[m];

        for(int i = 0; i < m; i++) {
            List<Example> tempList = new ArrayList<Example>();
            for(int j = 0; j < size; j++) {
                if(g.get(j).getFunctionValue() == b.getPossibleValues()[i]) {
                    tempList.add(g.get(j));
                }
            }
            subg[i] = tempList;
        }

        int[] subcnt = new int[m];
        for(int i = 0; i < m; i++) {
            subcnt[i] = subg[i].size();
        }

        double rem = 0;
        for(int i = 0; i < m; i++) {
            double pr = subcnt[i]/size;
            double info = getInfo(subg[i], k);
            rem += pr * info;
        }

        return rem;

    }

    public void getAttribute(Attribute attrib, List<Example> g) {
        int k = attrib.getPossibleValues().length;
        double info = getInfo(g, k);
        maxGain = -1;
        bestA = null;
        
    }

}
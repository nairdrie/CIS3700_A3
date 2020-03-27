import java.util.*;

public class Example {

    Attribute[] attributes;
    int[] attributeValues;

    Attribute function;
    int functionValue;

    public Example() {}

    public int[] getAttributeValues() {
        return this.attributeValues;
    }

    public String getFunctionValue() {
        return this.function.getPossibleValues()[functionValue];
    }

    public String getAttributeValue(String attrName) {
        return "ERR";
    }


}
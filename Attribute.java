public class Attribute {

    String name;
    String[] possibleValues;

    public Attribute(String name, String[] possibleValues) {
        this.name = name;
        this.possibleValues = possibleValues;
    }

    public String[] getPossibleValues() {
        return this.possibleValues;
    }
    

}
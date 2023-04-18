public class Item {
    
    private String name;
    private int weight;
    private int value;

    public Item (String name, int weight, int value){
        this.name = name;
        this.weight = weight;
        this.value = value; 
    }

    public int getWeight() {
        return weight; 
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        // return (name + " [Weight:" + weight + ", Value:" + value + "]");
        // return String.format("%s [Weight: %d, Value: %d]", name, weight, value);
        return (name);
    };
}

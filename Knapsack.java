import java.util.*;

// import java.util.Arrays;

public class Knapsack {
    
    public static void combinations(Item [] items) {
        //int bestKnapsack = 0; 
        for (int i = 0; i < Math.pow(2, items.length); i++) {
            String binaryFlag = Integer.toBinaryString(i);
            String paddedBinaryFlag = (String.format("%"+ items.length + "s", binaryFlag).replace(" ", "0"));
            List<Item> combination = new ArrayList<Item>();
            int totalValue = 0;
            for (int j = 0; j < items.length; j++) {
                if (paddedBinaryFlag.length() > j && paddedBinaryFlag.charAt(j) == '1') {
                    items[j].weight;
                    combination.add(items[j]);
                }
            }
            System.out.println(combination.toString());

        }

        // for (int i = 0; i < items.length; i++) {
        //     // Arrays.stream(items).filter(xi -> xi != i).toArray();

            
        //     for (int j = 0; j < items.length; j++) {
        //         if (i != j) {
        //             Item [] subArray = {items[i], items[j]};
        //             System.out.println(Arrays.toString(subArray));
        //         }
        //     }
            
        //     // Item [] subArray = Arrays.copyOfRange(items, i, items.length + 1);
        //     // Item [] subArray = Arrays.copyOfRange(items, i, items.length + 1);
        //     // System.out.println(Arrays.toString(subArray));
        //    // System.out.println(items[i].toString());
        // }
    }
    
    public static void main(String[] args) {
        Item item1 = new Item("item 1",7, 42);
        Item item2 = new Item("item 2",3, 12);
        Item item3 = new Item("item 3",4, 40);
        Item item4 = new Item("item 4",5, 25);
       // System.out.println(item3.toString());
        Item [] items = {item1, item2, item3, item4};
        combinations(items);
       // System.out.println(Arrays.toString(items));
       // System.out.println(item3.weight);


    }
}

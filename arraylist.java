import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList<>();
        array.add("Apple");
        array.add("Apple1");
        array.add("Apple2");
        
        System.out.println("Element at index is-->" + array.get(1));

        System.out.println("Element at index is-->" + array.remove(2));
        System.out.println("Element at index is-->" + array);


    }
    
}

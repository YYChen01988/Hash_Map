import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> favouriteFruits = new HashMap();
        favouriteFruits.put("Alice", "Apple");
        favouriteFruits.put("Sarah", "Banana");
        favouriteFruits.put("Bob", "Strawberry");

//        System.out.println(favouriteFruits.get("Alice"));

//        for (String value : favouriteFruits.values()){
//            System.out.println("The favourite fruit is: " + value);
//        }

        for (String key : favouriteFruits.keySet()){
            System.out.println(key + " favourite fruit is: " + favouriteFruits.get(key));
        }
    }
}

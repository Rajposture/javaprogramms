 import java.util.Vector;

public class Stringvector {
    public static void main(String[] args) {
        
        // --- String Functions ---
        String str1 = "Hello";
        String str2 = "World";
        
        // Concatenation
        String result = str1.concat(" " + str2);
        System.out.println("Concatenated String: " + result);
    
        System.out.println("Length of result string: " + result.length());
     
        System.out.println("Uppercase: " + result.toUpperCase());
        
        // Substring
        System.out.println("Substring (0 to 5): " + result.substring(0, 5));
        
    
        System.out.println("Character at index 1: " + result.charAt(1));
        
        System.out.println("----------------------------------");
        
        // --- Vector Data Type ---
        Vector<String> names = new Vector<>();
        
        // elements
        names.add("Raj");
        names.add("Vinay");
        names.add("Soham");
        
        System.out.println("Vector elements: " + names);
        
        // Access element
        System.out.println("First element: " + names.get(0));
        
        // Remove element
        names.remove("Bob");
        System.out.println("After removing Bob: " + names);
        
        // Size of vector
        System.out.println("Size of vector: " + names.size());
    }

}
    


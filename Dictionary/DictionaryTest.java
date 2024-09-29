public class DictionaryTest {
    public static void main(String[] args) {
        ArrayDictionary<String, Double> dictionary = new ArrayDictionary<>(5);
        
        // Add elements to the dictionary
        System.out.println("Adding items to dictionary");
        dictionary.add("Alice", 500.0);
        dictionary.add("Bob", 300.0);
        dictionary.add("Charlie", 800.0);
        
        // Print the dictionary before sorting
        System.out.println("Dictionary before sorting:");
        dictionary.printDictionary();
        
        // Sort the dictionary by key
        dictionary.sort();
        
        // Print the dictionary after sorting
        System.out.println("\nDictionary after sorting:");
        dictionary.printDictionary();
        
        // Search for a key
        System.out.println("\nSearching for Bob's balance: " + dictionary.contains("Bob"));
        
        // Remove an entry
        System.out.println("\nRemoving Charlie's entry.");
        dictionary.remove("Charlie");
        
        // Print the dictionary after removal
        System.out.println("\nDictionary after removal:");
        dictionary.printDictionary();
    }
}

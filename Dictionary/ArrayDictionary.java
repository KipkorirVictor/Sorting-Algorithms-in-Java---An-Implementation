import java.util.Arrays;

class ArrayDictionary<K extends Comparable<K>, V> {
    private Node<K, V>[] dictionary;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayDictionary(int capacity) {
        dictionary = new Node[capacity];
        size = 0;
    }

    public void add(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value);
        if (size >= dictionary.length) {
            dictionary = Arrays.copyOf(dictionary, dictionary.length * 2); // Resize array if full
        }
        dictionary[size] = newNode;
        size++;
    }

    public V remove(K key) {
        for (int i = 0; i < size; i++) {
            if (dictionary[i].getKey().equals(key)) {
                V value = dictionary[i].getValue();
                dictionary[i] = dictionary[size - 1]; // Replace removed node with the last node
                dictionary[size - 1] = null;
                size--;
                return value;
            }
        }
        return null; // Key not found
    }

    public V contains(K key) {
        for (int i = 0; i < size; i++) {
            if (dictionary[i].getKey().equals(key)) {
                return dictionary[i].getValue();
            }
        }
        return null; // Key not found
    }

    public void sort() {
        Arrays.sort(dictionary, 0, size, (node1, node2) -> node1.getKey().compareTo(node2.getKey()));
    }

    public void printDictionary() {
        for (int i = 0; i < size; i++) {
            System.out.println("Key: " + dictionary[i].getKey() + ", Value: " + dictionary[i].getValue());
        }
    }
}

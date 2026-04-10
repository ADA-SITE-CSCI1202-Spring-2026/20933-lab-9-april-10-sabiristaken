class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + key + " = " + value + "]";
    }
}

public class PairTester {
    public static void main(String[] args) {
        System.out.println("--- Generic Pair Class Test ---");

        Pair<String, Integer> person = new Pair<>("Sabir", 23);
        System.out.println("Person Pair: " + person);

        Pair<Integer, Double> employeeData = new Pair<>(101, 75000.50);
        System.out.println("Employee Data: " + employeeData);

        String name = person.getKey(); 
        int age = person.getValue();
        System.out.println("Extracted Name: " + name + ", Age: " + age);

        employeeData.setKey(102);
        employeeData.setValue(82000.00);
        System.out.println("Updated Employee: " + employeeData);

    }
}
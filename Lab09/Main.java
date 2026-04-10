class NumericFunction<T extends Number> {

    private T num;

    public NumericFunction(T num) {
        this.num = num;
    }

    public double getReciprocal() {
        return 1.0 / num.doubleValue();
    }

    public double getFractionalPart() {
        double val = Math.abs(num.doubleValue());
        return val - (int) val;
    }

    public boolean absEquals(NumericFunction<?> other) {
        return Math.abs(this.num.doubleValue()) == Math.abs(other.num.doubleValue());
    }
}

public class Main {
    public static void main(String[] args) {
        NumericFunction<Double> doubleVal = new NumericFunction<>(9.76);
        
        NumericFunction<Float> floatVal = new NumericFunction<>(-9.76f);
        
        NumericFunction<Integer> intVal = new NumericFunction<>(5);

        System.out.println("--- Results ---");

        System.out.println("Reciprocal of 5: " + intVal.getReciprocal());

        System.out.printf("Fractional part of 9.76: %.2f%n", doubleVal.getFractionalPart());

        if (doubleVal.absEquals(floatVal)) {
            System.out.println("Absolute values of 9.76 and -9.76f are EQUAL.");
        } else {
            System.out.println("Absolute values are DIFFERENT.");
        }

        System.out.println("Absolute values of 9.76 and 5 equal? " + doubleVal.absEquals(intVal));
    }
}
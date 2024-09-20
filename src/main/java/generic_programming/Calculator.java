package generic_programming;

public class Calculator {

    private static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    private static <T extends Number> double multiply(T a, T b){
        return a.doubleValue() * b.doubleValue();
    }

    private static <T extends Number> double divide(T a, T b){
        return a.doubleValue() / b.doubleValue();
    }

    private static <T extends Number> double subtract(T a, T b){
        return a.doubleValue() - b.doubleValue();
    }

    private static <T> boolean compareArrays(T[] a, T[] b){
        if (a.length != b.length){
            return false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (!a[i].equals(b[i])){
                    return false;
                }
            }
        }
        return true;

    }
}

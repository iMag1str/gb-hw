/**
 * Java 1. HomeWork 2
 *
 * @author Mark
 * @version 11.10.2021
 */
class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("HomeWork #2");
        System.out.println("The amount between 10 and 20 - " + (between10And20(5, 14)? "true" : "false"));
        positiveOrNegative(0);
        System.out.println("The number is - " + (isPositiveOrNegative(-1)? "false" : "true"));
        stringNTimes("Obana",4);
    }    
    
    static boolean between10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    
    static void positiveOrNegative(int a) {   
        System.out.println(a >= 0? "Positive" : "Negative");
    }
    
    static boolean isPositiveOrNegative(int a) {
        return a > 0;
    }
    
    static void stringNTimes(String word, int times) {
        for (int a = 0; a < times; a++) {
            System.out.println(word);
        }
    }
   
}
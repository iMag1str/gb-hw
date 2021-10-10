class HomeWork {
    // fields
    public static void main(String[] args) {
        System.out.println("HomeWork #1");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    
    static void checkSumSign() {
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c >= 0? "Positive amount" : "Negative amount");
    }
    
    static void printColor() {
        int value = 100;
        if (value <=0 ) {
            System.out.println("Red");
        }
        if (value >=1 && value <=100) {
            System.out.println("Yellow");
        }
        if (value > 100) {
            System.out.println("Green");
        }
            
    }
        
    static void compareNumbers() {
        int a=5;
        int b=6;
        System.out.println(a>=b? "a>=b" : "a<b");
    }
}
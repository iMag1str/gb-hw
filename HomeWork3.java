/**
 * Java 1. HomeWork 3
 *
 * @author Mark
 * @version 13.10.2021
 */
 import java.util.Arrays;
 
 class HomeWork3 {
     public static void main(String[] args) {
        System.out.println("HomeWork #3");
        invertArray();
        from1to10();
        randomArray();
        squareArray();
        System.out.println(Arrays.toString(returningArray(7, 7)));
     }
        
    static void invertArray() {
// изначальная форма
        int[] arr = {0, 0, 1, 1, 0, 0, 1, 1};
            System.out.println(Arrays.toString(arr));
// итоговая
        for (int a = 0; a < arr.length; a++) {
            arr[a] = (arr[a] > 0) ? 0 : 1;
        }
            System.out.println(Arrays.toString(arr));
    }
    
    static void from1to10() {
        int[] arr = new int[100];
        arr[0] = 1;
        for (int a = 0; a < arr.length; a ++) {
            arr[a] = a + 1;
        }
            System.out.println(Arrays.toString(arr));
    }
    
    static void randomArray() {
// изначальная форма
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println(Arrays.toString(arr));
// итоговая
        int a;
        for (int i = 0; i < arr.length; i++) {
            a = arr[i];
                arr[i] = a < 6 ? a * 2 : a;
        }
            System.out.println(Arrays.toString(arr));
    }
    
    static void squareArray() {
        int[][] arr = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int a = 0; a < 8; a++) {
                if (a == i || a == arr.length - i - 1) {
                    arr[i][a] = 1;
                }
                System.out.print(arr[i][a] + "  ");
            }
                System.out.println();
        }
    }
    
    static int[] returningArray(int len, int initialValue) {
        int[] arr = new int[len];
            for (int a = 0; a < len; a++) {
                arr[a] = initialValue;
            }
            return arr;
    }
 }
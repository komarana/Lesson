import java.util.Random;

public class Work3_6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(80) - 30;
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        // System.out.println();
        System.out.print("\nSorted: \n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            int tmp = arr[j];
            arr[j] = arr[arr.length - j - 1];
            arr[arr.length - j - 1] = tmp;
            System.out.print(arr[j] + " ");
        }
    }
}
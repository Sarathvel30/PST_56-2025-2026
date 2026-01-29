public class arrayasc{
    public static void main(String[] args) {
        int[] array = {34, 12, 5, 67, 23};
        int n = array.length;

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                   
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Array elements in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}       
        
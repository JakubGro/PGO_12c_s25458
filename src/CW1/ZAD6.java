package CW1;

public class ZAD6 {
    public static final int MIN = 100;
    public static final int MAX = 1000;

    public static void start(){
        int[] arr = getRandomNumberArr(10);

        System.out.print("Generated array: ");
        printArray(arr);

        sortArray(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }

    public static int[] getRandomNumberArr(int arrSize){
        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
        }
        return arr;
    }

    public static void printArray(int[] arrToPrint){
        System.out.print("[");
        for (int i = 0; i < arrToPrint.length; i++) {
            System.out.print(arrToPrint[i]);
            if(i+1 < arrToPrint.length){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void sortArray(int[] arrayToSort){
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = i+1; j < arrayToSort.length; j++) {
                int currentSmallest = arrayToSort[i];
                int newPretender = arrayToSort[j];
                if (currentSmallest > newPretender){
                    arrayToSort[i] = newPretender;
                    arrayToSort[j] = currentSmallest;
                }
            }
        }
    }
}

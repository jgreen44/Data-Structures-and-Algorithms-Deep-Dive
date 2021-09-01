public class Main {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
//        int lastUnsortedIndex = intArray.length - 1;

        // Initialize Gap value
        for (int gap = intArray.length / 2; gap > 0; gap /= 2){

            // Comparing and shifting
            for (int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];

                int j = i;

                while (j >= gap && intArray[j - gap] > newElement){
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }
        }


        for (int j : intArray) {
            System.out.println(j);
        }
    }


}
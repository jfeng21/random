public class InsertionSort {

    public int[] sort(int[] input) {
        if(input.length == 0)
            System.out.println("No input");

        for (int i = 1; i < input.length; i++) {
            int currentElement = input[i];
            int k;
            for (k = i - 1; k >= 0 && input[k] > currentElement; k--) {
                input[k + 1] = input[k];    //swamp, to put smaller ele at left
            }
            input[k + 1] = currentElement;  //insert the current element into list
          
        }
        System.out.println("input");

        return input;
    }

}

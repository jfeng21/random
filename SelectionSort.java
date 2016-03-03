public class SelectionSort {

 
    public int[] sort(int[] input) {
              if(input.length == 0)
            System.out.println("No input");

        for(int i=0;i<input.length;i++){
        int index = i;
        for(int j = i+1; j<input.length;j++)
            if(input[j]<input[index])
                index = j;      //swap index and inner loop element, till find the smallest
           int smaller = input[index];
           input [index] = input[i];
           input[i] = smaller;
            
        }

        for(int j = 0; j<input.length; j++)
                       System.out.print(input[j]);
                        return input;
    }
    
}

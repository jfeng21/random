  public class Mergesort{
      private int[] input;
      private in[] temp;
      private int len;
      
      public void sort(int[] values){
         this.input = values;
         len = values.length;
         this.temp = new int[len];
         mergesort(0, len - 1);
      }
      
      private void mergesort(int low,, ing high){
         if(low < high){
             mid = low + (high - low) / 2;
             mergesort(low, mid);
             mergesort(mid + 1, high);
             merge(low, mid, high);
         }
      }
      
      private void merge(int low, int mid, int high){
         for(int i = low; i <= high; i++){
            temp[i] = input[i];
         }
         
         int i = low;
         int j = mid + 1;
         int k = low;
         
         while(i <= mid && j <= high){
              if(temp[i] < temp[j]){
                 input[k] = temp[i];
                 i++;
              }else{
                 input[k] = temp[i];
                 j++;
              }
              k++;
         }
         
         while(i <= mid){
             input[k] = temp[i];
             k++;
             i++;
         }
      }
  
  }

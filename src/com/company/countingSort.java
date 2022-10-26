
public class countingSort {
    static int max(int arr[]){
        int max = arr[0];
        for(int i : arr){
            if(max < i){
                max = i;
            }
        }
        return max;
    }
    static void sort(int arr[]){
        int n = arr.length;
        int output[] = new int[n];
        int max = max(arr);

        int count[] = new int[max+1];
        
        for(int i : arr){
            count[i]++;
        }
        for(int i=1;i<=max;i++){
            count[i] += count[i-1]; 
        }
        for(int i = n-1;i>=0;i--){
            output[count[arr[i]]-1] = arr[i];
            --count[arr[i]];
        }
        for(int i=0;i<n;i++){
            arr[i] = output[i];
        }
        

    }
    public static void main(String[] args) {
        int arr[]= {11,4,61,2,78,5,2};
        sort(arr);
        for(int i : arr){
            System.out.println(i + " ");
        }
    }
}

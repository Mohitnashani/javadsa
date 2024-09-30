public class couting{
public static void countingSortDescending(int arr[]) {
    // Step 1: Find the largest element in the array
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        largest = Math.max(largest, arr[i]);
    }

    // Step 2: Create a count array to store the frequency of each element
    int count[] = new int[largest + 1];

    // Step 3: Populate the count array with frequencies
    for (int i = 0; i < arr.length; i++) {
        count[arr[i]]++;
    }

    // Step 4: Sort the array in descending order using the count array
    int j = 0;
    for (int i = count.length - 1; i >= 0; i--) {
        while (count[i] > 0) {
            arr[j] = i;
            j++;
            count[i]--;
        }
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
public static void main(String[] args) {
    int arr[]={4,6,3,2,1,5,6,5,8,9,5};
    countingSortDescending(arr);
}
}
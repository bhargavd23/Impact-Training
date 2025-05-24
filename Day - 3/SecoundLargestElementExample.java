public class SecoundLargestElementExample {
    public static void main(String args[]) {

        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        if(n<2)
            return;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for (int i = 0;i<arr.length;i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            } else {
                if (arr[i] > second_large && arr[i] != large) {
                    second_large = arr[i];
                }
            }
        }
        System.out.println(second_large);
    }
}

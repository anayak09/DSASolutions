public class InsertionSort {
    // O(n2)
    public static void nope(String[] args) {

        int[] random = {43, 75, 11, 9, 36};

        for(int i=1; i< random.length; i++) {
            int temp = random[i];
            int j = i-1;

            while(j >= 0 && random[j] > temp) {
                random[j+1] = random [j];
                j--;
            }
            random[j+1] = temp;
        }

        for(int a=0; a< random.length; a++) {
            System.out.println(random[a]);
        }
    }
}

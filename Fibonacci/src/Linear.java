public class Linear {
    private int[] arr;

    public int getNumber(int n){
        if (n <= 0)
            return -1;
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else{
            this.arr = new int[n];
            this.arr[0] = 0;
            this.arr[1] = 1;
            for (int i = 2; i < n; i++)
                arr[i] = arr[i-1] + arr[i-2];
            return arr[n-1];
        }
    }
}

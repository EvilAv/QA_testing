public class Recursive {

    public int getNumber(int n){
        if (n <= 0)
            return -1;
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else
            return (this.getNumber(n-1) + this.getNumber(n-2));
    }
}

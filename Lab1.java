import static java.lang.System.out;
import java.util.Scanner;

public class Lab1 {
    int n;
    int m;

    public lab1(){
        n = 3;
        m = 4;
    }   

    public lab1(int n, int m){
        this.n = n;
        this.m = m;
    }

    public static int pow(int n, int m) {
        int result = 1;
        for (int i = 1; i <= m; i++) {
            result = result * n;
        }
        return result;
    }

    public static void main(String[] args) {
        Lab1 a = new Lab1();
        Lab1 b = new Lab1();

        out.println(pow(2, 4));
    }
}

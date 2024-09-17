import java.util.Scanner;
public class Fibonacci 
{
    public static void main(String[] args)
    {
        int num, t1 = 0, t2 = 1, proxTerm = 0;
        Scanner leitor= new Scanner(System.in);
        num = leitor.nextInt();
        if (num == 1) {
            System.out.println(t1);
        }
        else if (num == 2){
            System.out.println(t2);
        }
        else {
        for (int cont = 3; cont <= num; cont=cont+1) {
            proxTerm = t1 + t2;
            t1 = t2;
            t2 = proxTerm;
        }
        System.out.println(proxTerm);
        }
    }
}

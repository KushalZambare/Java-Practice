import java.util.Scanner;

public class reducetozero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        long steps = 0;
        while(t>0){
            if((t & 1)==0){
                t >>=1;
            }
            else {
                t ^= 1;
            }
            steps++;
            
        }
        System.out.println(steps);
   }
}
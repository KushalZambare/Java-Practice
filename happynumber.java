import java.util.HashSet;
public class happynumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            int sum = 0;
            while(n > 0){
                int ans = n %10;
                sum = sum + (ans * ans);
                n = n / 10;
            }
            n = sum;
        }
        return true;
    }

    public static void main(String[] args) {
        happynumber obj = new happynumber();
        int number = 21;
        boolean result = obj.isHappy(number);
        System.out.println(result);
    }
}

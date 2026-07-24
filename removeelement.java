import java.util.ArrayList;

public class removeelement {
    public static void main(String[] args) {

        int[] num = {2,2,3,2,3,4,5};
        int val = 2;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            list.add(num[i]);
        }

        for (int i = 0; i < list.size(); i++ ) {
            if (list.get(i) == val) {
                list.remove(i);
            } 
        }

        System.out.println(list);
        System.out.println(list.size());
    }
}
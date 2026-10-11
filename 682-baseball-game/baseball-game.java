
import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int last = list.get(list.size() - 1);
                int secondLast = list.get(list.size() - 2);
                list.add(last + secondLast);

            } else if (op.equals("D")) {
                int last = list.get(list.size() - 1);
                list.add(last * 2);

            } else if (op.equals("C")) {
                list.remove(list.size() - 1);

            } else {
                list.add(Integer.parseInt(op));
            }
        }

        for (int l : list) {
            sum += l;
        }

        return sum;
    }
}

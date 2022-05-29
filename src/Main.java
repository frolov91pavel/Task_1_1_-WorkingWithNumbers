import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> newList = new ArrayList<Integer>();

        for (int i : list) {
            if (i > 0 && i % 2 == 0) {
                newList.add(i);
            }
        }

        newList.sort(Comparator.naturalOrder());

        System.out.println(newList);

    }
}

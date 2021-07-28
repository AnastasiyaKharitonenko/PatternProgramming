import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Task2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("мама", "мыла", "раму"));
        String str = "именно";
        System.out.println(list.toString());

        for (int i = 0; i < 6; i++) {
            if ((i == 1) || (i == 3) || (i == 5))
                list.add(i, str);
            System.out.println(list.get(i));
        }
    }
}

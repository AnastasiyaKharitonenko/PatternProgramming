import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int p = 0; p < 10; p++) {
            list.add(reader.readLine());
        }
        System.out.println(list);
        doubleValues(list);
        System.out.println(list);
    }
    public static void doubleValues(List list) {
        String value;
        for (int i = 0; i < list.size(); i++) {
            value = (String) list.get(i);
            list.set(i, value + value);
        }
    }
}

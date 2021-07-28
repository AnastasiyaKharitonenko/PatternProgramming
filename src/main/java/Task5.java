import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            List<String> list = new ArrayList<>();
            String str = bufferedReader.readLine();
            for (int i = 0; !str.equals("end"); i++) {
                list.add(str);
                str = bufferedReader.readLine();
            }
            bufferedReader.close();
            System.out.println();
            for (String s : list) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

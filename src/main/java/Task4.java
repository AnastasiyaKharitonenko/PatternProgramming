
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Task4 {

    public static void main(String[] args) throws IOException {

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            List<String> list = new ArrayList<>();
            int numberN = Integer.parseInt(bufferedReader.readLine());
            int numberM = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < numberN; i++) {
                list.add(bufferedReader.readLine());
            }
            for (int i = 0; i < numberM; i++) {
                String s = list.get(0);
                list.remove(0);
                list.add(s);
            }
            for (String s : list) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
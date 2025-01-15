import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringBuilder result = new StringBuilder();
        result.append("<");

        int index = 0;
        while (list.size() > 0) {
            index = (index + K - 1) % list.size();
            result.append(list.remove(index));
            if (list.size() > 0) {
                result.append(", ");
            }
        }

        result.append(">");
        bw.write(result.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
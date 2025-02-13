import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 노드 개수
        int m = Integer.parseInt(st.nextToken()); // 간선 개수

        int count = 0; // 현재 사용한 간선 개수
        int node = 0;  // 마지막으로 연결된 노드

        // 루트(0)에서 M개의 자식 노드를 만듦
        for (int i = 1; i < n; i++) {
            if (count < m) { 
                sb.append("0 ").append(i).append("\n"); // 루트 노드(0)와 연결
                count++;
            } else {
                sb.append(node).append(" ").append(i).append("\n"); // 나머지는 직렬 연결
            }
            node = i;
        }

        System.out.print(sb);
    }
}
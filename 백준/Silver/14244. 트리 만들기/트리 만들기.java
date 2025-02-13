import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 노드 개수
        int m = Integer.parseInt(st.nextToken()); // 간선 개수

        int currentEdgeCnt = 0; // 현재 사용한 간선 개수
        int lastNode = 0;  // 마지막으로 연결된 노드

        // 루트(0)에서 M개의 자식 노드를 만듦
        for (int i = 1; i < n; i++) {
            if (currentEdgeCnt < m) { 
                sb.append("0 ").append(i).append("\n"); // 루트 노드(0)와 연결
                currentEdgeCnt++;
            } else {
                sb.append(lastNode).append(" ").append(i).append("\n"); // 간선 추가 (부모 -> 자식)
            }
            lastNode = i; // 다음 노드를 부모로 설정
        }

        System.out.print(sb);
    }
}
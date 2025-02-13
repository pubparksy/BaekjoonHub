import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 출력 최적화

        // 테스트 케이스 개수 입력
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) { // 테스트 케이스 반복
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 국가 수
            int M = Integer.parseInt(st.nextToken()); // 비행기 수

            // M개의 비행기 입력 (입력만 받고 실제로 저장하지 않음)
            for (int i = 0; i < M; i++) {
                br.readLine();
            }

            // 모든 국가를 여행하는 최소 비행기 수는 항상 N-1
            sb.append(N - 1).append("\n");
        }

        // 결과 한 번에 출력
        System.out.print(sb.toString());
        br.close();
    }
}

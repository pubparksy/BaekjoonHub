import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 덱을 저장할 deque 객체 생성
        Deque<Integer> deque = new LinkedList<>();

        // 명령의 개수
        int N = Integer.parseInt(br.readLine());

        // 각 명령을 처리
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push_front": // 덱 앞에 수를 추가
                    int frontValue = Integer.parseInt(st.nextToken());
                    deque.addFirst(frontValue);
                    break;
                case "push_back": // 덱 뒤에 수를 추가
                    int backValue = Integer.parseInt(st.nextToken());
                    deque.addLast(backValue);
                    break;
                case "pop_front": // 덱 앞에서 수를 제거하고 출력
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.pollFirst() + "\n");
                    }
                    break;
                case "pop_back": // 덱 뒤에서 수를 제거하고 출력
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.pollLast() + "\n");
                    }
                    break;
                case "size": // 덱의 크기 출력
                    bw.write(deque.size() + "\n");
                    break;
                case "empty": // 덱이 비어있는지 확인하여 출력
                    if (deque.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case "front": // 덱 앞의 수 출력
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.peekFirst() + "\n");
                    }
                    break;
                case "back": // 덱 뒤의 수 출력
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.peekLast() + "\n");
                    }
                    break;
            }
        }

        // 버퍼 출력, 자원 반환
        bw.flush();
        bw.close();
        br.close();
    }
}

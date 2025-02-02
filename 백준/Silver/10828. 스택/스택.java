import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Deque<Integer> stack = new ArrayDeque<>(); // 스택을 저장할 List 사용
        int N = Integer.parseInt(br.readLine()); // 명령의 수
        
        for (int i = 0; i < N; i++) { // 명령을 N번 반복 처리
            String command = br.readLine();
            
            // 명령 종류에 따라 분기
            if (command.startsWith("push")) {
                // "push X" 명령: X를 스택에 넣음
                int X = Integer.parseInt(command.split(" ")[1]);
                stack.push(X);
            } else if (command.equals("pop")) {
                // "pop" 명령: 스택에서 가장 위의 값을 꺼냄
                if (stack.isEmpty()) {
                    bw.write("-1\n"); // 스택이 비었을 때는 -1 출력
                } else {
                    bw.write(stack.pop() + "\n");
                }
            } else if (command.equals("size")) {
                // "size" 명령: 스택의 크기 출력
                bw.write(stack.size() + "\n");
            } else if (command.equals("empty")) {
                // "empty" 명령: 스택이 비었는지 확인
                if (stack.isEmpty()) {
                    bw.write("1\n"); // 비어있으면 1 출력
                } else {
                    bw.write("0\n"); // 비어있지 않으면 0 출력
                }
            } else if (command.equals("top")) {
                // "top" 명령: 스택의 가장 위의 값 출력
                if (stack.isEmpty()) {
                    bw.write("-1\n"); // 스택이 비었을 때는 -1 출력
                } else {
                    bw.write(stack.peek() + "\n");
                }
            }
        }
        
        // 최종적으로 버퍼에 쌓인 출력값을 모두 출력
        bw.flush();
        bw.close();
    }
}

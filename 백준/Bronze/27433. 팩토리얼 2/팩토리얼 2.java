import java.io.*;

public class Main {
    
    // 팩토리얼을 계산하는 재귀 함수
    static long factorial(int n) {
        // 재귀 종료 조건: n이 1 이하일 때는 1을 반환
        if (n <= 1) {
            return 1;
        }
        // 재귀적으로 팩토리얼을 계산
        return n * factorial(n - 1);
    }

    public static void main(String[] args) throws IOException {
        // BufferedReader와 BufferedWriter를 사용한 입출력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 입력 받기
        int N = Integer.parseInt(br.readLine()); // N 입력
        
        // 팩토리얼 계산
        long result = factorial(N);
        
        // 결과 출력
        bw.write(String.valueOf(result) + "\n");
        bw.flush(); // 버퍼에 남은 내용 출력
        br.close();
        bw.close();
    }
}

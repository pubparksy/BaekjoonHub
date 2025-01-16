import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }
        
        st = new StringTokenizer(br.readLine());
        int[] targets = new int[M];
        for (int i = 0; i < M; i++) {
            targets[i] = Integer.parseInt(st.nextToken());
        }
        
        int totalOperations = 0;
        for (int target : targets) {
            int index = deque.indexOf(target);
            int leftRotation = index;
            int rightRotation = deque.size() - index;
            
            if (leftRotation <= rightRotation) {
                for (int i = 0; i < leftRotation; i++) {
                    deque.addLast(deque.pollFirst());
                }
                totalOperations += leftRotation;
            } else {
                for (int i = 0; i < rightRotation; i++) {
                    deque.addFirst(deque.pollLast());
                }
                totalOperations += rightRotation;
            }
            deque.pollFirst();
        }
        
        bw.write(totalOperations + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
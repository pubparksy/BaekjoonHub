import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 배열 a의 크기
        int k = Integer.parseInt(st.nextToken()); // 교환 횟수

        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        bubbleSort(a, n, k);
    }

    static void bubbleSort(int[] a, int n, int k) { // a배열 오른차순 정렬
        int count = 0;

        for (int last = n-1; last > 0; last--) {
            for (int i = 0; i < last; i++) {
                if (a[i] > a[i + 1]) { // a[i] <-> a[i + 1]
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    count++;
                    if (count == k) {
                        for (int j = 0; j < a.length; j++) {
                            System.out.printf("%d ", a[j]);
                        }
                    }
                }
            }
        }

        if (count < k) {
            System.out.println(-1);
        }
    }
}
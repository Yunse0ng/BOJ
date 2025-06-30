import java.io.*;
import java.util.*;

public class Main {
    static int[][] seats;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        seats = new int[n][n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                seats[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(divideQuarter(n, 0, 0));
    }

    static int divideQuarter(int n, int x, int y){
        if(n == 1){
            return seats[x][y];
        }
        else{
            int[] dividedSeats = new int[]{
                    divideQuarter(n/2, x, y),
                    divideQuarter(n/2, x, y+n/2),
                    divideQuarter(n/2, x+n/2, y),
                    divideQuarter(n/2, x+n/2, y+n/2)
            };
            Arrays.sort(dividedSeats);
            return dividedSeats[1];
        }
    }
}
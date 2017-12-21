//import java.util.Scanner;
//import java.util.Arrays;
//
//public class Main {
////	static int dx[] = {-1, 0 ,1, 0};
////	static int dy[] = {0, 1, 0, -1};
////	static int n;
////	static String map[][] = new String[5][5];
////	static char empty = '.';
////	static char piece = '*';
////	static int ans;
//	
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i < 5; i++){
//			for(int j =0; j < 5; j++){
//			map[i][j] = sc.next();
//			}
//		}
////		sol();
//		System.out.println(map);
//	}
//	
////	static void sol(){
////		
////	}
//}

import java.util.Scanner;

public class Main{
	static int x, y, N;
	static int cnt; // 대결하는 라운드 번호
	static int result;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
//		solve(x, y, 1);
		while( x != y){
			x = x/2 + x%2;
			y = y/2 + y%2;
			cnt++;
		}
		System.out.println(cnt);
	}
}
//	
//	static void solve(int x, int y, int cnt){
//		if(x % 2 != 0){
//			x = (x / 2) + 1;
//			y = y / 2;
//			cnt++;
//		}
//		
//		else if( y % 2 != 0){
//			y = (y / 2) + 1;
//			x = x / 2;
//			cnt++;
////			System.out.println(cnt);
//		}
//		else if(x %2 != 0 && y % 2 != 0){
//			x = ( x / 2) + 1;
//			y = ( y / 2) + 1;
//			cnt++;
//		}
//		
//		if((x+1) == y && y %2 == 0 )//1칸 옆이면서 짝수면
//			{
//		result = cnt;	
//		}
//		
//		else {
//			solve(x, y, cnt);
//		}
//	}
//}
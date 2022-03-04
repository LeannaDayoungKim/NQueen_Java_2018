import java.util.Scanner;

public class NQueen {
	static int path[] = new int[16];
	static int n;
	static int ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			path[0]=i;
			nQueen(i,0);
		}
		System.out.println(ans);
	}
	private static void nQueen(int a,int b) {
		for(int i=0;i<b;i++) {
			if(path[i]==a || Math.abs(a-path[i])==b-i)
				return;
		}
		if(b==n-1) {
			ans++;
			return;
		}
		for(int i=0;i<n;i++) {
			path[b+1]=i;
			nQueen(i,b+1);
		}
	}

}

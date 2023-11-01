public class fibo {

	public static void main(String[] args) {
		int n = 5;
		int[] dp = new int[n + 1];
		System.out.println(fibTD(n, dp));
		System.out.println(fibBU(n));
		System.out.println(fib(n));

	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int f1 = fib(n - 1);
		int f2 = fib(n - 2);
		return f1 + f2;

	}

	public static int fibTD(int n, int[] dp) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (dp[n] != 0) {// dp Apply kra hai
			return dp[n];
		}
		int f1 = fibTD(n - 1, dp);// dp[n-1]
		int f2 = fibTD(n - 2, dp);// dp[n-2]
		return dp[n] = f1 + f2;// dp[n]=dp[n-1]+dp[n-2]

	}

	public static int fibBU(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
}
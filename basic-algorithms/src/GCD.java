
public class GCD {
	
	public int calculate_rec(int a, int b) {
		if (b == 0) {
			return Math.abs(a);
		}
		return calculate_rec(b, a % b);
	}
		
}

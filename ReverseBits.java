
public class ReverseBits {

	public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32; i++) {
        	   result <<= 1;
               if((n & 1) == 1) result++;
               n >>= 1;
        }
        return result;
    }
	
	public static void main(String[] args) {
		int n = 13;
		ReverseBits obj = new ReverseBits();
		System.out.println(obj.reverseBits(n));
	}
}

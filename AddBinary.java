import java.math.BigInteger;
public class AddBinary {
	public static String addBinary(String a, String b) {
		BigInteger x = new BigInteger(a, 2);
		BigInteger y = new BigInteger(b, 2);
		BigInteger zero = new BigInteger("0", 2);
		BigInteger carry, answer;
		while(y.compareTo(zero) != 0) {
			answer = x.xor(y);    //since xor adds
			carry = x.and(y).shiftLeft(1); //and "and" helps maintain carry but we shift left to next digit
			x = answer;
			y = carry;
		}
		return x.toString(2);
	}
	
	public static void main(String[] args) {
		String a = "11";
		String b = "11";
		System.out.println(addBinary(a, b));
	}
}


public class AddDigits {
	public static int addDigits(int num) {
        if(num == 0) return 0; //base case
        if(num % 9 == 0) return 9; //a number is divisible by 9 if sum of its digits is
        //divisible by 9
        return num % 9; //break into 9
    }
	
	public static void main(String[] args) {
		int num = 38;
		System.out.println(addDigits(num));
	}
}

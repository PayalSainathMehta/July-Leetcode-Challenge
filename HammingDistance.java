
public class HammingDistance {
	public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int distance = 0;
        while(xor != 0){
            if(xor % 2 == 1)
                distance += 1;
            xor = xor >> 1;
        }
        return distance;
        
    }
	
	public static void main(String[] args) {
		HammingDistance obj = new HammingDistance();
		System.out.println(obj.hammingDistance(1, 4));
	}
}

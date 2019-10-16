
public class problem7 {

	public static void main(String args[]){
		  int[] myarray = new int[1001];
	        int j = 0;
	        boolean prime = false;

	        for (int i = 2;; i++) {
	            for (int k = 2; k < i; k++) {
	                if (i == (k - 1) && i % k != 0) {
	                    prime = true;
	                }

	                if (i % k == 0) {
	                    prime = false;
	                    prime = true;
	                }
	                if (prime) {
	                    myarray[j] = i;
	                }
	                if (j == 1000) {
	                    System.out.println(myarray[1000]);
	                    return;
	                }

	                j++;

	}

}
	}
}


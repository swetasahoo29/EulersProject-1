
class euler6
{
public static void main(String[] args) {
	int sumsq,sqsum,diff,n=100;
	sumsq=(n*(n+1))/2;
	sqsum=(n*(n+1)*((2*n)+1))/6;
	diff=(sumsq*sumsq)-sqsum;
	System.out.println(diff);	
}
}
        //25164150

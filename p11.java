class p11{
	public static void main(String args[]){
			int a=5, b=10, c=8;
			int res=-(b-c)*(c-a)*(a-b)*(b+c)*(c+a)*(a+b);
			System.out.println(" The solution for b^2c^(b^2-c^2)+c^2a^2(c^2-a^2)+a^2b^2(a^2-b^2) ="+res);
		}
	}
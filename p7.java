class p7{
	public static void main(String args[]){
		int a=1,b=9,c=5, d=((a-b)*(a-b))+((b-c)*(b-c))+((c-a)*(c-a));
		double res =0.5*(a+b+c)*d;
		System.out.println("a^3+b^3+c^3-3abc ="+res);
	}
}
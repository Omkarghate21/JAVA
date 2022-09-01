class p6{
	public static void main(String args[]){
		int a=1,b=1,c=3;
		int res =(a=b+c)*(a+b+c)-2*(a*b+b*c+c*a);
		System.out.println("a^2+b^2+c^2 ="+res);
	}
}
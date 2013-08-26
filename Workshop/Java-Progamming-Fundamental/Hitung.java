class Hitung {
	public static void main(String[]args){
		int a=2;
		final String stringA="A";
		final String stringB="B";
		String stringC=stringA+stringB;
		a=a++;
		System.out.println(a);
		a=++a;
		System.out.println(a);
		System.out.println(stringC);
	}
}

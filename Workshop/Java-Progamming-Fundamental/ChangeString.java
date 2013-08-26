class ChangeString {
	public static void main(String[]args){
		String aStr="   Geed ";
		String bStr="mernih!";
		String cStr=aStr.concat(bStr);
		
		System.out.println(cStr);
		String dStr=cStr.replace('e','o');
		System.out.println(dStr);
		String eStr=dStr.toLowerCase();
		System.out.println(eStr);
		String fStr=eStr.toUpperCase();
		System.out.println(fStr);
		String gStr=fStr.trim();
		System.out.println(gStr);
	}
}

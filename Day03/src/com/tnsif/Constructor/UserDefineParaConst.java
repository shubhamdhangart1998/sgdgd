package com.tnsif.Constructor;

public class UserDefineParaConst {

	int a;
	int b;
	
	public UserDefineParaConst() {
	
	a=10;
	b=20;
	
	}
	
	 UserDefineParaConst(int c, int d) 
	 {
      a=c;
      b=d;
      	 
	 }
	
	public void add()
	{
		System.out.println("addition");
		System.out.println(a+b);
	}
	
	public void sub()
	{
		System.out.println("sub");
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		
//		
//		UserDefineParaConst uc1=new UserDefineParaConst(25, 20);
//		uc1.show();
		
		UserDefineParaConst uc1=new UserDefineParaConst();
		uc1.add();
		uc1.sub();
		
		System.out.println();System.out.println();
		
		UserDefineParaConst uc2=new UserDefineParaConst(67, 33);
		uc2.add();
		uc2.sub();
		
		

	}

}

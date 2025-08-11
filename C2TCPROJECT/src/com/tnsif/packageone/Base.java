package com.tnsif.packageone;

public class Base {
 
	int varDefault;
	private int varprivate;
	public int varpublic;
	protected int varprotected;
	
	void methodDefault() {
		System.out.println("default access base class:");
		System.out.println("default variable:"+varDefault);
	}
	
	void methodPrivate() {
		System.out.println("default access base class:");
		System.out.println("default variable:"+varprivate);
	}
	void methodPublic() {
		System.out.println("default access base class:");
		System.out.println("default variable:"+varpublic);
	}
	void methodProtected() {
		System.out.println("default access base class:");
		System.out.println("default variable:"+varprotected);
	}
}

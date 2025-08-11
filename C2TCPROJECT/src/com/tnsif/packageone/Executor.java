package com.tnsif.packageone;

public class Executor {
   public static void main (String args[] ) {
	Base be = new Base();
	  be.varDefault=10;
	  be.varprotected=12;
	  be.varpublic=16;
	  be.methodDefault();
	 be.methodProtected();
be.methodPrivate();
	 be.methodPublic();

}
}
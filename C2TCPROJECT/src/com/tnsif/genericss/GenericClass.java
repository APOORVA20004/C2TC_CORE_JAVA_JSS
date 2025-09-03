package com.tnsif.genericss;

public class GenericClass<T> {

	T data;
	void set(T data) {
		this.data=data;
	}
	
	T get() {
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
}

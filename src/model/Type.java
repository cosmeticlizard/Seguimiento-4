package model;

public class Type<T> implements Comparable<T> {
	private T dato;
	private Type<T> next;
	

	public Type(T d) {
		this.dato = d;
	}
	public Type(T d, Type<T> n) {
		this.dato = d;
		this.next = n;
	}
	
	public Type<T> getNext() {
		return next;
	}
	
	public T getDato() {
		return dato;
	}
	
	
	
	public void setDato(T dato) {
		this.dato = dato;
	}
	public void setNext(Type<T> next) {
		this.next = next;
	}
	public void addNext(Type<T> next2){
		if(next!=null) {
			
			next.addNext(next2);
		}else {
			next=next2;
		}
	}
	
	public int compareTo(Type<T> type) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

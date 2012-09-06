package Oblig1;

public class Pair <F,S>{
	
	private F first;
	private S secound;
	
	public Pair(F first, S secound) {
		
		this.first = first;
		this.secound = secound;
	}
	
	
	
	public void setFirst(F first) {
		this.first = first;
	}


	public void setSecound(S secound) {
		this.secound = secound;
	}

	public F getFirst(){
		
		return first;
	}
	
	public S getSecound(){
		
		return secound;
	}
	
	
	
	

}

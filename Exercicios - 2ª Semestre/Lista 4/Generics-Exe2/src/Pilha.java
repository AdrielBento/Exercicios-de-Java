public class Pilha<T> {

	private Object[] list = new Object[10];
	private Integer topo = -1;
	
	public void empilha(T i) {
		
		if(this.topo != list.length) {
			this.topo++;			
			this.list[this.topo] = i;
		}else {
			System.out.println("Pilha cheia");
		}
	}

	public void desempilha() {

		if(this.topo > 0) {
			this.list[--topo] = null;
		}		
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();	
		sb.append("[");
		for(int i = (this.list.length-1); 0 <= i;i--) {
			if(this.list[i] != null) {
				sb.append(this.list[i] +",");				
			}
		}
		sb.append("]");
		return sb.toString();
	}

	public int length() {
		return this.list.length;
	}
}

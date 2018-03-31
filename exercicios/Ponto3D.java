
public class Ponto3D {

	int x = 0;
	int y = 0;
	int z = 0;
	String cor  = null;
	String intensidade = null;
		
	
	public Ponto3D(int x,int y,int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	   public String getCor() {
		return cor;
	}	   
	   public int getZ() {
		return z;
	}
	  public String getIntensidade() {
		return intensidade;
	}
	  public int getX() {
		return x;
	}
	  public int getY() {
		return y;
	}
	  public void setCor(String cor) {
		this.cor = cor;
	}
	  public void setIntensidade(String intensidade) {
		this.intensidade = intensidade;
	}public void setX(int x) {
		this.x = x;
	}public void setY(int y) {
		this.y = y;
	}public void setZ(int z) {
		this.z = z;
	}
	  
	 public double calculaDistancia(Ponto3D p){		
		 
		double result = 0.0;
		double x = Math.pow(p.x - this.x, 2);
		double y = Math.pow(p.y - this.y, 2);
		double z = Math.pow(p.z - this.z,2);
	    result = Math.sqrt(x + y+z);
		return result;		 
	  }
	
	
	
	
	
	
}

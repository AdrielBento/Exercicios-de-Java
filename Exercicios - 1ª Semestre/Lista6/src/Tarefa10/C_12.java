package Tarefa10;

public class C_12 extends C implements I1,I2 {

	Float[][] atr3 = new Float[0][0];

	public C_12() {
		this.atr3 = new Float[2][2];
		preencheMatrix(0f);
		
	}

	public C_12(String p1, float p2) {
		super(p1, p2);
		this.atr3 = new Float[3][3];
		preencheMatrix(1f);
	}

	public void preencheMatrix(Float value) {

		for (int i = 0; i < this.atr3.length; i++) {
			for (int j = 0; j < this.atr3.length; j++) {
				this.atr3[i][j] = value;
//				System.out.printf("%f",this.atr3[i][j]);
			}
		}

	}
	
	public void imprimeMatrix() {

		for (int i = 0; i < this.atr3.length; i++) {
			System.out.printf("Linha %d:",i);
			for (int j = 0; j < this.atr3.length; j++) {
				System.out.printf("[%f]",this.atr3[i][j]);
			}
			System.out.println("\n");
		}

	}
	
	@Override
	public void operacao2() {
		System.out.println("Entrei na operacao2");
		
	}

	@Override
	public void operacao1() {
		System.out.printf("Entrei na operacao1 !\nAtributo1:%s  Atributo2:%f\n",super.atr1,super.atr2);
		imprimeMatrix();
		
	}

}

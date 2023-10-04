public class Calculadora {
	private int _n1;
	private int _n2;

	public Calculadora() {
		this._n1=0;
		this._n2=0;
	}

	public Calculadora(int aNum_1, int aNum2) {
		this._n1=aNum_1;
		this._n2=aNum2;
	}

	public int sumar() {
		return this._n1+this._n2;
	}

	public int multiplicar() {
		return this._n1*this._n2;
	}

	public void setN1(int aNum1) {
		this._n1 = aNum1;
	}

	public void setN2(int aNum2) {
		this._n2 = aNum2;
	}
}
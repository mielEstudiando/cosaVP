public class CarroCompra {
	private int[][] _productos = new int[2][5];

	public CarroCompra() {
		for (int i=0; i<5; i++){
			this._productos[0][i]=1;
			this._productos[1][i]=1000;
		}
	} //cometí un error y puse un espacio
	//por lo cual tuve que modificarlo ahora
	//el error igual se ve en el diagrama

	public int calcularTotal() {
		int total = 0;
		for (int i=0; i<5; i++){
			total+=subtotal(this._productos[0][i], this._productos[1][i]);
		}
		return total;
	}

	public int subtotal(int cant, int precio) {
		Calculadora calculadora = new Calculadora(cant,precio);
		return calculadora.multiplicar();
	}

	public void mostrarTotal() {
		System.out.println("El total de su compra es: " + this.calcularTotal());
	}
}
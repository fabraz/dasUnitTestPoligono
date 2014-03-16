
public class Quadrado extends Poligono{

	private float lado; 
	
	public float calcularArea() {
		area = lado * lado; 
		return area;
	}
	
	
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

}

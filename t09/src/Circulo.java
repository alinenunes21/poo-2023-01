	public class Circulo {
	    private double x; // coordenada x do centro
	    private double y; // coordenada y do centro
	    private double raio;

	    // Construtor
	    public Circulo(double x, double y, double raio) {
	        this.x = x;
	        this.y = y;
	        this.raio = raio;
	    }

	    // Método para transladar o círculo
	    public void transladar(double deltaX, double deltaY) {
	        this.x += deltaX;
	        this.y += deltaY;
	    }

	    // Getters e Setters para os atributos
	    public double getX() {
	        return x;
	    }

	    public void setX(double x) {
	        this.x = x;
	    }

	    public double getY() {
	        return y;
	    }

	    public void setY(double y) {
	        this.y = y;
	    }

	    public double getRaio() {
	        return raio;
	    }

	    public void setRaio(double raio) {
	        this.raio = raio;
	    }
	}

	
	
	
	
	
	
	
	
}

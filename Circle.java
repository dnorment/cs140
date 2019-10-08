public class Circle{

	private double radius;

	public Circle(double r){
		radius = r;
	}

	public Circle(){
		this(1.0);
	}

	public double getArea(){
		return Math.PI * radius * radius;
	}

	public String toString(){
		return "circle(" + radius + ")";
	}

	public static void main(String[] args){
		Circle[] carr = new Circle[10];
		double sum = 0;
		for(int i=0; i<carr.length; i++){
			carr[i] = new Circle(i+1);
			sum+= carr[i].getArea();
		}
		System.out.printf("Total area = %f%n", sum);
	}
}

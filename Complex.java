public class Complex{

	private double a, b; //not int

	public Complex(double a, double b){
		this.a = a;
		this.b = b;
	}

	public Complex(){
		this(0,0);
	}

	public String toString(){
		return a + " + " + b + "i";
	}

	public boolean equals(Complex c2){
		return (a==c2.a)&&(b==c2.b);
	}

	public Complex multiply(Complex c2){
		Complex res = new Complex();
		res.a = a*c2.a - b*c2.b;
		res.b = a*c2.b + b*c2.a;
		return res;
	}

	public static void main(String[] args){
		Complex c1 = new Complex(1,2);
		Complex c2 = new Complex();
		System.out.println(c1);
	}

}

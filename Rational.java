public class Rational {

	private int num;
	private int den;

	public Rational(int p, int q){
		num = p;
		den = q;
	}

	public Rational(){
		this(0,1);
	}

	public void set(int p, int q){
		num = p;
		den = q;
	}

	public static int getNumerator(Rational r){
		return r.num;
	}

	public static int getDenominator(Rational r){
		return r.den;
	}

	public void print(){
		System.out.printf("%d/%d%n", num, den);
	}

	public static double getDouble(Rational r){
		return (double)r.num/r.den;
	}

	public Rational add(Rational r){
		// a/b + c/d = ad + bc / bd
		return new Rational(num * r.den + den * r.num, den * r.den);
	}

	public Rational multiply(Rational r){
		// a/b * c/d = ac/bd
		return new Rational(num * r.num, den * r.den);
	}

	public static void main(String[] args){
		Rational r1 =  new Rational(2,5);
		Rational r2 = new Rational();
		r2.set(1,4);
		System.out.println(getNumerator(r1)); //2
		System.out.println(getDenominator(r2)); //4
		r1.add(r2).print(); //13/20
		System.out.println(getDouble(r1.add(r2))); //0.65
		r1.multiply(r2).print(); //2/20
		System.out.println(getDouble(r1.multiply(r2))); //0.1
	}
}

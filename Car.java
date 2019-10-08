public class Car{

	private String number;
	private int speed;

	public Car(String number){
		this.number = number;
		speed = 0;
	}

	public void setSpeed(int newSpeed){
		if (0 < newSpeed && newSpeed < 150){
			speed = newSpeed;
		}
	}

	public String getNumber(){
		return number;
	}

	public String toString(){
		return number + ">" + speed;
	}

	public void accelerate(){
		speed += 5;
		if (speed > 150) {
			speed = 150;
		}
	}

	public void brake(){
		speed -= 5;
		if (speed < 0) {
			speed = 0;
		}
	}

	public static void main(String[] args){
		Car car = new Car("10");
		for(int i = 1; i <= 5; i++){
			car.accelerate();
			System.out.println(car);
		}
	}
}

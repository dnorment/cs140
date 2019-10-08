import java.util.Random;

public class RandomArray {

	private int[] randArray;

	Random rand = new Random();

	public RandomArray(int size){
		randArray = new int[size];
		for (int i = 0; i < randArray.length; i++){
			randArray[i] = rand.nextInt(100) + 1;
		}
	}

	public int getValue(int index){
		return randArray[index];
	}

	public int frequency(int num){
		int total = 0;
		for (int i = 0; i < randArray.length; i++){
			if (randArray[i] == num){
				total++;
			}
		}
		return total;
	}

	public static void main(String[] args){
		RandomArray randArr = new RandomArray(100);
		for (int i = 0; i < randArr.randArray.length; i++){
			System.out.print(randArr.randArray[i] + " ");
		}
		System.out.println();
		System.out.println(randArr.frequency(50));
	}
}

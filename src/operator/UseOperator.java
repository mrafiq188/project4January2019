package operator;

public class UseOperator {

	public static void main(String[] args) {
		int num1 = 309;
		int num2 = 100;
		if((num1>num2) && (num1 % 2 == 0)) {
			System.out.println(num1 + " is bigger than "+ num2 + ", " + num1 + " is even number");
		}else if(num1<num2){
			System.out.println(num2 + " is bigger than "+ num1);
		}else if(num1==num2){
			System.out.println(num2 + " is equals to "+ num1);
		}

	}
}

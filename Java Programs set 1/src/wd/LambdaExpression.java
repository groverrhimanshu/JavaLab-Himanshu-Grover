package wd;
interface Operation {
    double calculate(double a, double b);
}
public class LambdaExpression {

	public static void main(String[] args) {
		
		Operation add = (a, b) -> a + b;

        
        Operation subtract = (a, b) -> a - b;

        
        Operation multiply = (a, b) -> a * b;

        
        Operation divide = (a, b) -> a / b;
             
       

       
        double x = 20;
        double y = 5;

        
        System.out.println("Addition: " + add.calculate(x, y));
        System.out.println("Subtraction: " + subtract.calculate(x, y));
        System.out.println("Multiplication: " + multiply.calculate(x, y));
        System.out.println("Division: " + divide.calculate(x, y));
    }

	}



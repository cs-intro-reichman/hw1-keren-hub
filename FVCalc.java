// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currentValue= Double.parseDouble(args[0]); 
		double interest= Double.parseDouble(args[1]);
		double years= Double.parseDouble(args[2]);
		int futureValue= (int) (currentValue * Math.pow((1 + interest / 100.0), years));
		System.out.println("After " + (int)years +  " years, $" + (Double)currentValue + " saved at " + interest + "%" + " will yield $" + (int)futureValue);

	}
}
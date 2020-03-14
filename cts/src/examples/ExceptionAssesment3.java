package examples;

public class ExceptionAssesment3 {

	public static void main(String[] args) {
	
		float sum = 0,avg;
		try {
			for (int i = 0; i < args.length; i++) {
	            sum = sum + Integer.parseInt(args[i]);
	        }
			  avg=sum/args.length;
        System.out.println("The sum of the arguments passed is " + sum);
        System.out.println("The avg of the arguments passed is " + avg);
		}
		catch(NumberFormatException e) {
			System.out.println("unscucessful Numberformat exception");
		}

	}

}

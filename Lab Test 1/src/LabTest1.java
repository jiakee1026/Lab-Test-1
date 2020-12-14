import java.util.Scanner;
public class LabTest1 {
	
	public static void main(String[] args) {
		// question 1 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of item: ");
		int item = input.nextInt();
		
		System.out.print("Enter price of first item: RM");
		int priceitem1 = input.nextInt();
		System.out.print("Enter quantity of first item: ");
		int qtyitem1 = input.nextInt();
		System.out.println();
		
		System.out.print("Enter price of second item: RM");
		int priceitem2 = input.nextInt();
		System.out.print("Enter quantity of second item: ");
		int qtyitem2 = input.nextInt();
		System.out.println();
		
		System.out.print("Enter price of third item: RM");
		int priceitem3 = input.nextInt();
		System.out.print("Enter quantity of second item: ");
		int qtyitem3 = input.nextInt();
		System.out.println();
		
		int ttlpriceitem1 = priceitem1 * qtyitem1;
		int ttlpriceitem2 = priceitem2 * qtyitem2;
		int ttlpriceitem3 = priceitem3 * qtyitem3;
		double ttlprice3items = ttlpriceitem1 + ttlpriceitem2 + ttlpriceitem3;
		
		double discount = 0;
		if(ttlprice3items > 100) {
			discount =  ttlprice3items * 20/100;
		}
		
		else if(ttlprice3items < 100) {
			discount = ttlprice3items * 10/100;
		}
		
		System.out.println("Total price : RM" + ttlprice3items);
		System.out.println("Discount received: RM" + discount);
		System.out.println("Price to be paid: RM" + (ttlprice3items - discount ));
		System.out.println();
	
	// Question 2
		System.out.print("Enter sales: RM");
		int sales = input.nextInt();
		System.out.print("Enter hours worked: ");
		int hours = input.nextInt();
		
		double comission = 0;
		if(sales >= 150 && sales<=300 ) {
			comission = sales * 5/100;
		}
		
		else if(sales >= 301 && sales<=500) {
			comission = sales * 10/100;
		}
		
		else if(sales > 500) {
			comission = sales * 15/100;
		}
		
		
		int basichourlywages = 5;
		
		System.out.println("Comission: RM" + comission);
		System.out.println("Daily wages: RM" + (comission + (basichourlywages * hours)));
		
	}

}

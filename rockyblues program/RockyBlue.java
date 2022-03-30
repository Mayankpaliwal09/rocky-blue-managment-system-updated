/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rockyblue;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RockyBlue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Rocky Blues School");
		float cost_of_lession=(float) 29.95;
		DecimalFormat df = new DecimalFormat("0.00");
		int N=1;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		String minName ="";
		String maxName ="";
		float totalAmount=0;
		int totalLessons=0;
		
		while(N<=3) {
			
			System.out.print("Please Enter Booking Name  " +N+ " ==>" );
			String s=sc.nextLine();
			if(s.equals("")) {
				
				System.out.println("Booking Name Can Not Be Blank");
				N--;
			}else {
				System.out.print("Enter Number of Lessions for "+s+" ==>" );
				int no_of_lesson=sc.nextInt();
				totalLessons=totalLessons+no_of_lesson;
				
				if(no_of_lesson<=min && no_of_lesson>=0) {
					min=no_of_lesson;
					minName="";
					minName=minName+s;
				}
				if(no_of_lesson>=max) {
					max=no_of_lesson;
					maxName="";
					maxName=maxName+s;
				}
				
				while(no_of_lesson<=0) {
					System.out.println("No. of Lessons Must Be Greater Than Zero");
					System.out.print("Enter Number of Lessions for "+s+" ==>" );
					no_of_lesson=sc.nextInt();
					
				}
					float final_cost=cost_of_lession*no_of_lesson;
					System.out.print(s+" Do You Want To Purchage a Guitar for  $199 (y/n) ==>");
					String agree=sc.next();
					if(agree.equals("y")) {
						float discounted_price;
						if(no_of_lesson>5 && no_of_lesson<=10 ) {
							 discounted_price=final_cost- (final_cost*10/100);
							 float Guitar_and_lessons_price=discounted_price+199;
							 totalAmount+=discounted_price+199;
							 System.out.println("The Charge for "+s+" for "+no_of_lesson+" lessons And Guitar is $"+df.format(Guitar_and_lessons_price));
							
						}
						else if(no_of_lesson>10) {
							discounted_price=final_cost- (final_cost*20/100);
							float Guitar_and_lessons_price=discounted_price+199;
							System.out.println("The Charge for "+s+" for "+no_of_lesson+" lessons And Guitar is $"+df.format(Guitar_and_lessons_price));
							totalAmount+=discounted_price+199;
						}
						else {
							discounted_price=final_cost;
							float Guitar_and_lessons_price=discounted_price+199;
							System.out.println("The Charge for "+s+" for "+no_of_lesson+" lessons And Guitar is $"+df.format(Guitar_and_lessons_price));
							totalAmount+=discounted_price+199;
						}
						
					}
					else {
						float discounted_price;
						if(no_of_lesson>5 && no_of_lesson<=10 ) {
							 discounted_price=final_cost- (final_cost*10/100);
							 totalAmount+=discounted_price;
							 System.out.println("The Charge for "+s+" for "+no_of_lesson+" lessons is $"+df.format(discounted_price));
							
						}
						else if(no_of_lesson>10) {
							discounted_price=final_cost- (final_cost*20/100);
							System.out.println("The Charge for "+s+" for "+no_of_lesson+" lessons is $"+df.format(discounted_price));
							totalAmount+=discounted_price;
						}
						else {
							discounted_price=final_cost;
							System.out.println("The Charge for "+s+" for "+no_of_lesson+" lessons is $"+df.format(discounted_price));
							totalAmount+=discounted_price;
						}
					}
				}
				
			N++;
                }
		int avgLessons=totalLessons/3;
		System.out.println();
		System.out.println();
		System.out.println("Statical Information for Rocky Blue");
		System.out.println();
		System.out.println(minName+" has the minimum no. of "+min+" lessions");
		System.out.println(maxName+" has the maximum no. of "+max+" lessions");
		System.out.println("The Average no. of  lessions is: "+avgLessons);
		System.out.println("Total Charges Collected is: $"+df.format(totalAmount));
		System.out.println();
		System.out.println();
		System.out.println("Thank you for using Rocky Blue School management");
	}
	
    
    }
    
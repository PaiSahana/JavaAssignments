package inputdatafromuser;

import java.util.Scanner;

public class inputdatafromuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String value;//defined the variables
 int number;
 char character;
 double percentage;
 short number2;//short long store only numbers but the range is different
 //short less range,long more range
 long number3;
 Scanner sc=new Scanner(System.in);//sc is an object of scanner class
 System.out.println("Enter one string data type,one number,one character,one double value,one short,one long");
 value=sc.next();//.next method is used to read string data type
 number=sc.nextInt();//nextInt method is used to store integer data type
 character=sc.next().charAt(0);//next method is used to read character data after that we have to specify the position of the character and it is always 0 index.
 //java-j=0,a=1,v=2,a=3//array
 percentage=sc.nextDouble();
 number2=sc.nextShort();
 number3=sc.nextLong();
 System.out.println(value);
 System.out.println(number);
 System.out.println(character);
 System.out.println(percentage);
 System.out.println(number2);
 System.out.println(number3);
 
 
	}

}

package assignement1_2;
import java.util.*;

public class AssignmentQ2 {
	
public static void main(String args[]){
		//Creating Scanner object
		Scanner inpScan = new Scanner(System.in);
		
		System.out.println("Please enter Numbers to add");
						
		try{
			//Taking input from user
			int firstNum=inpScan.nextInt();
			int secNum=inpScan.nextInt();
			//Calling add function
			int outputNum=addIterative(firstNum,secNum);
			//Printing result
			System.out.println("Sum of given numbers :"+outputNum);
		//Catching input mismatch exception if other than integer is entered by user	
		}catch(InputMismatchException exception){
			exception.printStackTrace();
		}
		finally{
			//close scanner
			inpScan.close();
		}
		
		
}
	//Add function using xor to perform sum of two numbers
	public static int addIterative(int firstNum, int secondNum){ 
        while (secondNum != 0){
            int carry = (firstNum & secondNum) ; 
          
            firstNum = firstNum ^secondNum; //SUM of two bits is A XOR B
          
            secondNum = carry << 1; //shifts carry to 1 bit to calculate sum
        }
        //return the result
        return firstNum;
    }
	
}




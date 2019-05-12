package algo;

import java.util.*;
public class Recursion {
	
  
  			
  
  
 	public boolean NumCorrect(int num){
      int num1=2;
      int num2=5;
      int number=num;
      while(number>0){
       // System.out.println(2%10);
       int rem=number%10;
        
       //System.out.println(rem);
        if((rem!=num1) && (rem!=num2)) {
        	//System.out.println("bro");
          return false;
        }
        
        number=number/10;
       // System.out.println("Hello");
        
        if(rem==2 || rem==5){
          if(number<0)
            return true;
          else
            NumCorrect(number);
        }
      }
      return true;
    } 
 	 
  	public  void printSequence(int range){
      		
	  
      for(int i=1;i<=range;i++){
        
      		if(NumCorrect(i))
              System.out.println(i);
      
		}
}
 public static void main(String []args){
   
   Recursion ss=new Recursion();
   
   Scanner sc=new Scanner(System.in);
   int r=sc.nextInt();
      
   ss.printSequence(r);
   
 } 
  
  
  
  
  
}












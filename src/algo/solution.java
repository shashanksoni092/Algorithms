package algo;

import java.util.Scanner;

public class solution {
public static void printSequence(int range){
if(range < 2){
return;
}
if(range < 5){
System.out.println("2");
return;
}
String[] str = {"2","5"};
print(range,str);
}
public static  void print(int n,String[] result){
/*
* base case is not added on the top because range may be exceeded in
between
*/
int x =2;
String[] newresult = new String[result.length*3];
int k=0;
for(int i=0;i<result.length;i++){
newresult[k++] = result[i];
}
for(int j=0;j<2;j++,x=5){
for(int i=result.length/3;i<result.length;i++){
if(Integer.parseInt(newresult[k-1])>n){ //base case
printStr(newresult,k-1);
return;
}
newresult[k++]=x+result[i];
}
}
print(n,newresult);
}
public static void printStr(String[] str,int l){
for(int i =0;i<l;i++){
System.out.println(str[i]);
}
}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int range=sc.nextInt();
	solution ss=new solution();
	solution.printSequence(range);
	
}
}







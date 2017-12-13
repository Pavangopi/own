package hello;
import java.io.*;
public class array {
public static void main(String args[])throws IOException{
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in)); 
	int A[]=new int[10]; 
	for(int i=0;i<10;i++) 
	{ 
	System.out.println("Enter a number : "); 
	A[i]=Integer.parseInt(br.readLine()); 
	} 
	System.out.println("printing the array : "); 
	for(int i=0;i<10;i++) 
	{ 
		System.out.println(A[i]); 
	}

}
}
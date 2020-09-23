import java.util.*;
public class vowels{
    public static void main(String[] arugs){
		char v;
		boolean vowel =true;
		System.out.println("Enter the charcter:");
		Scanner input=new Scanner(System.in);
		v=input.next().charAt(0);
		System.out.println("you have enterd "+"  "+v);
		switch(v)
		{
			case 'a' :
			    
			case 'e' :
			   
			case 'i':
			   
			case 'o':
			    
			case 'u':
			         vowel= true;
			         
		}
		if(vowel==true){
			System.out.println("Given charcter is vowel");
		}
		else if(vowel==false){
			System.out.println("given charcter is consonant");
		}
		
	
			     
	}

	
}
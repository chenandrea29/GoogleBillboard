import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
public void setup()  
{            
	// String digits = e.substring(2,12);
	// double dNum = Double.parseDouble(digits);
	// System.out.println(dNum); //displays 7.182818284E9
    noLoop();  
}  
public void draw()  
{   
	//not needed for this assignment
	for (int i = 1; i < e.length()-10; i++) {
		String digits = e.substring(i, i+10);
		double dNum = Double.parseDouble(digits);
		boolean prime = isPrime(dNum);
		if (prime == true) {
			System.out.println(dNum);
		}
	}
}  
public boolean isPrime(double dNum)  
{   
	if (dNum <= 1) {
		return false;
	}
    for (int i = 2; i <= Math.sqrt(dNum); i++) {
    	if(dNum%i==0) {
    		return false;
    	}
    }   
    return true;  
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

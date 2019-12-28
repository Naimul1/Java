package Lesson1;

public class findMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k, l, temp;
		 i = 10;
		 j = 15;
		 k = 20;
		 l = 25;
		temp = l;
		
		if (i > j && i > k && i > l) {
		temp = i; 
	} else if (j > i && j > k && j > l) {
		temp = j; 
	
	} else if (k > i && k > j && k > l) {
		temp = k; 
	} else {
		temp = l; 
	}
		System.out.println ("Max number is " + temp);
	  }
	}


//did it in class-----
/*int x, y, g, temp;

x = 10;
y = 15;
g = 20;
temp = x;

if (x > y && x > g) {
	temp = x; 
}else if (y > x && y > g) 
{ 
temp = y; 

} else {
	temp = g;
}
	
System.out.println ("Max value is " + temp );
}
}*/




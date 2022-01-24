package collections;

public class Functions {

	public static void main(String[] args) {
		
        int total = sum(4,9);
        System.out.println(total);
        data();
        
	}

	public static int sum(int a, int b) {
		
		return a + b;
	}
	
	public static void data() {
		
		int array[]= {12, 3, 8, 0, 99, 123, 68, 40};
		int min = array[0];
		int max= array[0];
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i]>max) max = array[i];
			
			if(array[i]<min) min = array[i];
				
		}
		System.out.println("The maximum number is :" + max);
		System.out.println("The minimum number is :" + min);
	}
}

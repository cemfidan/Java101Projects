import java.util.Arrays;

public class ArrayFrequency {

	public static void main(String[] args) {
		
		int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
		
		int[] count = new int[list.length];
		
        System.out.println("Array: "+ Arrays.toString(list));
        
        for (int i = 0; i <list.length; i++) {
            count[i]=1;
        }
        for (int i = 0; i < list.length ; i++) {
            for (int j = 0; j < list.length ; j++) {
                if ((i != j) && (list[i] == list[j]))  {
                    count[i]++;
                }
            }
        }
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length ; j++) {
                if ((j != i) && (list[i] == list[j]) ) {
                    count[j]=count[i];
                }
            }
        }
        System.out.println("Repeating numbers");
        
        for (int i = 0; i< list.length ; i++) {
            if (i !=0) {
                System.out.println("Number " + list[i]+" repeated "+count[i]+" times.");
            }
        }
	}
}

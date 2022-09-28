import java.util.Arrays;

public class RepeatingEvenNumb {

	public static void main(String[] args) {
		
		int origin = 0;
		
		int[] list = {2, 5, 11, 8, 6, 2, 12, 17, 8};
		
		int[] evenNumb = new int[list.length];
		
		System.out.println("Array: " + Arrays.toString(list));
		
		System.out.print("Repeating even numbers: ");
		
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(evenNumb, list[i])) {
                    	evenNumb[origin++] = list[i];
                        break;
                    }
                }
            }
        }
        
        for (int value : evenNumb) {
            if ((value != 0) && (value % 2 != 1)) {
                System.out.print(value + " ");
            }
        }
	}

	static boolean isFind(int[] arr, int value) {

        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}

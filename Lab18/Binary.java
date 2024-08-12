
import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            a[i] = sc.nextInt();
        }
        int left = 0;
        int right = size;
        int middle = 0;

        System.out.print("Enter element to be searched: ");
        int target = sc.nextInt();

        while(left<right){
			middle = (left+right)/2;
			if(a[middle]==target){
				System.out.println("Index is : "+middle);
				return;
			}
			else if(a[middle]>target){
				right = middle-1;
				
			}
			else if(a[middle]<target){
				left = middle+1;
			
				
			}
			else{
				System.out.println("Element not found");
				
			}
		}
        }
    }

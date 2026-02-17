package leetProblems;
import java.util.*;
public class removeElement_LC_27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
		int[] nums = new int[l];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}
		int n = 0;
		int val = input.nextInt();
		for(int i = 0; i < l; i++) {
			if(nums[i]!=val) {
				nums[n] = nums[i];
				n++;
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(nums[i]+" ");
		}
		input.close();
	}

}

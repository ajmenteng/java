import java.util.Arrays;

public class RemoveDuplicates{
    public static int[] removeDuplicates(int[] nums) {
    	if(nums.length <= 1){
    		return nums;
    	}
		int i = 0;
		boolean found = false;
    	for(int j = 1; j < nums.length; j++){
    		if(nums[j] == nums[j-1]){
    			found = true;
    		}
    		else if(nums[j] != nums[j-1] && found == true){
    			nums[i+1] = nums[j];    
    			i++;
    			found = false;
    		}
    		else{
    			nums[i+1] = nums[j];    
    			i++;
    		}
    	}
    	int[] newnums = new int[i+1];
    	for(int k = 0; k < i+1; k++){
    		newnums[k] = nums[k];
    	}
    	
    	return newnums;
    	
    }
    public static void main(String args[]){
    	int[] arr = new int[] {1,1,2,3};
    	try{
    		System.out.println(Arrays.toString(removeDuplicates(arr)));
    	}
    	catch(ArrayIndexOutOfBoundsException e){
    		System.out.println("Wrong input");
    	}
    }
}
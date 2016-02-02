import java.util.Arrays;

public class RemoveDuplicates{
    public static int[] removeDuplicates(int[] nums) {
    	/*
    	 * IF THE ARRAY IS EMPTY OR HAS ONLY ONE ELEMENT,
    	 * THEN RETURN THE ORIGINAL ARRAY
    	 */
    	if(nums.length <= 1){
    		return nums;
    	}
    	
    	/*
    	 * USE TWO POINTERS (i) & (j)
    	 * AND A FLAG (found) TO INFORM IF DUPLICATE IS FOUND
    	 */
		int i = 0;
		boolean found = false;
    	
		/*THE 2ND POINTER (j) IS ALWAYS AHEAD OF (i)
		 */
		for(int j = 1; j < nums.length; j++){
    		if(nums[j] == nums[j-1]){
    			found = true;
    		}
    		
    		/*
    		 * COMPARE AN ELEMENT WITH THE PREVIOUS ELEMENT
    		 * IF DIFFERENT AND THE FOUND IS TRUE, THAT MEANS
    		 * FROM THE PREVIOUS ELEMENT UNTIL THE 1ST POINTER
    		 * ARE DUPLICATES.
    		 * MOVE THE DIFFERENT ELEMENT ENCOUNTERED TO A POSITION
    		 * NEXT TO THE 1ST ELEMENT
    		 */
    		else if(nums[j] != nums[j-1] && found == true){
    			nums[i+1] = nums[j];    
    			i++;
    			found = false;
    		}
    		
    		/*
    		 * IF NO DUPLICATE IS FOUND, THEN MOVE THE POINTER ACCORDINGLY
    		 */
    		else{
    			nums[i+1] = nums[j];    
    			i++;
    		}
    	}
		
		/*
		 * CREATE A NEW ARRAY, AND COPY THE CONTENTS
		 * FROM THE ORIGINAL ARRAY BUT ONLY UNTIL THE POSITION
		 * WHERE THE 1ST POINTER IS LOCATED (+ 1)
		 */
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
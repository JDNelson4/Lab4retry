

public class Lab4
{
   public static void main(String[] args)
   {
      int[] numArray = new int[]{3,1,6,3,2};
      sortArray(numArray);
      for(int numb : numArray)
      {
         System.out.print(numb);
      }
   
   }
   
   public static int[] sortArray(int[] nums)
   {
      boolean change = true;
      while(change)
      {
         change = false;
         for(int i = 4; i > 0; i--)
         {
            if(nums[i]>nums[i-1])
            {
               int temp = nums[i]; //Placeholder so I don't lose the value
               nums[i] = nums[i-1];
               nums[i-1] = temp;
               change = true;
            }
         }
      }
      return nums;
   }
}
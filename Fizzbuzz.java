public class Fizzbuzz {
  public static void main(String[] args) {
    int x = 3;
    int y = 5;
    int z = 15;
    int a = 53;
    
    int[] nums = {x, y, z, a};
    
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 15 == 0) {
            System.out.println("fizzbuzz");
        }
        
        else if (nums[i] % 5 == 0) {
            System.out.println("buzz");
        }
        
        else if (nums[i] % 3 == 0) {
            System.out.println("fizz");
        }
        
        else {
            System.out.println("hi");
        }
    }
  }
}
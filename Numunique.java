import java.util.ArrayList;

class Numunique {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(nums[0]);

        for (int j = 1; j < nums.length; j++) {

            if (nums[i] < nums[j]) {
                i = j;
                arr.add(nums[j]);
            }
        }

        return arr.size();
    }

    public static void main(String[] args) {

        Numunique obj = new Numunique();

        int[] nums = { 1, 1, 2, 2, 3, 4, 4, 5 };

        int result = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + result);
    }
}

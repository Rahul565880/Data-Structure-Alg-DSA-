
    import java.util.*;

    public class RemoveDuplicateFromSortedArray {
        public int removeDuplicates(int[] nums) {

            Set<Integer> st = new HashSet<>();

            for(int num : nums) {
                st.add(num);
            }

            int i = 0;

            for(int arr : st) {
                nums[i++] = arr;
            }

            return st.size();
        }
    }


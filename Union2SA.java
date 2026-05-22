import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int i =0;
        int j =0;
        List<Integer> union = new ArrayList<>();
        while(i<nums1.length&& j<nums2.length){
            if(nums1[i]<nums2[j]){
                if(union.isEmpty()||union.get(union.size()-1)!= nums1[i]){
                    union.add(nums1[i]);
                   
                }
                 i++;
            }
           else if(nums2[j]<nums1[i]){
                if(union.isEmpty()|| union.get(union.size()-1)!=nums2[j]){
                    union.add(nums2[j]);
                   
                }
                 j++;
            }
            else{
                if(union.isEmpty()||union.get(union.size()-1 )!= nums1[i]){
                    union.add(nums1[i]);
                 
                }
                   i++;
                    j++;
            }

        }
        while(i<nums1.length){
            if(union.isEmpty()|| union.get(union.size()-1)!= nums1[i]){
                union.add(nums1[i]);
               

            }
             i++;
        }

        while(j<nums2.length){
            if(union.isEmpty()||union.get(union.size()-1)!= nums2[j]){
                union.add(nums2[j]);
               
            }
             j++;
        }

        int [] uni = new int[union.size()];
        for(int q =0;q<union.size();q++){
            uni[q]= union.get(q);
        }

        return uni;
        
    }
}

public class Union2SA {
    public static void main(String[] args) {
        int [] arr1={1,1,2,3,4,5};
        int [] arr2={1,2,3,4,5,6};
        Solution s1 = new Solution();
        int [] arr= s1.unionArray(arr1, arr2);
        for(int p :arr){
            System.out.print(p+ " ");
        
        }
        
    }
}

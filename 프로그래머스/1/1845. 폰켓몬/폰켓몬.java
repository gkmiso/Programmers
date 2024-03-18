import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(temp.size() < nums.length/2 && !temp.contains(nums[i])) {
                temp.add(nums[i]);
            }
        }
        return temp.size();
    }
}
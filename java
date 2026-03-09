//score of a string
class Solution {
    public int scoreOfString(String s) {
    int sum=0;
    for(int i=0;i<s.length()-1;i++) sum+=Math.abs(s.charAt(i)-s.charAt(i+1));
    return sum;

    }
}
//concatenation-of-array
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0;i<ans.length;i++) ans[i]=nums[i%nums.length];
        return ans;
    }
}
//duplicate-integer
class Solution {
    public boolean hasDuplicate(int[] nums) {
     HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(!set.add(n)) return true;
        }
        return false;   
    }
}

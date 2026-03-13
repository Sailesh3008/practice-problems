class Solution {
    public int scoreOfString(String s) {
    int sum=0;
    for(int i=0;i<s.length()-1;i++) sum+=Math.abs(s.charAt(i)-s.charAt(i+1));
    return sum;
    }
}
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0;i<ans.length;i++) ans[i]=nums[i%nums.length];
        return ans;
    }
}
class Solution {
    public boolean hasDuplicate(int[] nums) {
     HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(!set.add(n)) return true;
        }
        return false;   
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
char[] a=s.toCharArray(),b=t.toCharArray();java.util.Arrays.sort(a);java.util.Arrays.sort(b);return java.util.Arrays.equals(a,b);
    }
}
class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for(int i = arr.length - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }
        return arr;
    }
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)) i++;
            j++;
        }
        return i==s.length();
    }
}

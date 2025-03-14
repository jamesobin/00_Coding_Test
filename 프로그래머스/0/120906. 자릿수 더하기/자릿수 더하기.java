class Solution {
    public int solution(int n) {
        int sum = 0;
        
        String ns = Integer.toString(n);
        
        for(int i = 0; i < ns.length(); i++) {
            sum += Character.getNumericValue(ns.charAt(i));
        }
        
        return sum;
    }
}
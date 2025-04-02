class Solution {
    public int solution(String A, String B) {
//         int answer = 0;
//         String checkString = A + A;
        
//         if(checkString.contains(B)) {
//             while(!A.equals(B)) {
//                 A = A.charAt(A.length()-1) + A.substring(0, A.length()-1);
//                 answer ++;
//             }
//         } else {
//             answer = -1;
//         }

//         return answer;
        
        String doubledB = B + B;

        int index = doubledB.indexOf(A);
        
        return index;
        
    }
}
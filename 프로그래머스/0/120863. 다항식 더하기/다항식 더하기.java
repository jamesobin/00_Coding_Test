class Solution {
    public String solution(String polynomial) {
        String[] slist = polynomial.split(" ");
        int num1 = 0;
        int num2 = 0;

        for(int i = 0; i < slist.length; i += 2) {
            if(slist[i].contains("x")) {
                int tmp = 0;
                if(slist[i].equals("x")) {
                    tmp = 1;
                } else {
                    tmp = Integer.parseInt(slist[i].substring(0, slist[i].length()-1));
                }

                num1 += tmp;
            } else {
                int tmp = Integer.parseInt(slist[i]);
                num2 += tmp;
            }
        }

        String answer = "";
        
        if(num1 == 0) {
            answer = Integer.toString(num2);
        } else if(num1 == 1) {
            if(num2 != 0) {
                answer = "x + " + num2; 
            } else {
                answer = "x";
            }
        } else {
            if(num2 != 0) {
                answer = num1 + "x + " + num2;
            } else {
                answer = num1 + "x";
            }
        }

        return answer;
    }
}
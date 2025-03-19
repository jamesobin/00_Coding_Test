class Solution {
    public int solution(String[] spell, String[] dic) {
        for(int i = 0; i < spell.length; i++) {
            for(int j = 0; j < dic.length; j++) {
                if(!dic[j].contains(spell[i])) {
                    dic[j] = "";
                }
            }
        }

        // for(String spellString:spell) {
        //     for(String dicString:dic) {
        //         if(!dicString.contains(spellString)) {
        //             dicString = "";
        //         }
        //     }
        // }

        int count = 0;

        for(String dicString:dic) {
            if(dicString.equals("")) {
                count ++;
            }
        }

        if((dic.length - count) > 0) {
            return 1;
        } else {
            return 2;
        }
    }
}
package org.example;

public class StringCal {
    public int stringCalculator(String str){
        if(str == "") {
            return 0;
        }else if(str.length() == 1){
            return Integer.valueOf(str);
        }

        int ans = 0;
        String[] number = str.split(",");
        int size = number.length;

        for(int i =0; i<size; i++){
            ans += Integer.valueOf(number[i]);
        }

       return ans;
    }
}

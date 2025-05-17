package org.example;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class StringCal {
    public int stringCalculator(String str){
        if(str == "") {
            return 0;
        }else if(str.length() == 1){
            return Integer.valueOf(str);
        }
        String delimiterLine = "[,\n]";
        if(str.startsWith("//")){
            int newLineIndex = str.indexOf("\n");
            if(newLineIndex == -1){
                throw new RuntimeException("Invalid input !!");
            }
            delimiterLine = str.substring(2,newLineIndex);

            int j =0;
            int start = 0;
            ArrayList<String> delimiters = new ArrayList<>();
            while(j<delimiterLine.length()){
                if(delimiterLine.charAt(j) == '['){
                    start = j;

                    delimiters.add(Pattern.quote(delimiterLine.substring(start+1,delimiterLine.indexOf(']',j))));
                    j = delimiterLine.indexOf(']',j);
                }
                j++;
            }
            if(delimiters.size()>0) {
                delimiterLine = "[,\n]|" + String.join("|", delimiters);
            }else{
                delimiterLine = "[,\n]|" + Pattern.quote(delimiterLine);
            }
           str = str.substring(newLineIndex+1);
        }
        int ans = 0;
        ArrayList negative = new ArrayList();
        boolean negFlag = false;
        String[] number = str.split(delimiterLine);
        int size = number.length;

        for(int i =0; i<size; i++){
            if(number[i].isEmpty()) continue;
            int no = Integer.valueOf(number[i]);
            if(no<0) {
                negFlag = true;
                negative.add(number[i]);
            }
            if(no<=1000) {
                ans += no;
            }
        }

        if(negFlag){
            throw new RuntimeException("negative numbers not allowed "+String.join(",",negative));
        }
       return ans;
    }
}

package org.example;

public class StringCal {
    public int stringCalculator(String str){
        if(str == "") {
            return 0;
        }else if(str.length() == 1){
            return Integer.valueOf(str);
        }
        String delimiter = "[,\n]";
        if(str.startsWith("//")){
           String[] input =  str.split("/n",2);
            delimiter = "[,/n]|" + input[0].substring(2,3);
           str = input[1];
        }
        int ans = 0;
        String exceptionMsg = "negative numbers not allowed ";
        boolean negFlag = false;
        String[] number = str.split(delimiter);
        int size = number.length;

        for(int i =0; i<size; i++){
            if(number[i].isEmpty()) continue;
            int no = Integer.valueOf(number[i]);
            if(no<0) {
                negFlag = true;
                exceptionMsg += number[i];
            }
            ans += no;
        }

        if(negFlag){
            throw new RuntimeException(exceptionMsg);
        }
       return ans;
    }
}

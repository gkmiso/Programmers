import java.util.*;

class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase()//1
            .replaceAll("[^abcdefghijklmnopqrstuvwxyz1234567890\\-\\_\\.]", "")//2
            .replaceAll("[.]{2,}", ".")//3
            .replaceAll("^[.]|[.]$", "") ;//4      
        if(new_id.equals("")) { new_id = "a";};//5
        if( new_id.length() > 15 )  { new_id = new_id.substring(0, 15).replaceAll("[.]$", "") ;}//6
        while(new_id.split("").length <= 2){
            new_id += new_id.substring(new_id.length() - 1);
        }//7
        return new_id;
    }
}
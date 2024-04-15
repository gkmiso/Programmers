import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> temp = new ArrayList<Long>();
        while(n>10){
            temp.add(n%10);
            n = (n-(n%10))/10;
        }
        temp.add(n);
        Collections.sort(temp);
        for(int i=0;i<temp.size(); i++){
            answer += (long)(Math.pow(10,i)*temp.get(i));
        }
        return answer;
    }
}
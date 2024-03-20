import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>(); //int형 스택 선언
        stack.add(arr[0]); // stack에 arr[0] 추가
        for(int i = 1; i < arr.length; i++){
            if(stack.peek() != arr[i]){ // peek() : 스택의 가장 위에 있는 값 출력
                stack.push(arr[i]); // stack에 값 arr[i]추가
            }
        }
        int answer[] = new int[stack.size()];
        for(int i = answer.length-1; i >= 0; i--){
            answer[i] = stack.pop(); // stack에 값 제거
        }

        return answer;
    }
}
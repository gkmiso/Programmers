class Solution {
    public int[] solution(int start_num, int end_num) {
        int difference = end_num - start_num;
        int[] answer = new int [difference + 1];
        
        for(int i = 0; i <= difference; i++) {
                answer[i] = start_num++;
        }
        
        return answer;
    }
}
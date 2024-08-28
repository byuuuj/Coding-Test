import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer = new int[2];
        int count1 = 0;
        int count2 = 0;
        
        for(int i = 0; i < num_list.length ; i++) {
            if(num_list[i] % 2 == 0){
                count1 += 1;
            }else{
                count2 += 1;
            }
        }
        
        answer[0] = count1;
        answer[1] = count2;
        
        
        return answer;

        // 다른 사람이 한 풀이
        // 짝수 홀수 2의 나머지는 0 아니면 1만 나오기때문에 짝수이면 배열의 0번째에 ++ , 홀수이면 배열의 1번째에 ++ 하도록 작성
        // int[] answer = new int[2];

        // for(int i = 0; i < num_list.length; i++)
        //     answer[num_list[i] % 2]++;

        // return answer;
    }
}

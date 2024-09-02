import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int a = 0; a < array.length; a++){
            if( array[a] == n ){
                answer++;
            }
        }
        return answer;
    }
}
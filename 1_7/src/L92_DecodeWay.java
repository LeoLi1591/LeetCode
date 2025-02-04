import java.util.HashMap;
import java.util.Map;

public class L92_DecodeWay {
    Map<Integer,Integer> map = new HashMap<>();
    public int numDecodings(String s) {
        if (s.isEmpty()){
            return 0;
        }
        return helper(0,s);

    }

    private int helper(int index, String s){
        // check if we have already calculated this index
        if (map.containsKey(index)){
            return map.get(index);
        }

        // check it reaches the max
        if (index == s.length()){
            return 1;
        }

        // if index start at 0 return 0
        if (s.charAt(index) == '0'){
            return 0;
        }

        if (index == s.length() - 1){
            return 1;
        }

        int ans = helper(index + 1, s);
        if (Integer.parseInt(s.substring(index, index + 2)) <= 26){
            ans+= helper(index+2,s);
        }

        map.put(index,ans);

        return ans;
    }
}

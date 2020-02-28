public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        Map<String, List<Integer>> map = new HashMap<>();
        int max = 0;
        for(int i=0; i<A.size(); i++){
            String key = findKey(A.get(i));
            if(!map.containsKey(key)){
                List<Integer> list = new ArrayList<>();
                list.add(i+1);
                max = Math.max(max, list.size());
                map.put(key, list);
            }else{
                List<Integer> list = map.get(key);
                list.add(i+1);
                max = Math.max(max, list.size());
                map.put(key, list);
            }
        }
        
        return new ArrayList(map.values());
        
    }
    
    public String findKey(String str){
        int[] arr = new int[26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            arr[ch-'a']++;
        }
        StringBuffer sb = new StringBuffer("");
        for(int i=0; i<26; i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}

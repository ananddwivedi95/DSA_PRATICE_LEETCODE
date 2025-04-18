class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<>();
        for(String word: strs)
        {
            char[] charr=word.toCharArray();
            Arrays.sort(charr);
            String sortedWord= new String(charr);

            if(!map.containsKey(sortedWord))
            {
                map.put(sortedWord,new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
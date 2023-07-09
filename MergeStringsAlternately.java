class Solution {
    public String mergeAlternately(String word1, String word2) {
        // first add both Strings size to decalue a array
        int n = word1.length() + word2.length();
        char arr[] = new char[n];
        // declare variable i,j and count to traverse on both string and a array
        int i=0,j=0,count=0;
        // While i and j less than their respectively strings
        while(i<word1.length() && j<word2.length()){
            // write even and odd condition to add characters alternatively
            if(count%2==0){
                arr[count++]=word1.charAt(i++);
            }else{
                arr[count++]=word2.charAt(j++);
            }
        }
        // if elements left in word1 then it will be execute
        while(i<word1.length()){
            arr[count++]=word1.charAt(i++);
        }
        // if elements left in word2 then it will be execute
        while(j<word2.length()){
            arr[count++]=word2.charAt(j++);
        }
        // declare another string to return the final answer
        String ans = new String(arr);
        return ans;
    }
}
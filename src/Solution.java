public class Solution {
    int splitDistinct(int n,String str)
    {
        int[]arr1=new int[26];
        int[]arr2=new int[26];
        int count1=0;
        int count2=0;
        // Iterate over the characters of the string, except for the last character
        for (int j=0;j<n-1;j++)
        {
            // Check if the current character is encountered for the first time in the first part
            if (arr1[(int)str.charAt(j)-(int)'a']==0)
            {
                count1++;// Increment the count of distinct characters in the first part

            }
            arr1[(int)str.charAt(j)-(int)'a']++;// Increment the count of the current character in arr1

        }
        arr2[(int)str.charAt(n-1)-(int)'a']=1;
        count2=1;// Increment the count of distinct characters in the second part
        int pointer1=n-2;// Initialize the pointer to the second-to-last character
        int maxvalue=count1+count2; // Initialize the maximum number of distinct characters

        while (pointer1>=0) // Iterate over the characters in reverse order (second part of the split)
        {
            // Check if the last occurrence of the current character in the first part
            if (arr1[(int)str.charAt(pointer1)-(int)'a']==1)
            {
                count1--;// Decrement the count of distinct characters in the first part
            }
            arr1[(int)str.charAt(pointer1)-(int)'a']--;// Decrement the count of the current character in arr1
            // Check if the first occurrence of the current character in the second part
            if (arr2[(int)str.charAt(pointer1)-(int)'a']==0) {
                count2++;// Increment the count of distinct characters in the second part
            }
            arr2[(int)str.charAt(pointer1)-(int)'a']++;// Increment the count of the current character in arr2
            maxvalue=Math.max(maxvalue,count1+count2);// Update the maximum number of distinct characters
            pointer1--;// Move to the previous character

        }

        return maxvalue;
    }
}

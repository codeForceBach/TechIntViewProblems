package org.example.ArrayHashing;

import java.util.*;

public class ArrayHashingE {

    public boolean validAnagram(String s, String t){
        /**
         * Given two string s and t, return true if t is an anagram of s, and false otherwise
         * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
         * typically using all the original letters exactly once
         */
        Map<Character, Integer> charCntMap = new HashMap<>();

    //https://leetcode.com/problems/valid-anagram/description/
    //https://leetcode.com/problems/valid-anagram/solutions/?orderBy=hot
    //https://leetcode.com/problems/valid-anagram/solutions/3139922/explained-code-used-hashing-java-code/
    /*
    check length of the two strings. return false if the length is different
   */
    if(s.length() == t.length()){
    //iterate over the String as Char and add each Character to a map with counter
        for(int i = 0; i <s.length() ; i++){
            Character sch = s.charAt(i);
            charCntMap.put(sch, charCntMap.getOrDefault(sch, 0)+1);
        }
        /*
        once again iterate over other string and search the map to find match character
        if there is no matching character return false otherwise subtract counter of the character in the map
        after the iteration if the map is empty return true otherwise false
        */
        for(int i = 0; i < t.length() ; i++){
            Character tch = t.charAt(i);
            if(charCntMap.get(tch) != null){
                if(charCntMap.get(tch) == 1){
                    charCntMap.remove(tch);
                } else {
                    charCntMap.put(tch, charCntMap.get(tch) - 1);
                }
            } else {
                return false;
            }
        }
        /*
        iterate over the other string as charSet.
        if the character does not present in the map return false,
        if the character present in the map, count down the value in the map and add back to the map
         */
    } else {
        return false;
    }
return charCntMap.isEmpty();

}

    public int[] replaceElements(int[] arr){
        //https://www.youtube.com/watch?v=68isPRHgcFQ
        return arr;
    }

    public boolean isSubsequence(String s, String t){
        //https://leetcode.com/problems/is-subsequence/
        //https://www.youtube.com/watch?v=99RVfqklbCE
        https://leetcode.com/problems/is-subsequence/solutions/2473010/very-easy-100-fully-explained-java-c-python-js-c-python3-two-pointers-approach/
        /*use two pointer approch to
        if both character matches, increment index for both otherwise increment index for t.
        at the end if index of s reached length of string then return true indicates that s is subsequence of string t. Otherwise retrun false since all character in s wasn't find in t
        */
        return false;
    }

    public int lengthOfLastWord(String s){
    //https://leetcode.com/problems/length-of-last-word/
    //https://leetcode.com/problems/length-of-last-word/solutions/21878/a-single-line-of-code-in-java/
        /*
        utilize trim - remove all the leading trailing white spaces
        lastIndexOf - return index value of  white space before the last word
        subtract the length of trimmed string length with white space before the last word gives length of the last word
         */
        return 0;
    }

    public String longestCommonPrefix(String[] s){
        //05/19/2023
        //https://leetcode.com/problems/longest-common-prefix/
        //https://leetcode.com/problems/longest-common-prefix/solutions/721752/java-100-just-compare-two-strings/
        //https://leetcode.com/problems/longest-common-prefix/solutions/3174307/well-explained-code-using-strings-in-java/
        //https://leetcode.com/problems/longest-common-prefix/editorial/
        /*
        sort the array and compare first and last string in the list
        if each character in both String is same, add counter
        retrun substring of first String upto index of the counter
         */
        return "";
    }

    public int[] twoSum(int [] nums, int target){
        int[] twoSumArray = new int[2];

        //https://leetcode.com/problems/two-sum/description/

        /*
        use two pointer brute force - 05/19/2023 solved
        https://leetcode.com/problems/two-sum/solutions/2990807/solution-c-java-python-both-brute-force-optimized-code/
        */


        /*05/19/2023 - solved
        use map to store each array value as a key and index as value in the map
        https://leetcode.com/problems/two-sum/solutions/2671539/java-100-runtime-easy-to-understand/
         */
        return twoSumArray;
    }

    public List<List<Integer>> pascalTriangle(int numRows){
        /*
        https://leetcode.com/problems/pascals-triangle/
        use double dimentional List.get[].get[] to access
         */
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        /*
        //https://leetcode.com/problems/pascals-triangle/solutions/38141/my-concise-solution-in-java/
        //https://www.digitalocean.com/community/tutorials/java-list-add-addall-methods
        //need to understand how list.add() works
        List<Integer> row = new ArrayList<>();
        for(int i = 0; i < numRows ; i++){
            row.add(0, 1);//each itearation, add new value 1 to the begining of the row. adding an element to an index would add the value to that index and move existing elements to right
            for(int j = 1 ; j < row.size()- 1; j++){
                row.set(j, row.get(j) + row.get(j+1));//update value of index 1 to sum of next value. as J increment,
            }
            pascalTriangle.add(new ArrayList<Integer>((row)));
        }
        */

        return pascalTriangle;
    }

    public int removeElement(int[] nums, int val){
        //https://leetcode.com/problems/remove-element/description/
        /*
        The judge will test your solution with the following code:

            int[] nums = [...]; // Input array
            int val = ...; // Value to remove
            int[] expectedNums = [...]; // The expected answer with correct length.
                                        // It is sorted with no values equaling val.

            int k = removeElement(nums, val); // Calls your implementation

            assert k == expectedNums.length;
            sort(nums, 0, k); // Sort the first k elements of nums
            for (int i = 0; i < actualLength; i++) {
                assert nums[i] == expectedNums[i];
            }
         */
    /*
    if the element is not matching value, save off the last value in array to temporary,
    and save current element in index to the latest,
    save temp value as current value
     */
        int size = 0;

        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != val){
                int temp = nums[i];
                nums[i] = nums[size];
                nums[size] = temp;
                size++;
            }
        }
        int[] reOrderArr = nums;
        return size;

    }

    public int[] reorderElementInArray(int[] nums, int val){
        /*
    This method is identical logic with removeElement only difference is that this method return the modified Array instead of the size of array element that moved.
     */
        int size = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != val){
                int temp = nums[i];
                nums[i] = nums[size];
                nums[size] = temp;
                size++;
            }
        }
        return nums;
    }

    public int numUniqueEmails (String[] emails){
    /*
    //https://leetcode.com/problems/unique-email-addresses/description/
     understanding what indexOf("char") and substring(int, int) or substring (int) methods return from the string help
    */
        //https://leetcode.com/problems/unique-email-addresses/solutions/2510279/my-java-solution/
        /*
        iterate over string array
        store index of where "+" sign in local name
        store index of "@" sign which signify start with domain name
        if the index of "+" is exist( greater than 0) only store local name upto that sign since rest of char will be ignored
        otherwise store the local name to a string
        then add whatever rest of string as domain name to the string
        add to set so that by default only unique eMail will be saved and use flag to add count or the set
        or after for loop return the size of the set.
         */

        return 0;
    }

    public boolean isIsomorphicArray (String s, String t){
        /*
    https://leetcode.com/problems/isomorphic-strings/
    Given two strings s and t, determine if they are isomorphic.
    Two strings s and t are isomorphic if the characters in s can be replaced to get t.
    All occurrences of a character must be replaced with another character while preserving the order of characters.
    No two characters may map to the same character, but a character may map to itself.
     */
        //https://leetcode.com/problems/isomorphic-strings/solutions/2472118/very-easy-100-fully-explained-java-c-python-javascript-python3-using-hashmap/
        if(s.length()!= t.length()){
            return false;
        }
        int[] maps = new int[127];
        int[] mapt = new int[127];

        for(int idx = 0; idx < s.length() ; idx++){
            //compare ASCII value of each characters if it already exist in each map
            //if the character alreadsy exist in array, the value(index) should be same
            if(maps[s.charAt(idx)] != mapt[t.charAt(idx)]){
                return false;
            }
            //store index value to the ASCII value as index location
            maps[s.charAt(idx)] = idx + 1;
            mapt[t.charAt(idx)] = idx + 1;
        }
        return true;

    }

    public boolean isIsomorphicMap (String x, String y){
        //https://www.geeksforgeeks.org/check-if-two-given-strings-are-isomorphic-to-each-other/
        if(x.length() != y.length())
        {
            return false;
        }
        int size = 127;

        Boolean[] check = new Boolean[size];
        Arrays.fill(check, Boolean.FALSE);

        int [] flip = new int[size];
        Arrays.fill(flip, -1);

        for(int i = 0; i < y.length() ; i++){
            //if current char value in index i in flip array is -1, the character never compared before
            if (flip[x.charAt(i)] == -1){
                //if current char value of boolean array is already exist in the check array
                if(check[y.charAt(i)] == true){
                    return false;
                }
                check[y.charAt(i)] = true;
                flip[x.charAt(i)] = y.charAt(i);
            } else if(flip[x.charAt(i)] != (y.charAt(i))){
                return false;
            }
        }

        return true;

    }

    /*
    https://leetcode.com/problems/can-place-flowers/
    605. Can Place Flowers
    No-adjacent means that there are no 1's next to each other.
    Something like [1,0,1,0,1] or [1,0,0,1] are valid while [1,0,1,1] or [1,1] are not.

    Additionally, n can be less than or equal the maximum amount of flowers you can place.
    Something like [0,0,0,0,0] can have at most 3 flowers: [1,0,1,0,1], so any n such that n<=3 should return true.
     */
    public boolean canPlaceFlowers(int [] flowerBed, int n) {
        /*
         there condition to check in each iteration:
         1. if value of the current element is 0
         2. if the index is 0 (frist element) OR previous value is 0
         3. if the index is last element or the next element is 0
        */
        return true;
    }

    public boolean canPlaceFlowersSolution (int [] flowerbed, int n){
        //https://leetcode.com/problems/can-place-flowers/solutions/1698771/c-java-python-2-simple-solutions-image-explanation-beginner-friendly/
        if(n == 0){
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            /*
            there
             */
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) { // can place?
                -- n;
                if (n == 0) {
                    return true;
                }
                flowerbed[i] = 1; // place!
            }
        }
        return false;

    }

    public int majorityElementMooreVoteAlgo(int[] nums){
        /*
        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
        https://leetcode.com/problems/majority-element/
        https://leetcode.com/problems/majority-element/solutions/51611/java-solutions-sorting-hashmap-moore-voting-bit-manipulation/
        https://www.cs.utexas.edu/~moore/best-ideas/mjrty/example.html
        https://www.youtube.com/watch?v=M1IL4hz0QrE - Java
        https://www.youtube.com/watch?v=7pnhv842keE - python
        solve the problem in linear time and in O(1) space?
         */
        int mjCnt = 0, mjNum = 0;
        for(int value: nums){
            if(mjCnt == 0){
                mjNum = value;
            }
            if (mjNum != value){
                mjCnt--;
            } else {
                mjCnt++;
            }
        }
        return mjNum;
    }//end majorityElement

    public int majorityElementHashMap(int[] nums){
        /*
        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
        https://leetcode.com/problems/majority-element/solutions/51611/java-solutions-sorting-hashmap-moore-voting-bit-manipulation/
        initialize a HashMap
        iterate over array to store the element as key and counter as value to the map
        also check to see if current key (element) in HashMap value (counter) is greater than half of the lenght of array
        if so break off from the array loop and return the key as majority element in the array
         */
        int mjElement = 0;
        Map <Integer, Integer> mjMap = new HashMap<>();
        for(int element : nums){
            mjMap.put(element, mjMap.getOrDefault(element, 0)+1);
            if(mjMap.get(element) > nums.length/2){
                mjElement = element;
                break;
            }
        }

        return mjElement;

    }

    public int[] nextGreaterElementBruteForce(int [] num1, int[] num2){
        /*
        The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
        You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
        For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2.
        If there is no next greater element, then the answer for this query is -1.
        Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
         */
        /*
        https://leetcode.com/problems/next-greater-element-i/
        https://leetcode.com/problems/next-greater-element-i/solutions/1579935/java-easy-solution-brute-and-optimal-stack-diagrammatic-explanation/
         */

        //initialize new array that will hold next greater value in the num2
        int[] resNums = new int[num1.length];
        //iterate over the num1
        for(int i = 0 ; i < num1.length ; i++){
            int maxIndex = -1;
            int j = num2.length - 1;
            //iterate over num2 in reverse
            while(j >= 0 && num2[j] != num1[i]){
                //if num2[j](current iteration) is not same value with current num1[i]
                if(num2[j] > num1[i]){
                    //and if num2[j] is bigger than num1[i] which means num1[i] found next greater element, since num1 is sub set of num2 num1[i] is gureentee to exist in num2
                    //set the current num2[j] as maxIndex= greater element for num[i]
                    maxIndex = num2[j];
                }
                j--;
            }
            //store either -1 or the maxIndex found in the iteration
            resNums[i] = maxIndex;
        }

        return resNums;
    }

    public int[] nextGreaterElementMonotonicStack(int[] nums1, int[] nums2){
        /*
        https://leetcode.com/problems/next-greater-element-i/
        https://leetcode.com/problems/next-greater-element-i/solutions/1579935/java-easy-solution-brute-and-optimal-stack-diagrammatic-explanation/
        https://leetcode.com/problems/next-greater-element-i/solutions/991295/java-o-n-time-o-n-space-using-monotonic-stack-with-explanation/
        https://www.youtube.com/watch?v=Dq_ObZwTY_Q
         */

        /*
        create an new array with length of array num1, stack & map
        iterate over array num2
        if stack is not empty and current array element is bigger than what is in the stack, store the value in stack with current element in array num2 to the map
        -> this will ensure that element in stack - a previous element found next greater element and that pair got stored in the map.
        otherwise, simply store current element in the stack to compare next element.
        -> This will ensure we keep track of previoud element in the array.
         */
        int[] answer = new int[nums1.length];
        Stack <Integer> stack = new Stack<>();
        Map <Integer, Integer> ngeMap = new HashMap<>();

        for(int element : nums2){
            while(!stack.isEmpty() && element > stack.peek()){
                ngeMap.put(stack.pop(), element);
            }
            stack.add(element);
        }

        /*
        iterate array num1 to get the value for each element in the array ans store to new array.
         */
        int i = 0;
        for(int num : nums1){
            answer[i++] = ngeMap.getOrDefault(num, -1);
        }

        return answer;

    }

    public int pivotIndex(int [] nums){
    /*
    https://leetcode.com/problems/find-pivot-index/
    https://www.youtube.com/watch?v=u89i60lYx8U
    https://leetcode.com/problems/find-pivot-index/solutions/3167687/simple-java-runtime-1-ms-beats-100/
    https://leetcode.com/problems/find-pivot-index/solutions/2681701/java-easiest-solution-to-understand-100-faster/
     */
    /*
     Given an array of integers nums, calculate the pivot index of this array.
    The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
    If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
    Return the leftmost pivot index. If no such index exists, return -1.
    */
   //Example 1:
     /*
    Input: nums = [1,7,3,6,5,6]
    Output: 3
    Explanation:
    The pivot index is 3.
    Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
    Right sum = nums[4] + nums[5] = 5 + 6 = 11
     */
    //Example 2:
     /*
    Input: nums = [1,2,3]
    Output: -1
    Explanation:
    There is no index that satisfies the conditions in the problem statement.
      */
    //Example 3:
     /*
    Input: nums = [2,1,-1]
    Output: 0
    Explanation:
    The pivot index is 0.
    Left sum = 0 (no elements to the left of index 0)
    Right sum = nums[1] + nums[2] = 1 + -1 = 0
      */
        int pivot = -1;
        //initialize total, rightSum & leftSum
        int leftSum = 0, rightSum = Arrays.stream(nums).sum();//try to different method to sum up!!
        //iterate over the array
        for(int i = 0 ; i < nums.length ; i++){
            if(rightSum - leftSum - nums[i] == leftSum){// leftSum*2 = rightSum - num[i]
                pivot = i;
                break;
            }
            leftSum+= nums[i];
        }
        return pivot;
    }

    public int sumArrayRange(int [] nums, int lIndex, int rIndex){
        /*
        https://leetcode.com/problems/range-sum-query-immutable/

        Given an integer array nums, handle multiple queries of the following type:
        Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.

        Implement the NumArray class:

        NumArray(int[] nums) Initializes the object with the integer array nums.
        int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
         */
        //Example 1:
        /*
        Input : ["NumArray", "sumRange", "sumRange", "sumRange"]
        [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
        Output
        [null, 1, -1, -3]

        Explanation
        NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
        numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
        numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
        numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
         */
        //convert class as a method call with  parameter that return the correct sum of range
        /*
        iterate over array to store sumRange in each index and store in new array
        to calculate the sumRange, subtract the later sumRange  value with first index sumRange value
         */
        int [] gradualSum = new int[nums.length];
        int rangeSum = 0;
        for(int i = 0; i < nums.length ; i++){
            rangeSum +=nums[i];
            gradualSum[i] = rangeSum;
        }
        if(lIndex > 0){
            rangeSum =  gradualSum[rIndex] - gradualSum[lIndex - 1];
        }
        if(lIndex == 0){
            rangeSum =  gradualSum[rIndex];
        }
        return rangeSum;
    }

    public List<Integer> findDisappearedNumbers(int [] nums){
        /*
        https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
        https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/solutions/777978/java-time-o-n-space-o-1/
         */
        /*
        Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
        Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
         */
        /*
            solution 0(1): walk through all elements in the array,
            use the current value as an index (absolute &  subtract 1 so that it does not caught indexOutOfBound) in the array and flag its value(negative).
            in the end, all the positive value in the array are missing values.
         */
        List<Integer> missingNum = new ArrayList<>();

        for(int i : nums){
            int index = Math.abs(i);
            if(nums[index - 1] > 0){
                nums[index - 1] *=-1;
            }
        }
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] > 0){
                missingNum.add(i + 1);
            }
        }
        return missingNum;
    }

    public int maxNumberOfBallons(String text){
        /*
        Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
        You can use each character in text at most once. Return the maximum number of instances that can be formed.
        https://leetcode.com/problems/maximum-number-of-balloons/
        https://leetcode.com/problems/maximum-number-of-balloons/solutions/
         */
        //the text is not in the order of letter to form "Ballon" - use hashSet to check except char"L" and "o"
        /*
        store occurance of each character (associated with integer value) of "balloons" in the text
        divide number of each character to the necessary occurance to form words
        return minimum number of occurance
         */
    return 0;

    }

    /*
    https://leetcode.com/problems/word-pattern/
    Given a pattern and a string s, find if s follows the same pattern.
    Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

    Example 1:
        Input: pattern = "abba", s = "dog cat cat dog"
        Output: true

    Example 2:
        Input: pattern = "abba", s = "dog cat cat fish"
        Output: false

    Example 3:
        Input: pattern = "aaaa", s = "dog cat cat dog"
        Output: false

     */
    public boolean wordPattern(String pattern, String s){
    /*

        store String Pattern as character array
        split the String s by space and store as array
        if the length of these array is not same, return false.

        if the length is same store the pattern as key  and string as value in a map if the key is not already exist in the map

        if key exist, compare value in the map with current string
        if they are not same return false
        after debug couple time submit successful!! 07/28/2023
     */

        String [] splitWords = s.split(" ");
        if(pattern.length() != splitWords.length){
            return false;
        }

    //create a map to store each String of pattern as key, splitWords as value
        Map<Character, String> patternMatch = new HashMap<>();
        for(int i = 0 ; i < pattern.length() ; i++){
            if(patternMatch.containsKey(pattern.charAt(i))){
                if (!patternMatch.get(pattern.charAt(i)).equals(splitWords[i])){
                    return false;
                }
            } else{
                //if the key is not in the map but the value is same as other key value return false
                if(patternMatch.containsValue(splitWords[i])){
                    return false;
                }
                patternMatch.put(pattern.charAt(i), splitWords[i]);
            }
        }
        return true;

    }

    /*
    https://leetcode.com/problems/word-pattern/solutions/73402/8-lines-simple-java/

    I go through the pattern letters and words in parallel and compare the indexes where they last appeared.

    Edit 1: Originally I compared the first indexes where they appeared, using putIfAbsent instead of put.
    That was based on mathsam's solution for the old Isomorphic Strings problem.
    But then czonzhu's answer below made me realize that put works as well and why.

    Edit 2: Switched from

        for (int i=0; i<words.length; ++i)
            if (!Objects.equals(index.put(pattern.charAt(i), i),
                                index.put(words[i], i)))
                return false;
    to the current version with i being an Integer object, which allows to compare with just != because there's no autoboxing-same-value-to-different-objects-problem anymore.
    Thanks to lap_218 for somewhat pointing that out in the comments.
     */
    public boolean wordPatternEightLine(String pattern, String str){


        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i=0; i<words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
    }

}

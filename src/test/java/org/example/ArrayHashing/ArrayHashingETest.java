package org.example.ArrayHashing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class ArrayHashingETest {
    ArrayHashingE ahashing = new ArrayHashingE();

    @Test
    @DisplayName("Validate two string is Valid anagram")
    void validAnagramTest() {
        assertEquals(true, ahashing.validAnagram("anagram", "nagaram"));
    }


    @Test
    void isSubsequence() {
    }

    @Test
    void lengthOfLastWordTest() {
        assertThat(5).isEqualTo(ahashing.lengthOfLastWord("Hello World"));
        assertThat(4).isEqualTo(ahashing.lengthOfLastWord("   fly me   to   the moon  "));
        assertThat(6).isEqualTo(ahashing.lengthOfLastWord("luffy is still joyboy"));
    }


    @Test
    @DisplayName("by Brute force iteration or using map to store index of two arrays elements that hold target value")
    void twoSumTest() {
        assertThat(new int[] {0, 1}).containsExactly(ahashing.twoSum(new int[] {2, 7, 11, 15}, 9));
        assertThat(new int[] {1, 2}).containsExactly(ahashing.twoSum(new int[] {3, 2, 4}, 6));
        assertThat(new int[] {0, 1}).containsExactly(ahashing.twoSum(new int[] {3, 3}, 6));
    }

    @Test
    void pascalTriangleTest() {
        List<List<Integer>>  fivePascal = ahashing.pascalTriangle(5);
        assertThat(fivePascal.get(4)).containsExactly(1, 4, 6, 4, 1);
    }

    @Test
    void removeElement() {
        int[] removeArr = {0,1,2,2,3,0,4,2};
        assertThat(5).isEqualTo(ahashing.removeElement(removeArr, 2));
    }

    @Test
    void reorderElementInArray() {
        int[] removeArr = {0,1,2,2,3,0,4,2};
        int[] afterArr = {0,1,3,0,4,2,2,2};
        assertThat(ahashing.reorderElementInArray(removeArr, 2)).containsExactly(afterArr);
    }

    @Test
    void numUniqueEmails() {
        String [] email3 = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        assertThat(2).isEqualTo(ahashing.numUniqueEmails(email3));
    }

    @Test
    void isIsomorphicArray() {
        assertThat(true).isEqualTo(ahashing.isIsomorphicArray("paper", "title"));

    }

    @Test
    void testIsIsomorphicMapTest() {
        assertThat(true).isEqualTo(ahashing.isIsomorphicMap("paper", "title"));
    }

    @Test
    void canPlaceFlowersTest() {
        int [] flower2 = {1, 0, 0, 0, 1};
        int [] flower1 = {1, 0, 0, 0, 0, 1};

        //assertThat(ahashing.canPlaceFlowers(flower2, 1)).isEqualTo(true);
        //assertThat(ahashing.canPlaceFlowers(flower1, 2)).isEqualTo(false);

    }

    @Test
    void canPlaceFlowersSolutionTest() {
        int [] flower3 = {0, 0, 1, 0, 1};
        //assertThat(ahashing.canPlaceFlowersSolution(flower3, 1)).isEqualTo(true);
        int [] flower4 = {0, 0, 0};
        assertThat(ahashing.canPlaceFlowersSolution(flower4, 2)).isEqualTo(true);
    }

    @Test
    void majorityElementMooreVoteAlgoTest() {
        int [] num1 = {3, 1, 2, 4, 3, 3, 1, 3, 3, 3};
        assertThat(ahashing.majorityElementMooreVoteAlgo(num1)).isEqualTo(3);
    }

    @Test
    void majorityElementHashMapTest() {
        int [] num1 = {3, 3, 3, 4, 3, 3, 1, 3, 1, 2};
        assertThat(ahashing.majorityElementHashMap(num1)).isEqualTo(3);
    }

    @Test
    void nextGreaterElementBruteForceTest() {
        int [] num1 = {4, 1, 2};
        int [] num2 = {1, 3, 4, 2};
        int [] answer = {-1, 3, -1};
        assertThat(ahashing.nextGreaterElementBruteForce(num1, num2)).isEqualTo(answer);
    }

    @Test
    void nextGreaterElementMonotonicStackTest() {
        int [] num1 = {4, 1, 2};
        int [] num2 = {1, 3, 4, 2};
        int [] answer = {-1, 3, -1};
        assertThat(ahashing.nextGreaterElementMonotonicStack(num1, num2)).isEqualTo(answer);
    }

    @Test
    void pivotIndexTest() {
        int [] nums = {1,7,3,6,5,6};
        int [] zeroNum = {2, 1, -1};
        assertThat(ahashing.pivotIndex(nums)).isEqualTo(3);
        assertThat(ahashing.pivotIndex(zeroNum)).isEqualTo(0);
    }

    @Test
    void sumArrayRangeTest() {
        int [] nums= {-2, 0, 3, -5, 2, -1};
        assertThat(ahashing.sumArrayRange(nums, 0, 2)).isEqualTo(1);
        assertThat(ahashing.sumArrayRange(nums, 2, 5)).isEqualTo(-1);
        assertThat(ahashing.sumArrayRange(nums, 0, 5)).isEqualTo(-3);
    }

    @Test
    void wordPatternTest() {
        assertThat(ahashing.wordPattern("abba", "dog dog dog dog")).isEqualTo(false);
    }

    @Test
    void wordPatternEightLineTest() {
        assertThat(ahashing.wordPatternEightLine("abba", "dog dog dog dog")).isEqualTo(false);
    }

    @Test
    void easyParkingLotTest(){
        LCodeParkingSystem easyParking = new LCodeParkingSystem(1, 1, 0);
        assertThat(easyParking.addCar(1)).isEqualTo(true);
        assertThat(easyParking.addCar(2)).isEqualTo(true);
        assertThat(easyParking.addCar(3)).isEqualTo(false);

    }
}
package org.example.tree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


class LCodeTreeEasyTest {

    List<Integer> orderList;
    LCodeTreeEasy treeEasy = new LCodeTreeEasy();

    @Test
    void containsNodeTest() {
        treeEasy.add(1);
        treeEasy.add(4);
        treeEasy.add(2);
        assertThat(treeEasy.containsNode(treeEasy.root, 4)).isEqualTo(true);
    }
    @Test
    void inorderTraversalIterativeTest() {
        treeEasy.add(1);
        treeEasy.add(4);
        treeEasy.add(2);
        orderList = Arrays.asList(1, 2, 4);

        assertThat(treeEasy.inorderTraversalIterative(treeEasy.root)).isEqualTo(orderList);
    }


    @Test
    void deleteTest() {
        treeEasy.add(12);
        treeEasy.add(18);
        treeEasy.add(8);
        treeEasy.add(4);
        treeEasy.add(9);
        treeEasy.add(14);
        treeEasy.add(21);
        treeEasy.add(2);
        treeEasy.add(5);
        treeEasy.add(6);
        treeEasy.add(15);
        treeEasy.add(16);
        treeEasy.add(19);
        treeEasy.add(22);
        treeEasy.add(1);
        treeEasy.add(3);
        treeEasy.add(7);
        treeEasy.add(10);
        treeEasy.add(20);
        treeEasy.add(24);
        treeEasy.delete(8);
        assertThat(treeEasy.containsNode(treeEasy.root, 8)).isEqualTo(false);
        assertThat(treeEasy.root.val).isEqualTo(12);
    }
}
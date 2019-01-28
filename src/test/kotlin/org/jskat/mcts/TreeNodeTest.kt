package org.jskat.mcts

import org.junit.Test

class TreeNodeTest {
    @Test
    fun `New root node should have no children`() = assert(TreeNode().isLeaf())

    @Test
    fun `Expanded root node should have three children`() {

        val rootNode = TreeNode()
        rootNode.expand()

        assert(rootNode.getChildren().size == 3)
    }

    @Test
    fun `Update value should increase visits and totalValue`() {

        val node = TreeNode()

        assert(node.getVisits() == 0L)
        assert(node.getTotalValue() == 0L)

        node.updateValue(18)

        assert(node.getVisits() == 1L)
        assert(node.getTotalValue() == 18L)

        node.updateValue(20)

        assert(node.getVisits() == 2L)
        assert(node.getTotalValue() == 38L)
    }
}
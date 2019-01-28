package org.jskat.mcts

import org.junit.Test

class MonteCarloTreeSearchTest {

    @Test
    fun `Select with root node`() {
        val visitedNodes = select(TreeNode())
        assert(visitedNodes.size == 2)
        assert(visitedNodes[0] != visitedNodes[1])
    }

    @Test
    fun `Select with two levels`() {

        val rootNode = TreeNode()

        select(rootNode)
        val visitedNodes = select(rootNode)

        assert(visitedNodes.size == 3)
        assert(visitedNodes[0] != visitedNodes[1])
        assert(visitedNodes[1] != visitedNodes[2])
        assert(visitedNodes[2] != visitedNodes[0])
    }

    @Test
    fun `Simulation returns -1`() {
        assert(simulate(TreeNode()) == 18L)
    }

    @Test
    fun `Backpropagation updates all visited nodes`() {

        val visited = listOf(TreeNode(), TreeNode(), TreeNode())
        backpropagate(visited, 18L)

        for (node in visited) {
            assert(node.getVisits() == 1L)
            assert(node.getTotalValue() == 18L)
        }
    }

    @Test
    fun `Print tree`() {

        val rootNode = TreeNode()

        println("New tree")
        printTree(rootNode)

        var visited = select(rootNode)

        println("1st selection")
        printTree(rootNode)

        backpropagate(visited, 18)

        println("1st backpropagation")
        printTree(rootNode)

        visited = select(rootNode)

        println("2nd selection")
        printTree(rootNode)

        backpropagate(visited, 20)

        println("2nd backpropagation")
        printTree(rootNode)
    }
}
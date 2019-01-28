package org.jskat.mcts

class TreeNode(
        private val children: MutableList<TreeNode> = mutableListOf(),
        private var visits: Long = 0,
        private var totalValue: Long = 0) {

    fun isLeaf() = children.isEmpty()

    fun getChildren() = children.toList()

    fun getVisits() = visits

    fun getTotalValue() = totalValue

    fun expand(): TreeNode {
        // FIXME add only possible moves
        children.addAll(listOf(TreeNode(), TreeNode(), TreeNode()))
        return this
    }

    fun selectHighestValueChildNode(): TreeNode {

        val iterator = children.listIterator()
        var result = iterator.next()
        var bestValue: Double = result.calculateUCTValue()

        while(iterator.hasNext()) {
            val node = iterator.next()
            val nodeValue = node.calculateUCTValue()
            if (nodeValue > bestValue) {
                bestValue = nodeValue
                result = node
            }
        }

        return result
    }

    private fun calculateUCTValue(): Double {
        // FIXME correct calculation
        return 1.0 / visits + 0.000001
    }

    fun updateValue(value: Long) {
        visits++
        totalValue+=value
    }
}
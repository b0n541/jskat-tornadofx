package org.jskat.mcts

fun select(rootNode: TreeNode): List<TreeNode> {
    val visitedNodes: MutableList<TreeNode> = mutableListOf(rootNode)
    var currentNode = rootNode
    while (!currentNode.isLeaf()) {
        currentNode = currentNode.selectHighestValueChildNode()
        visitedNodes.add(currentNode)
    }
    currentNode.expand()
    visitedNodes.add(currentNode.selectHighestValueChildNode())
    return visitedNodes
}

fun simulate(node: TreeNode): Long {
    return 18
}

fun backpropagate(nodes: List<TreeNode>, value: Long) {
    for (node in nodes) {
        node.updateValue(value)
    }
}

fun printTree(rootNode: TreeNode) {

    printNode(rootNode)
    println()
}

private fun printNode(node: TreeNode, level: Long = 0) {

    for (i in 1..level - 1) {
        print("    ")
    }
    if (level > 0) {
        print(" |- ")
    }
    println("v: " + node.getVisits() + " t: " + node.getTotalValue())

    for (childNode in node.getChildren()) {
        printNode(childNode, level + 1)
    }
}
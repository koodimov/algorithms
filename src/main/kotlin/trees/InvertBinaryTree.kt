package mov.kudy.trees

fun invertBinaryTree(root: TreeNode?): TreeNode? {
    if (root == null) return root

    val tmp = root.right
    root.right = root.left
    root.left = tmp

    invertBinaryTree(root.left)
    invertBinaryTree(root.right)

    return root
}

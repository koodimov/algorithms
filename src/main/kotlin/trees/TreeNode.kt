package mov.kudy.trees

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    companion object {
        fun IntArray.toTreeNode(): TreeNode? {
            return insertNode(this, 0)
        }

        private fun insertNode(array: IntArray, idx: Int): TreeNode? {
            var root: TreeNode? = null
            if (idx < array.size) {
                root = TreeNode(array[idx])
                root.left = insertNode(array, idx * 2 + 1)
                root.right = insertNode(array, idx * 2 + 2)
            }
            return root
        }

        //
//        private fun setChildren(root: TreeNode?) {
//
//        }

    }
}

fun TreeNode?.printOut() {
    if (this == null) return
    this.left.printOut()
    print("${this.`val`} ")
    this.right.printOut()
}

fun TreeNode?.toArray(): IntArray {
    val list = ArrayList<Int>()
    return insertToList(this, list).toIntArray()
}

private fun insertToList(root: TreeNode?, list: ArrayList<Int>): ArrayList<Int> {
    if (root == null) return list
    list.add(root.`val`)
    insertToList(root.left, list)
    insertToList(root.right, list)
    return list
}
object WallService {
   private var arrayPosts = emptyArray<Post>()

    fun add(post: Post): Post {
        arrayPosts += post.copy(id = arrayPosts.size + 1)
        return arrayPosts.last()
    }

    fun update(post: Post): Boolean {
        for (cell in arrayPosts) {
            if (cell.id == post.id) {
                arrayPosts[cell.id - 1] = post.copy(id = cell.id, ownerId = cell.ownerId, date = cell.date)
            }
            return true
        }
        return false
    }
}
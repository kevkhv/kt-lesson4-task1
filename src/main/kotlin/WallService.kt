import Attachments.PostNotFoundException

internal class WallService {
    private var arrayPosts = emptyArray<Post>()
    private var arrayComments = emptyArray<Comment>()

    fun add(post: Post): Post {
        arrayPosts += post.copy(id = arrayPosts.size + 1)
        return arrayPosts.last()
    }

    fun update(post: Post): Boolean {
        for (cell in arrayPosts) {
            if (cell.id == post.id) {
                arrayPosts[cell.id - 1] = post.copy(id = cell.id, ownerId = cell.ownerId, date = cell.date)
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment): Boolean {
        for (post in arrayPosts) {
            if (post.id == comment.postId) {
                arrayComments += comment
                return true
                }
            }
        throw PostNotFoundException("Пост с ID ${comment.postId} не найден")
    }
}




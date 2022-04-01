internal class WallService {
   var arrayPosts = emptyArray<Post>()

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
}
//internal class WallService {
//
//    var posts = emptyArray<Post>()
//    private var newID = 0
//
//    fun add(post: Post): Post {
//        newID += 1                  добавили пост id = 1, добавили еще 1 пост id = 2     ok
//        posts += post.copy(id = newID, text = "Мой первый пост")
//        return posts.last()
//    }
//
//    fun update(post: Post): Boolean {
//        for ((index, value) in posts.withIndex()) {
//            if (post.id == value.id) {       попадает в метод пост с id = 2, видит в массиве пост с таким же id
//                newID += 1                   id был у нас 2 стал 3
//                posts[index] = post.copy(      помещаем в туже ячейку где был пост номер 2 новый пост
//                    id = newID,                id поста номер 3
//                    ownerId = value.ownerId,
//                    date = value.date,
//                )                            итого уу нас больше не будет поста с id 2 он затерся
//                return true
//            }
//        }
//        return false
//    }
//}
fun main() {
    val comments = Comments(21, true, false, true, true)
    val copyright = Copyright(52154, "id.com/52154", "Victor", "Superuser")
    val donut = Donut(true, 240, canPublishFreeCopy = false, editMode = "all")
    val likes = Likes(110, true, true, true)
    val reposts = Reposts(100, true)
    val views = Views(220)
    val wallService = WallService()
    wallService.add(Post(
        ownerId = 67,
        fromId = 3465,
        createdBy = 45634,
        date = 1324,
        text = "первый пост",))
    wallService.add(Post( id = 124,
        ownerId = 876607,
        fromId = 32465,
        createdBy = 45634,
        date = 136430324,
        text = "второй пост",))
    wallService.add(Post(
        ownerId = 607,
        fromId = 3465,
        createdBy = 45634,
        date = 130324,
        text = "третий пост",))
    val postUpdate = Post(
        id = 5,
        ownerId = 100,
        fromId = 100,
        createdBy = 100,
        date = 100,
        text = "обновленный пост",
    )

    println(wallService.arrayPosts[0])
    println(wallService.arrayPosts[1])
    println(wallService.arrayPosts[2])
    wallService.update(postUpdate)
    println(wallService.arrayPosts.size)
    println(wallService.arrayPosts[0])
    println(wallService.arrayPosts[1])
    println(wallService.arrayPosts[2])
}
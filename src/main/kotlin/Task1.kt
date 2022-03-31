fun main() {
    val comments1244 = Comments(21, true, false, true, true)
    val copyright1244 = Copyright(52154, "id.com/52154", "Victor", "Superuser")
    val donut1244 = Donut(true, 240, canPublishFreeCopy = false, editMode = "all")
    val likes1244 = Likes(110, true, true, true)
    val reposts1244 = Reposts(100, true)
    val views1244 = Views(220)
    val wallService = WallService

    val post1 = Post (
        1244,
        6887,
        679,
        8977,
        1303545,
        "Hello world",
        343,
        435,
        true,
        comments1244,
        copyright1244,
        likes1244,
        reposts1244,
        views1244,
        "post",
        2342,
        true,
        true,
        true,
        false,
        false,
        false,
        donut1244,
        3563463)

    wallService.arrayPosts += post1
    println(wallService.arrayPosts[0])

}
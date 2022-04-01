fun main() {
    val comments = Comments(21, true, false, true, true)
    val copyright = Copyright(52154, "id.com/52154", "Victor", "Superuser")
    val donut = Donut(true, 240, canPublishFreeCopy = false, editMode = "all")
    val likes = Likes(110, true, true, true)
    val reposts = Reposts(100, true)
    val views = Views(220)
    val wallService = WallService()
}
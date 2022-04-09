import Attachments.*

fun main() {
    val comments = Comments(21, true, false, true, true)
    val copyright = Copyright(52154, "id.com/52154", "Victor", "Superuser")
    val donut = Donut(true, 240, canPublishFreeCopy = false, editMode = "all")
    val likes = Likes(110, true, true, true)
    val reposts = Reposts(100, true)
    val views = Views(220)
    val wallService = WallService()

    val attachment1 = AudioAttachment(Audio(32235, 323, "Bon jovi", "New York", 335, "www.url.com/"))
    val attachment2 = PhotoAttachment(Photo(550000, 225, 20002235, "Nature", 22.5))
    val link1 = Link("www.url.com/", "File manager", "caption", "Ссылка для загрузки")
    val attachment3 = LinkAttachment(link1)
    val post1 = Post(
        id = 25,
        ownerId = 67,
        fromId = 3465,
        createdBy = 45634,
        date = 1324,
        text = "первый пост",
        donut = donut,
        arrayAttachments = arrayOf(attachment1,attachment2)
    )
    post1.arrayAttachments += attachment3
    println(post1)
}
class Reposts(
    val count: Int,               //число пользователей, скопировавших запись
    val userReposted: Boolean,    //наличие репоста от текущего пользователя (true — есть, false — нет)
    val original: Post? = null
)
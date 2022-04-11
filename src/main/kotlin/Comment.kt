import Attachments.Attachment

data class Comment(
    val ownerId: Int,
    val postId: Int,
    val fromGroup: Int = 0,
    val message:String? = null,
    val replyToComment:Int? = null,
    var arrayAttachments: Array<Attachment>? = null,
    val stickerId:Int? = null,
    val guid:Int? = null
)
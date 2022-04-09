import Attachments.Attachment

data class Post(
    val id: Int = 0,                          // Идентификатор записи
    val ownerId: Int = 0,                     // Идентификатор владельца стены, на которой размещена запись
    val fromId: Int = 0,                      // Идентификатор автора записи (от чьего имени опубликована запись)
    val createdBy: Int = 0,                   // Идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора)
    val date: Int = 0,                        // Время публикации записи в формате unixtime
    val text: String? = null,                    // Текст записи
    val replyOwnerID: Int? = null,                // Идентификатор владельца записи, в ответ на которую была оставлена текущая
    val replyPostId: Int? = null,                 // Идентификатор записи, в ответ на которую была оставлена текущая
    val friendsOnly: Boolean? = null,         // true, если запись была создана с опцией «Только для друзей»
    val comments: Comments? = null,           // Комментарии к записи
    val copyright: Copyright? = null,         // Источник материала
    val likes: Likes? = null,                 // Информация о лайках к записи
    val reposts: Reposts? = null,             // Информация о репостах записи («Рассказать друзьям»)
    val views: Views? = null,                 // Информация о просмотрах записи
    val postType: String? = null,                // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    val signerId: Int? = null,                    // Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    val canPin: Boolean? = null,               // Информация о том, может ли текущий пользователь закрепить запись (true — может, false — не может)
    val canDelete: Boolean? = null,            // Информация о том, может ли текущий пользователь удалить запись (true — может, false — не может)
    val canEdit: Boolean? = null,              // Информация о том, может ли текущий пользователь редактировать запись (true — может, false — не может)
    val isPinned: Boolean? = null,            // Информация о том, что запись закреплена (true — закреплена, false — не закреплена)
    val markedAsAds: Boolean? = null,         // Информация о том, содержит ли запись отметку «реклама» (true — да, false — нет)
    val isFavorite: Boolean? = null,          // true, если объект добавлен в закладки у текущего пользователя
    val donut: Donut? = null,                 // Информация о записи VK Donut
    val postponedId: Int? = null,                 // Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.
    var arrayAttachments: Array<Attachment> = emptyArray() // Массив с вложениями к записи
)
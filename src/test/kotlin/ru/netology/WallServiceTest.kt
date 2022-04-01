package ru.netology


import Post
import WallService
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class WallServiceTest {

    @Test
    fun updateReturnTrue() {
        //arrange
        val service = WallService()
        service.add(Post(
            ownerId = 67,
            fromId = 3465,
            createdBy = 45634,
            date = 1324,
            text = "первый пост",))
        service.add(Post(
            id = 124,
            ownerId = 876607,
            fromId = 32465,
            createdBy = 45634,
            date = 136430324,
            text = "второй пост",))
        service.add(Post(
            ownerId = 607,
            fromId = 3465,
            createdBy = 45634,
            date = 130324,
            text = "третий пост",))
        val postUpdate = Post(
            id = 123,
            ownerId = 607,
            fromId = 3465,
            createdBy = 45634,
            date = 130324,
            text = "обновленный пост",
        )
        //act
        val result = service.update(postUpdate)
        //assert
        assertTrue(result)
    }

    @Test
    fun updateReturnFalse() {
        //arrange
        val service = WallService()
        service.add(Post(
            ownerId = 67,
            fromId = 3465,
            createdBy = 45634,
            date = 1324,
            text = "первый пост",))
        service.add(Post(
            id = 124,
            ownerId = 876607,
            fromId = 32465,
            createdBy = 45634,
            date = 136430324,
            text = "второй пост",))
        service.add(Post(
            ownerId = 607,
            fromId = 3465,
            createdBy = 45634,
            date = 130324,
            text = "третий пост",))
        val postUpdate = Post(
            id = 125,
            ownerId = 607,
            fromId = 3465,
            createdBy = 45634,
            date = 130324,
            text = "обновленный пост",
        )
        //act
        val result = service.update(postUpdate)
        //assert
        assertFalse(result)
    }
}
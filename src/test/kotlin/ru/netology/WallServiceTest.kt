package ru.netology

import Post
import WallService
import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {
    private val post1 = Post(
        id = 1,
        ownerId = 67,
        fromId = 3465,
        createdBy = 45634,
        date = 1324,
        text = "первый пост"
    )
    private val post2 = Post(
        id = 2,
        ownerId = 876607,
        fromId = 32465,
        createdBy = 45634,
        date = 136430324,
        text = "второй пост"
    )
    private val post3 = Post(
        id = 3,
        ownerId = 607,
        fromId = 3465,
        createdBy = 45634,
        date = 130324,
        text = "третий пост"
    )

    @Test
    fun updateReturnTrue() {
        //arrange
        val service = WallService()
        service.add(post1)
        service.add(post2)
        service.add(post3)
        val postUpdate = Post(
            id = 1,
            ownerId = 607,
            fromId = 3465,
            createdBy = 45634,
            date = 130324,
            text = "обновленный пост"
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
        service.add(post1)
        service.add(post2)
        service.add(post3)
        val postUpdate = Post(
            id = 125,
            ownerId = 607,
            fromId = 3465,
            createdBy = 45634,
            date = 130324,
            text = "обновленный пост"
        )
        //act
        val result = service.update(postUpdate)
        //assert
        assertFalse(result)
    }

    @Test
    fun checkIdFor0() {
        //arrange
        val service = WallService()
        val expectedId = 1
        //act
        val actualId = service.add(post3).id
        //assert
        assertEquals(expectedId, actualId)
    }
}
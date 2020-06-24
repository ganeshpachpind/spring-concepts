package com.transaction.learning.transaction.user

import com.transaction.learning.transaction.manager.DeveloperService
import io.zonky.test.db.AutoConfigureEmbeddedDatabase
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureEmbeddedDatabase
class DeveloperServiceIntegrationTest {

    @Autowired
    private lateinit var developerRepository: DeveloperRepository

    private lateinit var developerService: DeveloperService

    @BeforeEach
    fun setUp() {
        developerService = DeveloperService(developerRepository)
    }

    @Test
    fun `should save user`() {
        val developerToSave = DeveloperDao(name = "Ganesh", surName = "Pachpind")
        developerService.saveDeveloper(developer = developerToSave)
    }
}
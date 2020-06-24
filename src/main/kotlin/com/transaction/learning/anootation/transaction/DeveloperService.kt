package com.transaction.learning.transaction.manager

import com.transaction.learning.anootation.transaction.DeveloperDao
import com.transaction.learning.anootation.transaction.DeveloperRepository
import org.springframework.stereotype.Service

@Service
class DeveloperService(val userRepository: DeveloperRepository) {

    fun saveDeveloper(developer: DeveloperDao): DeveloperDao {
        return userRepository.save(developer)
    }
}
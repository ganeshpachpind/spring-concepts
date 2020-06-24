package com.transaction.learning.transaction.manager

import com.transaction.learning.transaction.user.DeveloperDao
import com.transaction.learning.transaction.user.DeveloperRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class DeveloperService(val userRepository: DeveloperRepository) {

    fun saveDeveloper(developer: DeveloperDao): DeveloperDao {
        return userRepository.save(developer)
    }
}
package com.transaction.learning.transaction.user

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface DeveloperRepository : JpaRepository<DeveloperDao, UUID>


package com.transaction.learning.anootation.transaction

import com.transaction.learning.anootation.transaction.DeveloperDao
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface DeveloperRepository : JpaRepository<DeveloperDao, UUID>


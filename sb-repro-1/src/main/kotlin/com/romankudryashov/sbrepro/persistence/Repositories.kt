package com.romankudryashov.sbrepro.persistence

import com.romankudryashov.sbrepro.persistence.entity.InboxEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface InboxRepository : JpaRepository<InboxEntity, UUID> {
    fun findFirst50ByStatusOrderByCreatedAtAsc(status: InboxEntity.Status): List<InboxEntity>
}

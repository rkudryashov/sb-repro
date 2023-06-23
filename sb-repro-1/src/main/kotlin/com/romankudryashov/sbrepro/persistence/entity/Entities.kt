package com.romankudryashov.sbrepro.persistence.entity

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "inbox")
class InboxEntity(
    @Id
    val id: UUID,
    @Enumerated(value = EnumType.STRING)
    var status: Status,
    @CreationTimestamp
    val createdAt: LocalDateTime? = null
) {

    enum class Status {
        New
    }
}

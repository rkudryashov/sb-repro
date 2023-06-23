package com.romankudryashov.sbrepro.task

import com.romankudryashov.sbrepro.persistence.InboxRepository
import com.romankudryashov.sbrepro.persistence.entity.InboxEntity
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class InboxProcessingTask(
    private val inboxRepository: InboxRepository
) {

    private val log = LoggerFactory.getLogger(this.javaClass)

    @Scheduled(cron = "\${inbox.processing.cron}")
    fun execute() {
        log.debug("444 Start inbox polling iteration for repro")

        val notProcessedEvents = inboxRepository.findFirst50ByStatusOrderByCreatedAtAsc(InboxEntity.Status.New)

        log.debug("Number of unprocessed messages: {}", notProcessedEvents.size)
    }
}

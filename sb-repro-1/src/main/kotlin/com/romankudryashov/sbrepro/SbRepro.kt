package com.romankudryashov.sbrepro

import org.hibernate.generator.internal.CurrentTimestampGeneration
import org.springframework.aot.hint.MemberCategory
import org.springframework.aot.hint.RuntimeHints
import org.springframework.aot.hint.RuntimeHintsRegistrar
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ImportRuntimeHints
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@ImportRuntimeHints(SbReproRuntimeHints::class)
@EnableScheduling
class SbRepro

fun main(args: Array<String>) {
    runApplication<SbRepro>(*args)
}

class SbReproRuntimeHints : RuntimeHintsRegistrar {
    override fun registerHints(hints: RuntimeHints, classLoader: ClassLoader?) {
        hints.reflection()
            .registerType(CurrentTimestampGeneration::class.java, MemberCategory.INVOKE_DECLARED_CONSTRUCTORS)
    }
}

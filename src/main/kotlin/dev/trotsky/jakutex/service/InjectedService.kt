package dev.trotsky.jakutex.service

import dev.trotsky.jakutex.entity.Entity
import org.springframework.stereotype.Service

interface InjectedService {
    fun increment(entity: Entity)
}

@Service
class InjectedServiceImpl: InjectedService {
    override fun increment(entity: Entity) {
        entity.number++
    }

}

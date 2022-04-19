package dev.trotsky.jakutex.service

import dev.trotsky.jakutex.entity.Entity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

interface MainService {
    fun serviceFunction(entity: Entity): String
}

@Service
class MainServiceImpl: MainService {

    @Autowired
    private lateinit var injectedService: InjectedService

    override fun serviceFunction(entity: Entity): String {
        injectedService.increment(entity)

        entity.name = entity.name + entity.number

        return entity.name;
    }
}

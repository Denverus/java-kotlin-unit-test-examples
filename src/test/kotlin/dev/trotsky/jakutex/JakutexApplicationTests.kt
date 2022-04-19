package dev.trotsky.jakutex

import dev.trotsky.jakutex.entity.Entity
import dev.trotsky.jakutex.service.InjectedService
import dev.trotsky.jakutex.service.MainService
import dev.trotsky.jakutex.service.MainServiceImpl
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class JakutexApplicationTests {

	@InjectMocks
	private val mainService: MainService = MainServiceImpl()

	@Mock
	private lateinit var injectedService: InjectedService

	@Test
	fun contextLoads() {
	}

	@Test
	fun test_Service_Function() {
		val entity = Entity(1, "Test")

		Mockito.`when`(injectedService.increment(entity)).then { 2.also { entity.number = it } }// thenReturn(Entity(2, "Test"))

		mainService.serviceFunction(entity)
		assert(entity.name == "Test2")
	}
}

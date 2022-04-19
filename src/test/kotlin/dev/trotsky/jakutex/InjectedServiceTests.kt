package dev.trotsky.jakutex

import dev.trotsky.jakutex.entity.Entity
import dev.trotsky.jakutex.service.InjectedService
import dev.trotsky.jakutex.service.InjectedServiceImpl
import dev.trotsky.jakutex.service.MainService
import dev.trotsky.jakutex.service.MainServiceImpl
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class InjectedServiceTests {

	@InjectMocks
	private val injectedService: InjectedService = InjectedServiceImpl()

	@Test
	fun test_Service_Function() {
		val entity = Entity(1, "Test")

		injectedService.increment(entity)
		assert(entity.number == 2)
	}
}

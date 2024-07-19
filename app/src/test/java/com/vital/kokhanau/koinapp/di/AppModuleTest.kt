package com.vital.kokhanau.koinapp.di

import org.junit.Rule
import org.koin.core.parameter.parametersOf
import org.koin.dsl.koinApplication
import org.koin.dsl.module
import org.koin.test.KoinTest
import org.koin.test.KoinTestRule
import org.koin.test.check.checkModules
import kotlin.test.Test

class AppModuleTest : KoinTest {

    @get:Rule
    val koinTestRule = KoinTestRule.create {
        modules(appModule)
    }

    @Test
    fun `check modules`() {
        koinApplication {
            modules(module { factory { (msg: String) -> TestModule(msg) } })
        }.checkModules {
            create<TestModule> { parametersOf("TestModule") }
        }
    }

    data class TestModule(val name: String)
}

package com.gerardocortes.backend

import com.gerardocortes.backend.controller.AdminController
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BackendApplicationTests(@Autowired private val controller: AdminController) {

    @Test
    fun contextLoads() {
        assertThat(controller).isNotNull()
    }

}

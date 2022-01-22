package io.keepcoding.mvvmarchitecture.repository.local

import io.keepcoding.mvvmarchitecture.domain.Entity
// This is to use coroutines in our functions

interface LocalHelper {
    suspend fun getEntityById(id: String): Entity
}
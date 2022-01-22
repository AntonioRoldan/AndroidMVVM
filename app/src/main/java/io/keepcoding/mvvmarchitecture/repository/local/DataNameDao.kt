package io.keepcoding.mvvmarchitecture.repository.local

import androidx.room.*
import io.keepcoding.mvvmarchitecture.domain.Entity

@Dao
abstract class DataNameDao {
    // TODO: Write
    @Query("SELECT * FROM data_name_table")
    abstract fun getEntities(): List<Entity>
}
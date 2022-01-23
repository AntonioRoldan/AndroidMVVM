package io.keepcoding.mvvmarchitecture.ui

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.keepcoding.mvvmarchitecture.utils.Resource
import io.keepcoding.mvvmarchitecture.domain.Entity
import io.keepcoding.mvvmarchitecture.repository.local.LocalHelper
import io.keepcoding.mvvmarchitecture.repository.remote.ApiHelper
import kotlinx.coroutines.launch

class FragmentOrActivityViewModel(private val context: Application, private val apiHelper: ApiHelper, private val localHelper: LocalHelper) : ViewModel() {
    // private val entities : MutableLiveData<Resource<List<EntityItemViewModel?>>>()

    fun fetchPojoRetrofitResponse() {
        viewModelScope.launch {
            // entities.postValue(Resource.loading(null))
        }
    }
}
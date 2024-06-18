package com.c241ps220.centingapps.views.Fragment.HistoryFragment

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.c241ps220.centingapps.Repository.ChildRepository
import com.c241ps220.centingapps.data.database.child.Child
import com.c241ps220.centingapps.data.pref.UserModel
import com.c241ps220.centingapps.data.pref.UserPreference

class HistoryViewModel(application: Application, private val pref: UserPreference) : ViewModel() {
    private val mChildRepository: ChildRepository = ChildRepository(application)

    fun getAllChild(): LiveData<List<Child>> = mChildRepository.getAllChild()
    fun getSession(): LiveData<UserModel> {
        return pref.getSession().asLiveData()
    }
}
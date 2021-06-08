package zy.douyinpersonalpage.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import zy.douyinpersonalpage.model.UserProfile
import zy.douyinpersonalpage.viewmodel.PersonalInformationFragmentViewModel

/**
 * 工厂获得ViewModel，适用于有参数的ViewModel
 */
class PersonalInformationFragmentViewModelFactory(private val userProfile: UserProfile?):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PersonalInformationFragmentViewModel(userProfile) as T
    }
}

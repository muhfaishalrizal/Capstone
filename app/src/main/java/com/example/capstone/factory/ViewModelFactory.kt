package com.example.capstone.factoryimport android.content.Contextimport androidx.lifecycle.ViewModelimport androidx.lifecycle.ViewModelProviderimport com.example.capstone.data.AppRepositoryimport com.example.capstone.di.Injectionimport com.example.capstone.ui.upload_event.UploadViewModelimport com.example.capstone.ui.daftar_event.DaftarEventViewModelimport com.example.capstone.ui.detail_event.CommentViewModelimport com.example.capstone.ui.detail_event.DetailEventViewModelimport com.example.capstone.ui.edit_profille.EditProfilleViewModelimport com.example.capstone.ui.home.HomeViewModelimport com.example.capstone.ui.list_join.ListJoinViewModelimport com.example.capstone.ui.auth.login.LoginViewModelimport com.example.capstone.ui.maps.MapsViewModelimport com.example.capstone.ui.profile.DetailProfileViewModelimport com.example.capstone.ui.auth.sign_up.SignUpViewModelimport com.example.capstone.ui.detail_comment.DetailCommentViewModelimport com.example.capstone.ui.detail_join.DetailJoinViewModelimport com.example.capstone.ui.edit_profille.EditProfileAvatarViewModelimport com.example.capstone.ui.list_post.ListPostViewModelclass ViewModelFactory private constructor(private val appRepository: AppRepository): ViewModelProvider.NewInstanceFactory(){    @Suppress("UNCHECKED_CAST")    override fun <T : ViewModel> create(modelClass: Class<T>): T {        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {            return LoginViewModel(appRepository) as T        }        if (modelClass.isAssignableFrom(SignUpViewModel::class.java)){            return SignUpViewModel(appRepository) as T        }        if (modelClass.isAssignableFrom(HomeViewModel::class.java)){            return HomeViewModel(appRepository) as T        }        if (modelClass.isAssignableFrom(UploadViewModel::class.java)){            return UploadViewModel(appRepository) as T        }        if (modelClass.isAssignableFrom(MapsViewModel::class.java)){            return MapsViewModel(appRepository) as T        }        if (modelClass.isAssignableFrom(DetailProfileViewModel::class.java)){            return DetailProfileViewModel(appRepository) as T        }        if (modelClass.isAssignableFrom(EditProfilleViewModel::class.java)){            return EditProfilleViewModel(appRepository) as T        }        if (modelClass.isAssignableFrom(DaftarEventViewModel::class.java)){            return DaftarEventViewModel(appRepository) as T        }        if (modelClass.isAssignableFrom(ListJoinViewModel::class.java)){            return ListJoinViewModel(appRepository) as T        }        if (modelClass.isAssignableFrom(DetailEventViewModel::class.java)){            return DetailEventViewModel(appRepository) as T        }        if (modelClass.isAssignableFrom(CommentViewModel::class.java)){            return CommentViewModel(appRepository) as T        }        if (modelClass.isAssignableFrom(DetailJoinViewModel::class.java)){            return DetailJoinViewModel(appRepository) as T        }        if (modelClass.isAssignableFrom(EditProfileAvatarViewModel::class.java)){            return EditProfileAvatarViewModel(appRepository) as T        }        if (modelClass.isAssignableFrom(DetailCommentViewModel::class.java)){            return DetailCommentViewModel(appRepository) as T        }        if (modelClass.isAssignableFrom(ListPostViewModel::class.java)){            return ListPostViewModel(appRepository) as T        }        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)    }    companion object{        @Volatile        private var instance: ViewModelFactory? = null        fun getInstnce(context: Context): ViewModelFactory{            return instance ?: synchronized(this){                instance ?: ViewModelFactory(Injection.provideRepository(context))            }.also { instance = it }        }    }}
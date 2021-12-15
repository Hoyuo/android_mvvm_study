package me.hoyuo.gallery.presentation.feature.detail

import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import me.hoyuo.gallery.base.presentation.BaseActivity
import me.hoyuo.gallery.presentation.databinding.ActivityDetailBinding
import me.hoyuo.gallery.presentation.helper.DetailActivityHelper
import timber.log.Timber

@AndroidEntryPoint
class DetailActivity : BaseActivity<ActivityDetailBinding>(ActivityDetailBinding::inflate) {

    @Inject
    lateinit var factory: DetailViewModel.AssistedFactory

    override val viewModel: DetailViewModel by viewModels {
        DetailViewModel.provideFactory(factory, DetailActivityHelper.getArguments(intent))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("onCreate: ")
    }

    override fun initLayout() {
        bind {
            vm = viewModel
            lifecycleOwner = this@DetailActivity
        }
    }
}

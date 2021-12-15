package me.hoyuo.gallery.presentation.feature.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import me.hoyuo.gallery.base.presentation.BaseActivity
import me.hoyuo.gallery.base.presentation.util.livedata.eventObserve
import me.hoyuo.gallery.presentation.databinding.ActivityMainBinding
import me.hoyuo.gallery.presentation.feature.main.adatper.MainAdapter
import me.hoyuo.gallery.presentation.helper.DetailActivityHelper
import timber.log.Timber

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override val viewModel: MainViewModel by viewModels()

    private var loading = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("onCreate: ")

        setupObserve()
    }

    override fun initLayout() {
        bind {
            vm = viewModel
            lifecycleOwner = this@MainActivity

            list.adapter = MainAdapter() { itemId ->
                startActivity(DetailActivityHelper.getNavigationIntent(this@MainActivity, itemId))
            }

            list.addOnScrollListener(object : RecyclerView.OnScrollListener() {
                override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                    super.onScrolled(recyclerView, dx, dy)

                    if (loading) return

                    val layoutManager = (list.layoutManager as? GridLayoutManager) ?: return

                    val visibleItemCount = layoutManager.childCount
                    val totalItemCount = layoutManager.itemCount
                    val pastVisibleItems = layoutManager.findFirstCompletelyVisibleItemPosition()

                    if ((visibleItemCount + pastVisibleItems) >= totalItemCount) {
                        loading = true
                        viewModel.pageLoad()
                    }
                }
            })

            swipeLayout.setOnRefreshListener {
                swipeLayout.isRefreshing = false
                viewModel.initLoad()
            }
        }
    }

    private fun setupObserve() {
        viewModel.event.eventObserve(this@MainActivity) {
            loading = it
        }
    }
}

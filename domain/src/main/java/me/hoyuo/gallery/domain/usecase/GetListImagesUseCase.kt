package me.hoyuo.gallery.domain.usecase

import javax.inject.Inject
import me.hoyuo.gallery.domain.repository.Repository

class GetListImagesUseCase @Inject constructor(
    private val repository: Repository,
) {
    operator fun invoke(page: Int, limit: Int = 20) = repository.getListImages(page, limit)
}

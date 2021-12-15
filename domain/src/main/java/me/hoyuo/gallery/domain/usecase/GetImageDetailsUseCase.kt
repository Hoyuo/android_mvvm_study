package me.hoyuo.gallery.domain.usecase

import javax.inject.Inject
import me.hoyuo.gallery.domain.repository.Repository

class GetImageDetailsUseCase @Inject constructor(
    private val repository: Repository,
) {
    operator fun invoke(id: String) = repository.getImageDetails(id)
}

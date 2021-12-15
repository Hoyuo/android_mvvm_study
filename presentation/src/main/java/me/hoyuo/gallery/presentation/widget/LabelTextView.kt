package me.hoyuo.gallery.presentation.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import me.hoyuo.gallery.presentation.databinding.ViewLabelTextViewBinding
import timber.log.Timber

@BindingMethods(
    value = [
        BindingMethod(
            type = LabelTextView::class,
            attribute = "bind:setLabel",
            method = "setLabel",
        ),
        BindingMethod(
            type = LabelTextView::class,
            attribute = "bind:setText",
            method = "setText",
        )
    ]
)

class LabelTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0,
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    private val binding: ViewLabelTextViewBinding =
        ViewLabelTextViewBinding.inflate(LayoutInflater.from(context), this, true)

    var label: String? = null
        set(value) {
            field = value
            if (value.isNullOrEmpty()) return
            Timber.d("setLabel: $value")
            binding.label.text = value
        }

    var text: String? = null
        set(value) {
            field = value
            if (value.isNullOrEmpty()) return
            Timber.d("setText: $value")
            binding.text.text = value
        }
}

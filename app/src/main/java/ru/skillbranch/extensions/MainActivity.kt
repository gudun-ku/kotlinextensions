package ru.skillbranch.extensions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import ru.skillbranch.extensions.utils.setPaddingOptionally
import ru.skillbranch.extensions.utils.span

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // usual way
//        some_text_view.text =
//            SpannableStringBuilder()
//                .append("new text", ForegroundColorSpan(ContextCompat.getColor(this, R.color.red)),
//                    SpannableString.SPAN_INCLUSIVE_EXCLUSIVE)
//                .append(" ")
//                .append("\n")
//                .append("new text", ForegroundColorSpan(ContextCompat.getColor(this, R.color.blue)),
//                    SpannableString.SPAN_INCLUSIVE_EXCLUSIVE)

        // using extensions
        some_text_view.text = span {
            color("This string will be RED", R.color.red)
            space()
            plain("This string will be sad :^(")
            space()
            string("This string will be blue and bold!") {
                color(R.color.blue)
                bold()
            }
        }

        some_text_view.setPaddingOptionally(
            top = 16,
            left = 16
        )
    }
}

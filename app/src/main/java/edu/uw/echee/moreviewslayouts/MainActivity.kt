package edu.uw.echee.moreviewslayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import edu.uw.echee.moreviewslayouts.databinding.UpdateViewsProgrammaticallyBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: UpdateViewsProgrammaticallyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = UpdateViewsProgrammaticallyBinding.inflate(layoutInflater).apply { setContentView(root) }

        val shouldShowButton = false

        binding.btnLoad.setOnClickListener {
            binding.tvWelcome.setTextColor(getColor(R.color.default_text_color))
            binding.tvWelcome.text = getString(R.string.welcome_eric)

            binding.btnLoad.visibility = if (shouldShowButton){
                View.VISIBLE
            } else {
                View.GONE
            }
        }
    }
}


/**
 * ......
 * Note: binding, inflate + apply + set content root
 *  Documentation: https://developer.android.com/topic/libraries/view-binding
 */

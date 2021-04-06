package edu.uw.echee.moreviewslayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/**
 * ......
 * Note: binding, inflate + apply + set content root
 *  Documentation: https://developer.android.com/topic/libraries/view-binding
 */

package com.example.hudson.emojiexperiment

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URLDecoder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        send.setOnClickListener {
            Log.i(TAG, edit_text.text.toString())
            log_encoded.text = Uri.encode(edit_text.text.toString())
            log.text = URLDecoder.decode(log_encoded.text.toString(), "UTF-8")
        }
    }

    companion object {
        const val TAG = "MainActivity"
    }
}

package com.example.primeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.WebView

class WebViewActivity : AppCompatActivity() {

    lateinit var web:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        // val webView:WebView = findViewById(R.id.web)
        web = findViewById(R.id.web)
        web.loadUrl("https://www.google.com")
        web.settings.javaScriptEnabled = true
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK && web.canGoBack()) {
            web.canGoBack()
            return  true
        }
        return super.onKeyDown(keyCode, event)
    }

}
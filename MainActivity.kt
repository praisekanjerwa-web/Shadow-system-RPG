package com.shadowsystem.rpg

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.graphics.Color

class MainActivity : Activity() {
    private lateinit var gameView: WebView

    @Suppress("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = Color.rgb(8, 13, 25)
        window.navigationBarColor = Color.rgb(8, 13, 25)
        window.decorView.systemUiVisibility = 0

        gameView = WebView(this)
        gameView.setBackgroundColor(Color.rgb(8, 13, 25))
        gameView.settings.javaScriptEnabled = true
        gameView.settings.domStorageEnabled = true
        gameView.settings.allowFileAccess = true
        gameView.settings.allowContentAccess = true
        gameView.settings.loadsImagesAutomatically = true
        gameView.webViewClient = WebViewClient()
        gameView.webChromeClient = WebChromeClient()
        gameView.overScrollMode = View.OVER_SCROLL_NEVER
        gameView.isVerticalScrollBarEnabled = false
        gameView.isHorizontalScrollBarEnabled = false
        setContentView(gameView)

        if (savedInstanceState == null) {
            gameView.loadUrl("file:///android_asset/index.html")
        } else {
            gameView.restoreState(savedInstanceState)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        gameView.saveState(outState)
        super.onSaveInstanceState(outState)
    }

    @Deprecated("Deprecated in Android API but retained for compatibility")
    override fun onBackPressed() {
        if (::gameView.isInitialized && gameView.canGoBack()) {
            gameView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}

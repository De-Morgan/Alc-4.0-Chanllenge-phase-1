package com.example.alc4phase1

import android.net.http.SslError
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.*

class AlcWebPage : AppCompatActivity() {
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alc_web_page)
         webView = findViewById(R.id.alc_webview)
        loadWebPage()

    }
    private fun loadWebPage(){
        webView.webViewClient = MyWebViewClient()
        webView.loadUrl("https://andela.com/alc")
    }
}
class MyWebViewClient: WebViewClient(){
    override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
        handler?.proceed()
    }
}

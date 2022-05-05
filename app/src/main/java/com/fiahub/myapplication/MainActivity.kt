package com.fiahub.myapplication

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import im.delight.android.webview.AdvancedWebView

class MainActivity : AppCompatActivity(),AdvancedWebView.Listener  {


    lateinit var webview : AdvancedWebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        webview = findViewById<AdvancedWebView>(R.id.webview)


        webview.setListener(this, this);
        webview.setMixedContentAllowed(false);



        webview.loadUrl("https://staging.fiahub.com/payment?session_id=772bbd29-cba1-46d1-bb60-fb70fc6f5c56")
    }

    override fun onPageStarted(url: String?, favicon: Bitmap?) {

    }

    override fun onPageFinished(url: String?) {

    }

    override fun onPageError(errorCode: Int, description: String?, failingUrl: String?) {

    }

    override fun onDownloadRequested(url: String?,
                                     suggestedFilename: String?,
                                     mimeType: String?,
                                     contentLength: Long,
                                     contentDisposition: String?,
                                     userAgent: String?) {

    }

    override fun onExternalPageRequest(url: String?) {

    }

    override fun onResume() {
        super.onResume()
        webview.onResume()
    }

    override fun onPause() {
        super.onPause()
        webview.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        webview.onDestroy()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        webview.onActivityResult(requestCode, resultCode, intent)
        // ...
    }
}
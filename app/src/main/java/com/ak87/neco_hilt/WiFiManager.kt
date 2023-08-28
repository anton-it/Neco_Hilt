package com.ak87.neco_hilt

import android.util.Log
import javax.inject.Inject

class WiFiManager @Inject constructor(private val settings: WiFiSettings) {
    fun connect() {
        settings.openConnection()
    }
    fun sendMessage() {
        settings.writeBytes()
    }

}

class WiFiSettings @Inject constructor() {
    fun openConnection() {
        Log.d("MyLog111", "Connected")
    }

    fun writeBytes() {
        Log.d("MyLog111", "Hello!")
    }

}
package com.ak87.neco_hilt

import android.util.Log

class WiFiManager(private val settings: WiFiSettings) {
    fun connect() {
        settings.openConnection()
    }
    fun sendMessage() {
        settings.writeBytes()
    }

}

class WiFiSettings {
    fun openConnection() {
        Log.d("MyLog111", "Connected")
    }

    fun writeBytes() {
        Log.d("MyLog111", "Hello!")
    }

}
package com.example.mad_pr_5_21012011087

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        impenitent()
    }
    private fun impenitent()
    {
        findViewById<Button>(R.id.button_browse).setOnClickListener {
         Log.i("cilck", "ManActivity")
            Intent(Intent.ACTION_VIEW, Uri.parse(findViewById<EditText>(R.id.input_url).toString())).also{ startActivity(it)}
        }
        findViewById<Button>(R.id.button_call_log).setOnClickListener {
            Log.i("cilck" , "MainActivity")
            val number=findViewById<EditText>(R.id.input_phone_no).text.toString().trim()
            Intent(Intent.ACTION_DIAL).data = ((Uri.parse("tel$number"))).apply {  }

        }
        findViewById<Button>(R.id.button_call).setOnClickListener {
            Log.i("Cilck_Call-log", "MainActivity")
            Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).also { startActivity(it) }
        }
        findViewById<Button>(R.id.button_gallery).setOnClickListener {
            Log.i("Click_Gallery","MainActivity")
            Intent(Intent.ACTION_VIEW).setType("image/*").also { startActivity(it) }
        }
        findViewById<Button>(R.id.button_alarm).setOnClickListener {
            Log.i("Click","MainActivity")
            Intent(AlarmClock.ACTION_SHOW_ALARMS).also { startActivity(it) }
        }

    }
}
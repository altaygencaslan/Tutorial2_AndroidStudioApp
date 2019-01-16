package com.blogspot.altaygencaslan.tutorial2_androidstudioapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnIn_Click(view: View)
    {
        var message = "Singing In: ${txtUserName.text}"
        if (txtUserName.text.isNullOrEmpty())
            message = "UserName cannot be empty!"

        Toast.makeText(applicationContext,message,Toast.LENGTH_LONG).show()

    }
}

package com.example.uidesigns

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Window
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViewById<Button>(R.id.btnStartProgress).setOnClickListener{
            customDialog()
        }
    }

    private fun customDialog(){
        val dialog= Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.custom_dialog)
        dialog.setCancelable(false)

        val btnYes=dialog.findViewById<Button>(R.id.btnYes)
        val btnNo=dialog.findViewById<Button>(R.id.btnNo)

        btnYes.setOnClickListener{
            Toast.makeText(this,"You Agreed !",Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
        btnNo.setOnClickListener{
            dialog.dismiss()
        }

        dialog.show()
    }
}
package com.vns.customdialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonShowDialog = findViewById<Button>(R.id.buttonShowDialog)
        buttonShowDialog.setOnClickListener {
            showCustomDialog()
        }
    }

    private fun showCustomDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.activity_main)
        val width = (resources.displayMetrics.widthPixels * 0.8).toInt()
        val height = (resources.displayMetrics.heightPixels * 0.6).toInt() 
        dialog.window?.setLayout(width, height)

        val buttonOk = dialog.findViewById<Button>(R.id.buttonOk)
        val buttonCancel = dialog.findViewById<Button>(R.id.buttonCancel)

        buttonOk.setOnClickListener {
            dialog.dismiss()
        }

        buttonCancel.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
        }
}

package com.test.admin.tp1
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Exécution onCreate", Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Exécution onResume", Toast.LENGTH_SHORT).show()

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Exécution onStart", Toast.LENGTH_SHORT).show()
    }
    override fun onRestart(){
        super.onRestart()
        Toast.makeText(this, "Exécution onRestart", Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Exécution onStop", Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Exécution onPause", Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Exécution onDestroy", Toast.LENGTH_SHORT).show()
    }
}

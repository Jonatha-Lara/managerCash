package br.edu.ufpr.managercash

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var dataManagerNotes: DataManagerNotes;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun registerDebit(view: View){
        val intent = Intent(this, DebitActivity::class.java)
        startActivity(intent)
    }

    fun registerCredit(view: View){
        val intent = Intent(this, CreditActivity::class.java)
        startActivity(intent)
    }
    fun listStatement(view: View) {
        val intent = Intent(this, StatementActivity::class.java)
        startActivity(intent)
    }

    fun exitApp(view: View){
        finish()
    }

}



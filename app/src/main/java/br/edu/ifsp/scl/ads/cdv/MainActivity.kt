package br.edu.ifsp.scl.ads.cdv

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.ifsp.scl.ads.cdv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val amb: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(amb.root)
        amb.AbraBt.setOnClickListener {
            val anotherIntent:Intent= Intent(this@MainActivity, AnotherActivy::class.java)
        }
        Log.v(getString(R.string.app_name),"onCreate: Iniciando ciclo completo")
    }
    override fun onStart() {
        super.onStart()
        Log.v(getString(R.string.app_name),"onStart: Iniciando ciclo de visivel")
    }
    override fun onResume() {
        super.onResume()
        Log.v(getString(R.string.app_name),"onResume: Iniciando ciclo foreground")
    }
    override fun onPause() {
        super.onPause()
        Log.v(getString(R.string.app_name),"onPause: Finalizando ciclo foreground")
    }
    override fun onStop() {
        super.onStop()
        Log.v(getString(R.string.app_name),"onStop: Finalizando ciclo visivel")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(getString(R.string.app_name),"onDestroy: Finalizando ciclo completo")
    }
    override fun onRestart() {
        super.onRestart()
        Log.v(getString(R.string.app_name),"onRestart: Preparando o onStart")
    }
}

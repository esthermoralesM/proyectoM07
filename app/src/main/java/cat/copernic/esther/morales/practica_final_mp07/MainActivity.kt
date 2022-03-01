package cat.copernic.esther.morales.practica_final_mp07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import cat.copernic.esther.morales.practica_final_mp07.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        val retValue = super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.application_menu, menu)
        return retValue
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            android.R.id.home ->  onBackPressed()
            R.id.idItem1 ->   Toast.makeText(this, "Esther Morales Mozas", Toast.LENGTH_LONG).show()
        }

        return  super.onOptionsItemSelected(item)
    }
}
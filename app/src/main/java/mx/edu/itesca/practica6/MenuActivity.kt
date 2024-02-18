package mx.edu.itesca.practica6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos: Button = findViewById(R.id.Antojitos) as Button
        var btnEspecialidades: Button = findViewById(R.id.especialidades) as Button
        var btnCombinaciones: Button = findViewById(R.id.combinations) as Button
        var btnTortas: Button = findViewById(R.id.tortas) as Button
        var btnSopas: Button = findViewById(R.id.sopas) as Button
        var btnDrink: Button = findViewById(R.id.drinks) as Button

        btnAntojitos.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Antojitos")
            startActivity(intent)
        }
        btnEspecialidades.setOnClickListener{
            var intent :Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Especialidades")
            startActivity(intent)
        }
        btnCombinaciones.setOnClickListener{
            var intent :Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Combinaciones")
            startActivity(intent)
        }
        btnTortas.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Tortas")
            startActivity(intent)
        }
        btnSopas.setOnClickListener{
            var intent :Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Sopas")
            startActivity(intent)
        }
        btnDrink.setOnClickListener{
            var intent :Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType","Bebidas")
            startActivity(intent)
        }
    }
}
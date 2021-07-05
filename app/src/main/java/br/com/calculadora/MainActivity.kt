package br.com.calculadora

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultado

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt (nota1.text.toString())
            val nota2 = Integer.parseInt (nota2.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(faltas.text.toString())

            if(media >=6 && faltas <=10){
                resultado.setText("Parabéns, você foi aprovado!" + "Nota Final:"+ media+ "\n"+ "Faltas:" +faltas)
                resultado.setTextColor(Color.GREEN)
            }
            else if (faltas >10){
                resultado.setText("Infelizmente, você foi reprovado por faltas!" + "\n" + "Nota Final:"+ media+ "\n"+ "Faltas:" +faltas)
                resultado.setTextColor(Color.RED)
            }
            else{
                resultado.setText("Infelizmente, você foi reprovado!" + "Nota Final:"+ media+ "\n"+ "Faltas:" +faltas)
                resultado.setTextColor(Color.RED)
            }

        }
    }
}
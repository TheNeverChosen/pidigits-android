package com.alpha.firstbenchmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.alpha.firstbenchmark.*

class MainActivity : AppCompatActivity() {
    private lateinit var runBench:Button
    private lateinit var textV:TextView
    private val piDigits = 10000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        runBench = findViewById(R.id.button)
        textV = findViewById(R.id.textView)

        runBench.setOnClickListener{
//            val ktRosetta = calcPi(piDigits)
//            val jPi = PiRosettaJava()
//            val javaRosetta = jPi.calcPiDigits(piDigits)

            val ktBenchGame = run(piDigits)
            val javaBenchGame = PiBenchGameJava.run(piDigits)

            /*"Kotlin (Rosetta): $ktRosetta ms\nJava (Rosetta: $javaRosetta ms\n*/
            textV.text= "Kotlin (benchGame): $ktBenchGame ms\nJava (benchGame): $javaBenchGame ms"
        }
    }
}
package se.magictechnology.kotlinfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.fragHere, StartFragment()).commit()

        loadStartBtn.setOnClickListener {

            var theStart = StartFragment()
            theStart.countingNumber = 42

            supportFragmentManager.beginTransaction().replace(R.id.fragHere, theStart).commit()
        }

        changeStuffBtn.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragHere, OtherFragment()).commit()
        }


    }
}
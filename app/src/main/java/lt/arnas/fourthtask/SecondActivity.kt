package lt.arnas.fourthtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {

    lateinit var textListView2: ListView
    lateinit var adapter: ArrayAdapter<String>
    lateinit var randomNumber1: TextView
    lateinit var randomNumber2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textListView2 = findViewById(R.id.textListView2)
        randomNumber1 = findViewById(R.id.randomNumber1)
        randomNumber2 = findViewById(R.id.randomNumber2)

        fizzBuzz02()
    }

    private fun fizzBuzz02() {
        var randomInt1 = Random.nextInt(-50, 50)
        var randomInt2 = Random.nextInt(50, 150)

        randomNumber1.text = "First random number $randomInt1"
        randomNumber2.text = "Second random number $randomInt2"

        var length: Int = 0
        for(number in randomInt1..randomInt2) length++

        var array = arrayOfNulls<String?>(length)

        for(item in 0 until length){
            if ((randomInt1) % 3 == 0 && (randomInt1) % 5 == 0){
                array[item] = "FIZZBUZZ"
            } else if ((randomInt1) % 5 == 0) {
                array[item] = "BUZZ"
            } else if ((randomInt1) % 3 == 0) {
                array[item] = "FIZZ"
            } else
                array[item] = (randomInt1).toString()
            randomInt1++
        }
        adapter = ArrayAdapter(
            this, android.R.layout.simple_expandable_list_item_1, array
        )
        textListView2.adapter = adapter
    }
}
package lt.arnas.fourthtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    final val TAG = "my_tag"

    lateinit var textListView: ListView
    lateinit var adapter: ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textListView = findViewById(R.id.textListView)

        fizzBuzz()
    }

    private fun fizzBuzz() {
        textListView = findViewById(R.id.textListView)

        var array02 = arrayOfNulls<String?>(100)

        for(item in 0 .. 99){
            if ((item+1) % 3 == 0 && (item+1) % 5 == 0){
                array02[item] = "FIZZBUZZ"
            } else if ((item+1) % 5 == 0) {
                array02[item] = "BUZZ"
            } else if ((item+1) % 3 == 0) {
                array02[item] = "FIZZ"
            } else
                array02[item] = (item + 1).toString()
        }

        adapter = ArrayAdapter(
            this, android.R.layout.simple_expandable_list_item_1, array02
        )
        textListView.adapter = adapter
    }
}
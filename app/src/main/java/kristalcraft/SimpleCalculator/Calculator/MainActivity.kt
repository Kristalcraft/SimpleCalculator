package kristalcraft.SimpleCalculator.Calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculate = Arguments()

        button.setOnClickListener {
            if (!checkTextView(number_one) || !checkTextView(number_two)) {
                result.setText(R.string.error_numbers)
            }
            else if (!checkTextView(symbol)){
                result.setText(R.string.error_operator)
            } else {
                val output1 = calculate.main(symbol.text.toString(), number_one.text.toString(), number_two.text.toString())
                result.setText(output1)
            }

        }
    }

    fun checkTextView(input: TextView): Boolean{
        return input.length() > 0
    }
}
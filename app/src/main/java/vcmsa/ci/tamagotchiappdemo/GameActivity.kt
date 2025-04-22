package vcmsa.ci.tamagotchiappdemo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val hunger = 50
        val cleanliness =  100
        val health = 0

        val maxStatus = 100
        val minStatus = 0


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_game)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val tvHunger = findViewById<TextView>(R.id.tvHunger)
        val tvHealth = findViewById<TextView>(R.id.tvHealth)
        val tvHappy = findViewById<TextView>(R.id.tvHappy)

        btnFeed.setOnClickListener{
            performAction("FEED")
            }
        btnClean.setOnClickListener{
            performAction("Clean")
            }
        btnPlay.setOnClickListener{
            performAction("Play")
        }

    private fun performAction(strAction: String){
            if
        }
        updateStatusText()
    }
    private fun updateStatusText() {

        tvHunger.text = "Hunger: $intHunger"

    }
}



/*
fun updateStatusText() {
    //display the points in the respective controls
  }

  fun doActivityFeed()
        //???
        //VALIDATING THE POINTS
        //???

        //update the textview with the activity word
        //update the points
        //hunger -= 10
        //health += 5

        updateStatusText()
 */
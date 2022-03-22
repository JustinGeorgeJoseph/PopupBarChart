package com.justin.popupbarchartsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.justin.popupbarchart.CustomBarChart
import com.justin.popupbarchart.GraphValue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<CustomBarChart>(R.id.customBarchart).apply {
            setGraphValues(
                arrayListOf(
                    GraphValue(
                        day = 1,
                        id = 1,
                        progress = 30,
                        isToday = false,
                        showToolTip = false
                    ),
                    GraphValue(
                        day = 20,
                        id = 2,
                        progress = 70,
                        isToday = false,
                        showToolTip = false
                    ),
                    GraphValue(
                        day = 3,
                        id = 3,
                        progress = 100,
                        isToday = false,
                        showToolTip = false
                    ),
                    GraphValue(
                        day = 4,
                        id = 4,
                        progress = 0,
                        isToday = false,
                        showToolTip = false
                    ),
                    GraphValue(
                        day = 5,
                        id = 5,
                        progress = 50,
                        isToday = false,
                        showToolTip = false
                    ),
                    GraphValue(
                        day = 6,
                        id = 6,
                        progress = 50,
                        isToday = false,
                        showToolTip = false
                    ),
                    GraphValue(
                        day = 7,
                        id = 7,
                        progress = 25,
                        isToday = false,
                        showToolTip = false
                    ),
                )
            )

            animateProgress()
        }
    }
}
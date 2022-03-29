package com.justin.popupbarchartsample

import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.justin.popupbarchart.PopupBarChart
import com.justin.popupbarchart.GraphValue
import com.skydoves.colorpickerview.ColorPickerDialog
import com.skydoves.colorpickerview.listeners.ColorEnvelopeListener


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val widget = findViewById<PopupBarChart>(R.id.customBarchart).apply {
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
        }



        findViewById<CheckBox>(R.id.cb_round_corner).setOnCheckedChangeListener { compoundButton, b ->
            widget.roundCorner = b
        }

        findViewById<AppCompatButton>(R.id.colorPicker).setOnClickListener {
            ColorPickerDialog.Builder(this)
                .setTitle("Choose secondary color")
                .setPreferenceName("secondaryColor")
                .setPositiveButton("confirm",
                    ColorEnvelopeListener { envelope, fromUser ->
                        Log.d("TAG_JUSTIN","--> ${envelope.color} || ${envelope.argb} || ${envelope.hexCode}")
                        widget.secondaryColor = envelope.color
                    })
                .setNegativeButton("Cancel") {
                        dialogInterface, i -> dialogInterface.dismiss()
                }
                .attachAlphaSlideBar(true) // the default value is true.
                .attachBrightnessSlideBar(true) // the default value is true.
                .setBottomSpace(12) // set a bottom space between the last slidebar and buttons.
                .show()
        }



        findViewById<AppCompatButton>(R.id.colorPickerStartColor).setOnClickListener {
            ColorPickerDialog.Builder(this)
                .setTitle("Choose Start color")
                .setPreferenceName("startColor")
                .setPositiveButton("confirm",
                    ColorEnvelopeListener { envelope, fromUser ->
                        Log.d("TAG_JUSTIN","--> ${envelope.color} || ${envelope.argb} || ${envelope.hexCode}")
                        widget.startColor = envelope.color
                    })
                .setNegativeButton("Cancel") {
                        dialogInterface, i -> dialogInterface.dismiss()
                }
                .attachAlphaSlideBar(true) // the default value is true.
                .attachBrightnessSlideBar(true) // the default value is true.
                .setBottomSpace(12) // set a bottom space between the last slidebar and buttons.
                .show()
        }


        findViewById<AppCompatButton>(R.id.colorPickerEndColor).setOnClickListener {
            ColorPickerDialog.Builder(this)
                .setTitle("Choose end color")
                .setPreferenceName("endColor")
                .setPositiveButton("confirm",
                    ColorEnvelopeListener { envelope, fromUser ->
                        Log.d("TAG_JUSTIN","--> ${envelope.color} || ${envelope.argb} || ${envelope.hexCode}")
                        widget.endColor = envelope.color
                    })
                .setNegativeButton("Cancel") {
                        dialogInterface, i -> dialogInterface.dismiss()
                }
                .attachAlphaSlideBar(true) // the default value is true.
                .attachBrightnessSlideBar(true) // the default value is true.
                .setBottomSpace(12) // set a bottom space between the last slidebar and buttons.
                .show()
        }

        findViewById<SeekBar>(R.id.bar_size).setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                widget.barSize = p0?.progress ?: 16
            }

        })
    }
}
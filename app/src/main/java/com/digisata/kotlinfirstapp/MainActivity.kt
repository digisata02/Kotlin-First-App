package com.digisata.kotlinfirstapp

import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textViewY = seekBarView.translationY

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                seekBarView.text = progress.toString()

                val distance =
                    (textViewY + progress * resources.getDimension(R.dimen.text_anim) * -1)

                seekBarView.animate().translationY(distance)

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

        button.setOnClickListener { v ->
            seekBar.progress = 0
            seekBarView.animate().setDuration(500).rotationXBy(360f).translationY(textViewY)
                                   
            // collaboration test
            // this is another comment for collaboration test
            // uyee
        }
    }
}

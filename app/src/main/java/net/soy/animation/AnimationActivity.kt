package net.soy.animation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_animation.*
import kotlinx.android.synthetic.main.item_toolbar.*

class AnimationActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        initView()
    }

    private fun initView(){
        tv_toolbar_title.text = "Animation"
        tv_title.text = "title"
        tv_content.text = """animation
test 
content"""
        lin_animation.setOnClickListener {
            iv_plus_minus.isSelected = !iv_plus_minus.isSelected
            if(iv_plus_minus.isSelected){
                AnimationUtils.expand(lin_hide_animation)
            } else {
                AnimationUtils.collapse(lin_hide_animation)
            }
        }
    }
}

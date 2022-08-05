package com.nkechinnaji.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nkechinnaji.dagger2.dagger.components.DaggerMessageComponents
import com.nkechinnaji.dagger2.databinding.ActivityMainBinding
import com.nkechinnaji.dagger2.model.DataMsgs
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var  viewBinding: ActivityMainBinding

    @Inject
    lateinit var dataMsgs: DataMsgs

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = viewBinding.root
        setContentView(view)
        DaggerMessageComponents.create().inject(this)
        viewBinding.message.text = dataMsgs.msg1
    }
}
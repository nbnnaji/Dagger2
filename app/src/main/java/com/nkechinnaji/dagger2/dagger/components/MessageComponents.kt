package com.nkechinnaji.dagger2.dagger.components

import com.nkechinnaji.dagger2.MainActivity
import dagger.Component

@Component
interface MessageComponents {
    fun inject(mainActivity: MainActivity)
}
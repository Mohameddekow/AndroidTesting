package com.dekow.testingandriod

import android.content.Context

class ResourceCompere {
    fun isEqual(context: Context, string: String, resId: Int):Boolean{
        return context.getString(resId) == string
    }
}
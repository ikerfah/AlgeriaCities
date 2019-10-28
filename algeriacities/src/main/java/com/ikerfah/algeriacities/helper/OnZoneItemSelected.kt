package com.ikerfah.algeriacities.helper

import android.view.View
import android.widget.AdapterView
import com.ikerfah.algeriacities.models.Wilaya
import com.ikerfah.algeriacities.models.Zone

interface OnZoneItemSelected<T> {

    fun onNothingSelected(parent: AdapterView<*>?)

    fun onItemSelected(selectedZone: T?, parent: AdapterView<*>?, view: View?, position: Int, id: Long)
}
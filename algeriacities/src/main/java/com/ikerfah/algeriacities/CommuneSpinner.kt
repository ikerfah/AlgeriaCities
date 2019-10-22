package com.ikerfah.algeriacities

import android.R
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class CommuneSpinner : Spinner {
    private var mContext: Context? = null
    private var attrs: AttributeSet? = null
    private var mode: Int? = null
    private var defStyleAttr: Int? = null

    constructor(context: Context?) : super(context) {
        this.mContext = context
        setup()
    }

    constructor(context: Context?, mode: Int) : super(context, mode) {
        this.mContext = context
        this.mode = mode
        setup()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        this.mContext = context
        this.attrs = attrs
        setup()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        this.mContext = context
        this.attrs = attrs
        this.defStyleAttr = defStyleAttr
        setup()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, mode: Int) : super(
        context,
        attrs,
        defStyleAttr,
        mode
    ) {
        this.mContext = context
        this.attrs = attrs
        this.mode = mode
        this.defStyleAttr = defStyleAttr


        setup()
    }

    var selectedLang: String? = WilayaAdapter.LANG_FR

    fun setup() {

        if (attrs != null) {
            for (i in 0..attrs?.attributeCount?.minus(1)!!) {
                val name = attrs?.getAttributeName(i)
                if (name == "lang") {
                    selectedLang = attrs?.getAttributeValue(i)!!
                }
            }
        }
    }


    private var parent: Spinner? = null

    fun setParentSpinner(spinner: Spinner?) {
        parent = spinner
        if (parent != null) {

            parent?.onItemSelectedListener = object : OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) {
                }

                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    if (parent != null) {
                        val tmp = parent?.selectedItem as Wilaya
                        val test = WilayaAdapter(context,AlgeriaCities.getCommunesByWilayaId(tmp.id),selectedLang)
                        adapter = test


                    }
                }
            }

        }

    }


}
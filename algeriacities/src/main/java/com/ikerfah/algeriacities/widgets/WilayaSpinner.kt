package com.ikerfah.algeriacities.widgets

import android.content.Context
import android.util.AttributeSet
import android.widget.Spinner
import com.ikerfah.algeriacities.AlgeriaCities
import com.ikerfah.algeriacities.adapters.ZoneAdapter

class WilayaSpinner : Spinner {
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


    fun setup() {
        try {
            var selectedLang: String? = ZoneAdapter.LANG_FR
            if (attrs != null) {
                for (i in 0..attrs?.attributeCount?.minus(1)!!) {
                    val name = attrs?.getAttributeName(i)
                    if (name == "lang") {
                        selectedLang = attrs?.getAttributeValue(i)!!
                    }
                }
            }
            adapter = ZoneAdapter(
                context,
                AlgeriaCities.getAllWilaya(),
                selectedLang
            )
        } catch (e: Exception) {
            e.fillInStackTrace()
        }

    }


}
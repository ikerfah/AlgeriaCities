package com.ikerfah.algeriacities.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import com.ikerfah.algeriacities.AlgeriaCities
import com.ikerfah.algeriacities.adapters.ZoneAdapter
import com.ikerfah.algeriacities.models.Commune
import com.ikerfah.algeriacities.models.Wilaya

class WilayaSpinner : Spinner, AdapterView.OnItemSelectedListener {
    override fun onNothingSelected(p0: AdapterView<*>?) {
        listener?.onNothingSelected(p0)
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        if (communeSpinner != null) {
            val selectedWilaya: Wilaya? = selectedItem as Wilaya
            if (selectedWilaya != null) {
                if (mContext != null) {
                    communeSpinner!!.adapter = ZoneAdapter<Commune>(
                        mContext!!,
                        AlgeriaCities.getCommunesByWilayaId(selectedWilaya?.id)
                    )
                }

            }
        }
        listener?.onItemSelected(p0, p1, p2, p3)
    }


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


    private fun setup() {
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
        super.setOnItemSelectedListener(this)

    }

    private var listener: OnItemSelectedListener? = null
    override fun setOnItemSelectedListener(listener: OnItemSelectedListener?) {
        this.listener = listener
    }


    private var communeSpinner: CommuneSpinner? = null
    /**
     *  @param communeSpinner : Commune Spinner widget that listen to wilaya spinner changes
     */
    fun attachCommuneSpinner(communeSpinner: CommuneSpinner?) {
        this.communeSpinner = communeSpinner
    }

}
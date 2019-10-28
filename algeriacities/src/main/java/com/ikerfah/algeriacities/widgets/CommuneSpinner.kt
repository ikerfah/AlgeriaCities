package com.ikerfah.algeriacities.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import com.ikerfah.algeriacities.AlgeriaCities
import com.ikerfah.algeriacities.adapters.ZoneAdapter
import com.ikerfah.algeriacities.helper.OnZoneItemSelected
import com.ikerfah.algeriacities.models.Commune

class CommuneSpinner : Spinner, AdapterView.OnItemSelectedListener {
    override fun onNothingSelected(p0: AdapterView<*>?) {
        communeListener?.onNothingSelected(p0)
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        var selectedCommune: Commune? = null
        try {
            selectedCommune = selectedItem as Commune
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {

            communeListener?.onItemSelected(selectedCommune, p0, p1, p2, p3)
        }

    }

    private var mContext: Context? = null
    private var attrs: AttributeSet? = null
    private var mode: Int? = null
    private var defStyleAttr: Int? = null
    private var selectedLang: String? = ZoneAdapter.LANG_FR

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
            if (attrs != null) {
                for (i in 0..attrs?.attributeCount?.minus(1)!!) {
                    val name = attrs?.getAttributeName(i)
                    if (name == "lang") {
                        selectedLang = attrs?.getAttributeValue(i)!!
                    }
                }
            }

            super.setOnItemSelectedListener(this)
        } catch (e: Exception) {
            e.fillInStackTrace()
        }
    }



    private var communeListener: OnZoneItemSelected<Commune>? = null
    fun setOnZoneItemSelectedListener(listener: OnZoneItemSelected<Commune>?) {
        this.communeListener = listener
    }

    /**
     * @param wilayaId Wilaya id to populate the spinner
     */
    fun setWilayaId(wilayaId: Int) {
        try {
            adapter = ZoneAdapter(
                context,
                AlgeriaCities.getCommunesByWilayaId(
                    wilayaId
                ),
                selectedLang
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun getSelectedCommune(): Commune? {
        var selectedCommune: Commune? = null
        try {
            selectedCommune = selectedItem as Commune
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            return selectedCommune
        }
    }


}
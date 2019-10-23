package com.ikerfah.algeriacities.models

import com.ikerfah.algeriacities.AlgeriaCities

class Commune : Zone {

    var codePostal: Int? = null
    var wilayaId: Int
    var latLng: LatLng? = null

    constructor(id: Int, nomAr: String?, nomFr: String?, latLng: LatLng?, codePostal: Int?, wilayaId: Int) : super(
        id,
        nomAr,
        nomFr

    ) {
        this.latLng = latLng
        this.codePostal = codePostal
        this.wilayaId = wilayaId
    }

    fun getWilaya(): Wilaya? {
        return AlgeriaCities.getWilayaById(wilayaId)
    }

    override fun toString(): String {
        return nomFr!!
    }


}
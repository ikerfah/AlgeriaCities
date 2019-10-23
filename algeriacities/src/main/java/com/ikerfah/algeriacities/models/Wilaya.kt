package com.ikerfah.algeriacities.models

import com.ikerfah.algeriacities.AlgeriaCities

class Wilaya : Zone {

    constructor(
        id: Int,
        nomFr: String,
        nomAr: String
    ) : super(
        id,
        nomAr,
        nomFr
    )

    fun getCommunes(): List<Commune> {
        return AlgeriaCities.getCommunesByWilayaId(id)
    }

    override fun toString(): String {
        return nomFr!!
    }


}
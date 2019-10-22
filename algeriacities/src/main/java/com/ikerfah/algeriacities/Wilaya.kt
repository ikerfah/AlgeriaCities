package com.ikerfah.algeriacities

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
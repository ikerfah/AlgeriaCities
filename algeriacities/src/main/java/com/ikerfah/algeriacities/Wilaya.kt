package com.ikerfah.algeriacities

class Wilaya : Zone {

    constructor(
        id: Int,
        nomFr: String,
        nomAr: String
    ) : super(
        id,
        nomFr,
        nomAr
    )

    fun getCommunes(): List<Commune> {
        return AlgeriaCities.getCommunesByWilayaId(id)
    }
}
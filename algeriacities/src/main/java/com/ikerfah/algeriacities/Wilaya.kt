package com.ikerfah.algeriacities

class Wilaya : Zone {

    var communes: List<Commune> = arrayListOf()

    constructor(
        id: Int?,
        nomFr: String?,
        nomAr: String?,
        codePostal: Int?,
        communes: List<Commune>
    ) : super(
        id,
        nomFr,
        nomAr,
        codePostal
    ) {
        this.communes = communes
    }
}
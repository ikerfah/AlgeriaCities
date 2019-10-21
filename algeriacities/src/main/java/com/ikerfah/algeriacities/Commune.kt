package com.ikerfah.algeriacities

class Commune : Zone {

    var codePostal: Int? = null
    var wilayaId: Int? = null

    constructor(id: Int?, nomFr: String?, nomAr: String?, codePostal: Int?,wilayaId:Int) : super(
        id,
        nomFr,
        nomAr

    ) {
        this.wilayaId = wilayaId
        this.codePostal = codePostal
    }
}
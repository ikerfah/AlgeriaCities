package com.ikerfah.algeriacities

class Commune : Zone {

    var codePostal: Int? = null
    var wilayaId: Int? = null
    var latLng: LatLng? = null

    constructor(id: Int, nomAr: String?, nomFr: String?, latLng: LatLng?,codePostal: Int?, wilayaId: Int) : super(
        id,
        nomAr,
        nomFr

    ) {
        this.latLng = latLng
        this.codePostal = codePostal
        this.wilayaId = wilayaId
    }
}
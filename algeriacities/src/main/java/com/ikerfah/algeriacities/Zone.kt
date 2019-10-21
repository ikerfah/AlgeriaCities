package com.ikerfah.algeriacities

open class Zone {
    var id: Int? = null
    var nomFr: String? = null
    var nomAr: String? = null
    var codePostal: Int? = null

    constructor(id: Int?, nomFr: String?, nomAr: String?, codePostal: Int?) {
        this.id = id
        this.nomFr = nomFr
        this.nomAr = nomAr
        this.codePostal = codePostal
    }
}
package com.ikerfah.algeriacities

open class Zone {
    var id: Int? = null
    var nomFr: String? = null
    var nomAr: String? = null

    constructor(id: Int?, nomFr: String?, nomAr: String?) {
        this.id = id
        this.nomFr = nomFr
        this.nomAr = nomAr
    }
}
package com.ikerfah.algeriacities.models

open class Zone {
    var id: Int
    var nomFr: String? = null
    var nomAr: String? = null

    constructor(id: Int, nomAr: String?, nomFr: String?) {
        this.id = id
        this.nomFr = nomFr
        this.nomAr = nomAr
    }
}
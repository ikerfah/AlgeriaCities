package com.ikerfah.algeriacities.models

class LatLng {
    var latitude: String? = null
    var longitude: String? = null

    constructor(latitude: String?, longitude: String?) {
        this.latitude = latitude
        this.longitude = longitude
    }

    override fun toString(): String {
        return "LatLng(latitude=$latitude, longitude=$longitude)"
    }


}
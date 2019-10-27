package com.ikerfah.algeriacities.helper

class Validations {

    companion object {
        private val MIN_WILAYA_ID = 1
        private val MAX_WILAYA_ID = 48
        internal fun isWilayaIdCorrect(wilayaId: Int): Boolean {
            return wilayaId != null && wilayaId in 1..48
        }

        internal fun isWilayaNameCorrect(wilayaName: String): Boolean {
            return wilayaName != null && wilayaName.trim().isNotEmpty()
        }
    }
}
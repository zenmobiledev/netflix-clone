package com.mobbelldev.netflixclone.data.dto

import com.google.gson.annotations.SerializedName

data class ProductionCountryDTO(
    @SerializedName("iso_3166_1") val iso31661: String = "",
    @SerializedName("name") val name: String = "",
)

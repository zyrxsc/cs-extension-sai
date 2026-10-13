package com.example

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.TvType

class AnimeSogoProvider : MainAPI() {
    override var mainUrl = "https://animesogo.to"
    override var name = "AnimeSogo"
    override val supportedTypes = setOf(TvType.Anime, TvType.OVA, TvType.AnimeMovie, TvType.Music)
    override var lang = "en"
    override val hasMainPage = false

    override suspend fun search(query: String): List<SearchResponse> {
        return listOf()
    }
}

package com.example

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.TvType

class AniSugeProvider : MainAPI() {
    override var mainUrl = "https://anisuge.tv"
    override var name = "AniSuge"
    override val supportedTypes = setOf(TvType.Anime, TvType.OVA, TvType.AnimeMovie, TvType.Music)
    override var lang = "en"
    override val hasMainPage = false

    override suspend fun search(query: String): List<SearchResponse> {
        return listOf()
    }
}

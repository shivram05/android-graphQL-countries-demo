package com.plcoding.graphqlcountriesapp.data

import com.plcoding.CountriesQuery
import com.plcoding.CountryQuery
import com.plcoding.graphqlcountriesapp.domain.DetailedCountry
import com.plcoding.graphqlcountriesapp.domain.SimpleCountry


fun CountryQuery.Country.toDetailedCountry(): DetailedCountry{

    return DetailedCountry(
        code = code,
        name,
        emoji,
        capital ?: "No capital",
        currency ?: "No currency",
        languages = languages.mapNotNull{ it.name },
        continent = continent.name
    )
}

fun CountriesQuery.Country.toSimpleCountry(): SimpleCountry{

    return SimpleCountry(
        code = code,
        name,
        emoji,
        capital ?: "No capital",
    )
}
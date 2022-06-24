package com.example.app_motivation.data

import com.example.app_motivation.helper.MotivationConstants
import kotlin.random.*

data class Phrase(val description: String, val categoryId: Int)

class Mock {

    private val all = MotivationConstants.FILTER.ALL
    private val happy = MotivationConstants.FILTER.HAPPY
    private val sunny = MotivationConstants.FILTER.SUNNY

    private val mListPhrases: List<Phrase> = listOf(
        Phrase("Not knowing it was impossible, he went there and did it.", happy),
        Phrase("You are not defeated when you lose, you are defeated when you give up!", happy),
        Phrase("When it's darker, we see more stars!", happy),
        Phrase("Insanity is doing the same thing over and over again and expecting a different result", happy),
        Phrase("Don't stop when you're tired, stop when you're done.", happy),
        Phrase("What can you do right now that has the biggest impact on your success?", happy),
        Phrase("The best way to predict the future is to invent it.", sunny),
        Phrase("You miss every chance you don't take.", sunny),
        Phrase("Failure is the spice that gives the flavor of success.", sunny),
        Phrase("As long as we are not committed, there will be hesitation!", sunny),
        Phrase("If you don't know where you want to go, any road will do.", sunny),
        Phrase("If you believe it, it makes all the difference.", sunny),
        Phrase("Risks must be taken, because the greatest danger is not risking anything!", sunny)
    )

    fun getPhrase(value: Int): String {
        var filtered = mListPhrases.filter { it.categoryId == value || value == all }
        return  filtered[Random.nextInt(filtered.size)].description
    }

}
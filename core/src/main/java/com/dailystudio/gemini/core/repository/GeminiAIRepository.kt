package com.dailystudio.gemini.core.repository

import android.content.Context
import com.dailystudio.devbricksx.development.Logger
import com.dailystudio.gemini.core.AppSettingsPrefs
import com.dailystudio.gemini.core.Constants.LT_MODEL_GEMINI
import com.google.ai.client.generativeai.GenerativeModel
import kotlinx.coroutines.CoroutineDispatcher

class GeminiAIRepository(
    context: Context,
    dispatcher: CoroutineDispatcher
): BaseAIRepository(context, dispatcher) {

    private lateinit var model: GenerativeModel

    override fun prepare() {
        Logger.debug(LT_MODEL_GEMINI, "model = ${AppSettingsPrefs.instance.model}")
        Logger.debug(LT_MODEL_GEMINI, "temperature = ${AppSettingsPrefs.instance.temperature}")
        Logger.debug(LT_MODEL_GEMINI, "topK = ${AppSettingsPrefs.instance.topK}")
        Logger.debug(LT_MODEL_GEMINI, "topP = ${AppSettingsPrefs.instance.topP}")
        Logger.debug(LT_MODEL_GEMINI, "maxTokens = ${AppSettingsPrefs.instance.maxTokens}")

        /**
         * TODO: Prepare you model here. Calling the Google AI API
         *       to create a model instance for inference.
         *       Don't forget to call setReady(true) when the model
         *       is loaded well.
         */

        setReady(false)
    }

    override suspend fun generateContent(
        prompt: String,
        fileUri: String?,
        mimeType: String?
    ): String? {
        /**
         * TODO: Do the synchronous call to Google AI API to generate
         *       the real content.
         */

        return null
    }

    override suspend fun generateContentStream(
        prompt: String,
        fileUri: String?,
        mimeType: String?
    ) {
        /**
         * TODO: Do the asynchronous call to Google AI API to generate
         *       the real content.
         */

        updateGenerationStream(null, Status.DONE)
    }

}
package com.dailystudio.gemini.core.repository

import android.content.Context
import com.dailystudio.gemini.core.utils.StatsUtils
import com.dailystudio.devbricksx.development.Logger
import com.dailystudio.gemini.core.AppSettingsPrefs
import com.dailystudio.gemini.core.Constants.LT_MODEL_GEMMA
import com.dailystudio.gemini.core.utils.ContentUtils
import com.google.mediapipe.tasks.genai.llminference.LlmInference
import com.google.mediapipe.tasks.genai.llminference.LlmInferenceSession
import kotlinx.coroutines.CoroutineDispatcher
import java.io.File

class MediaPipeAIRepository(
    context: Context,
    dispatcher: CoroutineDispatcher,
): BaseAIRepository(context, dispatcher) {

    companion object {
        // NB: Make sure the filename is *unique* per model you use!
        // Weight caching is currently based on filename alone.
        private const val MODEL_PATH_GEMMA2 = "/data/local/tmp/llm/model.bin"
        private const val MODEL_PATH_GEMMA3 = "/data/local/tmp/llm/gemma3-1B-it-int4.task"
    }

    private var llmInference: LlmInference? = null

    override fun prepare() {
        Logger.debug(LT_MODEL_GEMMA, "model = ${AppSettingsPrefs.instance.model}")
        Logger.debug(LT_MODEL_GEMMA, "temperature = ${AppSettingsPrefs.instance.temperature}")
        Logger.debug(LT_MODEL_GEMMA, "topK = ${AppSettingsPrefs.instance.topK}")
        Logger.debug(LT_MODEL_GEMMA, "topP = ${AppSettingsPrefs.instance.topP}")
        Logger.debug(LT_MODEL_GEMMA, "maxTokens = ${AppSettingsPrefs.instance.maxTokens}")

        /**
         * TODO: Prepare you model here. Calling the MediaPipe API
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
         * TODO: Do the synchronous call of MediaPipe API to generate
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
         * TODO: Do the asynchronous call to MediaPipe API to generate
         *       the real content.
         *       Don't forget to call updateGenerationStream() to update
         *       the progress of the generation.
         *       1) updateGenerationStream(text, Status.RUNNING) to gradually
         *          update the display of the response.
         *       2) updateGenerationStream(null, Status.DONE) when all the
         *          content is generated.
         */
        updateGenerationStream(null, Status.DONE)
    }

    override fun close() {
        super.close()

        /**
         * TODO: Carefully close your session and inference here.
         */
    }

}
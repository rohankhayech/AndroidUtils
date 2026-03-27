/*
 * Copyright 2026 Rohan Khayech
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.rohankhayech.android.util.ui.wear.input

import android.app.RemoteInput
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.wear.input.RemoteInputIntentHelper
import androidx.wear.input.wearableExtender

/**
 * Remembers a launcher for the Wear OS system text input interface,
 * and registers a callback to handle the result.
 *
 * @param title The title of the text input interface.
 * @param key The key used to retrieve the text input.
 * @param emojisAllowed Whether emojis are allowed in the text input.
 * @param imeActionType Action type to be set on RemoteInput session. Should be one of the
 *   following values: [EditorInfo.IME_ACTION_SEND], [EditorInfo.IME_ACTION_SEARCH],
 *   [EditorInfo.IME_ACTION_DONE], [EditorInfo.IME_ACTION_GO]. If not, send action will be set.
 * @param onInput Called with the text input when the user submits it.
 * @return A function that triggers the text input interface.
 *
 * @author Rohan Khayech
 */
@Composable
fun wearTextInput(
    title: String,
    key: String,
    emojisAllowed: Boolean = true,
    imeActionType: Int = EditorInfo.IME_ACTION_DONE,
    onInput: (String) -> Unit,
): () -> Unit {
    val launcher = rememberLauncherForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        it.data?.let { data ->
            val results: Bundle? = RemoteInput.getResultsFromIntent(data)
            val text = results?.getCharSequence(key)
            text?.let { text -> onInput(text.toString()) }
        }
    }

    val intent = remember(key, title, emojisAllowed, imeActionType) {
        RemoteInputIntentHelper.createActionRemoteInputIntent().also {
            RemoteInputIntentHelper.putRemoteInputsExtra(it, listOf(
                RemoteInput.Builder(key)
                    .setLabel(title)
                    .wearableExtender {
                        setEmojisAllowed(emojisAllowed)
                        setInputActionType(imeActionType)
                    }.build()
            ))
        }
    }

    return {
        launcher.launch(intent)
    }
}
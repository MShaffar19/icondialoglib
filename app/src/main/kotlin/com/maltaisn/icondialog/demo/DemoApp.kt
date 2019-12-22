/*
 * Copyright 2019 Nicolas Maltais
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.maltaisn.icondialog.demo

import android.app.Application
import com.maltaisn.icondialog.pack.IconPack
import com.maltaisn.icondialog.pack.IconPackLoader
import com.maltaisn.iconpack.defaultpack.createDefaultIconPack


class DemoApp : Application() {

    lateinit var iconPackLoader: IconPackLoader
    lateinit var iconPacks: List<IconPack>

    override fun onCreate() {
        super.onCreate()

        // Create and load icon pack
        iconPackLoader = IconPackLoader(this)
        iconPacks = listOf(
                createDefaultIconPack(iconPackLoader))
    }

    fun reloadIconPackStrings() {
        for (iconPack in iconPacks) {
            iconPackLoader.reloadStrings(iconPack)
        }
    }

}
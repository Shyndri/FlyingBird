package com.matthiaslapierre.flyingbird

import com.matthiaslapierre.flyingbird.resources.Cache
import com.matthiaslapierre.flyingbird.resources.Scores
import com.matthiaslapierre.flyingbird.resources.SoundEngine
import com.matthiaslapierre.flyingbird.resources.impl.CacheImpl
import com.matthiaslapierre.flyingbird.resources.impl.ScoresImpl
import com.matthiaslapierre.flyingbird.resources.impl.SoundEngineImpl

/**
 * To solve the issue of reusing objects, you can create your own dependencies container class
 * that you use to get dependencies. All instances provided by this container can be public.
 * Because these dependencies are used across the whole application, they need to be placed in
 * a common place all activities can use: the application class.
 * @see https://developer.android.com/training/dependency-injection/manual
 */
class AppContainer {
    val cache: Cache = CacheImpl()
    val soundEngine: SoundEngine = SoundEngineImpl()
    val scores: Scores = ScoresImpl()
}
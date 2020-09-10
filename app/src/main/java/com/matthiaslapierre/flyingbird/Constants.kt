package com.matthiaslapierre.flyingbird

object Constants {

    /**
     * This constant allows us to add, if necessary, a delay to avoid that the rendering phase
     * of the Game Loop be too fast.
     */
    const val MS_PER_FRAME = 20

    /**
     * Maximum of number of simultaneous streams that can be played simultaneously
     * by [android.media.SoundPool].
     */
    const val SOUND_MAX_STREAMS = 5

    const val UNDEFINED = -999f

}
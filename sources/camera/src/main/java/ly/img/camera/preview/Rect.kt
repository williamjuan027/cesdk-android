package ly.img.camera.preview

import android.graphics.RectF

internal object Rect {
    val fullScreen by lazy { RectF(0f, 0f, 1080f, 1920f) }

    val topRect by lazy { RectF(fullScreen).apply { bottom /= 2 } }
    val bottomRect by lazy { RectF(fullScreen).apply { top = bottom / 2f } }
    val leftRect by lazy { RectF(fullScreen).apply { right /= 2f } }
    val rightRect by lazy { RectF(fullScreen).apply { left = right / 2f } }
}

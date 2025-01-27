package ly.img.editor.core.state

import androidx.compose.ui.geometry.Rect
import ly.img.editor.core.sheet.SheetType

/**
 * Current state of the editor.
 *
 * @param canvasInsets the insets of the canvas in screen space.
 * @param activeSheet the sheet that is being displayed currently.
 * @param isTouchActive whether there is an ongoing touch action on the canvas.
 */
data class EditorState(
    val canvasInsets: Rect = Rect.Zero,
    val activeSheet: SheetType? = null,
    val isTouchActive: Boolean = false,
)

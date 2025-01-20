package ly.img.editor.core.iconpack

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val IconPack.Blur: ImageVector
    get() {
        if (_blur != null) {
            return _blur!!
        }
        _blur =
            Builder(
                name = "Blur",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF46464F)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(3.0f, 14.5f)
                    curveTo(2.8667f, 14.5f, 2.75f, 14.45f, 2.65f, 14.35f)
                    curveTo(2.55f, 14.25f, 2.5f, 14.1333f, 2.5f, 14.0f)
                    curveTo(2.5f, 13.8667f, 2.55f, 13.75f, 2.65f, 13.65f)
                    curveTo(2.75f, 13.55f, 2.8667f, 13.5f, 3.0f, 13.5f)
                    curveTo(3.1333f, 13.5f, 3.25f, 13.55f, 3.35f, 13.65f)
                    curveTo(3.45f, 13.75f, 3.5f, 13.8667f, 3.5f, 14.0f)
                    curveTo(3.5f, 14.1333f, 3.45f, 14.25f, 3.35f, 14.35f)
                    curveTo(3.25f, 14.45f, 3.1333f, 14.5f, 3.0f, 14.5f)
                    close()
                    moveTo(3.0f, 10.5f)
                    curveTo(2.8667f, 10.5f, 2.75f, 10.45f, 2.65f, 10.35f)
                    curveTo(2.55f, 10.25f, 2.5f, 10.1333f, 2.5f, 10.0f)
                    curveTo(2.5f, 9.8667f, 2.55f, 9.75f, 2.65f, 9.65f)
                    curveTo(2.75f, 9.55f, 2.8667f, 9.5f, 3.0f, 9.5f)
                    curveTo(3.1333f, 9.5f, 3.25f, 9.55f, 3.35f, 9.65f)
                    curveTo(3.45f, 9.75f, 3.5f, 9.8667f, 3.5f, 10.0f)
                    curveTo(3.5f, 10.1333f, 3.45f, 10.25f, 3.35f, 10.35f)
                    curveTo(3.25f, 10.45f, 3.1333f, 10.5f, 3.0f, 10.5f)
                    close()
                    moveTo(6.0f, 19.0f)
                    curveTo(5.7167f, 19.0f, 5.479f, 18.904f, 5.287f, 18.712f)
                    curveTo(5.0957f, 18.5207f, 5.0f, 18.2833f, 5.0f, 18.0f)
                    curveTo(5.0f, 17.7167f, 5.0957f, 17.4793f, 5.287f, 17.288f)
                    curveTo(5.479f, 17.096f, 5.7167f, 17.0f, 6.0f, 17.0f)
                    curveTo(6.2833f, 17.0f, 6.521f, 17.096f, 6.713f, 17.288f)
                    curveTo(6.9043f, 17.4793f, 7.0f, 17.7167f, 7.0f, 18.0f)
                    curveTo(7.0f, 18.2833f, 6.9043f, 18.5207f, 6.713f, 18.712f)
                    curveTo(6.521f, 18.904f, 6.2833f, 19.0f, 6.0f, 19.0f)
                    close()
                    moveTo(6.0f, 15.0f)
                    curveTo(5.7167f, 15.0f, 5.479f, 14.904f, 5.287f, 14.712f)
                    curveTo(5.0957f, 14.5207f, 5.0f, 14.2833f, 5.0f, 14.0f)
                    curveTo(5.0f, 13.7167f, 5.0957f, 13.479f, 5.287f, 13.287f)
                    curveTo(5.479f, 13.0957f, 5.7167f, 13.0f, 6.0f, 13.0f)
                    curveTo(6.2833f, 13.0f, 6.521f, 13.0957f, 6.713f, 13.287f)
                    curveTo(6.9043f, 13.479f, 7.0f, 13.7167f, 7.0f, 14.0f)
                    curveTo(7.0f, 14.2833f, 6.9043f, 14.5207f, 6.713f, 14.712f)
                    curveTo(6.521f, 14.904f, 6.2833f, 15.0f, 6.0f, 15.0f)
                    close()
                    moveTo(6.0f, 11.0f)
                    curveTo(5.7167f, 11.0f, 5.479f, 10.904f, 5.287f, 10.712f)
                    curveTo(5.0957f, 10.5207f, 5.0f, 10.2833f, 5.0f, 10.0f)
                    curveTo(5.0f, 9.7167f, 5.0957f, 9.479f, 5.287f, 9.287f)
                    curveTo(5.479f, 9.0957f, 5.7167f, 9.0f, 6.0f, 9.0f)
                    curveTo(6.2833f, 9.0f, 6.521f, 9.0957f, 6.713f, 9.287f)
                    curveTo(6.9043f, 9.479f, 7.0f, 9.7167f, 7.0f, 10.0f)
                    curveTo(7.0f, 10.2833f, 6.9043f, 10.5207f, 6.713f, 10.712f)
                    curveTo(6.521f, 10.904f, 6.2833f, 11.0f, 6.0f, 11.0f)
                    close()
                    moveTo(6.0f, 7.0f)
                    curveTo(5.7167f, 7.0f, 5.479f, 6.9043f, 5.287f, 6.713f)
                    curveTo(5.0957f, 6.521f, 5.0f, 6.2833f, 5.0f, 6.0f)
                    curveTo(5.0f, 5.7167f, 5.0957f, 5.479f, 5.287f, 5.287f)
                    curveTo(5.479f, 5.0957f, 5.7167f, 5.0f, 6.0f, 5.0f)
                    curveTo(6.2833f, 5.0f, 6.521f, 5.0957f, 6.713f, 5.287f)
                    curveTo(6.9043f, 5.479f, 7.0f, 5.7167f, 7.0f, 6.0f)
                    curveTo(7.0f, 6.2833f, 6.9043f, 6.521f, 6.713f, 6.713f)
                    curveTo(6.521f, 6.9043f, 6.2833f, 7.0f, 6.0f, 7.0f)
                    close()
                    moveTo(10.0f, 15.5f)
                    curveTo(9.5833f, 15.5f, 9.2293f, 15.354f, 8.938f, 15.062f)
                    curveTo(8.646f, 14.7707f, 8.5f, 14.4167f, 8.5f, 14.0f)
                    curveTo(8.5f, 13.5833f, 8.646f, 13.2293f, 8.938f, 12.938f)
                    curveTo(9.2293f, 12.646f, 9.5833f, 12.5f, 10.0f, 12.5f)
                    curveTo(10.4167f, 12.5f, 10.7707f, 12.646f, 11.062f, 12.938f)
                    curveTo(11.354f, 13.2293f, 11.5f, 13.5833f, 11.5f, 14.0f)
                    curveTo(11.5f, 14.4167f, 11.354f, 14.7707f, 11.062f, 15.062f)
                    curveTo(10.7707f, 15.354f, 10.4167f, 15.5f, 10.0f, 15.5f)
                    close()
                    moveTo(10.0f, 11.5f)
                    curveTo(9.5833f, 11.5f, 9.2293f, 11.354f, 8.938f, 11.062f)
                    curveTo(8.646f, 10.7707f, 8.5f, 10.4167f, 8.5f, 10.0f)
                    curveTo(8.5f, 9.5833f, 8.646f, 9.2293f, 8.938f, 8.938f)
                    curveTo(9.2293f, 8.646f, 9.5833f, 8.5f, 10.0f, 8.5f)
                    curveTo(10.4167f, 8.5f, 10.7707f, 8.646f, 11.062f, 8.938f)
                    curveTo(11.354f, 9.2293f, 11.5f, 9.5833f, 11.5f, 10.0f)
                    curveTo(11.5f, 10.4167f, 11.354f, 10.7707f, 11.062f, 11.062f)
                    curveTo(10.7707f, 11.354f, 10.4167f, 11.5f, 10.0f, 11.5f)
                    close()
                    moveTo(10.0f, 19.0f)
                    curveTo(9.7167f, 19.0f, 9.4793f, 18.904f, 9.288f, 18.712f)
                    curveTo(9.096f, 18.5207f, 9.0f, 18.2833f, 9.0f, 18.0f)
                    curveTo(9.0f, 17.7167f, 9.096f, 17.4793f, 9.288f, 17.288f)
                    curveTo(9.4793f, 17.096f, 9.7167f, 17.0f, 10.0f, 17.0f)
                    curveTo(10.2833f, 17.0f, 10.521f, 17.096f, 10.713f, 17.288f)
                    curveTo(10.9043f, 17.4793f, 11.0f, 17.7167f, 11.0f, 18.0f)
                    curveTo(11.0f, 18.2833f, 10.9043f, 18.5207f, 10.713f, 18.712f)
                    curveTo(10.521f, 18.904f, 10.2833f, 19.0f, 10.0f, 19.0f)
                    close()
                    moveTo(10.0f, 7.0f)
                    curveTo(9.7167f, 7.0f, 9.4793f, 6.9043f, 9.288f, 6.713f)
                    curveTo(9.096f, 6.521f, 9.0f, 6.2833f, 9.0f, 6.0f)
                    curveTo(9.0f, 5.7167f, 9.096f, 5.479f, 9.288f, 5.287f)
                    curveTo(9.4793f, 5.0957f, 9.7167f, 5.0f, 10.0f, 5.0f)
                    curveTo(10.2833f, 5.0f, 10.521f, 5.0957f, 10.713f, 5.287f)
                    curveTo(10.9043f, 5.479f, 11.0f, 5.7167f, 11.0f, 6.0f)
                    curveTo(11.0f, 6.2833f, 10.9043f, 6.521f, 10.713f, 6.713f)
                    curveTo(10.521f, 6.9043f, 10.2833f, 7.0f, 10.0f, 7.0f)
                    close()
                    moveTo(10.0f, 21.5f)
                    curveTo(9.8667f, 21.5f, 9.75f, 21.45f, 9.65f, 21.35f)
                    curveTo(9.55f, 21.25f, 9.5f, 21.1333f, 9.5f, 21.0f)
                    curveTo(9.5f, 20.8667f, 9.55f, 20.75f, 9.65f, 20.65f)
                    curveTo(9.75f, 20.55f, 9.8667f, 20.5f, 10.0f, 20.5f)
                    curveTo(10.1333f, 20.5f, 10.25f, 20.55f, 10.35f, 20.65f)
                    curveTo(10.45f, 20.75f, 10.5f, 20.8667f, 10.5f, 21.0f)
                    curveTo(10.5f, 21.1333f, 10.45f, 21.25f, 10.35f, 21.35f)
                    curveTo(10.25f, 21.45f, 10.1333f, 21.5f, 10.0f, 21.5f)
                    close()
                    moveTo(10.0f, 3.5f)
                    curveTo(9.8667f, 3.5f, 9.75f, 3.45f, 9.65f, 3.35f)
                    curveTo(9.55f, 3.25f, 9.5f, 3.1333f, 9.5f, 3.0f)
                    curveTo(9.5f, 2.8667f, 9.55f, 2.75f, 9.65f, 2.65f)
                    curveTo(9.75f, 2.55f, 9.8667f, 2.5f, 10.0f, 2.5f)
                    curveTo(10.1333f, 2.5f, 10.25f, 2.55f, 10.35f, 2.65f)
                    curveTo(10.45f, 2.75f, 10.5f, 2.8667f, 10.5f, 3.0f)
                    curveTo(10.5f, 3.1333f, 10.45f, 3.25f, 10.35f, 3.35f)
                    curveTo(10.25f, 3.45f, 10.1333f, 3.5f, 10.0f, 3.5f)
                    close()
                    moveTo(14.0f, 15.5f)
                    curveTo(13.5833f, 15.5f, 13.2293f, 15.354f, 12.938f, 15.062f)
                    curveTo(12.646f, 14.7707f, 12.5f, 14.4167f, 12.5f, 14.0f)
                    curveTo(12.5f, 13.5833f, 12.646f, 13.2293f, 12.938f, 12.938f)
                    curveTo(13.2293f, 12.646f, 13.5833f, 12.5f, 14.0f, 12.5f)
                    curveTo(14.4167f, 12.5f, 14.7707f, 12.646f, 15.062f, 12.938f)
                    curveTo(15.354f, 13.2293f, 15.5f, 13.5833f, 15.5f, 14.0f)
                    curveTo(15.5f, 14.4167f, 15.354f, 14.7707f, 15.062f, 15.062f)
                    curveTo(14.7707f, 15.354f, 14.4167f, 15.5f, 14.0f, 15.5f)
                    close()
                    moveTo(14.0f, 11.5f)
                    curveTo(13.5833f, 11.5f, 13.2293f, 11.354f, 12.938f, 11.062f)
                    curveTo(12.646f, 10.7707f, 12.5f, 10.4167f, 12.5f, 10.0f)
                    curveTo(12.5f, 9.5833f, 12.646f, 9.2293f, 12.938f, 8.938f)
                    curveTo(13.2293f, 8.646f, 13.5833f, 8.5f, 14.0f, 8.5f)
                    curveTo(14.4167f, 8.5f, 14.7707f, 8.646f, 15.062f, 8.938f)
                    curveTo(15.354f, 9.2293f, 15.5f, 9.5833f, 15.5f, 10.0f)
                    curveTo(15.5f, 10.4167f, 15.354f, 10.7707f, 15.062f, 11.062f)
                    curveTo(14.7707f, 11.354f, 14.4167f, 11.5f, 14.0f, 11.5f)
                    close()
                    moveTo(14.0f, 19.0f)
                    curveTo(13.7167f, 19.0f, 13.4793f, 18.904f, 13.288f, 18.712f)
                    curveTo(13.096f, 18.5207f, 13.0f, 18.2833f, 13.0f, 18.0f)
                    curveTo(13.0f, 17.7167f, 13.096f, 17.4793f, 13.288f, 17.288f)
                    curveTo(13.4793f, 17.096f, 13.7167f, 17.0f, 14.0f, 17.0f)
                    curveTo(14.2833f, 17.0f, 14.521f, 17.096f, 14.713f, 17.288f)
                    curveTo(14.9043f, 17.4793f, 15.0f, 17.7167f, 15.0f, 18.0f)
                    curveTo(15.0f, 18.2833f, 14.9043f, 18.5207f, 14.713f, 18.712f)
                    curveTo(14.521f, 18.904f, 14.2833f, 19.0f, 14.0f, 19.0f)
                    close()
                    moveTo(14.0f, 7.0f)
                    curveTo(13.7167f, 7.0f, 13.4793f, 6.9043f, 13.288f, 6.713f)
                    curveTo(13.096f, 6.521f, 13.0f, 6.2833f, 13.0f, 6.0f)
                    curveTo(13.0f, 5.7167f, 13.096f, 5.479f, 13.288f, 5.287f)
                    curveTo(13.4793f, 5.0957f, 13.7167f, 5.0f, 14.0f, 5.0f)
                    curveTo(14.2833f, 5.0f, 14.521f, 5.0957f, 14.713f, 5.287f)
                    curveTo(14.9043f, 5.479f, 15.0f, 5.7167f, 15.0f, 6.0f)
                    curveTo(15.0f, 6.2833f, 14.9043f, 6.521f, 14.713f, 6.713f)
                    curveTo(14.521f, 6.9043f, 14.2833f, 7.0f, 14.0f, 7.0f)
                    close()
                    moveTo(14.0f, 21.5f)
                    curveTo(13.8667f, 21.5f, 13.75f, 21.45f, 13.65f, 21.35f)
                    curveTo(13.55f, 21.25f, 13.5f, 21.1333f, 13.5f, 21.0f)
                    curveTo(13.5f, 20.8667f, 13.55f, 20.75f, 13.65f, 20.65f)
                    curveTo(13.75f, 20.55f, 13.8667f, 20.5f, 14.0f, 20.5f)
                    curveTo(14.1333f, 20.5f, 14.25f, 20.55f, 14.35f, 20.65f)
                    curveTo(14.45f, 20.75f, 14.5f, 20.8667f, 14.5f, 21.0f)
                    curveTo(14.5f, 21.1333f, 14.45f, 21.25f, 14.35f, 21.35f)
                    curveTo(14.25f, 21.45f, 14.1333f, 21.5f, 14.0f, 21.5f)
                    close()
                    moveTo(14.0f, 3.5f)
                    curveTo(13.8667f, 3.5f, 13.75f, 3.45f, 13.65f, 3.35f)
                    curveTo(13.55f, 3.25f, 13.5f, 3.1333f, 13.5f, 3.0f)
                    curveTo(13.5f, 2.8667f, 13.55f, 2.75f, 13.65f, 2.65f)
                    curveTo(13.75f, 2.55f, 13.8667f, 2.5f, 14.0f, 2.5f)
                    curveTo(14.1333f, 2.5f, 14.25f, 2.55f, 14.35f, 2.65f)
                    curveTo(14.45f, 2.75f, 14.5f, 2.8667f, 14.5f, 3.0f)
                    curveTo(14.5f, 3.1333f, 14.45f, 3.25f, 14.35f, 3.35f)
                    curveTo(14.25f, 3.45f, 14.1333f, 3.5f, 14.0f, 3.5f)
                    close()
                    moveTo(18.0f, 19.0f)
                    curveTo(17.7167f, 19.0f, 17.4793f, 18.904f, 17.288f, 18.712f)
                    curveTo(17.096f, 18.5207f, 17.0f, 18.2833f, 17.0f, 18.0f)
                    curveTo(17.0f, 17.7167f, 17.096f, 17.4793f, 17.288f, 17.288f)
                    curveTo(17.4793f, 17.096f, 17.7167f, 17.0f, 18.0f, 17.0f)
                    curveTo(18.2833f, 17.0f, 18.5207f, 17.096f, 18.712f, 17.288f)
                    curveTo(18.904f, 17.4793f, 19.0f, 17.7167f, 19.0f, 18.0f)
                    curveTo(19.0f, 18.2833f, 18.904f, 18.5207f, 18.712f, 18.712f)
                    curveTo(18.5207f, 18.904f, 18.2833f, 19.0f, 18.0f, 19.0f)
                    close()
                    moveTo(18.0f, 15.0f)
                    curveTo(17.7167f, 15.0f, 17.4793f, 14.904f, 17.288f, 14.712f)
                    curveTo(17.096f, 14.5207f, 17.0f, 14.2833f, 17.0f, 14.0f)
                    curveTo(17.0f, 13.7167f, 17.096f, 13.479f, 17.288f, 13.287f)
                    curveTo(17.4793f, 13.0957f, 17.7167f, 13.0f, 18.0f, 13.0f)
                    curveTo(18.2833f, 13.0f, 18.5207f, 13.0957f, 18.712f, 13.287f)
                    curveTo(18.904f, 13.479f, 19.0f, 13.7167f, 19.0f, 14.0f)
                    curveTo(19.0f, 14.2833f, 18.904f, 14.5207f, 18.712f, 14.712f)
                    curveTo(18.5207f, 14.904f, 18.2833f, 15.0f, 18.0f, 15.0f)
                    close()
                    moveTo(18.0f, 11.0f)
                    curveTo(17.7167f, 11.0f, 17.4793f, 10.904f, 17.288f, 10.712f)
                    curveTo(17.096f, 10.5207f, 17.0f, 10.2833f, 17.0f, 10.0f)
                    curveTo(17.0f, 9.7167f, 17.096f, 9.479f, 17.288f, 9.287f)
                    curveTo(17.4793f, 9.0957f, 17.7167f, 9.0f, 18.0f, 9.0f)
                    curveTo(18.2833f, 9.0f, 18.5207f, 9.0957f, 18.712f, 9.287f)
                    curveTo(18.904f, 9.479f, 19.0f, 9.7167f, 19.0f, 10.0f)
                    curveTo(19.0f, 10.2833f, 18.904f, 10.5207f, 18.712f, 10.712f)
                    curveTo(18.5207f, 10.904f, 18.2833f, 11.0f, 18.0f, 11.0f)
                    close()
                    moveTo(18.0f, 7.0f)
                    curveTo(17.7167f, 7.0f, 17.4793f, 6.9043f, 17.288f, 6.713f)
                    curveTo(17.096f, 6.521f, 17.0f, 6.2833f, 17.0f, 6.0f)
                    curveTo(17.0f, 5.7167f, 17.096f, 5.479f, 17.288f, 5.287f)
                    curveTo(17.4793f, 5.0957f, 17.7167f, 5.0f, 18.0f, 5.0f)
                    curveTo(18.2833f, 5.0f, 18.5207f, 5.0957f, 18.712f, 5.287f)
                    curveTo(18.904f, 5.479f, 19.0f, 5.7167f, 19.0f, 6.0f)
                    curveTo(19.0f, 6.2833f, 18.904f, 6.521f, 18.712f, 6.713f)
                    curveTo(18.5207f, 6.9043f, 18.2833f, 7.0f, 18.0f, 7.0f)
                    close()
                    moveTo(21.0f, 14.5f)
                    curveTo(20.8667f, 14.5f, 20.75f, 14.45f, 20.65f, 14.35f)
                    curveTo(20.55f, 14.25f, 20.5f, 14.1333f, 20.5f, 14.0f)
                    curveTo(20.5f, 13.8667f, 20.55f, 13.75f, 20.65f, 13.65f)
                    curveTo(20.75f, 13.55f, 20.8667f, 13.5f, 21.0f, 13.5f)
                    curveTo(21.1333f, 13.5f, 21.25f, 13.55f, 21.35f, 13.65f)
                    curveTo(21.45f, 13.75f, 21.5f, 13.8667f, 21.5f, 14.0f)
                    curveTo(21.5f, 14.1333f, 21.45f, 14.25f, 21.35f, 14.35f)
                    curveTo(21.25f, 14.45f, 21.1333f, 14.5f, 21.0f, 14.5f)
                    close()
                    moveTo(21.0f, 10.5f)
                    curveTo(20.8667f, 10.5f, 20.75f, 10.45f, 20.65f, 10.35f)
                    curveTo(20.55f, 10.25f, 20.5f, 10.1333f, 20.5f, 10.0f)
                    curveTo(20.5f, 9.8667f, 20.55f, 9.75f, 20.65f, 9.65f)
                    curveTo(20.75f, 9.55f, 20.8667f, 9.5f, 21.0f, 9.5f)
                    curveTo(21.1333f, 9.5f, 21.25f, 9.55f, 21.35f, 9.65f)
                    curveTo(21.45f, 9.75f, 21.5f, 9.8667f, 21.5f, 10.0f)
                    curveTo(21.5f, 10.1333f, 21.45f, 10.25f, 21.35f, 10.35f)
                    curveTo(21.25f, 10.45f, 21.1333f, 10.5f, 21.0f, 10.5f)
                    close()
                }
            }.build()
        return _blur!!
    }

private var _blur: ImageVector? = null

@Preview
@Composable
private fun Preview() = IconPack.Blur.IconPreview()

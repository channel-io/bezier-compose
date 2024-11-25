@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.compose.R

val BezierIcons.CheckVerificationFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_check_verification_filled
        override val imageVector: ImageVector
            get() = _checkVerificationFilled ?: ImageVector.Builder(
                    name = "CheckVerificationFilled",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(13.36f, 1.26f)
                    arcTo(2.0f, 2.0f, 312.84364304359633f, isMoreThanHalf = false, isPositiveArc = false, 10.639999999999999f, 1.26f)
                    lineTo(9.585999999999999f, 2.2359999999999998f)
                    arcTo(1.5f, 1.5f, 47.16403549823743f, isMoreThanHalf = false, isPositiveArc = true, 8.410999999999998f, 2.6279999999999997f)
                    lineTo(6.998f, 2.48f)
                    arcTo(2.0f, 2.0f, 275.97798847190677f, isMoreThanHalf = false, isPositiveArc = false, 4.832000000000001f, 4.0600000000000005f)
                    lineTo(4.507000000000001f, 5.613f)
                    arcTo(1.5f, 1.5f, 11.833500266456642f, isMoreThanHalf = false, isPositiveArc = true, 3.8150000000000004f, 6.589f)
                    lineTo(2.4830000000000005f, 7.3950000000000005f)
                    arcTo(2.0f, 2.0f, 238.8256687946012f, isMoreThanHalf = false, isPositiveArc = false, 1.6770000000000005f, 9.887f)
                    lineTo(2.3250000000000006f, 11.414f)
                    arcTo(1.5f, 1.5f, 337.0040122933323f, isMoreThanHalf = false, isPositiveArc = true, 2.3250000000000006f, 12.586f)
                    lineTo(1.6770000000000005f, 14.113f)
                    arcTo(2.0f, 2.0f, 202.9796240487774f, isMoreThanHalf = false, isPositiveArc = false, 2.4830000000000005f, 16.605f)
                    lineTo(3.8150000000000004f, 17.411f)
                    arcTo(1.5f, 1.5f, 301.15896855548453f, isMoreThanHalf = false, isPositiveArc = true, 4.507000000000001f, 18.387f)
                    lineTo(4.832000000000001f, 19.94f)
                    arcTo(2.0f, 2.0f, 168.19614107303727f, isMoreThanHalf = false, isPositiveArc = false, 6.998000000000001f, 21.520000000000003f)
                    lineTo(8.411000000000001f, 21.372000000000003f)
                    arcTo(1.5f, 1.5f, 264.06318807299044f, isMoreThanHalf = false, isPositiveArc = true, 9.586000000000002f, 21.764000000000003f)
                    lineTo(10.641000000000002f, 22.741000000000003f)
                    arcTo(2.0f, 2.0f, 132.80458362515685f, isMoreThanHalf = false, isPositiveArc = false, 13.359000000000002f, 22.741000000000003f)
                    lineTo(14.414000000000001f, 21.764000000000003f)
                    arcTo(1.5f, 1.5f, 227.16403549823744f, isMoreThanHalf = false, isPositiveArc = true, 15.589000000000002f, 21.372000000000003f)
                    lineTo(17.002000000000002f, 21.520000000000003f)
                    arcTo(2.0f, 2.0f, 95.9779884719068f, isMoreThanHalf = false, isPositiveArc = false, 19.168000000000003f, 19.940000000000005f)
                    lineTo(19.493000000000002f, 18.387000000000004f)
                    arcTo(1.5f, 1.5f, 191.8335002664567f, isMoreThanHalf = false, isPositiveArc = true, 20.185000000000002f, 17.411000000000005f)
                    lineTo(21.517000000000003f, 16.605000000000004f)
                    arcTo(2.0f, 2.0f, 58.82566879460122f, isMoreThanHalf = false, isPositiveArc = false, 22.323000000000004f, 14.113000000000003f)
                    lineTo(21.675000000000004f, 12.586000000000004f)
                    arcTo(1.5f, 1.5f, 157.00401229333235f, isMoreThanHalf = false, isPositiveArc = true, 21.675000000000004f, 11.414000000000003f)
                    lineTo(22.323000000000004f, 9.887000000000004f)
                    arcTo(2.0f, 2.0f, 22.979624048777367f, isMoreThanHalf = false, isPositiveArc = false, 21.517000000000003f, 7.395000000000004f)
                    lineTo(20.185000000000002f, 6.589000000000004f)
                    arcTo(1.5f, 1.5f, 121.15896855548452f, isMoreThanHalf = false, isPositiveArc = true, 19.493000000000002f, 5.613000000000004f)
                    lineTo(19.168000000000003f, 4.060000000000004f)
                    arcTo(2.0f, 2.0f, 348.1961410730372f, isMoreThanHalf = false, isPositiveArc = false, 17.002000000000002f, 2.480000000000004f)
                    lineTo(15.590000000000003f, 2.628000000000004f)
                    arcTo(1.5f, 1.5f, 84.02866652163107f, isMoreThanHalf = false, isPositiveArc = true, 14.414000000000003f, 2.236000000000004f)
                    close()
                    moveTo(8.083f, 11.67f)
                    lineTo(10.403f, 13.898f)
                    lineTo(15.851f, 8.777999999999999f)
                    arcTo(1.0f, 1.0f, 227.21657521144485f, isMoreThanHalf = false, isPositiveArc = true, 17.221f, 10.235f)
                    lineTo(11.1f, 15.989f)
                    arcTo(1.03f, 1.03f, 46.8998740059744f, isMoreThanHalf = false, isPositiveArc = true, 9.684f, 15.981000000000002f)
                    lineTo(6.7f, 13.113f)
                    arcTo(1.0f, 1.0f, 135.25172610641144f, isMoreThanHalf = false, isPositiveArc = true, 8.085f, 11.671f)
                }
            }.build().also {
                _checkVerificationFilled = it
            }
    }


private var _checkVerificationFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CheckVerificationFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CheckVerificationFilled.imageVector,
            contentDescription = null,
    )
}

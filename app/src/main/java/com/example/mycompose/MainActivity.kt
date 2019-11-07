package com.example.mycompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Material Theme 
            MaterialTheme {
                // Compose newsStory func
                NewsStory()
            }
        }
    }
}

@Composable
fun NewsStory() {

    //Image Resource
    val image = +imageResource(R.drawable.ic_header)

    MaterialTheme {
        // Column
        Column(
            crossAxisSize = LayoutSize.Expand,
            modifier=Spacing(16.dp)
        ) {
            // Container
            Container(
                expanded = true , height =180.dp
            ) {
                // Clip create func
                Clip(shape = RoundedCornerShape(8.dp)) {
                    //DrawImage func
                    DrawImage(image)
                }
            }

            // Height Space func
            HeightSpacer(height = 16.dp)
            Text("A day wandering through the sandhills in Shark " +
                    "Fin Cove, and a few of the sights I saw",
                maxLines = 2, overflow = TextOverflow.Ellipsis,
                style = (+themeTextStyle { h6 }).withOpacity(0.87f))

            // Text func
            Text("Davenport, California",
                style = (+themeTextStyle { body2 }).withOpacity(0.87f))

            // Text func
            Text("December 2018",
                style = (+themeTextStyle { body2 }).withOpacity(0.6f))

            
            HeightSpacer(height = 25.dp)
            Text("Develop by Parho Likho CS. & Thor")
        }
    }

}

@Preview
@Composable
fun DefaultPreview() {
    NewsStory()
}
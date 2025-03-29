package com.stephen.profile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stephen.profile.ui.theme.Poppins
import com.stephen.profile.ui.theme.ProfileTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Body(
                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }
}

@Composable
fun Body(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = Modifier
            .height(450.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(620.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 50.dp,
                        topEnd = 50.dp
                    )
                )
                .background(Color.White)
                .align(Alignment.BottomCenter) // This works inside Box
                .padding(50.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(bottom = 35.dp),
            ) {
                Text(
                    "Finland",
                    fontSize = 30.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                )
                Text(
                    "The Beauty Of Nordic Region",
                    modifier = Modifier
                        .padding(top = 5.dp),
                    fontSize = 15.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black,
                )
            }

            Row(
                modifier = Modifier
                    .padding(bottom = 35.dp),
                horizontalArrangement = Arrangement.spacedBy(20.dp),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pic1),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(2f / 3f) // Adjust the aspect ratio as needed
                        .clip(RoundedCornerShape(15.dp)),
                )

                Image(
                    painter = painterResource(id = R.drawable.pic2),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(2f / 3f)
                        .clip(RoundedCornerShape(15.dp)),
                )

                Image(
                    painter = painterResource(id = R.drawable.pic3),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(2f / 3f)
                        .clip(RoundedCornerShape(15.dp)),
                )
            }

            Column(
                modifier = Modifier,
            ) {
                Text(
                    "About",
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                )
                Text(
                    "Finland is a Northern European nation bordering Sweden, " +
                         "Norway and Russia. Its capital, Helsinki, occupies a " +
                         "peninsula and surrounding islands in the Baltic Sea. " +
                         "Helsinki is home to the 18th-century sea fortress Suomenlinna, " +
                         "the fashionable Design District and diverse museums. The " +
                         "Northern Lights can be seen from the country's Arctic Lapland " +
                         "province, a vast wilderness with national parks and ski resorts.",
                    modifier = Modifier
                        .padding(top = 5.dp),
                    fontSize = 12.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black,
                )
            }
        }
    }
}
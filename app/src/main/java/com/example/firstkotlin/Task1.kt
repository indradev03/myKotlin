package com.example.firstkotlin

import android.os.Bundle
import android.provider.ContactsContract.Profile
import android.service.autofill.OnClickAction
import android.text.style.BackgroundColorSpan
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstkotlin.ui.theme.Green41
import com.example.firstkotlin.ui.theme.White01
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class DashboardDesign : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // This is the base (Scaffold)
            Scaffold { innerPadding->
                DesignHeader(innerPadding)
            }
        }
    }

}

@Composable
fun DesignHeader(innerPadding: PaddingValues) {

    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(Green41),
    ) {

        // Top row ko Picture ko laagi
        //TOP ROW
        Row(
            modifier = Modifier.fillMaxWidth()
            .padding(15.dp),
            horizontalArrangement = Arrangement.End

        ) {

            Button(onClick = { /* Profile Click */
            },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Green41
                )
            )
            {
                Image(
                    painter = painterResource(R.drawable.boy),
                    contentDescription = "Profile",

                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(30.dp)
                        .clip(RoundedCornerShape(30.dp)) // 25dp to make it a perfect circle
                )
            }

        }
            // SECOND ROW
        Row {
            Column (
                modifier =
                    Modifier.padding(
                        horizontal = 10.dp,
                        vertical = 15.dp))
            {
                Text(text = "Card",
                    style =  TextStyle(
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold)
                )
                Text(text = "Simple and easy to use app",
                    style = TextStyle(
                        fontSize = 15.sp,
                        color = Color.White
                    )
                )
            }
        }


        // Spacer ma height ko kaam 2 farak ROw ko bichha maa spacing dine ho
        // Ra yo spacing mathi dekhi tala wala ho

        Spacer(modifier = Modifier.height(40.dp))

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
        ) {

            // Third Row ko Laagi
            Row {
                Card(
                    modifier = Modifier.height(160.dp).weight(1f),


                ) { Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally, // Centers horizontally
                ){
                    Image(
                        // Image ko namm rakhda jaile lower case ma hunu parxa
                        painter = painterResource(R.drawable.book),

                        contentDescription = null, contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(RoundedCornerShape(50.dp))
                            .padding(20.dp)

                    )
                    Text(text = "Text",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(text = "so this is the text",
                        modifier = Modifier.alpha(0.6f),
                        style = TextStyle(
                            fontSize = 10.sp,
                        )
                    )           }
                }

                // Spacer ma width ko kaam same row ko vitra ko content ma space dine kaam ho
                // yo spacing side by side ko mtlab dayabaya
                Spacer(modifier = Modifier.width(20.dp))
                Card(
                    modifier = Modifier.height(160.dp).weight(1f),
                    colors = CardDefaults.cardColors(
                        containerColor = White01
                    )
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally, // Centers horizontally
                    ){
                        Image(
                            // Image ko namm rakhda jaile lower case ma hunu parxa
                            painter = painterResource(R.drawable.address),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .clip(RoundedCornerShape(50.dp))
                                .padding(20.dp)

                        )
                        Text(text = "Address",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(text = "so this is the Address",
                            modifier = Modifier.alpha(0.6f),
                            style = TextStyle(
                                fontSize = 10.sp,
                            )
                        )
                    }
                }
            }
                // Fourth Row
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Card(
                    modifier = Modifier.height(160.dp).weight(1f)
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally, // Centers horizontally
                    ){
                        Image(
                            // Image ko namm rakhda jaile lower case ma hunu parxa
                            painter = painterResource(R.drawable.character),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .clip(RoundedCornerShape(50.dp))
                                .padding(20.dp)

                        )
                        Text(text = "Character",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(text = "so this is the Character",
                            modifier = Modifier.alpha(0.6f),
                            style = TextStyle(
                                fontSize = 10.sp,
                            )
                        )
                    }
                }
                Spacer(modifier = Modifier.width(20.dp))
                Card(
                    modifier = Modifier.height(160.dp).weight(1f),
                    colors = CardDefaults.cardColors(
                        containerColor = White01
                    )
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally, // Centers horizontally
                    ){
                        Image(
                            // Image ko namm rakhda jaile lower case ma hunu parxa
                            painter = painterResource(R.drawable.atm),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .clip(RoundedCornerShape(50.dp))
                                .padding(20.dp)

                        )
                        Text(text = "Bank Card",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(text = "so this is the Bank Card",
                            modifier = Modifier.alpha(0.6f),
                            style = TextStyle(
                                fontSize = 10.sp,
                            )
                        )
                    }
                }
            }

            // 5th Row
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Card(
                    modifier = Modifier.height(160.dp).weight(1f)
                ) {
                    Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally, // Centers horizontally
                ){
                    Image(
                        // Image ko namm rakhda jaile lower case ma hunu parxa
                        painter = painterResource(R.drawable.password),

                        contentDescription = null, contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(RoundedCornerShape(50.dp))
                            .padding(20.dp)

                    )
                    Text(text = "Password",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(text = "so this is the password ",
                        Modifier.alpha(0.6f),
                        style = TextStyle(
                            fontSize = 10.sp,
                        )
                    )
                }}
                Spacer(modifier = Modifier.width(20.dp))


                Card(
                    modifier = Modifier.height(160.dp).weight(1f),
                    colors = CardDefaults.cardColors(
                        containerColor = White01
                    )
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally, // Centers horizontally
                    ){
                        Image(
                            // Image ko namm rakhda jaile lower case ma hunu parxa
                            painter = painterResource(R.drawable.logistic),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .clip(RoundedCornerShape(50.dp))
                                .padding(20.dp)

                        )
                        Text(text = "Logistic",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(text = "so this is the logistic ",
                            modifier = Modifier.alpha(0.6f),
                            style = TextStyle(
                                fontSize = 10.sp,
                            )
                        )
                    }
                }
            }
                // LAST ROW
            Spacer(modifier = Modifier.height(20.dp))
            Row  {
                Card(
                    modifier = Modifier.height(70.dp).weight(1f),
                ){
                    Row (
                        modifier = Modifier.fillMaxWidth().padding(start = 20.dp, top = 15.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Image(
                            // Image ko namm rakhda jaile lower case ma hunu parxa
                            painter = painterResource(R.drawable.settings),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(40.dp)
                                .width(40.dp)
                                .clip(RoundedCornerShape(50.dp))


                        )

                        Column {
                            Text(text = "Setting",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold

                                    )
                            )
                            Text(text = "So this is the setting  ",
                                modifier = Modifier.alpha(0.6f),
                                style = TextStyle(
                                    fontSize = 10.sp,)
                            )
                        }

                    }
                }
            }

        }

    }
}


@Preview
@Composable
fun PreviewDesign(){
    DesignHeader(innerPadding = PaddingValues(0.dp))
}
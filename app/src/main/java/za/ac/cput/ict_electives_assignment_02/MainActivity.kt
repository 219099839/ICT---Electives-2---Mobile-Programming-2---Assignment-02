package za.ac.cput.ict_electives_assignment_02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import za.ac.cput.ict_electives_assignment_02.ui.theme.ICTElectivesAssignment02Theme
import za.ac.cput.ict_electives_assignment_02.ui.theme.color1
import za.ac.cput.ict_electives_assignment_02.ui.theme.color2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ICTElectivesAssignment02Theme {
                MainContent(

                )
                AlertDialog(
                    text = "info",
                    textColor = Color.White,
                    //Adding a gradient color to the alert dialog button
                    gradient = Brush.horizontalGradient(
                        colors = listOf(

                            //Custom colors can be found in Color.kt
                            color1,
                            color2
                        )
                    )
                )
              }
            }
        }
    }

//Adding the welcome screen box
@Composable
fun MainContent(){

    //Centering the content Horizontally and Vertically
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ){
        Box(Modifier
            .padding(20.dp)
            .fillMaxWidth()
            .height(200.dp)
            .clip(RoundedCornerShape(30.dp))
            .background(Brush.horizontalGradient(
                colors = listOf(
                color1,
                color2
            )))
            .wrapContentSize(Alignment.Center)
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(30.dp)
            )

        ){
            //Adding text inside the welcome screen box
            Text(
                text = "Welcome to my Jetpack Compose Journey",
                style=  TextStyle(Color.White),
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                )
        }
    }
}

//Making Alert dialog
@Composable
fun AlertDialog(

    text: String,
    textColor: Color,
    gradient: Brush,
){
    val DialogOpen = remember{ mutableStateOf(false) }

    //Centering the content Horizontally and Vertically
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(
                horizontal = 16.dp)

    ) {

        //Creating the alert dialog button
        Button(
            onClick = {
                DialogOpen.value = true
            },
            contentPadding = PaddingValues(),
            shape = RoundedCornerShape(50.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent
            )

        ){
            Box(
                modifier = Modifier
                    .background(gradient)
                    .padding(
                        horizontal = 20.dp,
                        vertical = 8.dp),
                        contentAlignment = Alignment.Center
            ) {

                //Adding the person icon
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = "",
                    tint = Color.White ,
                    modifier = Modifier
                        .padding(
                            end = 80.dp)

                )
                //Adding the text next to the icon
                Text(
                    text = text,
                    color = textColor,
                )

            }
        }

    }

    //If the button is clicked then the alert dialog opens
    if (DialogOpen.value) {
        AlertDialog(
            onDismissRequest = { DialogOpen.value = false },

            //Alert Dialog Title
            title = {
                Text(
                    text = "Alert Dialog",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp)

            },

            //Alert Dialog journey text
            text = {
                Text(
                    text = "This is my journey so far! " +
                            "Right now I can say I am thrilled with my experience in this elective " +
                            "as the new language, along with Jetpack Compose, makes the coding experience " +
                            "so much easier and simpler. I am looking forward to learning more stunning " +
                            "coding designs with this new language and toolkit.",
                    fontSize = 14.sp)
            },

            //Adding a close button to end the alert dialog
            confirmButton = {
                TextButton(
                    onClick = {
                    DialogOpen.value=false
                }){
                    Text(
                        text = "Close",
                        style = TextStyle(Color.Black))
                }

            },

            //Adding rounded corners and color to the alert dialog
            shape = RoundedCornerShape(30.dp),
            backgroundColor = Color.White,
            contentColor = Color.Black

        )}}



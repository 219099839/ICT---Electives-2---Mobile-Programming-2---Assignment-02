package za.ac.cput.ict_electives_assignment_02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import za.ac.cput.ict_electives_assignment_02.ui.theme.*

class MainActivity : ComponentActivity() {

    private lateinit var  navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ICTElectivesAssignment02Theme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}

@Composable
// This is the method that gets used to display a simple text with a background on screen
fun MainContent() {
    Text(
        // Adding text
        text = "Welcome to my Jetpack Compose Journey!",
        fontWeight = FontWeight.Bold,
        style=  TextStyle(Color.White),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .height(250.dp)
            .background(
                Brush.horizontalGradient(
                colors = listOf(
                    color1,
                    color2
                )
            ))
            .wrapContentSize(Alignment.Center)
    )
}

// Alert Dialog
@Composable
fun AlertDialog() {

    val openDialog = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Button(onClick = { openDialog.value = true },
            shape = RoundedCornerShape(50.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFad5389)),

        )
        // Type of icon with color chosen
        {
            Icon(imageVector = Icons.Filled.Info,
                contentDescription = "",
                tint = Color.White)
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            // Text of the alert dialog button
            Text(text = "Info",
                style = TextStyle(Color.White),
                fontWeight = FontWeight.Bold,)
        }
    }

    if (openDialog.value) {

        AlertDialog(
            shape = RoundedCornerShape(20.dp),
            onDismissRequest = { openDialog.value = false },
            // Alert Dialog Heading
            title = {
                Text(text = "Alert Dialog",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp)
            },
            // Alert Dialog paragraph
            text = {
                Text(text = "This is my journey so far! " +
                        "Right now I can say I am thrilled with my experience in this elective " +
                        "as the new language, along with Jetpack Compose, makes the coding experience " +
                        "so much easier and simpler. I am looking forward to learning more stunning " +
                        "coding designs with this new language and toolkit.",
                    fontSize = 16.sp)
            },
            // Close button to end the alert dialog
            confirmButton = {
                // Creating the text button for the alert dialog
                TextButton(onClick = {
                    openDialog.value=false
                }){
                    // Creating appropriate text for closing the alert dialog
                    Text(text = "Close",
                        style = TextStyle(Color.Black))
                }
            },
            // AlertDialog background color
            backgroundColor = Color.White,
            // AlertDialog text color
            contentColor = Color.Black
        )}



}

// Start Journey Button
@Composable
fun StartJourneyButton(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 200.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Button(
            // Code to navigate to Start Journey Screen
            onClick = {navController.navigate(route= Navigation.Journey.route)},
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFad5389)),
            shape = RoundedCornerShape(50.dp),
        )
        {
            Icon(
                imageVector = Icons.Filled.PlayArrow,
                contentDescription = "",
                tint = Color.White
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            // Text of the button
            Text(text = "Start Journey",
                style = TextStyle(Color.White),
                fontWeight = FontWeight.Bold,
            )
        }
    }
}
@Composable
@Preview(showBackground = true)
fun HomePreview() {
    MainContent()
    AlertDialog()
    StartJourneyButton(navController = rememberNavController())
}




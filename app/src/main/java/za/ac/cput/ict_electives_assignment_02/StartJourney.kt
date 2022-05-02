package za.ac.cput.ict_electives_assignment_02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

import androidx.navigation.compose.rememberNavController


class JourneyScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NameText()
            CourseText()
            DepartmentText()
            StudentNumberText()
            CourseButton()
            BackButton(navController = rememberNavController())
        }
    }
}
@Composable
fun NameText() {

    Text(
        // Setting the text
        text = "Name: Nawaaz Amien",
        style = TextStyle(Color.White),
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        modifier = Modifier
            .padding(16.dp)
            .padding(vertical = 50.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(30.dp))
            .height(100.dp)
            //Using custom color
            .background(Color(0xFFad5389))
            .wrapContentSize(Alignment.Center)
    )
}
@Composable
fun CourseText() {
    Text(
        // Setting the text
        text = "Course: Applications Development",
        style = TextStyle(Color.White),
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        modifier = Modifier

            .padding(vertical = 190.dp)
            .padding(horizontal = 15.dp)
            .width(380.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(30.dp))
            .height(100.dp)
            //Using custom color
            .background(Color(0xFFad5389))
            .wrapContentSize(Alignment.Center)
    )
}
@Composable
fun DepartmentText() {
    Text(
        // Setting the text
        text = "Department: ICT: Information and " +
                "Communications Technology",
        style = TextStyle(Color.White),
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        modifier = Modifier

            .padding(vertical = 320.dp)
            .padding(horizontal = 14.dp)
            .width(381.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(30.dp))
            .height(100.dp)
            //Using custom color
            .background(Color(0xFFad5389))
            .wrapContentSize(Alignment.Center)
    )
}
@Composable
fun StudentNumberText() {
    Text(
        // Setting the text
        text = "Student Number: 219099839",
        style = TextStyle(Color.White),
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        modifier = Modifier

            .padding(horizontal = 14.dp)
            .padding(vertical = 100.dp)
            .padding(top = 350.dp)
            .width(381.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(30.dp))
            .height(100.dp)
            //Using custom color
            .background(Color(0xFFad5389))
            .wrapContentSize(Alignment.Center),
        )
}
@Composable
fun CourseButton(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 50.dp),


        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally

    )
    {
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                //Using custom color
                backgroundColor = Color(0xFFad5389)),
            shape = RoundedCornerShape(50.dp),
        )
        {
            Icon(
                imageVector = Icons.Filled.Menu,
                contentDescription = "",
                tint = Color.White
            )
            // Creating a space between the icon and the text of the button
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            // Text of the button
            Text(text = "Current Modules",
                style = TextStyle(Color.White))
        }
    }
}

// Adding a back button to take you back to the welcome screen
@Composable
fun BackButton(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 5.dp)
            .padding(horizontal = 14.dp),

        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    )
    {
        Button(
            onClick = {navController.popBackStack()},
            colors = ButtonDefaults.buttonColors(
                //Using custom color
                backgroundColor = Color(0xFFad5389)),
            shape = RoundedCornerShape(50.dp),
        )
        {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "",
                tint = Color.White
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            // Text of the button
            Text(text = "Back",
                style = TextStyle(Color.White)
            )
        }
    }
}

//Adding a preview to view changes
@Composable
@Preview (showBackground = true)
fun JourneyScreenPreview() {
    NameText()
    CourseText()
    DepartmentText()
    StudentNumberText()
    CourseButton()
    BackButton(navController = rememberNavController())
}
package za.ac.cput.ict_electives_assignment_02.Screens

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import za.ac.cput.ict_electives_assignment_02.ui.theme.ScrollsTheme

//Nawaaz Amien 219099839//

class CourseModules : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollsTheme() {
                ListOfCourses()
            }
            BackButton(navController = rememberNavController())
            }
        }
    }

@Composable
fun ListOfCourses() {
    val listState = rememberLazyListState()
    val openDialog = remember { mutableStateOf(false) }
    val projectApplication=(LocalContext.current as? Activity)

    LazyColumn(modifier = Modifier.fillMaxSize(1F), state = listState) {


    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
            .padding(10.dp),
    ) {

        Column() {

            //Heading
            Row() {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(2.dp)
                        .padding(top = 60.dp)
                        .height(70.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color(0xFFad5389))
                ){
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                            horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,
                    ){
                        Text(
                            text = "Course Modules",
                            textAlign = TextAlign.Center,
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            //List of Courses
            Row() {
                Box(
                 modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp)
                    .padding(top = 20.dp)
                    .height(500.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(0xFFad5389))
                ) {
                Column(modifier = Modifier
                    .verticalScroll(rememberScrollState())){

                    //ADP Row
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .fillMaxWidth()
                    ) {


                        Text(
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 20.dp)
                                .align(Alignment.CenterVertically),
                            text = "Module Name:\n\n" +
                                    "Module Type:\n" +
                                    "Module Duration:",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            modifier = Modifier
                                .padding(horizontal = 0.dp)
                                .align(Alignment.CenterVertically),
                            text = "Application Development Practice 3\n" +
                                    "Practical\n" +
                                    "Year-Round",
                            color = Color.White,
                            fontSize = 16.sp
                        )
                    }

                    //Line Row
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .padding(top = 0.dp)
                            .fillMaxWidth()
                    ) {


                        Text(
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 0.dp)
                                .align(Alignment.CenterVertically),
                            text = "----------------------------------------------------------------------------------",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                    //ADT Row
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .fillMaxWidth()
                    ) {

                        //ADT Row
                        Text(
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 20.dp)
                                .align(Alignment.CenterVertically),
                            text = "Module Name:\n\n" +
                                    "Module Type:\n" +
                                    "Module Duration:",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            modifier = Modifier
                                .padding(horizontal = 0.dp)
                                .align(Alignment.CenterVertically),
                            text = "Application Development Theory 3\n" +
                                    "Theory\n" +
                                    "Year-Round",
                            color = Color.White,
                            fontSize = 16.sp
                        )


                    }

                    //Line Row
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .padding(top = 0.dp)
                            .fillMaxWidth()
                    ) {


                        Text(
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 0.dp)
                                .align(Alignment.CenterVertically),
                            text = "----------------------------------------------------------------------------------",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                    //ICT Electives Row
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .fillMaxWidth()
                    ) {

                        //ADT Row
                        Text(
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 20.dp)
                                .align(Alignment.CenterVertically),
                            text = "Module Name:\n" +
                                    "Module Type:\n" +
                                    "Module Duration:",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            modifier = Modifier
                                .padding(horizontal = 0.dp)
                                .align(Alignment.CenterVertically),
                            text = "ICT Electives 3\n" +
                                    "Practical\n" +
                                    "Year-Round",
                            color = Color.White,
                            fontSize = 16.sp
                        )


                    }

                    //Line Row
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .padding(top = 0.dp)
                            .fillMaxWidth()
                    ) {


                        Text(
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 0.dp)
                                .align(Alignment.CenterVertically),
                            text = "----------------------------------------------------------------------------------",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                    //Information Systems Row
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .fillMaxWidth()
                    ) {

                        //ADT Row
                        Text(
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 20.dp)
                                .align(Alignment.CenterVertically),
                            text = "Module Name:\n" +
                                    "Module Type:\n" +
                                    "Module Duration:",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            modifier = Modifier
                                .padding(horizontal = 0.dp)
                                .align(Alignment.CenterVertically),
                            text = "Information Systems 3\n" +
                                    "Theory\n" +
                                    "Year-Round",
                            color = Color.White,
                            fontSize = 16.sp
                        )


                    }

                    //Line Row
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .padding(top = 0.dp)
                            .fillMaxWidth()
                    ) {


                        Text(
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 0.dp)
                                .align(Alignment.CenterVertically),
                            text = "----------------------------------------------------------------------------------",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                    //Professional Practice Row
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .fillMaxWidth()
                    ) {

                        //ADT Row
                        Text(
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 20.dp)
                                .align(Alignment.CenterVertically),
                            text = "Module Name:\n" +
                                    "Module Type:\n" +
                                    "Module Duration:",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            modifier = Modifier
                                .padding(horizontal = 0.dp)
                                .align(Alignment.CenterVertically),
                            text = "Professional Practice 3\n" +
                                    "Theory\n" +
                                    "Year-Round",
                            color = Color.White,
                            fontSize = 16.sp
                        )


                    }

                    //Line Row
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .padding(top = 0.dp)
                            .fillMaxWidth()
                    ) {


                        Text(
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 0.dp)
                                .align(Alignment.CenterVertically),
                            text = "----------------------------------------------------------------------------------",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                    //Project Management Row
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .fillMaxWidth()
                    ) {

                        //ADT Row
                        Text(
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 20.dp)
                                .align(Alignment.CenterVertically),
                            text = "Module Name:\n" +
                                    "Module Type:\n" +
                                    "Module Duration:",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            modifier = Modifier
                                .padding(horizontal = 0.dp)
                                .align(Alignment.CenterVertically),
                            text = "Project Management 3\n" +
                                    "Theory\n" +
                                    "Year-Round",
                            color = Color.White,
                            fontSize = 16.sp
                        )


                    }

                    //Line Row
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .padding(top = 0.dp)
                            .fillMaxWidth()
                    ) {


                        Text(
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 0.dp)
                                .align(Alignment.CenterVertically),
                            text = "----------------------------------------------------------------------------------",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                    //Project Presentation Row
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .fillMaxWidth()
                    ) {

                        //ADT Row
                        Text(
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 20.dp)
                                .align(Alignment.CenterVertically),
                            text = "Module Name:\n" +
                                    "Module Type:\n" +
                                    "Module Duration:",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            modifier = Modifier
                                .padding(horizontal = 0.dp)
                                .align(Alignment.CenterVertically),
                            text = "Project Presentation 3\n" +
                                    "Theory\n" +
                                    "Year-Round",
                            color = Color.White,
                            fontSize = 16.sp
                        )


                    }

                    //Line Row
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .padding(top = 0.dp)
                            .fillMaxWidth()
                    ) {


                        Text(
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 0.dp)
                                .align(Alignment.CenterVertically),
                            text = "----------------------------------------------------------------------------------",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                    //Project 3
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .fillMaxWidth()
                    ) {

                        //ADT Row
                        Text(
                            modifier = Modifier
                                .padding(horizontal = 10.dp, vertical = 20.dp)
                                .align(Alignment.CenterVertically),
                            text = "Module Name:\n" +
                                    "Module Type:\n" +
                                    "Module Duration:",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            modifier = Modifier
                                .padding(horizontal = 0.dp)
                                .align(Alignment.CenterVertically),
                            text = "Project 3\n" +
                                    "Practical\n" +
                                    "Year-Round",
                            color = Color.White,
                            fontSize = 16.sp
                        )


                    }
                }
            }
                }

            //Alert Dialog Button
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
                    horizontalArrangement = Arrangement.Center,
            ) {
                Button(
                    onClick = { openDialog.value = true },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color(0xFFad5389)),
                    modifier = Modifier
                        .width(200.dp)
                        .padding(2.dp)
                        .padding(top = 20.dp)
                        .height(40.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color(0xFFad5389))
                ){

                        Icon(imageVector = Icons.Filled.ExitToApp,
                            contentDescription = "",
                            tint = Color.White)
                        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                        // Text of the alert dialog button
                        Text(text = "Good Bye",
                            fontSize = 16.sp,
                            style = TextStyle(Color.White),
                            fontWeight = FontWeight.Bold,)

                }
            }

            if (openDialog.value) {
                AlertDialog(
                    shape = RoundedCornerShape(20.dp),
                    onDismissRequest = { openDialog.value = false },
                    title = {
                        Text(text = "Leaving Now?",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp)
                    },
                        confirmButton = {
                    TextButton(onClick = {
                        openDialog.value=false
                    }){
                        Text(
                            text = "No",
                            style = TextStyle(Color.Black))
                    }
                },
                    dismissButton=
                    {
                        TextButton(onClick = {projectApplication?.finish()}) {
                            Text(
                                text = "Yes",
                                style = TextStyle(Color.Black))
                        }
                    },
                backgroundColor = Color.White,
                        contentColor = Color.Black
                )}}

    }}


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
@Preview(showBackground = true)
fun CourseModulesPreview() {
    ListOfCourses()
    BackButton(navController = rememberNavController())

}
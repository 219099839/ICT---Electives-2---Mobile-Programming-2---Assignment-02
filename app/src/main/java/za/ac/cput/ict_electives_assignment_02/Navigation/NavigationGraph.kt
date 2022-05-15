package za.ac.cput.ict_electives_assignment_02.ui.theme


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import za.ac.cput.ict_electives_assignment_02.Navigation.Navigation
import za.ac.cput.ict_electives_assignment_02.Screens.*

//Nawaaz Amien 219099839//

@Composable

fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(navController = navController,
        startDestination = Navigation.Home.route)
    {
        composable(Navigation.Home.route)
        {
            MainContent()
            za.ac.cput.ict_electives_assignment_02.Screens.AlertDialog()
            StartJourneyButton(navController = navController)
        }
        composable(Navigation.StartJourney.route)
        {
            Name()
            Course()
            Department()
            StudentNumber()
            CourseButton(navController = navController)
            BackButton1(navController = navController)
        }
        composable(Navigation.CourseModules.route)
        {
            ListOfCourses()
            BackButton(navController = navController)
        }

    }
}
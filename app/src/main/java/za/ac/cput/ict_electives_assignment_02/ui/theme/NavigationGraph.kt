package za.ac.cput.ict_electives_assignment_02.ui.theme


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import za.ac.cput.ict_electives_assignment_02.MainContent
import za.ac.cput.ict_electives_assignment_02.StartJourneyButton


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
            za.ac.cput.ict_electives_assignment_02.AlertDialog()
            StartJourneyButton(navController = navController)
        }
        composable(Navigation.Journey.route)
        {
            NameText()
            CourseText()
            DepartmentText()
            StudentNumberText()
            CourseButton()
            BackButton(navController = navController)
        }

    }
}
package za.ac.cput.ict_electives_assignment_02.Navigation

//Nawaaz Amien 219099839//

open class Navigation(val route: String){
    object Home: Navigation(route="Welcome_screen")
    object StartJourney: Navigation(route= "Journey_screen")
    object CourseModules: Navigation(route= "Course_Modules_screen")
}
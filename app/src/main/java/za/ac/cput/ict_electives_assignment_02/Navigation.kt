package za.ac.cput.ict_electives_assignment_02

open class Navigation(val route: String){
    object Home: Navigation(route="Welcome_screen")
    object StartJourney: Navigation(route= "Journey_screen")
}
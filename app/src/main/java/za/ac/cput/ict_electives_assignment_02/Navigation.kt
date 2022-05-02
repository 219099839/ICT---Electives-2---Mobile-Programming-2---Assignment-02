package za.ac.cput.ict_electives_assignment_02

open class Navigation(val route: String){
    object Home: Navigation(route="welcome_screen")
    object Journey: Navigation(route= "journey_screen")
}
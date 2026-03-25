package com.zhuravskii_khanov.student_planner2.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Details : Screen("details/{subjectId}") {
        fun createRoute(subjectId: String) = "details/$subjectId"
    }
    object Profile : Screen("profile")
    object Settings : Screen("settings")
}
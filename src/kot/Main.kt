package kot

fun main() {
    checkSeason("October")
    checkState(100)
    checkToDo(78, true)
}

fun checkSeason(nameOfMonth: String) {
//    val nameOfMonth = "July"
    val season = when (nameOfMonth) {
        "December", "January", "February" -> {
            "Winter"
        }
        "September", "October", "November" -> {
            "Autumn"
        }
        "June", "July", "August" -> {
            "Summer"
        }
        "March", "April", "May" -> {
            "Spring"
        }
        else -> {
            "Not found!"
        }
    }
    println(season)
}

fun checkState(temp: Int) {
    val state = if (temp >= 100) {
        "gas";
    } else if (temp >= 0) {
        "liquid";
    } else {
        "solid";
    }
    println(state);
}

fun checkToDo(currentTime: Int, weatherIsGood: Boolean) {
    val activity = when {
        currentTime in 6..21 && weatherIsGood -> {
            "Have a walk!"
        }
        currentTime in 6..21 && !weatherIsGood -> {
            "Read a book!"
        }
        currentTime in 0..5 || currentTime in 22..23 -> {
            "Have a sleep!"
        }
        else -> {
            "Please indicate time in range 0 - 23 hours!"
        }
    }
        println(activity)

}


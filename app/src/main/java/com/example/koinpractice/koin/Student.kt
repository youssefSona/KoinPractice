package com.example.koinpractice.koin

class Student(
    private val course: Course,
    private val friend: Friend
) {
    fun study() =course.study()

    fun hangout() = friend.hangout()

}

class Course {
    fun study() = println("Studying the course!")
}

class Friend {
    fun hangout() = println("Hanging out with a friend!")
}
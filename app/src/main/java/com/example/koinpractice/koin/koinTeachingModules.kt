package com.example.koinpractice.koin

import org.koin.dsl.module

// Initializing the module for Koin to tell Koin how to instantiating them
val koinTeachingModules = module {
    // Using single for singleton class so it's only one that is created since the scenario is we are having one course
    single { Course() }
    // Using factory so each time they are called a new instance is created as we have multiple friends and students
    factory { Friend() }
    factory { Student(get(), get()) }
}

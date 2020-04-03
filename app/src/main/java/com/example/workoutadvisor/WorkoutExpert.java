package com.example.workoutadvisor;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {
//    choose particular workout plan depending on the chosen body part

    List <String> getWorkouts (String workout_type){
        List <String> workout = new ArrayList<String>();

//        logic to be used to assign a particular workout
        if (workout_type.equals("Chest")){
            workout.add("Bench Press");
            workout.add("Cable Flys");
        } else if (workout_type.equals("Triceps")){
            workout.add("Tricep Ext");
            workout.add("Tricep Pushdowns");
        } else if (workout_type.equals("Shoulders")){
            workout.add("Press");
        } else if (workout_type.equals("Biceps")){
            workout.add("Bicep curls");
        }
        return workout;
    }
}

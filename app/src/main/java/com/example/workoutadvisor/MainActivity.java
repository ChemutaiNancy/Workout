package com.example.workoutadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {


    private WorkoutExpert expert = new WorkoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void findWorkout(View view){
        TextView workouts = findViewById(R.id.txtWorkout);
        Spinner workout_type = findViewById(R.id.workout_type);

        String workout = String.valueOf(workout_type.getSelectedItem());//get the item selected in the spinner

//        workouts.setText(workout);

        List <String> workoutList = expert.getWorkouts(workout);

        StringBuilder workoutsFormatted = new StringBuilder();
        for (String work: workoutList){
            workoutsFormatted.append(work).append('\n');
        }
        workouts.setText(workoutsFormatted);
    }

}

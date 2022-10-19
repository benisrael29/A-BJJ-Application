package com.example.mybjjapplication;



import java.sql.Time;

/**
 * Timer Activity represents a timer activity.
 */
public class m_TimerActivity {
    public final Time ROUND_DURATION;
    public final Time REST_DURATION;
    public final int NUMBER_OF_ROUNDS;
    public int roundsCompleted;
    public int restCompleted;


    public m_TimerActivity(Time round_duration, Time rest_duration, int number_of_rounds) {
        ROUND_DURATION = round_duration;
        REST_DURATION = rest_duration;
        //Needs to get a default or be set by ui
        NUMBER_OF_ROUNDS = number_of_rounds;

    }

    public void startTimer(){
        //TODO
    }

    public void stopTimer(){
        //TODO
    }

    public void restartTimer(){
        //TODO
    }

    public void pauseTimer(){
        //TODO
    }

    public void completeRound(){
        this.roundsCompleted+=1;
    }

    public void completeRest(){
        this.restCompleted+=1;
    }

    public int getRoundsCompleted(){
        return  roundsCompleted;
    }

}

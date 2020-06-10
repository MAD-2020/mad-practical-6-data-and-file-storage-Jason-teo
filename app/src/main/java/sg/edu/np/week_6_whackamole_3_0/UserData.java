package sg.edu.np.week_6_whackamole_3_0;

import android.util.Log;

import java.util.ArrayList;

public class UserData {

    /* NOTE:
            THIS OBJECT DATA IS GIVEN.
            DO NOT CHANGE ANYTHING IN HERE.
            YOU ARE TO USE THIS UserData as it is in your answers.

        The UserData consist of the following:
        1. UserName
        2. Password
        3. A list of Scores related to a list of corresponding Levels
        4. A list of Levels related to a list of corresponding Scores

     */
    String username;
    String password;
    private ArrayList<Integer> Scores = new ArrayList<>();
    private ArrayList<Integer> Levels = new ArrayList<>();

    public UserData()
    {
    }

    public UserData(String myUserName, String myPassword, ArrayList<Integer> myLevels, ArrayList<Integer> myScores) {
        this.username = myUserName;
        this.password = myPassword;
        this.Levels = myLevels;
        this.Scores = myScores;
    }

    public ArrayList<Integer> getLevels() {
        return this.Levels;
    }

    public void setLevels(ArrayList<Integer> levels) {
        this.Levels = levels;
    }

    public ArrayList<Integer> getScores() {
        return this.Scores;
    }

    public void setScores(ArrayList<Integer> scores) {
        this.Scores = scores;
    }

    public String getMyUserName() {
        return this.username;
    }

    public void setMyUserName(String myUserName) {
        this.username = myUserName;
    }

    public String getMyPassword() {
        return this.password;
    }

    public void setMyPassword(String myPassword) {
        this.password = myPassword;
    }

    public void addScore(Integer score, Integer levels){
        Scores.add(score);
        Levels.add(levels);
        Log.v("User", "Initializing Score");
    }
}

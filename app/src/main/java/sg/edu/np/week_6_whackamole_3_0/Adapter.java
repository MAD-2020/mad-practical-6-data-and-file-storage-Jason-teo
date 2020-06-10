package sg.edu.np.week_6_whackamole_3_0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private UserData user = new UserData();
    long timer = 11;

    public Adapter(UserData user, Context context){
        this.user.setScores(user.getScores());
        this.user.setLevels(user.getLevels());
        this.user.setMyUserName(user.getMyUserName());
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.activity_view_holder, viewGroup, false);
        return new ViewHolder(itemView, context, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.score.setText("Highest Score: " + user.getScores().get(i).toString());
        viewHolder.level.setText("Level: " + user.getLevels().get(i).toString());

    }

    @Override
    public int getItemCount() {
        return user.getLevels().size();
    }

    public Integer getHighScore(int position) {
        return user.getScores().get(position);
    }

    public Integer getLevel (int position) {
        return user.getLevels().get(position);
    }

    public String getUsername(){
        return user.getMyUserName();
    }

    public void openActivity(int position){
        int levelSelect = getLevel(position);
        Log.v("TAG", String.valueOf(levelSelect));
        String username = getUsername();

        //This is to store the timer data for the mole time
        Intent intent = new Intent(context, AdvanceActivity.class);
        long moleTime = (timer - levelSelect) * 1000;

        intent.putExtra("timer", moleTime);
        intent.putExtra("level", levelSelect);
        intent.putExtra("username", username);
        Log.v("ViewHolder", String.valueOf(moleTime));
        ((Activity) context).startActivityForResult(intent, 1);

    }

    public void reloadData(){

        this.notifyDataSetChanged();
    }
}
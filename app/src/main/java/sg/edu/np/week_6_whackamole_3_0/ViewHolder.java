package sg.edu.np.week_6_whackamole_3_0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView level, score;
    private Context mContext;
    int levelSelect;
    String username;

    Adapter adapter;

    public ViewHolder(View view, final Context context, final Adapter adapter){
        super(view);
        level = view.findViewById(R.id.txtLevel);
        score = view.findViewById(R.id.txtscore);
        this.adapter = adapter;
        this.mContext = context;

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.openActivity(getLayoutPosition());


            }
        });
    }


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
    }

}
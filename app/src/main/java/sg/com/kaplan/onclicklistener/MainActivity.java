package sg.com.kaplan.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView score = (TextView) findViewById(R.id.score);
        score.setText("0"); //set initial text to 0

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            int i = 0;

            @Override
            public void onClick(View view) {
                i++; //increment the value
//                score.setText(""+ i);
                if (i == 10) {
                    i = 0; //reset to 0
                }
                score.setText("" + i);
            }
        });
    }
}

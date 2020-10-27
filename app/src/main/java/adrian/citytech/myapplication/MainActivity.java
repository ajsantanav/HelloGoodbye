package adrian.citytech.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeTextOnce();
    }

    public void changeTextOnce() { //This is the a method, or function for the button
        final TextView changingText = (TextView) findViewById(R.id.textChange);
        // is variable and a class that calls the text view in order to show it in the app
        Button changeTextButton = (Button) findViewById(R.id.clickChange);
        //This is a variable and class that calls the button and changes whatever it is connected to
        changeTextButton.setOnClickListener(new View.OnClickListener() {
            //sets the event on click to change

            @Override
                public void onClick(View w) {
                changingText.setText("Good Bye");
                }
    });
}
}
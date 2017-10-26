package my.edu.taruc.lab12bmi;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.TextView;

public class BodyMassIndex extends AppCompatActivity {
    EditText editTextWeight,editTextHeight;
    TextView textViewReplay;
    ImageView imageViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_mass_index);

        editTextWeight = (EditText)findViewById(R.id.editTextWeight);
        editTextHeight = (EditText)findViewById(R.id.editTextHeight);
        textViewReplay = (TextView)findViewById(R.id.textViewReplay);
        imageViewResult = (ImageView)findViewById(R.id.imageView);
    }

    public void displayReplay (View view){
        double totalBMI;

        totalBMI = Double.parseDouble(editTextWeight.getText().toString()) / (Double.parseDouble(editTextHeight.getText().toString())*2);
        textViewReplay.setText("Your total BMI is " + totalBMI);

        if(totalBMI <= 18.5){
            imageViewResult.setImageResource(R.drawable.under);
        }
        else if(totalBMI >=25){
            imageViewResult.setImageResource(R.drawable.over);

        }
        else{
            imageViewResult.setImageResource(R.drawable.normal);
        }

    }
    public void resetMessage(View view){
        editTextWeight.setText("");
        editTextHeight.setText("");
        textViewReplay.setText("");
        imageViewResult.setImageResource(R.drawable.empty);
    }
}

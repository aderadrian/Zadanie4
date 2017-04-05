package com.example.adrianreda.zadanie4;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

public class obrazek extends AppCompatActivity
{
    int punkty=0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obrazek);

    }


    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton1:
                if (checked)
                    punkty++;
                    break;
        }
    }
    public void onRadioButtonClicked2(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton5:
                if (checked)
                    punkty++;
                    break;
        }}

    public void onRadioButtonClicked3(View view) {

    boolean checked = ((RadioButton) view).isChecked();
    switch(view.getId()) {
        case R.id.radioButton7:
            if (checked)
                punkty++;
            break;
    }}

    public void onRadioButtonClicked4(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton12:
                if (checked)
                    punkty++;
                break;
        }}

    public void onRadioButtonClicked5(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton15:
                if (checked)
                    punkty++;
                break;
        }}



    public void Wynik(View view)
    {
        Toast.makeText(getApplicationContext(),"Ilość zdobytych punktów: " + punkty, Toast.LENGTH_LONG).
                show();
    }

    public void Powrot(View view)
    {
        finish();
    }


}
package com.example.kidulll;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import android.widget.Button;
import android.widget.EditText;

public class SavingOptionsFragment extends Fragment {

    private EditText editTextAmount;
    private EditText editTextDuration;
    private Button buttonSave;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_saving_options, container, false);

        editTextAmount = view.findViewById(R.id.editTextAmount);
        editTextDuration = view.findViewById(R.id.editTextDuration);
        buttonSave = view.findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Dapatkan nilai dari editTextAmount dan editTextDuration
                String amount = editTextAmount.getText().toString();
                String duration = editTextDuration.getText().toString();

                // Lakukan apa yang diperlukan dengan nilai ini, misalnya, simpan di SharedPreferences
            }
        });

        return view;
    }
}

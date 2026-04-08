package com.penguinlauncher.eaglercraft;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText playerNameInput;
    private EditText serverUrlInput;
    private Button playButton;
    private Button controlEditorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerNameInput = findViewById(R.id.playerNameInput);
        serverUrlInput = findViewById(R.id.serverUrlInput);
        playButton = findViewById(R.id.playButton);
        controlEditorButton = findViewById(R.id.controlEditorButton);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String playerName = playerNameInput.getText().toString();
                String serverUrl = serverUrlInput.getText().toString();
                // Logic to start the game goes here
            }
        });

        controlEditorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Logic to open control editor goes here
            }
        });
    }
}
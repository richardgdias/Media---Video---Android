package com.curso.media_video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoView = findViewById(R.id.videoView);

        //esconder a statusBar e barra de navegacao
        View decorView = getWindow().getDecorView();
        int uiOpcoes = View.SYSTEM_UI_FLAG_FULLSCREEN |View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;

        decorView.setSystemUiVisibility(uiOpcoes); //opcoes de visibilidade

        //esconder a ActionBar
        getSupportActionBar().hide();

        //executar o vídeo
        videoView.setMediaController(new MediaController(this)); // quais vai ser os controladores desse video
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video); //getPackageName recupera o nome do pacote que vamos usar
        videoView.start();
    }
}

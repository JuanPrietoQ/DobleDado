package ec.edu.tecnologicoloja.dobledado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button boton;

    private ImageView dado1;
    private ImageView dado2;

    private TextView resp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asignacion
        boton = (Button) findViewById(R.id.button);

        dado1 = (ImageView) findViewById(R.id.imageView);
        dado2 = (ImageView) findViewById((R.id.imageView2));

        resp = (TextView) findViewById((R.id.textView2));

        //Fijar la accion click al boton

        boton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if(v==boton){
            int random = randomDado1();
            int random2 =randomDado2();

            respuesta(random, random2);

        }
    }
    public void respuesta (int random, int random2){
        if(random > random2){
            resp.setText("El ganador es DADO 1");
        }else{
            resp.setText("El ganador es DADO2");
        }
        if (random == random2){
            resp.setText("Es un EMPATE");
        }
    }
    public int randomDado1(){

        Random r1 = new Random();
        int random = r1.nextInt(6)+1;

        switch (random){
            case 1:
                dado1.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                dado1.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                dado1.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                dado1.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                dado1.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                dado1.setImageResource(R.drawable.dice_6);
                break;
        }
        return random;
    }

    public int randomDado2(){

        Random r2 = new Random();
        int random2 = r2.nextInt(6)+1;

        switch (random2){
            case 1:
                dado2.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                dado2.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                dado2.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                dado2.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                dado2.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                dado2.setImageResource(R.drawable.dice_6);
                break;
        }
        return random2;
    }
}
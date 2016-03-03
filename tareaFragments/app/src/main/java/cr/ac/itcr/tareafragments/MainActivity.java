package cr.ac.itcr.tareafragments;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity  extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn = (Button)findViewById(R.id.botonEjem);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Configuration config = getResources().getConfiguration();

        android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentManager.beginTransaction();


            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
            pm_fragment Pm_fragment = new pm_fragment();
            fragmentTransaction.replace(R.id.fragment, Pm_fragment);
            fragmentTransaction.commit();


    }


   public void abrirEjemplos(View view){
        Intent i = new Intent(MainActivity.this,activity_ejem.class);
        startActivity(i);
    }

}

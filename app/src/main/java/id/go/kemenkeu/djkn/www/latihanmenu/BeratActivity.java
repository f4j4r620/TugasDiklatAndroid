package id.go.kemenkeu.djkn.www.latihanmenu;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class BeratActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView myNavMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berat);
        myNavMenu = (BottomNavigationView) findViewById(R.id.nav);
        myNavMenu.setOnNavigationItemSelectedListener(this);

        Menu menu = myNavMenu.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_home:
                Intent home_page=new Intent(BeratActivity.this,MainActivity.class);
                startActivity(home_page);
                //finish();
                break;
            case R.id.nav_calculator:
                Intent calc_page=new Intent(BeratActivity.this,CalcActivity.class);
                startActivity(calc_page);
                break;
            case R.id.nav_suhu:
                Intent suhu_page=new Intent(BeratActivity.this,SuhuActivity.class);
                startActivity(suhu_page);
                break;
            case R.id.nav_berat:

                return true;
        }
        return false;
    }
}

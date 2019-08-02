package id.go.kemenkeu.djkn.www.latihanmenu;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SuhuActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView myNavMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhu);

        myNavMenu = (BottomNavigationView) findViewById(R.id.nav);
        myNavMenu.setOnNavigationItemSelectedListener(this);

        Menu menu = myNavMenu.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_home:
                Intent home_page=new Intent(SuhuActivity.this,MainActivity.class);
                startActivity(home_page);
                //finish();
                break;
            case R.id.nav_calculator:
                Intent cal_page=new Intent(SuhuActivity.this,CalcActivity.class);
                startActivity(cal_page);
                break;
            case R.id.nav_suhu:

                return true;
            case R.id.nav_berat:

                Intent berat_page=new Intent(SuhuActivity.this,BeratActivity.class);
                startActivity(berat_page);
                break;
        }
        return false;
    }
}

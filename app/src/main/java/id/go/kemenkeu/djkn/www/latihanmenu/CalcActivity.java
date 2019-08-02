package id.go.kemenkeu.djkn.www.latihanmenu;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class CalcActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView myNavMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        myNavMenu = (BottomNavigationView) findViewById(R.id.nav);
        myNavMenu.setOnNavigationItemSelectedListener(this);

        Menu menu = myNavMenu.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);
    }

    /*
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_nav_menu,menu);
        return true;
    }
*/

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_home:
                Intent home_page=new Intent(CalcActivity.this,MainActivity.class);
                startActivity(home_page);
                //finish();
                break;
            case R.id.nav_calculator:

                return true;
            case R.id.nav_suhu:
                Intent suhu_page=new Intent(CalcActivity.this,SuhuActivity.class);
                startActivity(suhu_page);
                //finish();
                break;
            case R.id.nav_berat:
                Intent berat_page=new Intent(CalcActivity.this,BeratActivity.class);
                startActivity(berat_page);
                //finish();
                break;
        }
        return false;
    }
}

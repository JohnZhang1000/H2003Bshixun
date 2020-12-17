package com.example.kami;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tab;
    private LinearLayout ll;
    private NavigationView nav;
    private DrawerLayout draw;
    private ViewPager vp_pager;
    private ArrayList<Fragment> list;
    private MyFramAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        vp_pager = (ViewPager) findViewById(R.id.vp_pager);
        tab = (TabLayout) findViewById(R.id.tab);
        //底部导航
        list = new ArrayList<>();
        list.add(new BlankFragment1());
        list.add(new BlankFragment2());
        list.add(new BlankFragment3());
        list.add(new BlankFragment4());
        list.add(new BlankFragment5());
        adapter = new MyFramAdapter(getSupportFragmentManager(),
                FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, list);
        vp_pager.setAdapter(adapter);
        tab.setupWithViewPager(vp_pager);
        tab.getTabAt(0).setText("第一页");
        tab.getTabAt(1).setText("第二页");
        tab.getTabAt(2).setText("第三页");
        tab.getTabAt(3).setText("第四页");
        tab.getTabAt(4).setText("第五页");


        ll = (LinearLayout) findViewById(R.id.ll);
        nav = (NavigationView) findViewById(R.id.nav);
        nav.setItemIconTintList(null);
        View headerView = nav.getHeaderView(0);
        ImageView iv_head = headerView.findViewById(R.id.iv_head);
        Glide.with(this).load(R.drawable.a2)
                .apply(new RequestOptions().circleCrop())
                .into(iv_head);

        draw = (DrawerLayout) findViewById(R.id.draw);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, draw, toolbar, 0, 0);
        draw.addDrawerListener(toggle);
        toggle.syncState();
        draw.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
                ll.setX(drawerView.getWidth() * slideOffset);
            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item1:
                        Toast.makeText(MainActivity.this, "我的心得", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item2:
                        Toast.makeText(MainActivity.this, "联系我们", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item3:
                        Toast.makeText(MainActivity.this, "发送通知", Toast.LENGTH_SHORT).show();
                        break;
                }

                return false;
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(1, 1, 1, "返回首页");
        menu.add(1, 2, 1, "返回首页");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Toast.makeText(this, "返回首页", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "搜索", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
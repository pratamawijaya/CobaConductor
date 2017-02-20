package com.example.pratama.cobaconductor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.Conductor;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;

public class MainActivity extends AppCompatActivity {

  private Router router;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ViewGroup viewGroup = (ViewGroup) findViewById(R.id.activity_main);

    router = Conductor.attachRouter(this, viewGroup, savedInstanceState);
    if (!router.hasRootController()) {
      router.setRoot(RouterTransaction.with(new HomeController()));
    }
  }

  @Override public void onBackPressed() {
    if (!router.handleBack()) {
      super.onBackPressed();
    }
  }
}

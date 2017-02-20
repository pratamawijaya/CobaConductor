package com.example.pratama.cobaconductor;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.Controller;

/**
 * Created by pratama on 2/20/17.
 */
public class HomeController extends Controller {

  @NonNull @Override
  protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
    View view = inflater.inflate(R.layout.layout_home, container, false);
    return view;
  }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageErrorListener;

public class Main2Activity extends AppCompatActivity implements ViewPager.OnPageChangeListener, OnLoadCompleteListener, OnPageErrorListener {

    PDFView pdfView;
    Bundle b = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pdfView = findViewById(R.id.pdfView);
        b = getIntent().getExtras();
        Uri myUri = Uri.parse(b.getString("imageUri"));
        if (myUri!=null){
            pdfView.fromUri(myUri)
                    .pages(0, 2, 1, 3, 3, 3) // all pages are displayed by default
                    .enableSwipe(true) // allows to block changing pages using swipe
                    .swipeHorizontal(false)
                    .enableDoubletap(true)
                    .defaultPage(0)
                    // allows to draw something on the current page, usually visible in the middle of the screen
                    .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                    .password(null)
                    .scrollHandle(null)
                    .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                    // spacing between pages in dp. To define spacing color, set view background
                    .spacing(0)
                    .invalidPageColor(Color.WHITE) // color of page that is invalid and cannot be loaded
                    .load();

        }

     //String   yourDataObject = getIntent().getStringExtra("url");
        Log.e("kkjj","llll1"+myUri);
       /* Uri uri = Uri.parse(yourDataObject);
        pdfView.fromUri(uri).pages(0).defaultPage(0).enableSwipe(false).load();*/

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void loadComplete(int nbPages) {

    }

    @Override
    public void onPageError(int page, Throwable t) {

    }
}

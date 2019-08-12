package com.amazing.mycnc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class BookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

       PDFView pdfView = findViewById(R.id.pdfView);
       pdfView.fromAsset("kompetensi.pdf")
               .pages(0)
               .enableSwipe(true)
               .swipeHorizontal(false)
               .enableDoubletap(true)
               .defaultPage(0)
               .enableAnnotationRendering(false)
               .password(null)
               .scrollHandle(null)
               .enableAntialiasing(true)
               .spacing(0)
               .pageFitPolicy(FitPolicy.WIDTH)
               .load();

    }
}

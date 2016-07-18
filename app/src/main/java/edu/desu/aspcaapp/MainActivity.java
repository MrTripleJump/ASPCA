package edu.desu.aspcaapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Locale;

import edu.desu.aspcaapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ///Method for when the Donate button is clicked
    public void toDonate (View view){
        Intent goToDonate = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ASPCA.org/Donate"));

        startActivity(goToDonate);

    }
    ///Method for when the Contact button is clicked
    public void toContact (View view){
        Intent goToContact = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.aspcapro.org/contact-us"));

        startActivity(goToContact);
    }
    ///Method for when the Twitter button is clicked
    public void twitterSite (View view){
        Intent twitterSite = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/ASPCA"));

        startActivity(twitterSite);
    }
    ///Method for when the Faceboook button is clicked
    public void facebookSite (View view){
        Intent goToFacebook = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/aspca"));

        startActivity(goToFacebook);
    }
    ///Method for when the Instagram button is clicked
    public void instagramSite (View view){
        Intent goToInstagram = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/aspca/"));

        startActivity(goToInstagram);
    }

    ///Method to find local ASPCAs
    public void gps (View view){
        Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:<lat>,<long>?q=ASPCA"));
        startActivity(search);
    }



}

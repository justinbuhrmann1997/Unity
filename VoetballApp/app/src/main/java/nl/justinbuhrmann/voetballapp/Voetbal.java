package nl.justinbuhrmann.voetballapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Voetbal extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voetbal);
        goalsLinks = (TextView) findViewById(R.id.scoreLinks);
        goalsRechts = (TextView) findViewById(R.id.scoreRechts);
        ovtextLinks = (TextView) findViewById(R.id.ovLinks);
        ovtextRechts = (TextView) findViewById(R.id.ovRechts);
        textWinnaar = (TextView) findViewById(R.id.winnaarId);

        goalsLinks.setText("" + scoreLinks);
        goalsRechts.setText("" + scoreRechts);

        ovtextLinks.setText("" + ovLinks);
        ovtextRechts.setText("" + ovRechts);

    }

    int scoreLinks = 0;
    int scoreRechts = 0;
    int ovLinks = 0;
    int ovRechts = 0;

    TextView goalsLinks;
    TextView goalsRechts;
    TextView ovtextLinks;
    TextView ovtextRechts;
    TextView textWinnaar;


    public void linksPlus(View view)
    {
        scoreLinks += 1;
        goalsLinks.setText("" + scoreLinks);
    }
    public void rechtsPlus(View view)
    {
        scoreRechts += 1;
        goalsRechts.setText("" + scoreRechts);
    }



    public void linksOVPlus(View view)
    {
      ovLinks += 1;
      ovtextLinks.setText("" + ovLinks);
    }
    public void rechtsOVPlus(View view)
    {
      ovRechts += 1;
     ovtextRechts.setText("" + ovRechts);
    }

    public void reset(View view){
        scoreLinks = 0;
        goalsLinks.setText("" + scoreLinks);
        scoreRechts = 0;
        goalsRechts.setText("" + scoreLinks);
        ovLinks = 0;
        ovtextLinks.setText("" + ovLinks);
        ovRechts = 0;
        ovtextRechts.setText("" + ovRechts);
        textWinnaar.setText("");
    }


    public void winnaar(View view)
    {
      if (scoreLinks > scoreRechts)
     {
        textWinnaar.setText(getString(R.string.linksWin));
     }
    else if (scoreRechts > scoreLinks)
    {
       textWinnaar.setText(getString(R.string.rechtsWin));
    }
    else if (scoreLinks == scoreRechts)

      textWinnaar.setText(getString(R.string.gelijkSpel));

    }
}

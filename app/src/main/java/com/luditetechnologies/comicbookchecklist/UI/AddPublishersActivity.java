package com.luditetechnologies.comicbookchecklist.UI;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.luditetechnologies.comicbookchecklist.R;
import com.parse.Parse;
import com.parse.ParseObject;


public class AddPublishersActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_publishers);

//  this initialization should be unecessary now
//        try {
//            // Enable Local Datastore.
//            Parse.enableLocalDatastore(this);
//            Parse.initialize(this, getString(R.string.ParseAppId), getString(R.string.ParseClientKey));
//        }
//        catch (Exception ex){}

        /*
--This is the query that generated the Java code for Publishers
            USE comics
            ;WITH CorrectedPublishers AS
            (
            SELECT
                 REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(replace(replace(replace(publisher,' ',''), '.',''), '-',''), '''',''), '&',''), '!',''), '/',''), '?',''), '-','') AS CorrectedPublisher
                 , REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(replace(replace(replace(publisher,'.',''), '-',''), '''','\'''), '&',''), '!',''), '/',''), '?',''), '-','') AS CorrectedPublisherWithSpaces
            FROM ComicsImport
            WHERE publisher IS NOT NULL
            )

            SELECT DISTINCT
                'try { '
                + 'Thread.sleep(50);'
                + 'ParseObject publisher' + CorrectedPublisher + ' = new ParseObject("ComicBookChecklist_Publisher");'
                + ' publisher' + CorrectedPublisher + '.put("name", "' + CorrectedPublisherWithSpaces + '");'
                + ' publisher' + CorrectedPublisher + '.saveInBackground();'
                + ' } catch (InterruptedException e) { }'
                 AS JavaParseCode
            FROM CorrectedPublishers
            ORDER BY JavaParseCode

            --This is the query that generated the Java code for Titles
            USE comics

            ;WITH CorrectedTitles AS
            (
            SELECT DISTINCT
                   REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(replace(replace(replace(title,' ',''), '#',''), '`',''), '(',''),')',''), '[',''), ':',''), '.',''), '''',''), '-',''),  '&',''), '!',''), '/',''), '?',''), '-','') AS CorrectedTitle
                    , Title
            FROM ComicsImport
            WHERE title IS NOT NULL
            )

            SELECT DISTINCT
				'try { '
                + 'Thread.sleep(50);'
                + 'ParseObject title' + CorrectedTitle + ' = new ParseObject("ComicBookChecklist_Title");'
                + ' title' + CorrectedTitle + '.put("name", "' + Title + '");'
                + ' title' + CorrectedTitle + '.saveInBackground();'
                + ' } catch (InterruptedException e) { }'
                 AS JavaParseCode
            FROM CorrectedTitles
            ORDER BY JavaParseCode
 */


        //TODO: implement a check to avoid duplicates
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "A LIST COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "A. SILENT COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AAA MILWAUKEE PUBLISHING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AARDVARK INTERNATIONAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AARDVARK VANAHEIM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AARDVARK-VANAHEIM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ABACULUS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ABERRATION PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ABIO GENESIS PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ABSENCE OF INK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ABSTRACT STUDIO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AC COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ACE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ACG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ACME COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ACTIVE SYNAPSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ADEPT BOOKS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ADHESIVE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ADULTS ONLY COMIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ADVENTURE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AEON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AIRCEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ALTERNATIVE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ALTERNATIVE PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AM WORKS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AMAZE INK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AMAZING COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AMERICAN MULE ENTERTAINMENT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AMERICA'S BEST COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AMF COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AMRYL ENTERTAINMENT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ANARCHY PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ANGEL ENTERTAINMENT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ANGUS COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ANTARTIC PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ANUBIS PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "APPLE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ARIA PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ARROW COMICS GROUP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ART & SOUL COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ARTISAN ENTERTAINMENT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ASTONISH COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ASTRO COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ATHLETIC COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ATOM COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ATOMEKA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ATOMIC PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AUGUST COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AUTOCRATIK FOR THE MASSES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "AVATAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BAD PRESS LTD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BARDIC PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BASEMENT COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BEANWORLD PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BEARBONES PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BEAVER PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BIG BABY COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BIG ENTERTAINMENT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BIG GUY COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BIG JOLT COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BISHOP PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BLACK BULL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BLACK DAZE PUBLISHING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BLACK DIAMOND EFFECT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BLACK EYE PRODUCTIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BLACK LACE STUDIOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BLACKBURN COMICS LTD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BLACKTHORNE PUBLISHING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BLIND WOLF COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BLT STUDIOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BLUE COMICS PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BONEYARD PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BOOKMARK PRODUCTIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BRAINSTORM COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BRAVURA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BRENNER PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BROADWAY COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BROKEN HALOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "BUCCANEER COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "C & T GRAPHICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CALIBER COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CALLIOPE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CAPITAL COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CARNAL COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CARTOON BOOKS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CASTLE RAIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CATALAN COMMUNICATIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CAVEMAN PUBLISHING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CFD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CHANCE ENTERPRISES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CHANTING MONKS STUDIOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CHAOS! COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CHARLTON COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CHARLTON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CHEMICAL BRAIN COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CHORAL COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CLAYPOOL COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CLUB 408 GRAPHICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "COLONIA PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "COM.X");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "COMICO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "COMICS BY ANSON JEW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "COMICS CONSPIRACY PUBLICATIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "COMPANY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CONCEPTION COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CONTINUITY COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CONTINUM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CORSAIR PUBLISHING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "COWTOWN COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CPL/GANG PUBLISHING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CRAZY CAT DESIGNS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CREATIVE FORCE PRODUCTIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CREATIVE FRONTIERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CROSSGEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CRUCIAL COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CRUSADE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CRUSADE OF COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "CULT PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "D.B.I.");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DANCING ELEPHANT PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DARK FANTASIES PRODUCTIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DARK HORSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DARK UTOPIA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DARK VISIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DC AMALGAM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DC");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DEAD FLY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DEATH COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DEE VEE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DEFIANT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DELL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DELTA COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DOTHENRIDGE PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DOUBLE DIAMOND PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DRACO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DRACONIAN FEATURES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DRAMENON STUDIO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DRAWN AND QUARTERLY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DREAMHAVEN PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DREAMING CITY COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DREAMWAVE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "DZL COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "EAGLE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "EBG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ECLIPSE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ECLIPSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "EDDIE CAMPBELL COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "EENIEWEENIE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "EL CAITAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ELITE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ENTITY COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "EOUCOMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "EPIC COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "EPITAPH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "EROS COMIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "EROS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ETERNITY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "EVENT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "EVIL PROPAGANDA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FALSE IDOL STUDIOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FANTACO ENTERPRISES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FANTACO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FANTACORE PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FANTAGRAPHICS BOOKS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FANTAGRAPHICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FANTASY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FAWCETT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FIREMAN PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FIRST COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FIRST PUBLISHING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FISHWRAP PRESENTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FIVE OCLOCK SHADOW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FLASHPOINT COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FLEETWAY/QUALITY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FOX KIDS NETWORK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FRY VISION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "FULL BLEED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "GALLANT STUDIOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "GASP! COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "GAUNTLET COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "GEMSTONE PUBLISHING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "GENESIS WEST COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "GLACIAL PACE PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "GOBLIN STUDIOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "GOLD KEY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "GOTHIC COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "GRAPHIC GRAPHIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "GREEN DOOR STUDIOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "GREEN MAN PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "GROUND ZERO COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "GRYPHON RAMPART");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "HALL OF HEROES PRESENTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "HAMMER AND ANVIL PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "HARRIER COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "HARRIS COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "HEAD PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "HEAVY INDUSTRIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "HELIKON COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "HERO ILLUSTRATED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "HERO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "HEROES CONVENTION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "HIGH IMPACT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "HOLLYWOOD COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "HOMAGE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "HOT COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "HURRICANE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "HUSTLER COMIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "I BOX PUBLISHING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ICG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ICONOGRAPHIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "IMAGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "IMMORTELLE STUDIOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "IMPACT STUDIOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "IMPACT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "INDEPENDANT COMICS GROUP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "INNER VISION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "INNOVATION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "INSIGHT STUDIOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "INSOMNIA COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "IRONCAT L.L.C.");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "JABBERWOCKY GRAPHICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "JADEMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "JITTERBUG PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "JUMP BACK PRODUCTIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "KENZER AND COMPANY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "KING COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "KING HELL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "KING INK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "KITCHEN SINK COMIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "KITCHEN SINK PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "KNEE DEEP PRODUCTIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "KNIGHT PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "KNOCKABOUT PRODUCTIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "KRONOS KOMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "LABRYNTH STUDIOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "LAST GASP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "LAUGHIG BUDDHA PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "LAUGHING CROW PUBLICATIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "LIAR COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "LIGHT SPEED PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "LIGHTNING COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "LISNER.COM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "LODESTONE PUBLISHING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "LONDON NIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "LOOKING GLASS STUDIOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "M F ENTERPRISES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MALIBU COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MALIBU");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MANIC PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MANIFEST DESTINY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MARBEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MARKS GIANT ECONOMY SIZE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MARVEL GRAPHIC NOVEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MARVEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MAVERICK PULP COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MEGATRON COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MERMAID");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MESIAWARP COMIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MIGHTY COMICS GROUP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MIKE HUNT COMIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MILLENNIUM PUBLICATIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MILLENNIUM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MIRAGE PUBLISHING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MIRAGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MOCK MAN PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MODERN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MONOLITH GRAPHICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MONSTER PANTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MONSTER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MOORDAM COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MULEHIDE GRAPHICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "MYSTIC COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "NANNY GOAT PRODUCTIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "NEC COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "NEOTECK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "NEW ENGLAND COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "NICOTAT COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "NO PLAN STUDIOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "NON-DAIRY PUBLISHING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "NORTHSTAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "NOTES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "NOW COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "OCEAN COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "OLIO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "OLLIE OLLIE OXEN FREE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "OLYOPTICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ONE SHOT PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ONI PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ONWARD COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PAN COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PARADOX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PARAGRAPHICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PC COMIC");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PC COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PEN AND INK COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PENNY FARTHING PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PENTHOUSE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PENTHOUSE COMIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PEREGRINE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PEREGRINE ENTERTAINMENT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PIG RUN PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PIRANHA PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PLASMA BABY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "POLITICAL COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PREVIEWS PRESENTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PROGRESSING BACKWARDS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "PULP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "QUALITY COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "RADIO COMIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "RAE COMIC CO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "RAISED BROW PUBLICATIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "REBEL STUDIOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "RED CIRCLE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "RED INK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "RE-IMAGING COMIC ART");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "RENEGADE PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "REOCCURRING IMAGES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "RETRO GRAPHIX COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "REVOLUTIONARY COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "RIP OFF PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "RIP-OFF PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "RISING STAR ENT.");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ROCK-IT COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SABRES EDGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SANCTUARY PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SANDBERG PUBLISHING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SCHISM COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SCORCHED EARTH PRODUCTIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SHANAMATION PUBLISHING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SHANDA FANTASY ARTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SHARKBAIT PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SICK MIND PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SILLY DADDY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SILVER HAMMER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SILVERWOLF");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SIRIUS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SIXSIXSIX COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SKY COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SLAP HAPPY COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SLAVE LABOR GRAPHICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SLEEPING GIANT COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SMALL PRESS EXPO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SOUTHWIND PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SPECTRUM COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SPIDERBABY GRAPHIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SPOTLIGHT COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "STAR REACH COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "STARHEAD COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "STRAW DOG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SUMITEK COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "SUPERIOR JUNK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "TALIESIN PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "TANGENT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "TAPESTRY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "TEKNO COMIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "TEN DUCK COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "THECOMIC");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "THE-COMIC.COM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "THINK BLOTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "THOUGHTS AND IMAGES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "THREE FINGER PRINTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "TIN CUP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "TOME PRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "TOO HIP GOTTA GO GRAPHICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "TOPPS COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "TOTALLYSTAMPED COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "TRIDENT COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "TRIGON COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "TROMA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "T-SQUARE GRAPHICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "TUNDRA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "TWIST AND SHOUT COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "UNDERHANDED COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "VALIANT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "VANGUARD COMIC PRODUCTION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "VENUS COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "VEROTIK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "VINCENT CREATIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "VISCERAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "VISUAL ANARCHY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "VIZ COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "VORTEX COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "WALKIE TALKIE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "WARP GRAPHICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "WARREN MAGAZINE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "WATERMARK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "WD PUBLICATIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "WEEBEE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "WELLS AND CLARK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "WELSH PUBLISHING GROUP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "WEST HAMPTON HOUSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "WHAT? COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "WILD STORM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "WILDSTORM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "WIMMENS COMIX PRESENTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "WIZARD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "WOMP PRESENTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ZERO MAYO STUDIOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject(getString(R.string.PublisherClassName));
            x.put("name", "ZONE PRODUCTIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }

    }
}

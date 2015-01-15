package com.luditetechnologies.comicbookchecklist.UI;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.luditetechnologies.comicbookchecklist.R;
import com.parse.Parse;
import com.parse.ParseObject;

public class AddTitlesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_titles);

        //  this initialization should be unecessary now
//        try {
//            // Enable Local Datastore.
//            Parse.enableLocalDatastore(this);
//            Parse.initialize(this, getString(R.string.ParseAppId), getString(R.string.ParseClientKey));
//        }
//        catch (Exception ex){}


        AddTitles1();
        AddTitles2();
    }

    private void AddTitles1() {
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "...PARADISE TOO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "007 JAMES BOND PERMISSION TO DIE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "100 BULLETS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "1000000");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "1602 BY NEIL GAIMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "1963 HORUS LORD OF LIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "1963 MYSTERY INCORPORATED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "1963 TALES FROM THE BEYOND");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "1963 TALES OF THE UNCANNY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "2000 A.D. MONTHLY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "2001");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "2020 VISIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "2099 UNLIMITED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "22 BRIDES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "3 GEEKS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "300");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "32 PAGES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "40148");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "7 GUYS OF JUSTICE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "777 THE WRATH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "7TH SYSTEM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "9-11 EMERGENCY RELIEF");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "A DISTANT SOIL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "A FALL OF STARDUST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "A MOMENT OF SILENCE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "A1");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "A-1");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ABBOTT AND COSTELLO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ABRAHAM STONE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ACME NOVELTY LIBRARY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ACTION COMICS ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ACTION COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ACTION GIRL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ACTIONS SPEAK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ADOLESCENT RADIOACTIVE BLACKBELT HAMSTERS 3-D");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ADOLESCENT RADIOACTIVE BLACKBELT HAMSTERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ADVENTURE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ADVENTURES IN THE RIFLE BRIGADE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ADVENTURES OF ADAM AND BRYON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ADVENTURES OF BARRY WEEN BOY GENIUS 2.0");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ADVENTURES OF BARRY WEEN BOY GENIUS MONKEY TALES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ADVENTURES OF BARRY WEEN BOY GENIUS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ADVENTURES OF MONKEY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ADVENTURES OF RHEUMY PEEPERS AND CHUNKY HIGHLIGHTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ADVENTURES OF SUPERMAN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ADVENTURES OF SUPERMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ADVENTURES OF THE MASK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AESOP'S FABLES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AGE OF HEROES SPECIAL EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AGE OF HEROES WEX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AGE OF HEROES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AGE OF REPTILES THE HUNT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AGE OF REPTILES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AGONY IN BLACK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AIRTIGHT GARAGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AKA GOLDFISH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AKIKO ON THE PLANET SMOO FAN EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AKIKO ON THE PLANET SMOO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AKIKO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AKIRA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALBEDO PROTOTYPE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALBEDO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALIAS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALICE AND THE ENGINE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALICE COOPER THE LAST TEMPTATION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALIEN WORLDS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALIENS EARTH ANGEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALIENS EARTH WAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALIENS GENOCIDE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALIENS HIVE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALIENS ROGUE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALIENS SACRIFICE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALIENS SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALIENS VS. PREDATOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALIENS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALL GIRLS SCHOOL BRAND SPANKING NEW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALL GIRLS SCHOOL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALL HALLOW'S EVE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALLEYCAT PRELUDE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALL-STAR SQUADRON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALPHA FLIGHT SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ALPHA FLIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AMAZING ADVENTURES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AMAZING FANTASY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AMAZING SCARLET SPIDER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AMAZING SPIDERMAN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AMAZING SPIDERMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AMAZON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AMBUSH BUG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AMERICAN FLAGG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AMERICAN FREAK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AMERICA'S BEST COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AMY RACECAR COLOR SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ANARKY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ANCIENT JOE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ANGEL AND THE APE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ANGEL GIRL AGAINST ALL EVIL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ANGEL GIRL BEFORE THE WINGS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ANGEL GIRL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ANGELA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ANIMA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ANIMAL MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ANIMAL MYSTIC WATER WARS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ANIMAL MYSTIC");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ANOTHER DAY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ANTFARM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ANTICIPATOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ANTI-SOCIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ANYTHING GOES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "APACHE SKIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "APPARITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AQUAMAN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AQUAMAN MINISERIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AQUAMAN TIME AND TIDE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AQUAMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ARACHNOPHOBIA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ARAK SON OF STONE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ARAKNIS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ARCANA ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ARCANA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ARCANUM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ARCHER AND ARMSTRONG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ARCHIE SERIES BETTY AND ME");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ARIA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ARIANNE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ARMAGEDDONQUEST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ARMATURE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ARSENIC LULLABY CHRISTMAS SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ARSENIC LULLABY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ART OF USAGI YOJIMBO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ARTBABE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ARTHUR KING OF BRITAIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ASH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ASSASSINS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ASTONISHING TALES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ASTRO CITY FULL COLOR 3D");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ASTRO CITY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ASYLUM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AT THE SEAMS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "A-TEAM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ATOM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AUSTIN POWERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AUTHORITY ANNUAL 2000");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AUTHORITY KEV");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AUTHORITY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AV IN 3D");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AVENGERS ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AVENGERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AWKWARD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AXEL PRESSBUTTON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AZRAEL ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AZRAEL ASH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AZRAEL PLUS THE QUESTION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AZRAEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "AZTEK THE ULTIMATE MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BABY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BABYLON CRUSH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BACCHUS COLOR SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BACCHUS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BAD BOY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BAD GIRLS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BAD TABITHA WITCH TRAINEE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BAD WORLD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BADGER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BADLANDS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BASTARD SAMURAI");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATGIRL ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATGIRL SECRET FILES AND ORIGINS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATGIRL SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATGIRL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATHORY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATHROOM GIRLS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN A DEATH IN THE FAMILY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN ADVENTURES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN AND THE OUTSIDERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN ARKHAM ASYLUM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN BATGIRL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN BEYOND");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN BLACKGATE ISLE OF MEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN BLACKGATE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN CASTLE OF THE BAT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN DAREDEVIL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN DARK KNIGHT OF THE ROUND TABLE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN DARK KNIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN DAY OF JUDGEMENT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN DEATH AND THE MAIDENS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN DEATH OF INNOCENCE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN DEMON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN DEVIL'S ASYLUM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN DREAMLAND");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN GCPD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN GHOSTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN GORDON'S LAW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN GOTHAM ADVENTURES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN GOTHAM BY GASLIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN HUNTRESS SPOILER BLUNT TRAUMA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN HUNTRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN JOKER'S APPRENTICE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN JUDGE DREDD JUDGEMENT ON GOTHAM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN LOTDK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN MANBAT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN MASK OF THE PHANTASM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN MASQUE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN MASTER OF THE FUTURE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN MOVIE ADAPTATION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN MOVIE SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN OFFICIAL COMIC ADAPTATION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN OUTLAWS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN PHANTOM STRANGER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN PLUS ARSENAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN RIDDLER THE RIDDLE FACTORY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN RUN RIDDLER RUN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN SEDUCTION OF THE GUN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN SHADOW OF THE BAT ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN SHADOW OF THE BAT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN SUPERMAN WORLD'S FINEST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN SWORD OF AZRAEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN THE CULT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN THE HILL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN THE LONG HALLOWEEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN THE TEN CENT ADVENTURE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN TWO FACE STRIKES TWICE!");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATTHING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATTLE OF THE PLANETS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BATTLESTAR GALACTICA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BEARSKIN A GRIMM TALE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BEAST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BEAUTIFUL STORIES FOR UGLY CHILDREN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BEAVIS AND BUTTHEAD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BECK & CAUL INVESTIGATIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BEDLAM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BELIAL A DEMONS FEAST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BERLIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BERZERKER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BETTY PAGE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BIG GUY ANDRUSTY THE BOY ROBOT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BIPOLAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BIRDS OF PREY MANHUNT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BIRDS OF PREY REVOLUTION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BIRDS OF PREY THE RAVENS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BIRDS OF PREY WOLVES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BIRDS OF PREY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BIRTH CAUL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BITCH IN HEAT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BITTER CAKE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BIZARRE HANDS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BIZARRE SEX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLACK CANARY ORACLE BIRDS OF PREY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLACK CAT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLACK CROSS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLACK DIAMOND EFFECT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLACK MIST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLACK ORCHID ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLACK ORCHID");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLACK WIDOW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLACKHAWK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLADE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLAIR WITCH PROJECT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLAIR WITCH?");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLAZE OF GLORY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLIP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLOOD FANG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLOOD FOR THE MUSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLOOD SWORD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLOOD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLOODHOUND");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLOODLINES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLOODSHOT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLOODSTRIKE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLOODY MARY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BLUEBEARD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BOB THE GALACTIC BUM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BODY DOUBLES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BODY HEAT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BODYGUARD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BOFFO LAFFS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BONE HOLIDAY SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BONE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BOOGIE MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BOOK OF BALLADS AND SAGAS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BOOKS OF FAERIE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BOOKS OF LORE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BOOKS OF MAGIC ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BOOKS OF MAGIC");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BOONDOGGLE SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BOONDOGGLE STORYBOOK ASHCAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BOONDOGGLE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BORIS THE BEAR NINJA WARS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BORIS THE BEAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BOUND IN DARKNESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BOX OFFICE POISON KOLOR KARNIVAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BOX OFFICE POISON SUPER SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BOX OFFICE POISON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BRAT PACK MAXIMORTAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BRAT PACK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BRATH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BRAVE AND THE BOLD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BREAK-THRU");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BREED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BREEDER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BRICKMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BRIGADE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BROKEN HALO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BROTHER POWER THE GEEK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BRUCE WAYNE AGENT OF S.H.I.E.L.D.");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BRU-HED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BUCK ROGERS IN THE 25TH CENTURY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BUDGET STRIPS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BULLETS AND BRACELETS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BUMPER AND THE BOUNCER ASHCAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "BURN TIME ANTHOLOGY ASHCAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CABLE BLOOD AND METAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CABLE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CADENCE OF THE DIRGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CADILLACS AND DINOSAURS BLOOD AND BONES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CADILLACS AND DINOSAURS MAN-EATER!");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CADILLACS AND DINOSAURS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAFFEINE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAGES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CALIBER PRESENTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CALIBRATIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CALL OF DUTY THE BROTHERHOOD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CALL OF DUTY THE PRECINCT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CANCER THE CRAB BOY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CANNIBAL PORN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAPITAL CAPERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAPTAIN AMERICA ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAPTAIN AMERICA SENTINEL OF LIBERTY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAPTAIN AMERICA SPECIAL COMICON EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAPTAIN AMERICA WHAT PRICE GLORY?");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAPTAIN AMERICA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAPTAIN ATOM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAPTAIN CRAFTY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAPTAIN DINGLEBERRY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAPTAIN GRAVITY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAPTAIN JACK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAPTAIN MARVEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAPTAIN PARAGON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAR 54 WHERE ARE YOU?");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CARNOSAUR CARNAGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CASTLE WAITING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CASUAL HEREOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAT & MOUSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CATSEYE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CATWOMAN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CATWOMAN DEFIANT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CATWOMAN PLUS SCREAM QUEEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CATWOMAN THE CAT FILE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CATWOMAN TRADE PAPERBACK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CATWOMAN VAMPIRELLA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CATWOMAN WILDCAT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CATWOMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAVE WOMAN COLOR SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAVEMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAVEWOMAN  THE MATURE VERSION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAVEWOMAN ORIGINAL SERIES TPB");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAVEWOMAN PAGAEN SEA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAVEWOMAN RAIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CAVEWOMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CELL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CEREAL KILLINGS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CEREBUS BI-WEEKLY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CEREBUS CHURCH AND STATE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CEREBUS GUIDE TO SELF PUBLISHING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CEREBUS JAM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CEREBUS NUMBER ZERO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CEREBUS WORLD TOUR BOOK 1995");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CEREBUS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CHAINGANG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CHAINSAW VIGILANTE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CHALLENGERS OF THE UNKNOWN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CHAMBER OF DARKNESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CHAMPIONS OF THE DUSK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CHAPEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CHARLOTTE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CHARLTON BULLSEYE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CHASE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CHASTITY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CHEVAL NOIR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CHILDRENS CRUSADE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CHRISTMAS WITH THE SUPERHEROES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CHROMA TICK SPECIAL EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CHROMA TICK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CHROME");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CLAN APIS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CLASSIC STAR WARS DEVILWORLDS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CLAUS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CLERKS THE COMIC BOOK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CLERKS THE HOLIDAY SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CLERKS THE LOST SCENE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CLIFFHANGER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CLINT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CLOAK AND DAGGER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CLOWNS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COLD BLOODED CHAMELEON COMMANDOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COLD SHOWER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COLLECTED ADVENTURES OF THE FABULOUS FURRY FREAK BROTHERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COLLEGE KINK IN THE FLESH 1");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COLLEGE KINK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COLONIA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COMET MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COMET");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COMIC BOOK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CONAN THE ADVENTURER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CONAN THE BARBARIAN MOVIE SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CONAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CONCAVE UP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CONCRETE KILLER SMILE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CONE OF SILENCE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CORINTHIANS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COSMIC ODYSSEY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COSMIC POWERS UNLIMITED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COSMIC POWERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COTTON CANDY AUTOPSY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COUNTDOWN SEX BOMBS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COUNTDOWN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COUNTESS VLADIMIRA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COURTNEY CRUMKIN AND THE NIGHT THINGS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COVEN OF ANGELS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COVENTRY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "COW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CRAP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CREATURE FROM THE BLACK LAGOON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CREED AND TEENAGE MUTANT NINJA TURTLES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CREED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CRIMSON NUN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CRIMSON PLAGUE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CRISIS ON INFINITE EARTHS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CRITICAL ERROR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CRITTERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CROSS ROADS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CROSSGEN SAMPLER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CROW OF THE BEAR CLAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CROW TPB");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CROW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CRUEL AND UNUSUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CRY FOR DAWN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CRYPT OF DAWN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CUCKOO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CUDA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CURSE OF THE SPAWN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CUTIE HONEY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CYBERCRUSH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CYBERFORCE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CYBERNARY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CYBORG GERBILS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "CYNDER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DAFFY DUCK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DALGODA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DAMAGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DANCE OF LIFEY DEATH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DANCES WITH COWS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DANTE PRIMER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DAREDEVIL AND THE PUNISHER CHILD'S PLAY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DAREDEVIL ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DAREDEVIL BULLSEYE THE TARGET");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DAREDEVIL SHI");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DAREDEVIL THE MAN WITHOUT FEAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DAREDEVIL VS. VAPORA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DAREDEVIL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARK ANGEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARK FANTASIES MIDSUMMERS EVE SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARK FANTASIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARK HORSE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARK HORSE PRESENTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARK MINDS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARK NEMESIS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARK OZ");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARK RAT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARK REALITY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARK STARS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARK UTOPIA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARK VISIONS ASHCAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARKCHYLDE SWIMSUIT ILLUSTRATED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARKCHYLDE THE DIARY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARKCHYLDE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARKER IMAGES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARKER SIDE OF SEX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARKMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARKNESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARKSEID VS. GALACTUS THE HUNGER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARKSEID");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DARQUE PASSAGES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DAWN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DAZZLER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DC 1ST: BATGIRL/JOKER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DC 1ST: GREEN LANTERN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DC 1ST: SUPERMAN/FLASH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DC 1ST: SUPERMAN/LOBO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DC COMICS PRESENTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DC SHOWCASE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DC SUPERSTARS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DC VERSUS MARVEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DC/MARVEL ACCESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DCU HOLIDAY BASH 1997");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DCU HOLIDAY BASH 2 1998");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DCU HOLIDAY BASH 3 1999");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEAD END");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEAD GRRL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEAD POOL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEADFACE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEADLY FOES OF SPIDERMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEADMAN EXORCISM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEADWORLD NECROPOLIS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATH BY CHOCOLATE SIR GEOFFREY AND THE CHOCOLATE CAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATH BY CHOCOLATE THE METABOLATORS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATH BY CHOCOLATE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATH DEALER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATH RATTLE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATH THE HIGH COST OF LIVING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATH THE TIME OF YOUR LIFE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATHBLOW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATHMATE BLACK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATHMATE BLUE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATHMATE YELLOW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATHMATE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATH'S HEAD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATHSTROKE THE TERMINATOR ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATHSTROKE THE TERMINATOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATHWATCH 2000 HYBRIDS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEATHWATCH 2000 MEGALITH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEEP TERROR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEMON ANNUAL 2");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEMON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEMONBABY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEMONGATE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DEMONIQUE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DENNIS THE MENACE [PET PARADE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DER VANDALE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DESCENDING ANGELS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DESERT REACH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DESPERADOES EPIDEMIC!");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DESPERADOES QUIET OF THE GRAVE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DESPERADOES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DESTINY A CHRONICLE OF DEATHS FORETOLD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DESTINY ANGEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DESTROYER DUCK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DETECTIVE ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DETECTIVE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DETECTIVE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DETENTION COMICS SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DETOUR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DICKS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DINO ISLAND");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DIRTBAG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DIRTY LITTLE SECRETS WHATS NEW PUSSYCAT?");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DIVINE RIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DNAGENTS 3D");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DNAGENTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DOC SAMSON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DOCTOR OCCULT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DOCTOR STRANGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DOCTOR STRANGEFATE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DODGING BULLETS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DOLLS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DOMAIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DOMINO CHANCE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DONATELLO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DONNA MIA GIANT SIZE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DONNA MIA INFINITY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DONNA MIA PINUP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DONNA MIA SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DONNA MIA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DOOM PATROL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DOOMSDAY SQUAD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DORK TOWER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DORK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DOUBLE DRAGON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DOUBLE IMPACT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DR STRANGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DR. FATE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DR. ROBOT SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DRACULA IN HELL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DRAFT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DRAGON QUEST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DRAGONFORCE CHRONICLES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DRAGONFORCE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DRAMA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DRAWN AND QUARTERLY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DREADSTAR ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DREADSTAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DREAM ANGEL THE QUANTUM DREAMER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DREAM ANGEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DREAM QUEST OF UNKNOWN KADATH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DREAM WOLVES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DREAMING CITY TALES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DREAMING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DREAMS OF DAWN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DREAMWALKER CAROUSEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DRYWALL OSWALD SHOW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DRYWALL UNZIPPED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DUCK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DUCKMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DUNGEONERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "DV8");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EARTH X");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EATERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ECLIPSE MONTHLY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EIGHTBALL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EIGHTH BEAST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ELEGANT LADIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ELEKTRA CYBLADE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ELEKTRA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ELEMENTALS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ELEVEN ELEVEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ELEVEN OR ONE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ELFQUEST HIDDEN YEARS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ELRIC THE VANISHING TOWER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ELRIC");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ELSEWORLD'S FINEST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ELVIRA'S HOUSE OF MYSTERY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EMBRACE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EMPEROR JOKER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EMPIRE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ENEMY ACE WAR IN HEAVEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ENIGMA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ERADICATORS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EROTIC PHOTO SHOOT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ESPERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ESTABLISHMENT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ETC");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ETERNAL WARRIOR YEARBOOK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ETERNAL WARRIOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ETERNAL WARRIORS DIGITAL ALCHEMY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ETERNAL WARRIORS TIME AND TREACHERY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EVANGELINE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EVEN HITLER HAD A GIRLFRIEND");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EVIL ERNIE REVENGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EVIL ERNIE STRAIGHT TO HELL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EXCALIBUR MOJO MAYHEM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EXCALIBUR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EXILES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EX-MUTANTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EXOTICA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EXQUISITE CORPSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "EXTREMISTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FABLES THE LAST CASTLE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FABLES WINTER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FABLES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FALLEN ANGELS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FANBOY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FANG TESTAMENT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FANG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FANTASTIC FOUR 1234");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FANTASTIC FOUR ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FANTASTIC FOUR UNLIMITED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FANTASTIC FOUR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FAST FORWARD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FAT NINJA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FATE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FATHOM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FAULTLINES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FAUNA REBELLION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FAUST 777 THE WRATH FEARBOOK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FAUST 777 THE WRATH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FAUST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FEEDERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FEEDIN' TIME");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FELON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FEMME MACABRE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FIGHTING AMERICAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FILLERBUNNY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FILTH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FINAL MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FINAL NIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FINDER FOOTNOTES WITH ISSUES 1-3");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FINDER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FIRE SALE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FIRESTAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FIRST TIMES BLUSHING BABES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FIRST TIMES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FISH POLICE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FIVE YEARS OF PAIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FLAMING CARROT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FLAMINGO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FLASH 80-PAGE GIANT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FLASH GORDON POSTCARD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FLASH GORDON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FLASH PLUS NIGHTWING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FLASH TV SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FLASH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FLINCH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FLIPPED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FLOWERS ON THE RAZORWIRE SPECIAL BIBLICAL ISSUE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FLOWERS ON THE RAZORWIRE SPECIAL HOLIDAY ISSUE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FLOWERS ON THE RAZORWIRE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FLY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FMF WEEKLY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FMF");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FOOM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FORBIDDEN ANGEL PHOTO SHOOT #1");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FORBIDDEN SEX TALES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FORBIDDEN SUBJECTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FORBIDDEN VAMPIRE TALES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FORBIDDEN WORLDS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FOREVER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FOUR KUNOICHI");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FREAKS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FREE SPEECHES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FREELIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FREEX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FROM BEYOND THE UNKNOWN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FROM HELL EPILOGUE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FROM HELL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FROM THE DARKNESS BLOOD VIALS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FROM THE DARKNESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FUNNYTIME FEATURES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FURY OF FIRESTORM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FUTURE COP LAPD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "FUTURE COURSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "G.I. JOE IN 3D");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "G.I.JOE CONVENTION SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "G.I.JOE MIA  ISSUES 1-2");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "G.I.JOE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "G.O.T.H.");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GALAXION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GAMEBOY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GANGBANG GIRLS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GANGLAND");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GASP!");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GATES OF EDEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GEEK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GEEKSVILLE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GEN 13");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GEN13 AND GENERATION X");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GEN13 AND THE MAXX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GEN13 ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GEN13 BIKINI PINUP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GEN13");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GENERATION X");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GENESIS PRIME");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GENESIS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GHOST RIDER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GHOST SHIP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GHOST SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GHOST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GHOST/BATGIRL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GHOSTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GIFT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GILGAMESH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GIRL STORIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GIRL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GIRLTALK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GIVE ME LIBERTY  AN AMERICAN DREAM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GIZMO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GLIMMER RATS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GOBBLEDYGOOK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GOBLIN LORD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GODDESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GODS AND TULIPS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GODZILLA KING OF THE MONSTERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GOING GOING...GON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GOLDEN AGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GON ON SAFARI");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GON SWIMMIN'");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GON UNDERGROUND");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GOOD GIRLS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GOTHAM NIGHTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GOTHIC NIGHTS`");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GRAFFITI KITCHEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GRAVEDIGGERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GRAVITY SUCKS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GREEN ARROW THE LONGBOW HUNTERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GREEN ARROW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GREEN GOBLIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GREEN LANTERN AND SENTINEL HEART OF DARKNESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GREEN LANTERN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GREEN LANTERN EMERALD DAWN II");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GREEN LANTERN EMERALD DAWN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GREEN LANTERN GANTHET'S TALE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GREEN LANTERN PLUS THE RAY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GREEN LANTERN SILVER SURFER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GREEN LANTERN SUPERMAN LEGEND OF THE GREEN FLAME");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GREEN LANTERN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GREENER PASTURES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GREEN-GREY SPONGE-SUIT SUSHI TURTLES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GRENDEL  DEVIL CHILD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GRENDEL  WAR CHILD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GRENDEL TALES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GRENDEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GRIFFIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GRIM JACK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GROO  DEATH AND TAXES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GROO  MIGHTIER THAN THE SWORD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GROO & RUFFERTO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GROO THE WANDERER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GROO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GROSS POINT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GUFF!");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GUMBY'S SUMMER FUN SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GUMBY'S WINTER FUN SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GUNFIRE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GUY GARDNER REBORN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GUY GARDNER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "GYRE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HALL OF HEROES HALLOWEEN HORROR SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HALL OF HORRORS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HALLS OF HORROR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HAMMER OF THE GODS COLOR SAGA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HAMMER OF THE GODS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HANGED MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HAPPYDALE DEVILS IN THE DESERT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HARBINGER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HARD BOILED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HARD CORPS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HARD LOOKS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HARDCORE DARD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HARDCORE STATION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HARLAN ELLISON'S DREAM CORRIDOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HARLEY AND IVY LOVE ON THE LAM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HARLEY QUINN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HARPY PRIZE OF THE OVERLORD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HATE JAMBOREE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HATE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HAUNTED LOVE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HAWKMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HEARTLAND");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HELL BLAZER ANNUAL 1");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HELL BLAZER BOOKS OF MAGIC");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HELL BLAZER SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HELL ETERNAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HELLBLAZER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HELLBOY  AUTOPSY IN B-FLAT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HELLRAISER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HELLSHOCK ASHCAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HELLSHOCK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HELLSPAWN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HELTER SKELTER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HEPCATS SAN DIEGO 1996 ASHCAN EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HEPCATS THE SPECIAL EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HEPCATS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HERETIC");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HERO ON A STICK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HEROBEAR AND THE KID DECOY FIELD TRIP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HEROBEAR AND THE KID MODEL SHEET EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HEROBEAR AND THE KID SPECIAL EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HEROBEAR AND THE KID");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HEROES FOR HIRE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HEROES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HEY. MISTER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HIEROGLYPH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HIGH ROADS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HILLY ROSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HISTORY OF THE UNIVERSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HITMAN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HITMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HOMICIDE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HONEST THIEF");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HOOD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HOOKY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HORROR IN THE DARK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HORRORIST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HOT TAILS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HOT YOUNG SLUTS WILD IN THE STREETS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HOUSE OF SECRETS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HOW TO PICK UP GIRLS IF YOU'RE A COMIC BOOK GEEK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HUDREDS OF FEET BELOW DAYLIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HULK SMASH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HUMAN REMAINS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HUNTRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HUP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HUSTLER COMIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "HYPER VIOLENTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "I AM PAULS DOG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "I BEFOR E");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "I FEEL SICK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "I HAD A DREAM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "I LOVE N.Y.");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "I SAW IT THE ATOMIC BOMBING OF HIROSHIMA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "I");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "I.B.4");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ICON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "IMAGINE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "IMPOSSIBLE MAN SUMMER VACATION SPECTACULAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "IMPULSE ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "IMPULSE PLUS GROSS-OUT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "IMPULSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "IN THE ZONE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "INCREDIBLE HULK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "INDEPENDANT VOICES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "INDEPENDENT VOICES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "INDIANA JONES AND THE FATE OF ATLANTIS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "INFERNO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "INFINITY INC.");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "INNOCENT BYSTANDERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "INSIDER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "INSTANT PIANO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "INTO SHAMBALLA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "INTRODUCING THE TICK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "INVADERS FROM HOME");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "INVADERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "INVISIBLES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "IRON MAN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "IRON MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "IT'S SCIENCE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JACK THE RIPPER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JAGUAR GOD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JAGUAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JAM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JAR OF FOOLS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JAY AND SILENT BOB");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JENNA JAMESON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JENNY SPARKS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JESTER CROW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JESTER MOON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JLA AVENGERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JLA PARADISE LOST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JLA SECRET FILES AND ORIGINS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JLA WORLD WITHOUT GROWNUPS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JLA YEAR ONE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JLA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JLX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JOE PSYCHO AND MOO FROG FANATICS EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JOE PSYCHO AND MOO FROG FULL COLOR EXTRAVAGARBONZO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JOE PSYCHO AND MOO FROG HALLOWEENIE SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JOE PSYCHO AND MOO FROG SAN DIEGO SPECIAL EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JOE PSYCHO AND MOO FROG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JOHN CARTER OF MARS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JOHNNY THE HOMICIDAL MANIAC");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JOKER MASK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JOKER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JOKER: LAST LAUGH SECRET FILES AND ORIGINS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JOKER: LAST LAUGH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JONAH HEX TWO-GUN MOJO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUDGE ANDERSON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUDGE DREDD LEGENDS OF THE LAW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUDGE DREDD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUDGE DREDD'S CRIME FILE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUDGMENT DAY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUGHEAD'S BRAND NEW JOKES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUNGLE JIM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUNGLE TALES OF CAVEWOMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUPITER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JURASSIC PARK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUST A PILGRIM GARDEN OF EDEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUST A PILGRIM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUSTICE LEAGUE AMERICA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUSTICE LEAGUE ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUSTICE LEAGUE EUROPE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUSTICE LEAGUE INTERNATIONAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUSTICE LEAGUE MIDSUMMER'S NIGHTMARE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUSTICE LEAGUE OF AMERICA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUSTICE LEAGUE QUARTERLY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUSTICE LEAGUE TASKFORCE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUSTICE LEAGUE THE NAIL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUSTICE LEAGUE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUSTICE RIDERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "JUSTY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KABUKI CIRCLE OF BLOOD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KABUKI COLOR SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KABUKI FAN EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KABUKI");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KAFKA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KAMANDI");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KANE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KEIF LLAMA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KENTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KID ETERNITY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KILL ME SLOWLY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KILLER TALES BY TIMOTHY TRUMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KILROY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KING CONAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KINGDOM COME");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KINGDOM KID FLASH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KINGDOM NIGHT STAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KINGDOM OF THE DWARFS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KINGDOM OFFSPRING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KINGDOM PLANET KRYPTON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KINGDOM SON OF THE BAT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KINGDOM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KISS AND TELL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KLAUS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KNEWTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KNIGHTS OF THE DINNER TABLE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KNIGHTS ON BROADWAY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "KONG THE UNTAMED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "L.E.G.I.O.N. ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "L.E.G.I.O.N.");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LA COSA NOSTROID");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LAB RATS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LADIES OF LONDON NIGHT FALL SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LADY DEATH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LADY RAWHIDE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LADY SUPREME");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LANDER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LAST AMERICAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LAST DAYS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LAST FOREST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LAST OF THE VIKING HEROES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LAST ONE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LAZARUS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LEAGUE OF EXTRAORDINARY GENTLEMEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LEAVE IT TO CHANCE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LEGACY OF SUPERMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LEGENDS OF THE DARK CLAW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LEGENDS OF THE DC UNIVERSE CRISIS ON INFINITE EARTHS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LEGENDS OF THE DC UNIVERSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LEGENDS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LEGION OF SUPERHEROES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LENORE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LEONARDO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LETHAL FOES OF SPIDERMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LETHARGIC LAD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LIBERTY MEADOWS WEDDING ALBUM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LIBERTY MEADOWS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LIBRALMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LIFE IS CHEAP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LIFE OF A FETUS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LITA FORD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LITTLE JIM-BOB BIGFOOT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LLOYD LLEWELLYN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO A CONTRACT ON GAWD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO CONVENTION SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO DEADMAN THE BRAVE AND THE BALD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO DEMON HALLOWEEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO DEMON HELLOWEEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO GOES TO HOLLYWOOD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO IN THE CHAIR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO INFANTICIDE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO JUDGE DREDD PSYCHO BIKERS VS THE MUTANT FROM HELL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO PARAMILITARY CHRISTMAS SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO PORTRAIT OF A VICTIM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO THE DUCK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO UNAMERICAN GLADIATORS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO UNBOUND");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO'S BACK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO'S BIG BABE SPRING BREAK SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOBO'S BLAZING CHAIN OF LOVE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOGAN FAITH OF THE WARLORD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOGAN SHADOW SOCIETY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LONE WOLF 2100");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LONE WOLF AND CUB");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOST GIRLS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOST IN SPACE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOST STORIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOST VALLEY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOUDER THAN WORDS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOUIS RIEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOVE AND ROCKETS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOVE SUCKS COLOR SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LOVE SUCKS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LUCIFER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LUM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LUNATIK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "LUX & ALBY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "M");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MADMAN ADVENTURES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MADMAN COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MAELSTROM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MAGE THE HERO DEFINED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MAGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MAGNESIUM ARC");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MAGNUS ROBERT FIGHTER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MAI THE PSYCHIC GIRL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MAJOR BUMMER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MALIBU SUN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MAN-BAT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MANDRAKE THE MAGICIAN POSTCARD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MAN-EATING COW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MANTRA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARA CELTIC SHAMANESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARA OF THE CELTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARA PAPER DOLL FULL COLOR ALLSTAR BENEFIT BOOK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARC SPECTOR: MOON KNIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARILYN MONROE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARK OF THE DOG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARRIED WITH CHILDREN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARSHAL LAW  SECRET TRIBUNAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARSHAL LAW TAKES MANHATTAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARSHAL LAW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARTHA WASHINGTON GOES TO WAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARTHA WASHINGTON SAVES THE WORLD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARTHA WASHINGTON STRANDED IN SPACE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARTIAN MANHUNTER ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARTIAN MANHUNTER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARVEL 1991 -- THE YEAR IN REVIEW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARVEL ACTION UNIVERSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARVEL AGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARVEL COMICS PRESENTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARVEL FANFARE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARVEL MASTERPIECES COLLECTION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARVEL MILESTONE EDITION: FANTASTIC FOUR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARVEL PREMIERE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARVEL PRESENTS: GUARDIANS OF THE GALAXY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARVEL SAGA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARVEL SUPER HEROES SECRET WARS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARVEL SUPER HEROES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARVEL TEAM-UP ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARVEL TEAM-UP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARVEL TWO-IN-ONE ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARVEL TWO-IN-ONE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MARYLIN STAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MASK & MARSHAL LAW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MASK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MASKS OF NOH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MASKS OF THE NOH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MASQUES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MASTER OF KUNG FU");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MATRIX: COMIC BOOK PREVIEW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MAXIMORTAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MAXX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MEAT CAKE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MEDAL OF HONOR SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MEDAL OF HONOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MEDIEVAL SPAWN WITCHBLADE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MEGATRON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MELODY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MEN OF WAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MEN'A ADVENTURE COMIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MEPHISTO VS. THE AVENGERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MEPHISTO VS. THE FANTASTIC FOUR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MEPHISTO VS. THE X-FACTOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MEPHISTO VS. THE X-MEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MERCEDES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MERCY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "METAL MEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "METALLICA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "METAMORPHO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "METEOR MAN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "METEOR MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MICHAELANGELO CHRISTMAS SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MICHAELANGELO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MICRONAUTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MIGHTY CRUSADERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MIGHTY GUY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MIGHTY MORPHING RUMP RANGERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MILK AND CHEES LATEST THING!");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MILK!");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MINIMUM WAGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MINISTRY OF SPACE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MINX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MIRACLE FAMILY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MIRACLEMAN 3D");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MIRACLEMAN APOCRYPHA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MIRACLEMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MIRRORWORLD RAIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MISERY SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MISSING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MISTER BLANK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MISTER X");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MOBFIRE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MOMENT OF FREEDOM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MONARCHY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MONICA'S STORY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MONKEYMAN AND O'BRIEN SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MONKEYMAN AND O'BRIEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MONSTER MASSACRE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MOON KNIGHT HIGH STRANGERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MOON KNIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MOONSHADOW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MORE THAN MORTAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MORGANA X SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MORLOCKS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MORRIGAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MOTORSTRIKE PUPPIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MR HERO THE NEWMATIC MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MR. MONSTER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MR. MXYZPTLK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MRS TREE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MS TREE'S THRILLING DETECTIVE ADVENTURES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MS. TREE 3-D");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MS. TREE QUARTERLY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MUMMY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MURDER CAN BE FUN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MURDER ME DEAD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MUSINGS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MUTIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MY LIFE WITH EDDIE VEDDER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MYSTERIOUS SUSPENSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MYSTERY MEN STORIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MYTH ADVENTURES ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MYTH ADVENTURES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MYTH CONCEPTIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MYTHOGRAPHY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MYTHOLOGY'S MISTRESSES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "MYTHOS THE FINAL TOUR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NAIVE INTER-DIMENSIONAL COMMANDO LOALAS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NAM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NATION OF SNITCHES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NAUGHTY BITS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NECROMANCER DELUXE EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NECROMANCER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NEGATIVE BURN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NEMESIS THE WARLOCKS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NEVADA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NEW ADVENTURES OF SUPERBOY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NEW BONDAGE FAIRIES FAIRY FETISH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NEW MUTANTS ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NEW MUTANTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NEWSTIME");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NEXT MEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NEXUS ALIEN JUSTICE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NFL SUPERPRO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NIGHT FORCE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NIGHT THRASHER FOUR CONTROL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NIGHTCRY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NIGHTMARES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NIGHT'S CHILDREN LIAISON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NIGHT'S CHILDREN ORIGINS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NIGHT'S CHILDREN THE VAMPIRE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NIGHTSHADES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NIGHTVISION ALL ABOUT EVE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NIGHTWING ALFRED'S RETURN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NIGHTWING EIGHTY PAGE GIANT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NIGHTWING HUNTRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NIGHTWING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NIMROD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NINE VOLT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NINJA HIGH SCHOOL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NINTH GLAND");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NO JUSTICE NO PIECE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NO SUCH THING AS MONSTERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NOBLESSE OBLIGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NOMAD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NORMALMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NOSFERATU");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "NO-WAX KILLING FLOOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ODDJOB");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "OFFERINGS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "OH MY GOTH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "OINK HEAVEN'S BUTCHER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "OMAHA THE CAT DANCER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "OMEGA MEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ON A PALE HORSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ONE LIFE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ONE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ONI DOUBLE FEATURE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "OPTIC NERVE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ORIGIN OF THE DEFIANT UNIVERSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ORIGIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ORIGINS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "OTTO SPACE!");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "OUT THERE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "OUTLAW NATION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "OUTLAWS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "OUTRAGIOUS TALES FROM THE OLD TESTAMENT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "OUTSIDERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "OZ");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PACIFIC PRESENTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PAINKILLER JANE VS THE DARKNESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PAINKILLER JANE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PALEO TALES OF THE LATE CRETACEOUS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PALOOKAVILLE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PANDORA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PAPER AND BINDING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PARADAX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PARADOX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PARALLAX EMERALD KNIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PATHWAYS TO FANTASY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PATRICK GAGNE'S NIRGENDWO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PAUL THE SAMURAI BONANZAI");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PAUL THE SAMURAI");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PEEP SHOW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PENGUIN BROTHERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PENGUIN TRIUMPHANT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PENTHOUSE COMIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PENTHOUSE MEN'S ADVENTURE COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PERG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PERVERT CLUB");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PETE THE P.O.'D POSTAL WORKER PETE'S VERY SPECIAL CHRISTMAS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PETE THE P.O.'D POSTAL WORKER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PETER PARKER SPIDERMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PETREFAX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PHANTOM STRANGER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PHOEBE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PICK-UP TRUCK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PINHEAD VS MARSHAL LAW HELL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PINK DUST MORPHINE DREAMS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PITT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PIZZA MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PLANET OF THE APES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PLANETARY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PLANETARY/AUTHORITY RULING THE WORLD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PLASTIC FORKS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "POE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "POISON ELVES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "POOT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "POP CULTURE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "POP GUN WAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PORTFOLIOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PORTRAIT OFA YOUNG CARTOONIST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "POSSESSED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "POSTMODERN ANGST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "POTENTIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "POWER OF SHAZAM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "POWERMAN AND IRONFIST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "POWERS THAT BE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "POWERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PRACTICE IN PAIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PREACHER CASSIDY: BLOOD AND WHISKEY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PREACHER ONE MAN'S WAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PREACHER TALL IN THE SADDLE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PREACHER THE GOOD OLD BOYS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PREACHER THE STORY OF YOU-KNOW-WHO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PREACHER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PREDATOR COLD WAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PREDATOR RACE WAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PREDATOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PRE-TEEN DIRTY-GENE KUNG-FU KANGAROOS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PREZ SMELLS LIKE TEEN PRESIDENT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PREZ");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PRIDE & JOY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PRIMER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PRISONER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PRISONOPOLIS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PRO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PROGRESSING BACKWARDS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PROMETHEA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PROMETHEUS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PROTECTORS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PTERANO-MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PULP MANGA FOR GROWNUPS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PUMPKINHEAD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PUNISHER BATMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PUNISHER HOLIDAY SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PUNISHER P.O.V.");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PUNISHER THE ORIGIN OF MICROCHIP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PUNISHER WAR ZONE ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PUNISHER WAR ZONE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "PUNISHER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "QUACK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "QUANTUM AND WOODY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "QUEENS OF HALLOWEEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "QUESTION ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "QUESTION QUARTERLY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "QUESTION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "R.E.B.E.L.S.");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RABID MONKEY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RADICAL DREAMER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RAGMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RAI");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RAMPAGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RAMPAGING HULK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RARE BIT FRIENDS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RARE CREATURE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RASCALS IN PARADISE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RAT BASTARD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RAW MEDIA ILLUSTRATED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RAW MEDIA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RAY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RAZOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "REAL WAR STORIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RED DIARIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RED FLANNEL SQUIRREL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RED MOON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RED STAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "REDFOX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "REID FLEMING WORLD'S TOUGHEST MILKMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "REN & STIMPY SHOW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "REPLACEMENT GOD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RESURRECTION MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RETURN OF HAPPY THE CLOWN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RETURN TO THE EVE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "REVELATIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "REVENGE OF THE FILLERBUNNY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "REVEREND ABLACK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RIB");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RIMA THE JUNGLE GIRL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RING OF ROSES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RING OF THE NIBELUNG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RISING STARS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROACHMILL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROAD TRIP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROBIN 3000");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROBIN AND ARGENT DOUBLE-SHOT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROBIN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROBIN EIGHTY PAGE GIANT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROBIN HOOD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROBIN II THE JOKER'S WILD!");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROBIN III");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROBIN PLUS FANG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROBIN PLUS IMPULSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROBIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROBOCOP VERSUS TERMINATOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROCKETEER MOVIE ADAPTATION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROCKETEER SPECIAL EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROCKETEER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROGUES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROMANTIC TAILS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RONIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROSE AND GUNN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROTTWEILER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ROUGH RAIDERS YEARBOOK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RUINS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RUNE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "RUST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SACHS & VIOLENS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SADE ENCORE EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SADE SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SADE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SAFE COMIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SAFETYBELT MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SAGA OF THE REALM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SAINT GERMAINE RESTORATION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SAINT GERMAINE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SAINT OF KILLERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SALAMANDROID");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SALLY FORTH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SAM AND TWITCH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SAMURAI CAT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SAMURAI JACK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SAMURAI PENGUIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SAMURAI SQUIRREL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SAMURAI");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SAMUREE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SANCTUARY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SANDMAN MIDNIGHT THEATER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SANDMAN MYSTERY THEATER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SANDMAN ORPHEUS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SANDMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SANDWALK ADVENTURES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SATANIKA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SATURDAY NITE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SAVAGE DRAGON MARSHAL LAW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SAVAGE DRAGON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SAVIOUR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SCARAB");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SCARE TACTICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SCARECROW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SCARLET SPIDER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SCARS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SCARY GODMOTHER AND FRIENDS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SCATTERBRAIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SCORCHED EARTH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SCUD THE DISPOSABLE ASSASSIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SEADRAGON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SEBASTIAN O");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SECRET FILES VS. VAMPIRE GIRLS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SECRET ORIGINS SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SECRET ORIGINS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SECRET WARS II");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SECRETS OF SISTERS ALL DOLLEDUP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SEDUCTION OF FAIR CHILDE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SEEKERS INTO THE MYSTERY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SENSATIONAL SHE-HULK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SENSATIONAL SPIDERMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SERINA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SEX AND VIOLENCE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHADE THE CHANGING MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHADE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHADES OF GRAY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHADOW HAWK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHADOW SHADOWS OF LIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHADOW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHADOWMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHADOWWALKER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHAIANA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHAMAN'S TEARS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHAQUILLE O'NEAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHAZAM POWER OF HOPE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHEBA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHEENA QUEEN OF THE JUNGLE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHE-HULK CEREMONY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHERLOCK HOLMES READER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHI DAREDEVIL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHI");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHIT THE DOG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHOWCASE 93");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHOWCASE 94");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SHUT UP AND DIE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SILLY DADDY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SILVER SABLE & THE WILD PACK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SILVER SURFER WEAPON ZERO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SILVER SURFER WITCHBLADE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SILVER SURFER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SIMPSONS COMICS & STORIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SIN CITY A DAME TO KILL FO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SIN CITY HELL AND BACK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SIN CITY JUST ANOTHER SATURDAY NIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SIN CITY LOST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SIN CITY SILENT NIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SIN CITY THE BABE WORE RED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SINS OF YOUTH BATBOY AND ROBIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SIRIUS SUMMER READING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SISTER VANESSA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SIX FROM SIRIUS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SKELETON KEY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SKETCHBOOK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SKROG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SKRULL KILL KREW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SKUNK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SKY BETWEEN BRANCHES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SLACKER COMICS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SLAINE THE HORNED GOD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SLAVE LABOR STORIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SLOW DEATH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SMALL PRESS EXPO '97");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SMALL PRESS EXPO '98");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SMALL PRESS EXPO '99");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SMAX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SMITH BROWN JONES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SNOW GLASS APPLES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SNOWMAN 1944");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SOCK MONKEY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SOF' BOY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SOLAR MAN OF THE ATOM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SOLITAIRE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SOLSTICE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SOMETHING INSIDE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SONG OF THE SIRENS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SOUL SEARCHERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SOULWIND");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SOVEREIGN SEVEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPACE BEAVER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPACE FAMILY ROBINSON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPACE USAGI");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPANK THE MONKEY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPANK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPAWN AND BATMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPAWN BLOOD AND SALVATION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPAWN BLOODFEUD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPAWN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPECTACLES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPECTACULAR SCARLET SPIDER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPECTACULAR SPIDERMAN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPECTACULAR SPIDERMAN SUPER SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPECTACULAR SPIDERMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPECTRE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPEED DEMON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPEED FORCE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDER-BOY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN & HIS AMAZING FRIENDS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN 2099");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN CHAPTER ONE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN DAREDEVIL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN DR. OCTOPUS NEGATIVE EXPOSURE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN GET KRAVEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN MAXIMUM CLONAGE ALPHA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN MAXIMUM CLONAGE OMEGA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN QUALITY OF LIFE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN TEAM-UP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN THE LOST YEARS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN UNLIMITED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN VS. WOLVERINE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN: BLUE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN: THE OSBORN JOURNAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN: WEB OF DOOM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIDERMAN'S TANGLED WEB");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIN WORLD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIRAL PATH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIRIT OF THE TAO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIRIT THE NEW ADVENTURES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPIRITS OF VENGEANCE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPLATTER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPUNKY KNIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPY BOY SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPY BOY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SPYBOY YOUNG JUSTICE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SQUEE!");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ST GEORGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ST SWITHIN' SDAY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STALKERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR CHILD CROSSROADS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR CHILD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR REACH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR TREK DEEP SPACE NINE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR TREK MOVIE SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR TREK SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR TREK THE NEXT GENERATION ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR TREK THE NEXT GENERATION PERCHANCE TO DREAM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR TREK THE NEXT GENERATION SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR TREK THE NEXT GENERATION THE BROKEN MOON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR TREK THE NEXT GENERATION THE KILLING SHADOWS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR TREK THE NEXT GENERATION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR TREK VOYAGER PLANET KILLER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR TREK VOYGER AVALON RISING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR TREK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR WARS DARK EMPIRE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR WARS TAG AND BINK ARE DEAD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR WARS TALES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR WARS THE AURORIENT EXPRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STAR WARS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STARDUST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STARKFUTURE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STARMAN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STARMAN THE MIST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STARMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STARSLAYER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STARSTRUCK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STEEL ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STEEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STIFF");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STITCH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STORMBRINGER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STORMWATCH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRANGE ADVENTURES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRANGE ATTRACTORS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRANGE DAYS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRANGE HAVEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRANGE KISS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRANGE SUSPENSE STORIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRANGE TALES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRANGE WINK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRANGELOVE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRANGER THAN FICTION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRANGERS IN PARADISE MOLLY & POO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRANGERS IN PARADISE SOURCE BOOK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRANGERS IN PARADISE WIZARD ACE EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRANGERS IN PARADISE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRAY BULLETS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRAY CATS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRAY TOASTERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRIKE FORCE MORITURI");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "STRIPPERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUB-MARINER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUDDEN GRAVITY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUNGLASSES AFTER DARK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPER FRIENDS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPER POWERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPER SOLDIER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERBOY ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERBOY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERFLY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERGIRL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERHEROES BATTLE SUPER GORILLAS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN 3D");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN ALIENS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN AND BATMAN GENERATIONS AN IMAGINARY TALE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN AT FIFTY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN BATMAN WORLD'S FINEST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN FOR ALL SEASONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN FOR EARTH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN FOREVER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN GALLERY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN KAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN KING OF THE WORLD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN MADMAN HULLABALOO!");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN PEACE ON EARTH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN PRESENTS THE KRYPTON CHRONICLES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN SPEEDING BULLETS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN TARZAN SONS OF THE JUNGLE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN THE 10 CENT ADVENTURE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN THE EARTH STEALERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN THE MAN OF STEEL ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN THE MAN OF STEEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN THE WEDDING ALBUM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN UNDER A YELLOW SUN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN WONDER WOMAN WHOM GODS DESTROY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPERMODELS IN THE RAINFOREST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPREME POWER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUPREME");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SURVIVOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUSPIRA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUSSEX VAMPIRE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SUTTLE VIOLENTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SWAMP THING ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SWAMP THING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SWEET LIL' CHEEKS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SWEET");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SWEETMEATS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SWING WITH SCOOTER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SWORDS OF CEREBUS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "SYRENNIEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TABOO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TAINTED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TALE OF ONE BAD RAT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TALES FROM THE BOG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TALES FROM THE EDGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TALES OF DARKNESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TALES OF THE BEANWORLD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TALES OF THE DEAD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TALES OF THE GREEN LANTERN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TALES OF THE TEEN TITANS ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TALES OF THE TEEN TITANS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TALES OF WITCHBLADE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TALES TO ASTONISH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TANKGIRL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TAOLAND");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TAPESTRY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TATTERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TEAM AMERICA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TEAM TITANS ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TEAM TITANS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TEARS OF DAWN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TEEN TITANS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TEENAGE MUTANT NINJA TURTLES SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TEENAGE MUTANT NINJA TURTLES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TEMPUS FUGITIVE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TENTH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TERMINAL CITY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TERMINAL DRIFT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TERMINATOR ONE SHOT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TERMINATOR SECONDARY OBJECTIVES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TERMINATOR THE BURNING EARTH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TERMINATOR THE ENEMY WITHIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TERROR OF GODZILLA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THANOS QUEST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE ARMAGEDDON FACTOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE ARSENIC LULLABIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE ASTONISHING MOTH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE BALLAD OF UTOPIA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE BOOK OF ANTS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE CHOKE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE CLOCK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE COLONIA BARGAIN BAG OF BOOTY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE DARK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE DONNELLY TRAGEDY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE FALL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE GIRLIE SHOW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE LAB");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE LEAGUE OF RATS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE LEMON KIDS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE LOST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE MAN OF RUST THE RETOLD STORY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE MARCH HARE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE NATURAL SELECTION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE PATH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE PUMA BLUES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE REALM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE REVIVAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THE RIPPER LEGACY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THIEVES AND KINGS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THOR ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THOR CORPSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THOR GODSTORM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THOR THE ROCK WARRIOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THOR VIKINGS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THORR-SVERD THE SWORD OF THOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THOSE ANNOYING POST BROTHERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THREE STOOGES 3D");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THRESHOLD NICO TEEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THRESHOLD THE STAMP COLLECTOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THRESHOLD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THUNDER BUNNY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THUNDERCATS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "THURN AND TAXIS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK & ARTIE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK A WORLD OF PAIN(T)");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK AND ARTHUR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK BIG BACK TO SCHOOL SPECIAL 1999");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK BIG BLUE DESTINY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK BIG CRUISE SHIP VACATION SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK BIG FATHERS DAY SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK BIG MOTHER'S DAY SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK BIG RED-N-GREEN CHRISTMAS SPECTACLE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK BIG ROMANTIC ADVENTURE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK BIG SUMMER ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK BIG SUMMER FUN SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK BIG TAX TIME TERROR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK BIG YEAR 2000 SPECTACLE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK BIG YULE LOG SPECIAL 2000");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK BIG YULE LOG SPECIAL 2001");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK BIG YULE LOG SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK CIRCUS MAXIMUS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK COLOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK HALLOWEEN SPECIAL 2000");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK HALLOWEEN SPECIAL 2001");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK HALLOWEEN SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK HEROES OF THE CITY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK INCREDIBLE INTERNET COMIC");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK KARMA TORNADO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK LUNY BIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK MASSIVE SUMMER DOUBLE SPECTACLE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK RAW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK SPECIAL EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICKLISH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK'S BACK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TICK-TOCK FOLLIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TIGRESS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TIMESPELL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TITLE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TITS AND CLITS PRODUCTIONS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TMNT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TOKA JUNGLE KING");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TOM STRONG");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TOM STRONG'S TERRIFIC TALES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TOMB OF DRACULA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TOMBRAIDER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TOMMY GUNN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TOMOE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TOMORROW'S STORIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TONGUE LASH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TOO MUCH COFFEE MAN'S COLOR SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TOOL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TOP 10");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TOTAL ECLIPSE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TOUCH OF SILVER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TOXIC AVENGER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TRANSFORMERS ARMADA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TRANSFORMERS THE WAR WITHIN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TRANSFORMERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TRANSMETROPOLITAN FILTH OF THE CITY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TRANSMETROPOLITAN I HATE IT HERE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TRANSMETROPOLITAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TRIBE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TRIDENT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TRIPLE-X-CINEMA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TROMEO AND JULIET");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TROUBLE WITH GIRLS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TROUBLEMAKERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TROUT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TROY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TRUE CRIME");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TRUE NORTH (CBLDF)");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TRUE NORTH II (CBLDF)");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TRUE SWAMP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TRUTH SERUM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TUG & BUSTER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TUG AND BUSTER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TURTLE SOUP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TWILIGHT MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TWILIGHT ZONE PREMIERE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TWILIGHT ZONE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TWISTED TALES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TWITCH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "TYRANT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "U.S. WAR MACHINE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ULTIMATE MARVEL TEAM-UP");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ULTIMATE SIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ULTIMATE SPIDERMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ULTIMATE WAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ULTIMATE XMEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ULTRA KLUTZ");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ULTRAFORCE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "UNCANNY X-MEN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "UNCANNY X-MEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "UNCLE SCROOGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "UNDERWATER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "UNDERWORLD UNLEASHED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "UNDRESSED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "UNITY 2000 PREVIEW BOOK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "UNITY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "UNKNOWN QUANTITIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "UNKNOWN SOLDIER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "UNTOLD TALES OF SPIDERMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "UNTOUCHABLES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "USAGI YOJIMBO COLOR SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "USAGI YOJIMBO GREEN PERSIMMON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "USAGI YOJIMBO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "V FOR VENDETTA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VALOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VAMPFIRE EROTIC ECHO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VAMPIRE GIRLS EROTIQUE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VAMPIRE GIRLS POETS OF BLOOD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VAMPIRE GIRLS VS. ANGEL GIRL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VAMPIRE GIRLS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VAMPIRELLA COMMEMORATIVE EDITION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VAMPIRELLA DEATH AND DESTRUCTION");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VAMPIRELLA DRACULA SHOWCASE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VAMPIRELLA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VAMPIRES LUST THE 1998 CALENDAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VAMPS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VENGEANCE OF THE AZTECS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VENGEANCE OF VAMPIRELLA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VENOM LETHAL PROTECTOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VEROTIKA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VERTIGO JAM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VERTIGO SECRET FILES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VERTIGO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VICTIMS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VIGILANTE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VILLIAN AND HERO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VIOLATOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VIOLENT MESSIAHS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VISIONS OF ANGEL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VOLTRON");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VOODO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VOODOO ZEALOT SKIN TRADE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "VORTEX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WAHOO MORRIS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WAITING PLACE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WALKIE TALKIE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WALT DISNEY'S COMICS AND STORIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WANDERING STAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WANTED THE WORLD'S MOST DANGEROUS VILLAINS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WAR OF THE GODS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WAR STORY D-DAY DODGERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WAR STORY JOHANN'S TIGER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WAR STORY NIGHTINGALE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WARLOCK 5");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WARLOCK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WARLORD ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WARLORD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WATCH ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WATCHMEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WAY OF THE RAT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WEASELGUY WITCHBLADE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WEB OF SCARLET SPIDER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WEB OF SPIDERMAN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WEB OF SPIDERMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WEBWITCH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WEDDING OF POPEYE AD OLIVE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WEIRD WAR TALES SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WEIRD WAR TALES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WEIRD");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WEIRDSVILLE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WEST COAST AVENGERS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WETWORKS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WHAT IF");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WHATS MICHAEL? MICHAEL'S ALBUM");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WHATS MICHAEL? OFF THE DEEP END");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WHITEOUT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WHO KILLED JFK?");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WHOA NELLIE!");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WHO'S WHO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WIINDOWS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WILD ONES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WILD WILD WEST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WILDC.A.T.S TRILOGY");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WILDC.A.T.S");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WILDSTAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WILLOW SKETCHBOOK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WILLOW");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WIMMEN'S COMIX");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WINTER'S EDGE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WITCHBLADE ELEKTRA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WITCHBLADE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WITCHCRAFT LA TERREUR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WITCHCRAFT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WITCHING HOUR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WITZEND");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WOLDS FINEST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WOLVERINE HULK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WOLVERINE WITHBLADE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WOLVERINE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }

    }

    private void AddTitles2() {
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WONDER MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WONDER WOMAN ANNUAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WONDER WOMAN SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WONDER WOMAN SPIRIT OF TRUTH");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WONDER WOMAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WONDER YEARS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WONDERS AND ODDITIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WORLD WITHOUT END");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WORLD'S FINEST THREE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "WORLD'S FINEST");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "X");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "XANADU");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "XENYA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "X-FACTOR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "X-FILES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "X-FORCE ITGIRL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "X-FORCE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "X-MEN ADVENTURES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "X-MEN AND ALPHA FLIGHT");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "X-MEN THE MOVIE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "XMEN UNLIMITED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "X-MEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "X-O MANOWAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "X-PATROL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "Y THE LAST MAN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "Y2K");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "YOUNG CYNICS CLUB");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "YOUNG GIRL ON GIRL SWEET MEMORIES");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "YOUNG GIRL ON GIRL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "YOUNG HEROES IN LOVE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "YOUNG JUSTICE OUR WORLDS AT WAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "YOUNG JUSTICE SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "YOUNG JUSTICE");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "YOUNG ZEN");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "YOUNGBLOOD AWESOME HOLIDAY SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "YOUNGBLOOD LIMITED EDITION COLLECTORS PACK");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "YUGGOTH CULTURES AND OTHER GROWTHS");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ZATANNA SPECIAL");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ZATANNA");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ZELL SWORDANCER");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ZERO HOUR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ZOMBIE WAR");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ZOOM'S ACADEMY FOR THE SUPER GIFTED");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }
        try {
            Thread.sleep(50);
            ParseObject x = new ParseObject("ComicBookChecklist_Title");
            x.put("name", "ZORRO");
            x.saveInBackground();
        } catch (InterruptedException e) {
        }

    }
}

package id.pecinta.quraan.jpq;

import android.graphics.Color;
import android.os.Bundle;

import id.pecinta.quraan.jpq.Fragment.Fragment_Button;
import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;
import it.neokree.materialnavigationdrawer.elements.MaterialAccount;
import it.neokree.materialnavigationdrawer.elements.listeners.MaterialAccountListener;
/**
 * Created by neokree on 18/01/15.
 */
public class Menu_PecintaQuran extends MaterialNavigationDrawer implements MaterialAccountListener {

    @Override
    public void init(Bundle savedInstanceState) {

        // add accounts
        //MaterialAccount account = new MaterialAccount(this.getResources(),"NeoKree","neokree@gmail.com",R.drawable.photo, R.drawable.bamboo);
        //this.addAccount(account);

        //MaterialAccount account2 = new MaterialAccount(this.getResources(),"Hatsune Miky","hatsune.miku@example.com",R.drawable.photo2,R.drawable.mat2);
        //this.addAccount(account2);

        MaterialAccount account3 = new MaterialAccount(this.getResources(),"Ainan Zaka","ainan.zaka@gmail.com",R.drawable.photo,R.drawable.mat3);
        this.addAccount(account3);

        // set listener
        this.setAccountListener(this);

        this.addSection(newSection("Profile", R.drawable.ic_mic_white_24dp,new Fragment_Button()).setSectionColor(Color.parseColor("#9c27b0")));
        this.addSection(newSection("Artikel",R.mipmap.ic_mic_white_24dp,new Fragment_Button()).setNotifications(0).setSectionColor(Color.parseColor("#9c27b0")));

        //this.addDivisor();
        this.addSection(newSection("Kajian",R.mipmap.ic_mic_white_24dp,new Fragment_Button()).setSectionColor(Color.parseColor("#9c27b0")));
        this.addSection(newSection("Sekilas Info",R.mipmap.ic_mic_white_24dp,new Fragment_Button()).setSectionColor(Color.parseColor("#9c27b0")));


        // create bottom section
        // this.addBottomSection(newSection("Bottom Section",R.drawable.ic_settings_black_24dp,new Intent(this,Settings.class)));

    }

    @Override
    public void onAccountOpening(MaterialAccount account) {

    }

    @Override
    public void onChangeAccount(MaterialAccount newAccount) {

    }
}

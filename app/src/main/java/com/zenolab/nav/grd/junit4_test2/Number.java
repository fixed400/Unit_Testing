package com.zenolab.nav.grd.junit4_test2;

import android.util.Log;

/**
 * Created by grd on 8/22/17.
 */

public class Number {

    public int sum (int n){
        int rez = 0;
        for (int i=1;i<=n;i++){
            // num += 10 means "num = num + 10"
            rez +=i;


            System.out.println("------ i = "+i);
            System.out.println("------ rez = "+rez);

        }
        return rez;
    }

}

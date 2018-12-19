package com.daggr2.demo.newdagger2.test7.component;

import com.daggr2.demo.newdagger2.test5.Test5Activity;
import com.daggr2.demo.newdagger2.test6.Test6Activity;
import com.daggr2.demo.newdagger2.test7.SonQualifier;
import com.daggr2.demo.newdagger2.test7.Test7Activity;
import com.daggr2.demo.newdagger2.test7.module.SonLunchModule;

import dagger.BindsInstance;
import dagger.Subcomponent;

@Subcomponent(modules = SonLunchModule.class)
public interface SonLunchComponent {
    void inject(Test7Activity test7Activity);

    @Subcomponent.Builder
    interface Builder {
        SonLunchComponent buildSonLunchComponent();

        @BindsInstance
        Builder toNoodle( @SonQualifier String money);
    }
}

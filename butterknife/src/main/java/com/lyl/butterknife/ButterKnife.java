package com.lyl.butterknife;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.ability.AbilitySlice;
import ohos.agp.components.ComponentContainer;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

import java.lang.reflect.Constructor;

public class ButterKnife {
    public static void bind(AbilitySlice a) {
        bindInstance(a);
    }

    public static void bind(Ability a) {
        bindInstance(a);
    }

    public static void bind(ComponentContainer a) {
        bindInstance(a);
    }

    public static void bindInstance(Object a) {
        String viewBindingClassName = a.getClass().getName() + "$ViewBinding";
        try {
            Class viewBindingClass = Class.forName(viewBindingClassName);
            Constructor viewBindingConstructor = viewBindingClass.getDeclaredConstructor(a.getClass());
            viewBindingConstructor.newInstance(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

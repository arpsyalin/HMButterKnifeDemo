package com.lyl.test.slice;



public final class MainAbilitySlice$ViewBinding1 {
    public MainAbilitySlice$ViewBinding1(final MainAbilitySlice target) {
        target.mBtn1 = (ohos.agp.components.Button) target.findComponentById(com.lyl.test.ResourceTable.Id_btn1);
        target.mBtn2 = (ohos.agp.components.Button) target.findComponentById(com.lyl.test.ResourceTable.Id_btn2);
        target.mText1 = (ohos.agp.components.Text) target.findComponentById(com.lyl.test.ResourceTable.Id_txt1);
        target.findComponentById(com.lyl.test.ResourceTable.Id_btn1).setClickedListener(new ohos.agp.components.Component.ClickedListener() {
            @Override
            public void onClick(ohos.agp.components.Component component) {
                target.click(component);
            }
        });
        target.findComponentById(com.lyl.test.ResourceTable.Id_btn2).setClickedListener(new ohos.agp.components.Component.ClickedListener() {
            @Override
            public void onClick(ohos.agp.components.Component component) {
                target.click(component);
            }
        });
        target.findComponentById(com.lyl.test.ResourceTable.Id_txt1).setClickedListener(new ohos.agp.components.Component.ClickedListener() {
            @Override
            public void onClick(ohos.agp.components.Component component) {
                target.click(component);
            }
        });
    }
}

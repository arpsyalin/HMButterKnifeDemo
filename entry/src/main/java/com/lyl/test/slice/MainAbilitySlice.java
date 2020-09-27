package com.lyl.test.slice;

import com.lyl.butterknife.ButterKnife;
import com.lyl.butterknife.annotations.BindView;
import com.lyl.butterknife.annotations.OnClick;
import com.lyl.test.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;

import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

public class MainAbilitySlice extends AbilitySlice {
    @BindView(value = ResourceTable.Id_btn1)
    Button mBtn1;
    @BindView(value = ResourceTable.Id_btn2)
    Button mBtn2;
    @BindView(value = ResourceTable.Id_txt1)
    Text mText1;

    @OnClick({ResourceTable.Id_txt1, ResourceTable.Id_btn1, ResourceTable.Id_btn2})
    public void click(Component component) {
        switch (component.getId()) {
            case ResourceTable.Id_txt1:
                mText1.setText("Id_txt1");
                System.out.println("Id_txt1");
                break;
            case ResourceTable.Id_btn1:
                mBtn1.setText("Id_btn1");
                System.out.println("Id_btn1");
                break;
            case ResourceTable.Id_btn2:
                mBtn2.setText("Id_btn2");
                System.out.println("Id_btn2");
                break;
        }
    }

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_abilityslice_main);
        ButterKnife.bind(this);
        mBtn1.setText("1111");

    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}

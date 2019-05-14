package com.gavin.test_one;

import android.text.TextUtils;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.gavin.common.base.BaseFragment;
import com.gavin.common.constants.DataKey;
import com.gavin.common.constants.FragmentPath;
import com.orhanobut.logger.Logger;

import butterknife.BindView;

/**
 * TabFragment
 */
@Route(path = FragmentPath.TEXT_ONE)
public class TabFragment extends BaseFragment{

    @BindView(R2.id.tv_text)
    TextView tvText;

    private String mParam1;
    private String mParam2;

    @Override
    protected void onViewInjected() {
        if (getArguments() != null) {
            mParam1 = getArguments().getString(DataKey.KEY_TEST_ONE);
            mParam2 = getArguments().getString(DataKey.KEY_TEST_TWO);
        }

        if(!TextUtils.isEmpty(mParam1) && !TextUtils.isEmpty(mParam2)){
            tvText.setText("mParam1:"+mParam1+" mParam2:"+mParam2);
            Logger.d("mParam1:"+mParam1+" mParam2:"+mParam2);
        }else{
            tvText.setText("No Params");
        }
    }

    @Override
    public int initFragmentViewId() {
        return R.layout.fragment_tab_one;
    }

}

package com.example.infomation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private String job;
    private String information;

    public void setJob(String job) {
        this.job = job;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return IntroductionFragment.newInstance(job);

            case 1:
                return  JobFragment.newInstance(information);

            default:
                return new IntroductionFragment();
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {

            case 0:
                title = "Introduction";
                break;

            case 1:
                title = "Job";
                break;

        }
        return title;
    }
}

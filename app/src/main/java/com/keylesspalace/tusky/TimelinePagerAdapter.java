/* Copyright 2017 Andrew Dawson
 *
 * This file is part of Tusky.
 *
 * Tusky is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * Tusky is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Tusky. If not, see
 * <http://www.gnu.org/licenses/>. */

package com.keylesspalace.tusky;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class TimelinePagerAdapter extends FragmentPagerAdapter {
    private String[] pageTitles;

    TimelinePagerAdapter(FragmentManager manager) {
        super(manager);
    }

    void setPageTitles(String[] titles) {
        pageTitles = titles;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0: {
                return TimelineFragment.newInstance(TimelineFragment.Kind.HOME);
            }
            case 1: {
                return NotificationsFragment.newInstance();
            }
            case 2: {
                return TimelineFragment.newInstance(TimelineFragment.Kind.PUBLIC);
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }
}

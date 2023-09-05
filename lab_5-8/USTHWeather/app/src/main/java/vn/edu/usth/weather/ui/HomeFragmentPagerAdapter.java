package vn.edu.usth.weather.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import vn.edu.usth.weather.R;

public class HomeFragmentPagerAdapter extends Fragment {

    private ViewPager2 viewPager;
    private FragmentStateAdapter pagerAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.view_pager, container, false);

        // Initialize ViewPager2 and its adapter
        viewPager = rootView.findViewById(R.id.view_pager);

        // Get the activity to pass to the adapter
        FragmentActivity fragmentActivity = getActivity();

        // Create a list of fragments to display in the ViewPager2
        // Replace with your own fragments
        Fragment[] fragments = new Fragment[]{
                new WeatherAndForecastFragment(),
                new WeatherAndForecastFragment(),
                new WeatherAndForecastFragment(),
                // Add more fragments here as needed
        };

        // Initialize the adapter
        pagerAdapter = new MyPagerAdapter(fragmentActivity, fragments);

        // Set the adapter to the ViewPager2
        viewPager.setAdapter(pagerAdapter);

        return rootView;
    }

    // Adapter class (you can define this as an inner class or in a separate file)
    private class MyPagerAdapter extends FragmentStateAdapter {

        private Fragment[] fragments;

        public MyPagerAdapter(FragmentActivity fragmentActivity, Fragment[] fragments) {
            super(fragmentActivity);
            this.fragments = fragments;
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return fragments[position];
        }

        @Override
        public int getItemCount() {
            return fragments.length;
        }
    }
}

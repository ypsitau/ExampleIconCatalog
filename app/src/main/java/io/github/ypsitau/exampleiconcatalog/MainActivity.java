package io.github.ypsitau.exampleiconcatalog;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewPager viewPager = findViewById(R.id.viewPager);
		viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
			@Override
			public Fragment getItem(int position) { return PageFragment.createFragment(position); }
			@Override
			public int getCount() { return 3; }

			@Nullable
			@Override
			public CharSequence getPageTitle(int position) {
				return "Page";
			}
		});
		TabLayout tabLayout = findViewById(R.id.tabLayout);
		tabLayout.setupWithViewPager(viewPager);
	}
	public static class PageFragment extends Fragment {
		private static final String ARG_POSITION = "position";
		public static Fragment createFragment(int position) {
			Fragment fragment = new PageFragment();
			Bundle bundle = new Bundle();
			bundle.putInt(ARG_POSITION, position);
			fragment.setArguments(bundle);
			return fragment;
		}

		@Nullable
		@Override
		public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
			View viewRoot = inflater.inflate(R.layout.fragment_page, container, false);
			final RecyclerView recyclerView = viewRoot.findViewById(R.id.recyclerView);
			//recyclerView.setHasFixedSize(true);
			Bundle bundle = getArguments();
			int position = bundle.getInt(ARG_POSITION);
			recyclerView.setLayoutManager(new LinearLayoutManager(inflater.getContext()));
			recyclerView.setAdapter(new ItemAdapter(position));
			return viewRoot;
		}
	}
}

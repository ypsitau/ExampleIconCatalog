package io.github.ypsitau.exampleiconcatalog;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
	static public class ItemInfo {
		final int resId;
		final String label;
		public ItemInfo(int resId, String label) {
			this.resId = resId;;
			this.label = label;
		}
	}

	private ItemInfo[] itemInfos;

	private final static ItemInfo[] itemInfos_icon = new ItemInfo[] {
			new ItemInfo(android.R.drawable.ic_btn_speak_now, "ic_btn_speak_now"),
			new ItemInfo(android.R.drawable.ic_delete, "ic_delete"),
			new ItemInfo(android.R.drawable.ic_dialog_alert, "ic_dialog_alert"),
			new ItemInfo(android.R.drawable.ic_dialog_dialer, "ic_dialog_dialer"),
			new ItemInfo(android.R.drawable.ic_dialog_email, "ic_dialog_email"),
			new ItemInfo(android.R.drawable.ic_dialog_info, "ic_dialog_info"),
			new ItemInfo(android.R.drawable.ic_dialog_map, "ic_dialog_map"),
			new ItemInfo(android.R.drawable.ic_input_add, "ic_input_add"),
			new ItemInfo(android.R.drawable.ic_input_delete, "ic_input_delete"),
			new ItemInfo(android.R.drawable.ic_input_get, "ic_input_get"),
			new ItemInfo(android.R.drawable.ic_lock_idle_alarm, "ic_lock_idle_alarm"),
			new ItemInfo(android.R.drawable.ic_lock_idle_charging, "ic_lock_idle_charging"),
			new ItemInfo(android.R.drawable.ic_lock_idle_lock, "ic_lock_idle_lock"),
			new ItemInfo(android.R.drawable.ic_lock_idle_low_battery, "ic_lock_idle_low_battery"),
			new ItemInfo(android.R.drawable.ic_lock_lock, "ic_lock_lock"),
			new ItemInfo(android.R.drawable.ic_lock_power_off, "ic_lock_power_off"),
			new ItemInfo(android.R.drawable.ic_lock_silent_mode, "ic_lock_silent_mode"),
			new ItemInfo(android.R.drawable.ic_lock_silent_mode_off, "ic_lock_silent_mode_off"),
			new ItemInfo(android.R.drawable.ic_media_ff, "ic_media_ff"),
			new ItemInfo(android.R.drawable.ic_media_next, "ic_media_next"),
			new ItemInfo(android.R.drawable.ic_media_pause, "ic_media_pause"),
			new ItemInfo(android.R.drawable.ic_media_play, "ic_media_play"),
			new ItemInfo(android.R.drawable.ic_media_previous, "ic_media_previous"),
			new ItemInfo(android.R.drawable.ic_media_rew, "ic_media_rew"),
			new ItemInfo(android.R.drawable.ic_menu_add, "ic_menu_add"),
			new ItemInfo(android.R.drawable.ic_menu_agenda, "ic_menu_agenda"),
			new ItemInfo(android.R.drawable.ic_menu_always_landscape_portrait, "ic_menu_always_landscape_portrait"),
			new ItemInfo(android.R.drawable.ic_menu_call, "ic_menu_call"),
			new ItemInfo(android.R.drawable.ic_menu_camera, "ic_menu_camera"),
			new ItemInfo(android.R.drawable.ic_menu_close_clear_cancel, "ic_menu_close_clear_cancel"),
			new ItemInfo(android.R.drawable.ic_menu_compass, "ic_menu_compass"),
			new ItemInfo(android.R.drawable.ic_menu_crop, "ic_menu_crop"),
			new ItemInfo(android.R.drawable.ic_menu_day, "ic_menu_day"),
			new ItemInfo(android.R.drawable.ic_menu_delete, "ic_menu_delete"),
			new ItemInfo(android.R.drawable.ic_menu_directions, "ic_menu_directions"),
			new ItemInfo(android.R.drawable.ic_menu_edit, "ic_menu_edit"),
			new ItemInfo(android.R.drawable.ic_menu_gallery, "ic_menu_gallery"),
			new ItemInfo(android.R.drawable.ic_menu_help, "ic_menu_help"),
			new ItemInfo(android.R.drawable.ic_menu_info_details, "ic_menu_info_details"),
			new ItemInfo(android.R.drawable.ic_menu_manage, "ic_menu_manage"),
			new ItemInfo(android.R.drawable.ic_menu_mapmode, "ic_menu_mapmode"),
			new ItemInfo(android.R.drawable.ic_menu_month, "ic_menu_month"),
			new ItemInfo(android.R.drawable.ic_menu_more, "ic_menu_more"),
			new ItemInfo(android.R.drawable.ic_menu_my_calendar, "ic_menu_my_calendar"),
			new ItemInfo(android.R.drawable.ic_menu_mylocation, "ic_menu_mylocation"),
			new ItemInfo(android.R.drawable.ic_menu_myplaces, "ic_menu_myplaces"),
			new ItemInfo(android.R.drawable.ic_menu_preferences, "ic_menu_preferences"),
			new ItemInfo(android.R.drawable.ic_menu_recent_history, "ic_menu_recent_history"),
			new ItemInfo(android.R.drawable.ic_menu_report_image, "ic_menu_report_image"),
			new ItemInfo(android.R.drawable.ic_menu_revert, "ic_menu_revert"),
			new ItemInfo(android.R.drawable.ic_menu_rotate, "ic_menu_rotate"),
			new ItemInfo(android.R.drawable.ic_menu_save, "ic_menu_save"),
			new ItemInfo(android.R.drawable.ic_menu_search, "ic_menu_search"),
			new ItemInfo(android.R.drawable.ic_menu_send, "ic_menu_send"),
			new ItemInfo(android.R.drawable.ic_menu_set_as, "ic_menu_set_as"),
			new ItemInfo(android.R.drawable.ic_menu_share, "ic_menu_share"),
			new ItemInfo(android.R.drawable.ic_menu_slideshow, "ic_menu_slideshow"),
			new ItemInfo(android.R.drawable.ic_menu_sort_alphabetically, "ic_menu_sort_alphabetically"),
			new ItemInfo(android.R.drawable.ic_menu_sort_by_size, "ic_menu_sort_by_size"),
			new ItemInfo(android.R.drawable.ic_menu_today, "ic_menu_today"),
			new ItemInfo(android.R.drawable.ic_menu_upload, "ic_menu_upload"),
			new ItemInfo(android.R.drawable.ic_menu_upload_you_tube, "ic_menu_upload_you_tube"),
			new ItemInfo(android.R.drawable.ic_menu_view, "ic_menu_view"),
			new ItemInfo(android.R.drawable.ic_menu_week, "ic_menu_week"),
			new ItemInfo(android.R.drawable.ic_menu_zoom, "ic_menu_zoom"),
			new ItemInfo(android.R.drawable.ic_notification_clear_all, "ic_notification_clear_all"),
			new ItemInfo(android.R.drawable.ic_notification_overlay, "ic_notification_overlay"),
			new ItemInfo(android.R.drawable.ic_partial_secure, "ic_partial_secure"),
			new ItemInfo(android.R.drawable.ic_popup_disk_full, "ic_popup_disk_full"),
			new ItemInfo(android.R.drawable.ic_popup_reminder, "ic_popup_reminder"),
			new ItemInfo(android.R.drawable.ic_popup_sync, "ic_popup_sync"),
			new ItemInfo(android.R.drawable.ic_search_category_default, "ic_search_category_default"),
			new ItemInfo(android.R.drawable.ic_secure, "ic_secure"),
	};
	private final static ItemInfo[] itemInfos_icon2 = new ItemInfo[]{
			new ItemInfo(android.R.drawable.ic_btn_speak_now, "ic_btn_speak_now"),
			new ItemInfo(android.R.drawable.ic_delete, "ic_delete"),
	};
	private final static ItemInfo[] itemInfos_icon3 = new ItemInfo[]{
			new ItemInfo(android.R.drawable.ic_popup_sync, "ic_popup_sync"),
			new ItemInfo(android.R.drawable.ic_search_category_default, "ic_search_category_default"),
			new ItemInfo(android.R.drawable.ic_secure, "ic_secure"),
	};
	public static class ViewHolder extends RecyclerView.ViewHolder {
		public ImageView imageView_icon;
		public TextView textView_label;
		public ViewHolder(View itemView) {
			super(itemView);
			imageView_icon = itemView.findViewById(R.id.imageView_icon);
			textView_label = itemView.findViewById(R.id.textView_label);
		}
	}

	ItemAdapter(int position) {
		itemInfos =
				(position == 0)? itemInfos_icon :
				(position == 1)? itemInfos_icon2 :
				(position == 2)? itemInfos_icon3 :
				itemInfos_icon;
	}
	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		return new ViewHolder(LayoutInflater.from(parent.getContext()).
				inflate(R.layout.adapter_item, parent, false));
	}
	@Override
	public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
		holder.imageView_icon.setImageResource(itemInfos[position].resId);
		holder.textView_label.setText(itemInfos[position].label);
	}

	@Override
	public int getItemCount() {
		return itemInfos.length;
	}
}

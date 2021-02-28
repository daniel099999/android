package com.avp.bottomnavigation.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.navGraphViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.avp.bottomnavigation.R
import com.avp.bottomnavigation.models.ItemNotificationModel
import com.avp.bottomnavigation.ui.adapter.NotificationAdapter
import com.avp.bottomnavigation.ui.home.HomeViewModel
import kotlinx.android.synthetic.main.fragment_notifications.*

class NotificationsFragment : Fragment() {
    private val viewModel by navGraphViewModels<NotificationsViewModel>(R.id.mobile_navigation)
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notifications, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val itemProfileModels = listOf(
            ItemNotificationModel(
                userName = "Anh Viet Pham1",
                gender = "Nam",
                birthday = "17/5/1995"
            ),
            ItemNotificationModel(
                userName = "Anh Viet Pham2",
                gender = "Nam",
                birthday = "17/5/1995"
            ),
            ItemNotificationModel(
                userName = "Anh Viet Pham3",
                gender = "Nam",
                birthday = "17/5/1995"
            ),
            ItemNotificationModel(
                userName = "Anh Viet Pham4",
                gender = "Nam",
                birthday = "17/5/1995"
            ),
            ItemNotificationModel(
                userName = "Anh Viet Pham5",
                gender = "Nam",
                birthday = "17/5/1995"
            ),
            ItemNotificationModel(
                userName = "Anh Viet Pham6",
                gender = "Nam",
                birthday = "17/5/1995"
            ),
            ItemNotificationModel(
                userName = "Anh Viet Pham7",
                gender = "Nam",
                birthday = "17/5/1995"
            ),
            ItemNotificationModel(
                userName = "Anh Viet Pham8",
                gender = "Nam",
                birthday = "17/5/1995"
            ),ItemNotificationModel(
                userName = "Anh Viet Pham9",
                gender = "Nam",
                birthday = "17/5/1995"
            )
        )
        val profileAdapter = NotificationAdapter(itemNotificationModels = itemProfileModels)
        rvNotification.layoutManager = LinearLayoutManager(this.context)
        rvNotification.adapter = profileAdapter

        if (viewModel.listStateNotification != null){
            rvNotification.layoutManager?.onRestoreInstanceState(viewModel.listStateNotification)
            viewModel.listStateNotification = null
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewModel.listStateNotification = rvNotification.layoutManager?.onSaveInstanceState()
    }
}

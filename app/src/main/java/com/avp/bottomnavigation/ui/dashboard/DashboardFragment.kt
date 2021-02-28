package com.avp.bottomnavigation.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.navGraphViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.avp.bottomnavigation.R
import com.avp.bottomnavigation.models.ItemDashBoardModel
import com.avp.bottomnavigation.ui.adapter.DashBoardAdapter
import com.avp.bottomnavigation.ui.home.HomeViewModel
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment : Fragment() {
    private val viewModel by navGraphViewModels<DashboardViewModel>(R.id.mobile_navigation)
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val itemChatModels = listOf(
            ItemDashBoardModel(
                userName = "DevChicken1",
                description = "Hom nay toi rat vui va buon kinh khung khiep, Hom nay toi rat vui va buon kinh khung khiep, Hom nay toi rat vui va buon kinh khung khiep"
            ),
            ItemDashBoardModel(
                userName = "DevChicken2",
                description = "Hom nay toi rat vui va buon kinh khung khiep, Hom nay toi rat vui va buon kinh khung khiep, Hom nay toi rat vui va buon kinh khung khiep"
            ),
            ItemDashBoardModel(
                userName = "DevChicken3",
                description = "Hom nay toi rat vui va buon kinh khung khiep, Hom nay toi rat vui va buon kinh khung khiep, Hom nay toi rat vui va buon kinh khung khiep"
            ),
            ItemDashBoardModel(
                userName = "DevChicken4",
                description = "Hom nay toi rat vui va buon kinh khung khiep, Hom nay toi rat vui va buon kinh khung khiep, Hom nay toi rat vui va buon kinh khung khiep"
            ),
            ItemDashBoardModel(
                userName = "DevChicken5",
                description = "Hom nay toi rat vui va buon kinh khung khiep, Hom nay toi rat vui va buon kinh khung khiep, Hom nay toi rat vui va buon kinh khung khiep"
            ),
            ItemDashBoardModel(
                userName = "DevChicken6",
                description = "Hom nay toi rat vui va buon kinh khung khiep, Hom nay toi rat vui va buon kinh khung khiep, Hom nay toi rat vui va buon kinh khung khiep"
            ),
            ItemDashBoardModel(
                userName = "DevChicken7",
                description = "Hom nay toi rat vui va buon kinh khung khiep, Hom nay toi rat vui va buon kinh khung khiep, Hom nay toi rat vui va buon kinh khung khiep"
            ),
            ItemDashBoardModel(
                userName = "DevChicken8",
                description = "Hom nay toi rat vui va buon kinh khung khiep, Hom nay toi rat vui va buon kinh khung khiep, Hom nay toi rat vui va buon kinh khung khiep"
            )
        )
        val chatAdapter = DashBoardAdapter(itemDashBoardModels = itemChatModels)
        rvDashBoard.layoutManager = LinearLayoutManager(this.context)
        rvDashBoard.adapter = chatAdapter

        if (viewModel.listStateDashBoard != null){
            rvDashBoard.layoutManager?.onRestoreInstanceState(viewModel.listStateDashBoard)
            viewModel.listStateDashBoard = null
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewModel.listStateDashBoard = rvDashBoard.layoutManager?.onSaveInstanceState()
    }
}

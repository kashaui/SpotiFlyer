/*
 * Copyright (C)  2020  Shabinder Singh
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.shabinder.spotiflyer.ui.gaana

import android.content.BroadcastReceiver
import android.content.IntentFilter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.shabinder.spotiflyer.R
import com.shabinder.spotiflyer.SharedViewModel
import com.shabinder.spotiflyer.databinding.TrackListFragmentBinding
import com.shabinder.spotiflyer.networking.GaanaInterface
import com.shabinder.spotiflyer.networking.YoutubeMusicApi
import javax.inject.Inject

class GaanaFragment : Fragment() {

    private lateinit var binding: TrackListFragmentBinding
    private lateinit var sharedViewModel: SharedViewModel
    @Inject lateinit var youtubeMusicApi: YoutubeMusicApi
    private lateinit var viewModel: GaanaViewModel
    @Inject lateinit var gaanaInterface: GaanaInterface
    private var intentFilter: IntentFilter? = null
    private var updateUIReceiver: BroadcastReceiver? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  DataBindingUtil.inflate(inflater,R.layout.track_list_fragment, container, false)
        viewModel = ViewModelProvider(this).get(GaanaViewModel::class.java)
        return binding.root
    }
}
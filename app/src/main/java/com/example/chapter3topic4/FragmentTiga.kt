package com.example.chapter3topic4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_dua.*
import kotlinx.android.synthetic.main.fragment_dua.umur
import kotlinx.android.synthetic.main.fragment_satu.*
import kotlinx.android.synthetic.main.fragment_satu.btn
import kotlinx.android.synthetic.main.fragment_tiga.*

class FragmentTiga : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tiga, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var getumur = arguments?.getString("dataumur")
        etumur.text = getumur
    }

}
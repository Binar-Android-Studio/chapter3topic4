package com.example.chapter3topic4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_tiga.*

class FragmentHome : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var getumur = arguments?.getString("dataumur")
        welcome.text = "Hello, "+ getumur + " !"

        btnsubmit.setOnClickListener {
            var dataumur = umurr.text.toString()
            var bund = Bundle()
            bund.putString("dataumur", dataumur)
            bund.putString("nama", getumur)
            Navigation.findNavController(view).navigate(R.id.action_fragmentHome3_to_hiFragment2,bund)
        }

        btnprofile.setOnClickListener {
            var bund = Bundle()
            bund.putString("nama", getumur)
            Navigation.findNavController(view).navigate(R.id.action_fragmentHome3_to_profileFragment3,bund)
        }

    }

}
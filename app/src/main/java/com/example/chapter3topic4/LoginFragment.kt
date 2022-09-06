package com.example.chapter3topic4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnlogin.setOnClickListener {
            if(password.text.toString() == "aaa123") {
                var dataumur = username.text.toString()
                var bund = Bundle()
                bund.putString("dataumur", dataumur)
                Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_fragmentHome3, bund)
            }
            else{
                Toast.makeText(getActivity(), "Cie Passwordnya Sallah", Toast.LENGTH_SHORT).show()
            }
        }

        register.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment2)
        }

    }


}
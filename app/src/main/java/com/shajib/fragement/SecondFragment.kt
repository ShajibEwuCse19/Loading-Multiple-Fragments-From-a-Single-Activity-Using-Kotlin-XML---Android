package com.shajib.fragement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

/**
 * @author Shajib
 * @since Aug 01, 2024
 **/
class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.second_fragment, container, false) //inflate and return the view

        //my tasks on the fragment view
        val editTextGender = view.findViewById<EditText>(R.id.etGender)
        val editTextAge = view.findViewById<EditText>(R.id.etAge)
        val buttonSubmit2 = view.findViewById<Button>(R.id.btSubmit2)

        buttonSubmit2.setOnClickListener {
            val text1 = editTextGender.text.toString()
            val text2 = editTextAge.text.toString()
            Toast.makeText(
                requireContext(),
                "Your Gender = $text1 and Age = $text2",
                Toast.LENGTH_SHORT
            ).show()
        }

        return view //return
    }
}